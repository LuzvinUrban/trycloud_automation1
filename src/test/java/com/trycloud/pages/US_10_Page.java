package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class US_10_Page extends BasePage{

    public US_10_Page() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(className = "settings-button")
    public WebElement settings;

//    @FindBy(xpath = "//input[@class='checkbox']")
//    public List<WebElement> checkBoxesInSettings;

    @FindBy(xpath = "//label[.='Show rich workspaces']")
    public WebElement workSpaceCheckBox;

    @FindBy(xpath = "//label[.='Show recommendations']")
    public WebElement recommendationsCheckBox;

    @FindBy(xpath = "//label[.='Show hidden files']")
    public WebElement hiddenFilesCheckBox;

    @FindBy(xpath = "//li[@id='quota']")
    public WebElement currentStorage;

    @FindBy(xpath = "//span[@class='icon icon-add']")
    public WebElement plusSign;

    @FindBy(xpath = "//span[.='Upload file']")
    public WebElement uploadfile;

    @FindBy(xpath = "//input[@type='file']")
    public WebElement inputFile;







}
