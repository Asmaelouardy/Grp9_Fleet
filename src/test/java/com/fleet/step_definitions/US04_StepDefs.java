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
    @Then("user clicks on Fleet modules and lands on Vehicle Contracts page_AE")
    public void userClicksOnFleetModulesAndLandsOnVehicleContractsPage_AE() {
        BrowserUtils.sleep(2);
        vehicleContracts_ae.VehicleContracts.click();
        BrowserUtils.sleep(2);
    }

    @Then("User sees {string} in the Vehicle Contracts title_AE")
    public void userSeesInTheVehicleContractsTitle_AE(String expectedTitle) {
        BrowserUtils.waitFor(2);
        BrowserUtils.verifyTitle(expectedTitle);
    }

    @And("Then User sees {string} in the Vehicle Contracts url_AE")
    public void thenUserSeesInTheVehicleContractsUrl_AE(String expectedUrl) {
        BrowserUtils.waitFor(2);

        //String expectedUrl = "https://qa1.vytrack.com/entity/Extend_Entity_VehicleContract";
        //BrowserUtils.verifyURLContains(expectedUrl);

        String actualTUrl = Driver.getDriver().getCurrentUrl();
        System.out.println("actualTUrl = " + actualTUrl);
        Assert.assertTrue(actualTUrl.contains(expectedUrl));


    }
    @Then("user should NOT access the Vehicle Contracts page_AE")
    public void userShouldNOTAccessTheVehicleContractsPage_AE() {
        BrowserUtils.waitFor(2);
    }
    @And("user should see {string}_AE")
    public void userShouldSee_AE(String expectedMessage) {
        String actualMessage = vehicleContracts_ae.permissionMessage.getText();
        Assert.assertEquals(actualMessage, expectedMessage);
    }
}
