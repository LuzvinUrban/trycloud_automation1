package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class US_08_DeleteFilePage extends BasePage {

    public US_08_DeleteFilePage() {
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "//a[@class='menuitem action action-delete permanent']")
    public WebElement actionDelete;


    @FindBy(xpath = "//a[.='Deleted files']")
    public WebElement deleteFiles;


    @FindBy(xpath = "//span[@class='nametext extra-data']")
    public List<WebElement> nameText;

    @FindBy(xpath = "//span[@class='innernametext']")
    public List<WebElement> fileName;

    @FindBy (xpath = "//a[@class='action action-restore permanent']")
    public WebElement restoreIcon;


    public String filesText(int indexNumber) {
        String text = "";

        for (WebElement each : fileName) {
            if (fileName.get(indexNumber).equals(each)) {
                text = each.getText();
            }
        }

        return text;
    }
}
