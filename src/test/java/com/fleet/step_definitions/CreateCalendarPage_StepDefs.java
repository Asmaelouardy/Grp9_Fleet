package com.fleet.step_definitions;

import com.fleet.pages.CreateCalendarPage_Page;
import com.fleet.pages.LoginPage;
import com.fleet.utilities.BrowserUtils;
import com.fleet.utilities.ConfigurationReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.Select;

public class CreateCalendarPage_StepDefs {

    CreateCalendarPage_Page createCalendarPagePage = new CreateCalendarPage_Page();
    @When("the user clicks on Activities module")
    public void the_user_clicks_on_activities_module() {
        createCalendarPagePage.activitiesModule.click();
    }

    @When("user selects Calendar Events dropdown")
    public void user_selects_calendar_events_dropdown() {
        createCalendarPagePage.calendarEventsDropdown.click();
    }
    @Then("user clicks on Create Calendar Events and lands on Calendar Event page")
    public void user_clicks_on_create_calendar_events_and_lands_on_calendar_event_page() {

        createCalendarPagePage.createCalendarEvenBtn.click();
    }






}



