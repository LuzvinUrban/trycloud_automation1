package com.trycloud.step_definitions;

import com.trycloud.pages.BasePage;
import com.trycloud.pages.US_02_Page;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US_02_Step_Definitions extends BasePage {

    US_02_Page us_02_page = new US_02_Page();

    @When("user enter invalid {string} and {string}")
    public void user_enter_invalid_and(String username, String password) {
        tryCloudLogin(username, password);

    }

    @Then("verify {string} message should be displayed")
    public void verify_message_should_be_displayed(String message) {

        String actualMessage = us_02_page.warningMessage.getText();

        Assert.assertEquals(message, actualMessage);


    }

}
