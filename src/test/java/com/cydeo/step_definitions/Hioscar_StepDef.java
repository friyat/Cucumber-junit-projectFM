package com.cydeo.step_definitions;

import com.cydeo.pages.HioscarPage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Hioscar_StepDef {

    HioscarPage hioscarPage = new HioscarPage();

    @Given("Go to {string}")
    public void go_to(String string) {
        Driver.getDriver().get(ConfigurationReader.getProperty("env2"));

    }

    @When("Click Search network")
    public void click_search_network() {
        hioscarPage.searchNetwork.click();

    }
    @When("From Coverage year dropdown Select \"{int}\"option")
    public void from_coverage_year_dropdown_select_option(Integer int1) {
        hioscarPage.dropdownSelect2023.click();
        

       // hioscarPage.select2023.click();


    }
    @When("From Coverage access dropdown {string} option")
    public void from_coverage_access_dropdown_option(String string) {
        hioscarPage.selectEmployer.click();

    }
    @When("From Network partner dropdown Select {string} option")
    public void from_network_partner_dropdown_select_option(String string) {
        hioscarPage.partnerSelectOscar.click();

    }
    @When("From Coverage area dropdown Select {string}")
    public void from_coverage_area_dropdown_select(String string) {
        hioscarPage.partnerSelectOscar.click();

    }

    @When("Click Continue button")
    public void click_continue_button() {
        hioscarPage.selectState.click();

    }
    @Then("Verify title contains “Oscar”")
    public void verify_title_contains_oscar() {
        hioscarPage.continueBut.click();


}
}