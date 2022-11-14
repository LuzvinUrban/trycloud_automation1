package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class US_05_Page extends BasePage{

    public US_05_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

 @FindBy(xpath = "//a[@class=\"action action-menu permanent\"]")
    public List<WebElement> actionIcon;

    @FindBy(xpath = "(//a[@class=\"action action-menu permanent\"])[1]")
    public WebElement actionIcon2;


    @FindBy(xpath = "//a[@class=\"menuitem action action-favorite permanent\"]")
    public WebElement addToFavorites;


    @FindBy(xpath = "//a[.=\"Favorites\"]")
    public WebElement favoritesSubModule;

    @FindBy(xpath = "//span[@class=\"innernametext\"]")
    public List< WebElement> fileName;

    @FindBy(xpath = "//tr[@data-tags=\"_$!<Favorite>!$_\"]")
    public List< WebElement> favoritedFileName;

    @FindBy(xpath = "//a[@class=\"action action-menu permanent\"]")
    public WebElement favoritesModuleActionIcon;

    public void setActionIcon(int indexNumber){
        actionIcon.get(indexNumber).click();

            }
    public String filesText(int indexNumber){
            String text="";
        for (WebElement each:fileName) {
            if (fileName.get(indexNumber).equals(each)){
               text= each.getText();
            }
        }
        return text;

    }



}
