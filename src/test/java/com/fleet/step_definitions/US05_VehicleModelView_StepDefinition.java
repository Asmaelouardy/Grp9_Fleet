package com.fleet.step_definitions;

import com.fleet.pages.LoginPage;
import com.fleet.pages.US05_VehicleModelsViewPage;
import com.fleet.pages.US07_VehiclesPage_AP;
import com.fleet.utilities.BrowserUtils;
import com.fleet.utilities.ConfigurationReader;
import com.fleet.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
        US05_VehicleModelsViewPage homePage = new US05_VehicleModelsViewPage();
        homePage.fleetOptions.click();
        US07_VehiclesPage_AP us07VehiclesPageAp = new US07_VehiclesPage_AP();
        us07VehiclesPageAp.VehicleModelPage.click();

        BrowserUtils.sleep(4);

    }
    @Then("verify that the user can view columns on the vehicle models page")
    public void verify_that_the_user_can_view_columns_on_the_vehicle_models_page() {
       // System.out.println("User verifies the columns on the Vehicle Models page ");

        String actualPage = Driver.getDriver().getTitle();
        String expectedPage = "vehicle models";
        Assert.assertEquals(actualPage,actualPage);
        US05_VehicleModelsViewPage modelsPage = new US05_VehicleModelsViewPage();
        List<String> expectedColumnNames = new ArrayList<>(Arrays.asList("MODEL NAME", "MAKE", "CAN BE REQUESTED", "CVVI", "CO2 FEE (/MONTH)",
                "COST (DEPRECIATED)", "TOTAL COST (DEPRECIATED)", "CO2 EMISSIONS",
                "FUEL TYPE", "VENDORS"));
      List<String> actualColumnNames = BrowserUtils.getElementsText(modelsPage.columnNames);
         Assert.assertEquals(actualColumnNames,expectedColumnNames);



    }



}
