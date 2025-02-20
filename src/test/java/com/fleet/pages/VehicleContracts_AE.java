package com.fleet.pages;

import com.fleet.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class VehicleContracts_AE {
    public VehicleContracts_AE(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id="prependedInput")
    public WebElement usernameInput;

    @FindBy(id = "prependedInput2")
    public WebElement passwordInput;

    @FindBy(id = "_submit")
    public WebElement loginBtn;

    @FindBy(xpath = "//li[@class='dropdown dropdown-level-1']")
    public WebElement Fleet;

    @FindBy(xpath="//span[.='Vehicle Contracts']")
    public WebElement VehicleContracts;

}
