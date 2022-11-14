package com.trycloud.step_definitions;

import com.trycloud.pages.BasePage;
import com.trycloud.pages.US_05_Page;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;

import java.util.List;

public class US_05_Step_Definitions extends BasePage {
    US_05_Page us_05_page= new US_05_Page();


    @When("the user clicks the files module")
    public void the_user_clicks_the_module() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
        tryCloudLogin("User25","Userpass123");

      filesModule.click();

    }

    @When("the user clicks action-icon  from any {int} on the page")
    public void theUserClicksActionIconFromAnyOnThePage(Integer fileIndexNumber) {

        //  BrowserUtils.waitForClickability(us_05_page.firstIndexFile,5).click();
        us_05_page.setActionIcon(fileIndexNumber);
    }

    @When("user choose the Add to favorites option")
    public void user_choose_the_option() {
        us_05_page.addToFavorites.click();

    }
    @When("user click the Favorites sub-module on the left side")
    public void user_click_the_sub_module_on_the_left_side() {
    us_05_page.favoritesSubModule.click();
    }

    @Then("Verify the chosen {int} is listed on the table")
    public void verify_the_chosen_file_is_listed_on_the_table(Integer fileIndexNumber) {
        List<String> allFileNames=new ArrayList<>();
        for (WebElement each:us_05_page.favoritedFileName) {
            allFileNames.add(each.getText());
        }
        String expectedResult=us_05_page.filesText(fileIndexNumber);
        Assert.assertTrue(allFileNames.contains(expectedResult));
//        us_05_page.favoritesModuleActionIcon.click();
//        us_05_page.removeFromFavorites.click();

     Driver.getDriver().navigate().back();
     BrowserUtils.waitForClickability(us_05_page.actionIcon2,5).click();

     BrowserUtils.waitForClickability(us_05_page.addToFavorites,5).click();

    }

    }


