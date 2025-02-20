package com.fleet.pages;

import com.fleet.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateCalendarPage_Page {
    public CreateCalendarPage_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//div[@id='main-menu']/ul/li[5]")
    public WebElement activitiesModule;

    @FindBy(xpath = "//a[.='Calendar Events']")
    public WebElement calendarEventsDropdown;

    @FindBy(xpath = "//a[@class='btn main-group btn-primary pull-right ']")
    public WebElement createCalendarEvenBtn;
}
