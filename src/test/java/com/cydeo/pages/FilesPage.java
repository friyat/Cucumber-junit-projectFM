package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FilesPage {

    public FilesPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[@class='recommendation']")
    public WebElement filesModule;

    @FindBy()
    public WebElement verifyPageTitle;

    @FindBy(xpath = "//label[@for='select-files-32986']")
    public WebElement clickCheckbox;

    @FindBy(xpath = "//label[@for='select_all_files']")
    public WebElement SelectAllFiles;
}
