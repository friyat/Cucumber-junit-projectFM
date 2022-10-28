package com.cydeo.step_definitions.hm;

import com.cydeo.pages.homework.EtsySearchPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class EtsySearch_StepDef {
    EtsySearchPage etsySearch = new EtsySearchPage();

    @Given("user is on the etsy home page")
    public void user_is_on_the_etsy_home_page() {
        Driver.getDriver().get("https://www.etsy.com/?ref=lgo");

    }
    @When("user types {string} in the search box")
    public void user_types_in_the_search_box(String string) {
        etsySearch.searchBox.sendKeys("Wooden Spoon");

    }
    @When("user clicks search button")
    public void user_clicks_search_button() {
        etsySearch.searchButton.click();

    }
    @Then("user sees {string} is in the title")
    public void user_sees_is_in_the_title(String string) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Wooden Spoon"));

    }
}
