package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public abstract class BasePage {

    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//div[@id='apps']/ul//a")
    public List<WebElement> mainModules;

    @FindBy(xpath = "//div[@class='logo logo-icon']")
    public WebElement tryCloudLogo;

    @FindBy(css = "#appmenu > li:nth-child(1) > a > svg > image")
    public WebElement dashboardModule;

    @FindBy(xpath = "(//a[@aria-label='Files'])[1]")
    public WebElement filesModule;

    @FindBy(xpath = "(//a[@aria-label='Photos'])[1]")
    public WebElement photosModule;

    @FindBy(xpath = "(//a[@aria-label='Activity'])[1]")
    public WebElement activityModule;

    @FindBy(xpath = "//*[@id='appmenu']//li[@data-id='spreed']//a")
    public WebElement talkModule;

    @FindBy(xpath = "//*[@id='appmenu']//li[@data-id='contacts']//a")
    public WebElement contactsModule;

    @FindBy(xpath = "//*[@id='appmenu']//li[@data-id='circles']//a")
    public WebElement circlesModule;

    @FindBy(xpath = "//*[@id='appmenu']//li[@data-id='calendar']//a")
    public WebElement calenderModule;

    @FindBy(xpath = "(//a[@aria-label='Deck'])[1]")
    public WebElement deckModule;

    @FindBy(xpath = "//a[@aria-haspopup='true']")
    public WebElement searchModule;

    @FindBy(xpath = "//img[@class='svg']")
    public WebElement notificationsModule;

    @FindBy(xpath = "//div[@class='icon-contacts menutoggle']")
    public WebElement contactModule;

    @FindBy(xpath = "//img[@width='32']")
    public WebElement profileModule;

    @FindBy(xpath = "//input[@id='user']")
    public WebElement inputUsername;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement inputPassword;

    @FindBy(xpath = "//input[@id='submit-form']")
    public WebElement loginBtn;


    public void tryCloudLogin(String username, String password){
       inputUsername.sendKeys(username);
       inputPassword.sendKeys(password);
       loginBtn.click();
    }



}
