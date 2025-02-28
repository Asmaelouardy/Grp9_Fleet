package com.fleet.pages;

import com.fleet.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US06_EditCarInfo_Page {

    public US06_EditCarInfo_Page(){

        PageFactory.initElements(Driver.getDriver(), this);

    }


    @FindBy(xpath = "//span[@class='title title-level-1']/i[@class='fa-asterisk menu-icon']")
    public WebElement fleetButton_OE;

    @FindBy(xpath = "//span[@class='title title-level-2'][normalize-space()='Vehicles']")
    public WebElement vehicleButton_OE;

    @FindBy(xpath = "//div[@class='dropdown']")
    public WebElement dropdownToggle_OE;

    @FindBy(xpath = "//a[@href=\"/entity/view/Extend_Entity_Carreservation/item/80']")
    public WebElement viewButton_OE;

    @FindBy(xpath = "//a[@href='/entity/update/Extend_Entity_Carreservation/item/80']")
    public WebElement editButton_OE;

    @FindBy(xpath = "//a[@title='Delete']")
    public WebElement deleteButton_OE;

}
