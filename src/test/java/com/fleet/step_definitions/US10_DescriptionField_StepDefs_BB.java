package com.fleet.step_definitions;

import com.fleet.pages.US10_DescriptionFieldPage_BB;
import com.fleet.utilities.BrowserUtils;
import com.fleet.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US10_DescriptionField_StepDefs_BB {

    US10_DescriptionFieldPage_BB us10DescriptionFieldPageBb = new US10_DescriptionFieldPage_BB();
    @Given("user is on the Creat Calendar page BB")
    public void user_is_on_the_creat_calendar_page_bb() {

        Driver.getDriver().get("https://qa3.vytrack.com/calendar/event/create");
    }
    @When("user clicks on the Description field BB")
    public void user_clicks_on_the_description_field_bb() {

        BrowserUtils.sleep(2);
        Driver.getDriver().switchTo().frame(us10DescriptionFieldPageBb.frame);
        us10DescriptionFieldPageBb.descriptionField.click();

    }
    @When("user types a message in the Description BB")
    public void user_types_a_message_in_the_description_bb() {
        us10DescriptionFieldPageBb.descriptionField.sendKeys("Hello");

    }
    @Then("the typed message should be displayed BB")
    public void the_typed_message_should_be_displayed_bb() {
       Assert.assertTrue(us10DescriptionFieldPageBb.paragraphText.isDisplayed());
    }
}
