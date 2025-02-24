package com.fleet.step_definitions;

import com.fleet.pages.LoginPage;
import com.fleet.pages.US02_OroincDocumentationPage;
import com.fleet.utilities.BrowserUtils;
import com.fleet.utilities.ConfigurationReader;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;

public class US02_StepDefinitions {

    US02_OroincDocumentationPage documentationPage = new US02_OroincDocumentationPage();





    @When("the user clicks the login button CC")
    public void theUserClicksTheLoginButtonCC() {

        LoginPage loginPage = new LoginPage();

        loginPage.userName.sendKeys(ConfigurationReader.getProperty("driver_username") + Keys.ENTER);
        loginPage.password.sendKeys(ConfigurationReader.getProperty("driver_password") + Keys.ENTER);
    }





    @Then("user clicks question mark access the documentation page CC")
    public void user_clicks_question_mark_access_the_documentation_page_cc() {
        documentationPage.questionMark.click();

    }
    @Then("Verify access the Oroinc Documentation page CC")
    public void verify_access_the_oroinc_documentation_page_cc() {
        BrowserUtils.switchWindowAndVerify("https://doc.oroinc.com/", "Welcome to Oro Documentation");

    }


}
