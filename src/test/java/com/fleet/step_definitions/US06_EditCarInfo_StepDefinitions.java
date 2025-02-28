package com.fleet.step_definitions;

import com.fleet.pages.US06_EditCarInfo_Page;
import com.fleet.utilities.BrowserUtils;
import com.fleet.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

public class US06_EditCarInfo_StepDefinitions {



    US06_EditCarInfo_Page editCarInfoPage = new US06_EditCarInfo_Page();

    Actions actions = new Actions(Driver.getDriver());


    @Then("Hover over the Fleet module")
    public void hover_over_the_fleet_module() {
        actions.moveToElement(editCarInfoPage.fleetButton_OE).perform();

        BrowserUtils.sleep(3);

    }

    @Then("click on vehicle from the dropdown list")
    public void click_on_vehicle_from_the_dropdown_list() {
        editCarInfoPage.vehicleButton_OE.click();

    }
    @Then("hover the mouse over the 3 dots “...”")
    public void hover_the_mouse_over_the_dots(Integer int1) {
        actions.moveToElement(editCarInfoPage.dropdownToggle_OE).perform();

    }
    @Then("user can see “view, edit, delete” options")
    public void user_can_see_view_edit_delete_options() {

        Assert.assertTrue(editCarInfoPage.viewButton_OE.isDisplayed());
        Assert.assertTrue(editCarInfoPage.editButton_OE.isDisplayed());
        Assert.assertTrue(editCarInfoPage.deleteButton_OE.isDisplayed());

    }



}
