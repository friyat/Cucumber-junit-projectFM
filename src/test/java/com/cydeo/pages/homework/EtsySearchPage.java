package com.cydeo.pages.homework;

import com.cydeo.step_definitions.hm.EtsySearch_StepDef;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EtsySearchPage {
    /*TC#52: Etsy Search Functionality Title Verification (without parameterization)
1. User is on https://www.etsy.com
2. User types Wooden Spoon in the search box
3. User clicks search button
4. User sees Wooden Spoon is in the title
Note: Follow POM
     */
    public EtsySearchPage(){
        PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(name="search_query")
    public WebElement searchBox;

    @FindBy(xpath = "/span[@class='wt-icon wt-nudge-b-2 wt-nudge-r-1']//*[name()='svg']")
    public WebElement searchButton;


}
