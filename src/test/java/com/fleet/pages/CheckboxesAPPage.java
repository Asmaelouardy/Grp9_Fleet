package com.fleet.pages;

import com.fleet.utilities.Driver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckboxesAPPage {




    public CheckboxesAPPage() {
        PageFactory.initElements(Driver.getDriver(), this);


    }

    @FindBy(xpath = "//span[@class='title title-level-1'][normalize-space()='Fleet']")
    public WebElement fleetButton;


    @FindBy(xpath ="//span[@class='title title-level-2'][normalize-space()='Vehicles']")
    public WebElement VehiclesButton;


   @FindBy(xpath = "//input[@type='checkbox']")
    public WebElement checkbox;

   @FindBy(xpath = "//button[@class='btn btn-default btn-small dropdown-toggle']")
   public WebElement clickButton;

   @FindBy(xpath="//ul[@class='dropdown-menu dropdown-menu__select-all-header-cell detach dropdown-menu__floating']//li//a[@href='#'][normalize-space()='None']")
    public WebElement groupButton;


   @FindBy(xpath = "//input[@tabindex='-1']")
    public WebElement selectAny;


}

