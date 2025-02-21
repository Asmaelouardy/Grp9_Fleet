package com.fleet.pages;

import com.fleet.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class US10_DescriptionFieldPage_BB {

    public US10_DescriptionFieldPage_BB(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//iframe")
    public WebElement frame;

    @FindBy(xpath = "//body[@id='tinymce']")
    public WebElement descriptionField;

    @FindBy(xpath = "//p")
    public WebElement paragraphText;

}
