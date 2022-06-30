package com.WebMbTest.UI.pageObjectNAlymjan;

import com.WebMbTest.UI.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ByPhone {

    public ByPhone() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "/html[1]/body[1]/div[1]/section[1]/main[1]/div[1]/div[2]/div[1]/div[1]/div[1]/button[2]/span[2]")
    public WebElement иконкаПереводаПоНомеруТелефона;

    @FindBy(xpath = "//input[@id='target']")
    public WebElement полеВводаНомераТелефонаПолучателя;

    @FindBy(css = "button[type='submit'] span")
    public WebElement кнопкаПродолжитьВПереводеПоНомеруТелефона1;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/section[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[6]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]/span[1]")
    public WebElement кнопкаПродолжитьВПереволеПоНомеруТелефона2;


    @FindBy(xpath = "//input[@id='amount']")
    public WebElement полеВводаСуммыВПереводеПоНомеруТелефона;

    @FindBy(xpath = "//span[contains(text(),'Перевести')]")
    public WebElement кнопкаПеревестиВПереводеПоНомеруТелефона;


    @FindBy(xpath = "/html[1]/body[1]/div[1]/section[1]/main[1]/div[1]/div[2]/div[1]/div[1]/div[1]/button[3]/span[2]")
    public WebElement оплатаПоРеквизитам;


}
