package com.fleet.step_definitions;

import com.fleet.pages.VehicleContracts_AE;
import com.fleet.utilities.BrowserUtils;
import com.fleet.utilities.ConfigurationReader;
import com.fleet.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class US04_StepDefs {

    VehicleContracts_AE vehicleContracts_ae = new VehicleContracts_AE();


    @When("user should be able to see fleet module")
    public void userShouldBeAbleToSeeFleetModule() {
        vehicleContracts_ae.Fleet.click();
    }

    @Then("user clicks on Fleet modules and lands on Vehicle Contracts page")
    public void userClicksOnFleetModulesAndLandsOnVehicleContractsPage() {
        vehicleContracts_ae.VehicleContracts.click();
    }


}
