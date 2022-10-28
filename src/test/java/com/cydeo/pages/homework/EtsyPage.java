package com.cydeo.pages.homework;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EtsyPage {
    /*TC#51: Etsy Title Verification
1. User is on https://www.etsy.com
2. User sees title is as expected.

Expected: Etsy - Shop for handmade, vintage, custom, and unique gifts for
everyone

Note: Follow POM
     */
    public EtsyPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(name="search_query")
    public WebElement searchBox;

    @FindBy(xpath = "//span[@class='wt-icon wt-nudge-b-2 wt-nudge-r-1']//*[name()='svg']")
    public WebElement searchButton;

}
