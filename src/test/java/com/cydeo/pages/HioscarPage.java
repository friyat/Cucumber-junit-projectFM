package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HioscarPage {

    public HioscarPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public void selectOption (String option) {
        Driver.getDriver().findElement(By.xpath("//div//li[contains(@id, '" + option + "')]")).click();
    }
    @FindBy(xpath = "//button[.='Search network']")
    public WebElement searchNetwork;

    @FindBy(xpath = "(//div[@class='Dropdown_visibleContent__NGHUm'])[1]")
    public WebElement dropdownSelect2023;

   // @FindBy(xpath = "//div[@aria-selected='true']")
   // public WebElement select2023;

    @FindBy(xpath = "(//div[@class='Dropdown_visibleContent__NGHUm'])[2]")
    public WebElement selectEmployer;

    @FindBy(xpath = "(//div[@class='Dropdown_visibleContent__NGHUm'])[3]")
    public WebElement partnerSelectOscar;

    @FindBy(xpath = "(//div[@class='Dropdown_visibleContent__NGHUm'])[3]")
    public WebElement selectState;

    @FindBy(xpath = "(//button[@type='button'])[2]")
    public WebElement continueBut;



}
