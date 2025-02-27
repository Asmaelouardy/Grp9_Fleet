package com.fleet.step_definitions;

import com.fleet.pages.US01_AccessMainModulesPage_TK;
import com.fleet.pages.LoginPage;
import com.fleet.utilities.ConfigurationReader;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class US01_StepDefs_TK {

    WebDriver driver;
    LoginPage loginPage;
    US01_AccessMainModulesPage_TK mainModulesPage;

    public US01_StepDefs_TK(WebDriver driver) {
        this.driver = driver;
        this.loginPage = new LoginPage();
        this.mainModulesPage = new US01_AccessMainModulesPage_TK();
    }

    @When("the user clicks login as sales manager")
    public void loginAsSalesManager() {
        loginPage.userName.sendKeys(ConfigurationReader.getProperty("sales_manager_username") + Keys.ENTER);
        loginPage.password.sendKeys(ConfigurationReader.getProperty("sales_manager_password") + Keys.ENTER);
    }

    @Then("user should be able to see expected manager module_names")
    public void verifyManagerModuleNames() {
        Assert.assertTrue(mainModulesPage.DashboardModule.isDisplayed());
        Assert.assertTrue(mainModulesPage.FleetModule.isDisplayed());
        Assert.assertTrue(mainModulesPage.CustomersModule.isDisplayed());
        Assert.assertTrue(mainModulesPage.SalesModule.isDisplayed());
        Assert.assertTrue(mainModulesPage.ActivitiesModule.isDisplayed());
        Assert.assertTrue(mainModulesPage.MarketingModule.isDisplayed());
        Assert.assertTrue(mainModulesPage.ReportsModule.isDisplayed());
        Assert.assertTrue(mainModulesPage.SystemModule.isDisplayed());
    }

    @When("the user clicks login as store manager")
    public void loginAsStoreManager() {
        loginPage.userName.sendKeys(ConfigurationReader.getProperty("store_manager_username") + Keys.ENTER);
        loginPage.password.sendKeys(ConfigurationReader.getProperty("store_manager_password") + Keys.ENTER);
    }

    @When("the user clicks login in as driver")
    public void loginAsDriver() {
        loginPage.userName.sendKeys(ConfigurationReader.getProperty("driver_username") + Keys.ENTER);
        loginPage.password.sendKeys(ConfigurationReader.getProperty("driver_password") + Keys.ENTER);
    }

    @Then("user should be able to see expected driver UI Names")
    public void verifyDriverUI() {
        Assert.assertTrue(mainModulesPage.DriverFleetModule.isDisplayed());
        Assert.assertTrue(mainModulesPage.DriverCustomerModule.isDisplayed());
        Assert.assertTrue(mainModulesPage.DriverActivitiesModule.isDisplayed());
        Assert.assertTrue(mainModulesPage.DriverSystemModule.isDisplayed());
    }
}