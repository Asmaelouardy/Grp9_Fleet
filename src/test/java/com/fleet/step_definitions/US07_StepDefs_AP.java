package com.fleet.step_definitions;

import com.fleet.pages.US07Page_AP;
import com.fleet.pages.LoginPage;
import com.fleet.utilities.BrowserUtils;
import com.fleet.utilities.ConfigurationReader;
import com.fleet.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;

    public class US07_StepDefs_AP {


        @Given("user is on the login page")
        public void user_is_on_the_login_page() {
            Driver.getDriver().get("https://qa3.vytrack.com/");

        }

        LoginPage loginPage = new LoginPage();

        @When("the user clicks the login button")
        public void user_enters_the_driver_information() {
            loginPage.userName.sendKeys(ConfigurationReader.getProperty("sales_manager_username") + Keys.ENTER);
            loginPage.password.sendKeys(ConfigurationReader.getProperty("sales_manager_password") + Keys.ENTER);
        }

        @Then("the user clicks the fleet options")
        public void theUserClicksTheFleetOptions() {

            US07Page_AP checkboxesAPPage = new US07Page_AP();
            checkboxesAPPage.fleetButton.click();
            BrowserUtils.sleep(3);

        }


        @Then("the user should be able to select any vehicle from the Vehicles page")
        public void theUserShouldBeAbleToSelectAnyVehicleFromTheVehiclesPage() {

            US07Page_AP checkboxesAPPage = new US07Page_AP();
            checkboxesAPPage.VehiclesButton.click();

        }

        @And("user can check the first checkbox to select all cars")
        public void userCanCheckTheFirstCheckboxToSelectAllCars() {

            US07Page_AP checkboxesAPPage = new US07Page_AP();
            checkboxesAPPage.checkbox.click();

            BrowserUtils.sleep(2);
            checkboxesAPPage.clickButton.click();



        }

        @Then("user clear the checkbox to select any car")
        public void userClearTheCheckboxToSelectAnyCar() {
            US07Page_AP checkboxesAPPage = new US07Page_AP();
            checkboxesAPPage.groupButton.click();
            BrowserUtils.sleep(2);
            //    checkboxesAPPage.dropdownMenu.click();*/


        }


        @Then("user can select any car")
        public void userCanSelectAnyCar() {

            US07Page_AP checkboxesAPPage = new US07Page_AP();
            checkboxesAPPage.selectAny.click();
            BrowserUtils.sleep(2);




        }

    }






