package com.cydeo.utilities;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;


public class BrowserUtils {

    //Methods are static.Because we do not want to creat an object to call those methods.
    //We just want to call those methods with class name.


    public static void sleep(int seconds) {
        // 1 second = 1000 millis
        //millis = seconds * 1000


        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("Exception happened in sleep method");
        }
    }

    //Method info:
    //• Name: verifyTitle()
    //• Return type: void
    //• Arg1: WebDriver
    //• Arg2: String expectedTitle
    public static void verifyTitle(WebDriver driver, String expectedTitle){
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(expectedTitle,Driver.getDriver().getTitle());
    }

}