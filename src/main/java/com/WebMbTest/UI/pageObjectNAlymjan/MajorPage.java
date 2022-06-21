package com.WebMbTest.UI.pageObjectNAlymjan;

import com.WebMbTest.UI.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MajorPage {

    public MajorPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(css = "a[href='/pay']")
    public WebElement оплатить;


}
