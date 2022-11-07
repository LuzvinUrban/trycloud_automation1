package com.trycloud.step_definitions;

import com.trycloud.pages.US_04_Page;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class US_04__Step_Definitions {

    US_04_Page us_04_page = new US_04_Page();


    @Given("user {string} {string} on the dashboard page")
    public void userOnTheDashboardPage(String username, String password) {


        Driver.getDriver().get("http://qa3.trycloud.net/index.php/login?clear=1");

//        us_04_page.userNameInput.sendKeys(username);
//        us_04_page.passwordInput.sendKeys(password);
//        us_04_page.loginBtn.click();

        us_04_page.login(username, password);

    }


    @When("user clicks the Files module")
    public void userClicksTheFilesModule() {

        us_04_page.filesModule.click();

    }

    @Then("verify the page title is {string}")
    public void verifyThePageTitleIs(String expectedTitle) {

        assertEquals(expectedTitle, Driver.getDriver().getTitle());

    }

    @When("user click the top-left checkbox of the table")
    public void user_click_the_top_left_checkbox_of_the_table() {

        us_04_page.selectAllFilesCheckbox.click();

    }

    @Then("verify all the files are selected")
    public void verify_all_the_files_are_selected() {

        for (WebElement each : us_04_page.listOfCheckbox) {
            assertTrue(each.isSelected());
        }
    }

}
