package com.fleet.pages;

import com.fleet.utilities.Driver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckboxesAPPage {


    public static Alert usernameInput;

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

 //  @FindBy(xpath = "//ul[@class='dropdown-menu dropdown-menu__select-all-header-cell detach dropdown-menu__floating']//li//a[@href='#'][normalize-space()='None']")
   // public WebElement dropdownMenu;
}
//span[normalize-space()='Vehicles']
//span[@class='title title-level-1'][normalize-space()='Fleet']
//lid attribute is not available for this elementi[class='dropdown
// dropdown-level-1 align-menu-right'] span[class='title title-level-1
//ul[@class='dropdown-menu dropdown-menu__select-all-header-cell detach dropdown-menu__floating']//li//a[@href='#'][normalize-space()='None']
//div[@class='btn-group dropdown open']
// button[@class='btn btn-default btn-small dropdown-toggle']
//div[class='btn-group dropdown open'] input[type='checkbox']
//div[@class='btn-group dropdown open']//i[@class='caret']
//ul[@class='dropdown-menu dropdown-menu__select-all-header-cell detach dropdown-menu__floating']//li//a[@href='#'][normalize-space()='None']
//tr[@class='grid-row row-click-action mouse-down row-selected']
// td[@class='select-row-cell renderable grid-cell
// grid-body-cell grid-body-cell-massAction']
//tr[@class='grid-row row-click-action mouse-down row-selected']//td[@class='select-row-cell renderable grid-cell grid-body-cell grid-body-cell-massAction']