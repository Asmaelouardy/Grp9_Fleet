package com.fleet.step_definitions;

import com.fleet.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class US05_VehicleModelView_StepDefinition {


    @Given("the user is logged in as a Store Manager")
    public void the_user_is_logged_in_as_a_store_manager() {
        System.out.println("User logs in as a store manager");

    }
    @When("the user clicks the fleet options")
    public void the_user_clicks_the_fleet_options() {
        System.out.println("User clicks on the Fleet option");

    }
    @Then("verify that the user can view columns on the vehicle models page")
    public void verify_that_the_user_can_view_columns_on_the_vehicle_models_page() {
        System.out.println("User verifies the columns on the Vehicle Models page ");
    }



}
