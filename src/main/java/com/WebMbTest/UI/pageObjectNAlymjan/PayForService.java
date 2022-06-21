package com.WebMbTest.UI.pageObjectNAlymjan;

import com.WebMbTest.UI.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PayForService {

    public PayForService(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "/html[1]/body[1]/div[1]/section[1]/main[1]/div[1]/div[2]/div[1]/div[1]/button[1]")
    public WebElement иконкаОплатитьУслуги;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/section[1]/main[1]/div[1]/div[2]/div[2]/button[1]/span[2]")
    public WebElement УслугиPay24;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/section[1]/main[1]/div[1]/div[3]/div[2]/button[3]/span[2]")
    public WebElement иконкаMegacom;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/section[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[3]/form[1]/div[1]/div[2]/div[1]/div[1]/input[1]")
    public WebElement полеВводаНомераМегаком;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/section[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[3]/form[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/input[1]")
    public WebElement полеВводаСуммы;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/section[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[3]/form[1]/div[3]/div[1]/button[1]/span[1]")
    public WebElement конопкаПродолжитьВМегаком;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/section[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/button[1]/span[1]")
    public WebElement кнопкаОплатитьВМегаком;

}
