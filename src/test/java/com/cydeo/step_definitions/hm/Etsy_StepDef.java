package com.cydeo.step_definitions.hm;

import com.cydeo.pages.homework.EtsyPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Etsy_StepDef {

    EtsyPage etsy = new EtsyPage();
    @Given("user is on etsy home page")
    public void user_is_on_etsy_home_page() {
        Driver.getDriver().get("https://www.etsy.com/?ref=lgo");

    }
    @When("user types {string} in the etsy search box")
    public void user_types_in_the_etsy_search_box(String string) {
        etsy.searchBox.sendKeys("women bag");


    }
    @When("user clicks etsy search button")
    public void user_clicks_etsy_search_button() {
        etsy.searchButton.click();

    }
    @Then("user sees {string} is in the etsy")
    public void user_sees_is_in_the_etsy(String string) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("women bag"));

    }


}
