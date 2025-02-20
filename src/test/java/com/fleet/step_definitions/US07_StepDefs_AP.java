package com.fleet.step_definitions;

import com.fleet.pages.US07_VehiclesPage_AP;
import com.fleet.pages.LoginPage;
import com.fleet.utilities.BrowserUtils;
import com.fleet.utilities.ConfigurationReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;

import java.util.List;

public class US07_StepDefs_AP {


        LoginPage loginPage = new LoginPage();

        @When("the user clicks the login button AP")
        public void user_enters_the_driver_information() {
            loginPage.userName.sendKeys(ConfigurationReader.getProperty("sales_manager_username") + Keys.ENTER);
            loginPage.password.sendKeys(ConfigurationReader.getProperty("sales_manager_password") + Keys.ENTER);

        }
        @Then("the user clicks the fleet options AP")
        public void theUserClicksTheFleetOptions() {

            US07_VehiclesPage_AP checkboxesAPPage = new US07_VehiclesPage_AP();
            checkboxesAPPage.fleetButtonAP.click();
            BrowserUtils.sleep(3);

        }


        @Then("the user should be able to select any vehicle from the Vehicles page AP")
        public void theUserShouldBeAbleToSelectAnyVehicleFromTheVehiclesPage() {

            US07_VehiclesPage_AP checkboxesAPPage = new US07_VehiclesPage_AP();
            checkboxesAPPage.VehiclesButtonAP.click();

        }

        @And("user can check the first checkbox to select all cars AP")
        public void userCanCheckTheFirstCheckboxToSelectAllCars() {

            US07_VehiclesPage_AP checkboxesAPPage = new US07_VehiclesPage_AP();
            checkboxesAPPage.checkboxAP.click();

            BrowserUtils.sleep(2);
            checkboxesAPPage.clickButtonAP.click();
        }

        @Then("user clear the checkbox to select any car AP")
        public void userClearTheCheckboxToSelectAnyCar() {
            US07_VehiclesPage_AP checkboxesAPPage = new US07_VehiclesPage_AP();
            checkboxesAPPage.groupButtonAP.click();
            BrowserUtils.sleep(2);
        }


        @Then("user can select any car AP")
        public void userCanSelectAnyCar() {

            US07_VehiclesPage_AP checkboxesAPPage = new US07_VehiclesPage_AP();
            checkboxesAPPage.selectAnyAP.click();
            BrowserUtils.sleep(2);

        }

    }






