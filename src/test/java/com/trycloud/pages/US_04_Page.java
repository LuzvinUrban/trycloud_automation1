package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class US_04_Page {


    public US_04_Page() {

        PageFactory.initElements(Driver.getDriver(), this);

    }
    @FindBy(name = "user")
    public WebElement userNameInput;

    @FindBy(name = "password")
    public WebElement passwordInput;

    @FindBy(id="submit-form")
    public WebElement loginBtn;

    @FindBy(xpath = "//a[@href=\"/index.php/apps/files/\"]")
    public WebElement filesModule;

    @FindBy(xpath = "//label[@for=\"select_all_files\"]")
    public WebElement selectAllFilesCheckbox;

    @FindBy(xpath = "//input[contains(@id,'select-files-')]")
    public List<WebElement> listOfCheckbox;



    public void login(String username, String password){

        userNameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginBtn.click();

    }


    public void filesCheckBoxSelectAll(String fileName) {

        for (WebElement each : listOfCheckbox) {
            if (fileName.equalsIgnoreCase("All")) {
                each.click();
            } else if (each.getText().equals(fileName)) {
                each.click();
            }

        }


    }


}
