package com.fleet.pages;

import com.fleet.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class US05_VehicleModelsViewPage {



    public US05_VehicleModelsViewPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

   // @FindBy(xpath = "(//span[contains(@class, 'title')])[4]")


}
