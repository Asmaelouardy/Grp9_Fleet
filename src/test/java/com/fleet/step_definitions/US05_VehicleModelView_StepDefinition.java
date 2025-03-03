package com.fleet.step_definitions;

import com.fleet.pages.LoginPage;
import com.fleet.pages.US05_VehicleModelsViewPage;
import com.fleet.utilities.BrowserUtils;
import com.fleet.utilities.ConfigurationReader;
import com.fleet.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class US05_VehicleModelView_StepDefinition {




    @Given("the user is logged in as a Store Manager")
    public void the_user_is_logged_in_as_a_store_manager() {
        LoginPage loginPage = new LoginPage();
       // System.out.println("User logs in as a store manager");
        loginPage.userName.sendKeys(ConfigurationReader.getProperty("store_manager_username") + Keys.ENTER);
      loginPage.password.sendKeys(ConfigurationReader.getProperty("store_manager_password") + Keys.ENTER);


    }
    @When("the user clicks the fleet options")
    public void the_user_clicks_the_fleet_options() {
      //  System.out.println("User clicks on the Fleet option");
        US05_VehicleModelsViewPage checkBoxSMPage = new US05_VehicleModelsViewPage();
        checkBoxSMPage.fleetOptions.click();

        BrowserUtils.sleep(4);

    }
    @Then("verify that the user can view columns on the vehicle models page")
    public void verify_that_the_user_can_view_columns_on_the_vehicle_models_page() {
       // System.out.println("User verifies the columns on the Vehicle Models page ");

        String actualPage = Driver.getDriver().getTitle();
        String expectedPage = "vehicle models";
        Assert.assertEquals(actualPage,actualPage);




    }



}
