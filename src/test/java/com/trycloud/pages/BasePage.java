package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//div[@class='logo logo-icon']")
    public WebElement tryCloudLogo;

    @FindBy(xpath = "/html/body/header/div[1]/ul/li[1]/a/svg")
    public WebElement dashboardModule;

    @FindBy(xpath = "/html/body/header/div[1]/ul/li[2]/a/svg")
    public WebElement filesModule;

    @FindBy(xpath = "/html/body/header/div[1]/ul/li[3]/a/svg")
    public WebElement photosModule;

    @FindBy(xpath = "/html/body/header/div[1]/ul/li[4]/a/svg")
    public WebElement activityModule;

    @FindBy(xpath = "//*[@id='appmenu']//li[@data-id='spreed']//a")
    public WebElement talkModule;

    @FindBy(xpath = "//*[@id='appmenu']//li[@data-id='contacts']//a")
    public WebElement contactsModule;

    @FindBy(xpath = "//*[@id='appmenu']//li[@data-id='circles']//a")
    public WebElement circlesModule;

    @FindBy(xpath = "//*[@id='appmenu']//li[@data-id='calendar']//a")
    public WebElement calenderModule;

    @FindBy(xpath = "/html/body/header/div[1]/ul/li[9]/a/svg")
    public WebElement deckModule;

    @FindBy(xpath = "//a[@aria-haspopup='true']")
    public WebElement searchModule;

    @FindBy(xpath = "//img[@class='svg']")
    public WebElement notificationsModule;

    @FindBy(xpath = "//div[@class='icon-contacts menutoggle']")
    public WebElement contactModule;

    @FindBy(xpath = "//img[@width='32']")
    public WebElement profileModule;



}
