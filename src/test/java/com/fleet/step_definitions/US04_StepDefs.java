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

    @When("user should be able to see fleet module_AE")
    public void userShouldBeAbleToSeeFleetModule_AE() {
        BrowserUtils.waitFor(3);
        vehicleContracts_ae.Fleet.click();
    }

    @Then("user clicks on Fleet modules and lands on Vehicle Contracts page")
    public void userClicksOnFleetModulesAndLandsOnVehicleContractsPage() {
        BrowserUtils.waitFor(5);
        vehicleContracts_ae.VehicleContracts.click();
        BrowserUtils.waitFor(5);

    }

    @Then("User sees {string} in the Vehicle Contracts title_AE")
    public void userSeesInTheVehicleContractsTitle_AE() {
        BrowserUtils.waitFor(10);
        String expectedTitle = "All - Vehicle Contract - Entities - System - Car - Entities - System";
        BrowserUtils.verifyTitle(expectedTitle);
    }

    @And("Then User sees {string} in the Vehicle Contracts url_AE")
    public void thenUserSeesInTheVehicleContractsUrl_AE() {
        BrowserUtils.waitFor(5);
        String expectedUrl = "https://qa1.vytrack.com/entity/Extend_Entity_VehicleContract";
        String actualTUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(actualTUrl, expectedUrl);
    }
    @Then("user should NOT access the Vehicle Contracts page")
    public void userShouldNOTAccessTheVehicleContractsPage() {
        BrowserUtils.waitFor(2);
    }

    @And("user should see {string}")
    public void userShouldSee(String expectedMessage) {
        String actualMessage = vehicleContracts_ae.permissionMessage.getText();
        Assert.assertEquals(actualMessage, expectedMessage);
    }
}
