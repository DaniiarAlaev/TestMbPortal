package com.WebMbTest.UI.pageObjectNAlymjan;

import com.WebMbTest.UI.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    public HomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(css = "#phoneNumber")
    public WebElement полеВводаНомераТелефона;

    @FindBy(css = "#password")
    public WebElement полеВводаПароля;

    @FindBy(css = "button[type='submit']")
    public WebElement кнопкаВойти;




}
