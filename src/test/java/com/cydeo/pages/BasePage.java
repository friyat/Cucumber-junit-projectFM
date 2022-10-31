package com.cydeo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage { //basepage is the berger typ

    @FindBy(xpath = "//button[text()='View all orders']")
    public WebElement navItemButton;

    @FindBy(css = "a[href='/products'] button")
    public WebElement navItemButton2;

    @FindBy(xpath = "//button[text()='Order']")
    public WebElement navItemButton3;

    @FindBy(xpath = "//button[text()='Logout']")
    public WebElement logoutButton;


    }

