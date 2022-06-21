package com.WebMbTest.UI.pageObjectNAlymjan.pageObjectModelPupkinIvan;

import com.WebMbTest.UI.utils.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ByPhonePupkinIvan {
    public ByPhonePupkinIvan() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[contains(text(),'Продолжить')]")
    public WebElement продолжитьвПереводеПоНомеруТ;
}
