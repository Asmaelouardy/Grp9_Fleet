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

    @FindBy(xpath = "//li[@class='dropdown dropdown-level-1']")
    public WebElement Fleet;

    @FindBy(xpath="//span[.='Vehicle Contracts']")
    public WebElement VehicleContracts;

    @FindBy(xpath="//div[.='You do not have permission to perform this action.']")
    public WebElement permissionMessage;


}
