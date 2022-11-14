package com.trycloud.step_definitions;

import com.trycloud.pages.BasePage;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class US_03_Step_Definitions extends BasePage {

    @Given("user on the login page")
    public void user_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
    }

    @When("the users  log in with valid credentials")
    public void the_users_log_in_with_valid_credentials() {
        tryCloudLogin("User25", "Userpass123");
    }

    @Then("Verify the user see the following modules:")
    public void verify_the_user_see_the_following_modules(List<String> expected) {

        List<String> actual = new ArrayList<>();

        for (WebElement eachModule : mainModules) {
            actual.add(eachModule.getText());
            
        }
        Assert.assertEquals(expected, actual);
    }
}