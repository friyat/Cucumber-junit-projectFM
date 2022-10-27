package com.cydeo.step_definitions;

import com.cydeo.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class Hooks {

    @After
    public void teardownScenario() {
        //We will implement taking screenshot in this method
        //System.out.println("It will be closing browser using cucumber @After each scenario");
        Driver.closeDriver();
    }
    @Before
    public void setupScenario(){
        System.out.println("setting up browser using cucumber @Before each scenario");
        Driver.getDriver().get("URL of your app");
    }



    //@Before(value = "@login",order=2)
    public void setupForLogin(){
        //If you want any code to run before any specific feature/scenario,
        //you can use value= "@tagname" to determine this
        System.out.println("===this will only apply to scenario with @login tag");
    }
   // @Before(value="@db", order=3)
    //public void setupDatabaseScenario("---------> applying setup using" ) {

    }

      //  @BeforeStep
    //public void setupScenarioStep(){
      //  System.out.println("");
    //}
    //@After
   // public void

