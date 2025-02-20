package com.fleet.step_definitions;

import com.fleet.pages.CheckboxesAPPage;
import com.fleet.pages.LoginPage;
import com.fleet.utilities.BrowserUtils;
import com.fleet.utilities.ConfigurationReader;
import com.fleet.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

    public class CheckboxesAP_StepDefinition {


        @Given("user is on the login page")
        public void user_is_on_the_login_page() {
            Driver.getDriver().get("https://qa3.vytrack.com/");

        }

        LoginPage loginPage = new LoginPage();

        @When("the user clicks the login button")
        public void user_enters_the_driver_information() {
            loginPage.userName.sendKeys(ConfigurationReader.getProperty("store_manager_username") + Keys.ENTER);
            loginPage.password.sendKeys(ConfigurationReader.getProperty("store_manager_password") + Keys.ENTER);
        }

        @Then("the user clicks the fleet options")
        public void theUserClicksTheFleetOptions() {

            CheckboxesAPPage checkboxesAPPage = new CheckboxesAPPage();
            checkboxesAPPage.fleetButton.click();
            BrowserUtils.sleep(3);

        }


        @Then("the user should be able to select any vehicle from the Vehicles page")
        public void theUserShouldBeAbleToSelectAnyVehicleFromTheVehiclesPage() {

            CheckboxesAPPage checkboxesAPPage = new CheckboxesAPPage();
            checkboxesAPPage.VehiclesButton.click();

        }

        @And("user can check the first checkbox to select all cars")
        public void userCanCheckTheFirstCheckboxToSelectAllCars() {

            CheckboxesAPPage checkboxesAPPage = new CheckboxesAPPage();
            checkboxesAPPage.checkbox.click();

            BrowserUtils.sleep(2);
            checkboxesAPPage.clickButton.click();



        }

        @Then("user clear the checkbox to select any car")
        public void userClearTheCheckboxToSelectAnyCar() {
            CheckboxesAPPage checkboxesAPPage = new CheckboxesAPPage();
            checkboxesAPPage.groupButton.click();
            BrowserUtils.sleep(2);
            //    checkboxesAPPage.dropdownMenu.click();*/


        }


        @Then("user can select any car")
        public void userCanSelectAnyCar() {

            CheckboxesAPPage checkboxesAPPage = new CheckboxesAPPage();
            checkboxesAPPage.selectAny.click();
            BrowserUtils.sleep(2);




        }

    }






