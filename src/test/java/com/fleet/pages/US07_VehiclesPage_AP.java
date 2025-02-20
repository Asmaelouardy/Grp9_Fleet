package com.fleet.pages;

import com.fleet.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US07_VehiclesPage_AP {


    public US07_VehiclesPage_AP() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[@class='title title-level-1'][normalize-space()='Fleet']")
    public WebElement fleetButtonAP;


    @FindBy(xpath = "//span[@class='title title-level-2'][normalize-space()='Vehicles']")
    public WebElement VehiclesButtonAP;

    @FindBy(xpath = "//input[@type='checkbox']")
    public WebElement checkboxAP;

    @FindBy(xpath = "//button[@class='btn btn-default btn-small dropdown-toggle']")
    public WebElement clickButtonAP;

    @FindBy(xpath = "//ul[@class='dropdown-menu dropdown-menu__select-all-header-cell detach dropdown-menu__floating']//li//a[@href='#'][normalize-space()='None']")
    public WebElement groupButtonAP;


    @FindBy(xpath = "//input[@tabindex='-1']")
    public WebElement selectAnyAP;


}

