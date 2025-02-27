package com.fleet.pages;

import com.fleet.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class US01_AccessMainModulesPage_TK {

    public US01_AccessMainModulesPage_TK() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

   //sales manager/store manager modules
    @FindBy(xpath = "/html/body/div[2]/div[2]/header/div[2]/ul/li[1]/a/span")
    public WebElement DashboardModule;

    @FindBy(xpath = "/html/body/div[2]/div[2]/header/div[2]/ul/li[2]/a/span")
    public WebElement FleetModule;

    @FindBy(xpath = "/html/body/div[2]/div[2]/header/div[2]/ul/li[3]/a/span")
    public WebElement CustomersModule;

    @FindBy(xpath = "/html/body/div[2]/div[2]/header/div[2]/ul/li[4]/a/span")
    public WebElement SalesModule;

    @FindBy(xpath = "/html/body/div[2]/div[2]/header/div[2]/ul/li[5]/a/span")
    public WebElement ActivitiesModule;

    @FindBy(xpath = "/html/body/div[2]/div[2]/header/div[2]/ul/li[6]/a/span")
    public WebElement MarketingModule;

    @FindBy(xpath = "/html/body/div[2]/div[2]/header/div[2]/ul/li[7]/a/span")
    public WebElement ReportsModule;

    @FindBy(xpath = "/html/body/div[2]/div[2]/header/div[2]/ul/li[8]/a/span")
    public WebElement SystemModule;

    // Driver Modules
    @FindBy(xpath = "/html/body/div[2]/div[2]/header/div[2]/ul/li[1]/a/span")
    public WebElement DriverFleetModule;

    @FindBy(xpath = "/html/body/div[2]/div[2]/header/div[2]/ul/li[2]/a/span")
    public WebElement DriverCustomerModule;

    @FindBy(xpath = "/html/body/div[2]/div[2]/header/div[2]/ul/li[3]/a/span")
    public WebElement DriverActivitiesModule;

    @FindBy(xpath = "/html/body/div[2]/div[2]/header/div[2]/ul/li[3]/a/span")  // Assuming the same module for Driver, adjust accordingly
    public WebElement DriverSystemModule;
}
