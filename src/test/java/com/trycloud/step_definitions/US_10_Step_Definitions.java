package com.trycloud.step_definitions;

import com.trycloud.pages.BasePage;
import com.trycloud.pages.US_10_Page;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class US_10_Step_Definitions extends BasePage {

    US_10_Page us_10_page = new US_10_Page();

    @Given("user on the dashboard page")
    public void user_on_the_dashboard_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
        tryCloudLogin("User25", "Userpass123");

    }
    @When("the user clicks the Files module")
    public void the_user_clicks_the_files_module() {
        filesModule.click();

    }
    @When("user clicks Settings on the left bottom corner")
    public void user_clicks_settings_on_the_left_bottom_corner() {
        us_10_page.settings.click();

    }
    @Then("the user should be able to click any buttons")
    public void the_user_should_be_able_to_click_any_buttons() {

        List<WebElement> allCheckBox = new ArrayList<>(Arrays.asList(us_10_page.workSpaceCheckBox, us_10_page.recommendationsCheckBox,us_10_page.hiddenFilesCheckBox));

        for (WebElement each: allCheckBox) {
            each.click();
            Assert.assertTrue(each.isEnabled());
        }


    }
    String storageBeforeUploadingFile;
    @When("user checks the current storage usage")
    public void user_checks_the_current_storage_usage() {
      storageBeforeUploadingFile   = us_10_page.currentStorage.getText();
        System.out.println(storageBeforeUploadingFile);
    }
    @When("user  uploads file with the upload file option")
    public void user_uploads_file_with_the_upload_file_option() {
        us_10_page.plusSign.click();
        us_10_page.uploadfile.click();
        BrowserUtils.sleep(5);
        us_10_page.inputFile.sendKeys("/Users/busra/Desktop/alberto_interwiew (1).pdf");
        BrowserUtils.sleep(5);


    }
    @When("user refresh the page")
    public void user_refresh_the_page() {
        Driver.getDriver().navigate().refresh();

    }
    String storageAfterUploadFile;
    @Then("the user should be able to see storage usage is increased")
    public void the_user_should_be_able_to_see_storage_usage_is_increased() {
       storageAfterUploadFile = us_10_page.currentStorage.getText();
        System.out.println(storageAfterUploadFile);

//       int storageBefore = Integer.parseInt(storageBeforeUploadingFile);
//       int storageAfter = Integer.parseInt(storageAfterUploadFile);
//       Assert.assertTrue(storageBefore < storageAfter);

        Assert.assertNotEquals(storageBeforeUploadingFile, storageAfterUploadFile);


    }

}
