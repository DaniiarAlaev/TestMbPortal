package com.WebMbTest.UI.pageObjectNAlymjan.pageObjectModelPupkinIvan;

import com.WebMbTest.UI.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BetweenAccountsPupkinIvan {

    public BetweenAccountsPupkinIvan() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//div[@class='ant-row ant-form-item floating-label']//span[@class='ant-select-selection-search']")
    public WebElement полеВыбораСчета2;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/section[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/span[2]/div[1]")
    public WebElement полеВыборасчета1;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/section[1]/main[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]")

    public WebElement сомовыйСчет1;

    @FindBy(css = "div[class='ant-select-item ant-select-item-option ant-select-item-option-active'] div[class='product-select-item-title'] span")

    public WebElement сомовыйСчет2;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/section[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]")
    public WebElement продолжить;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/section[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[4]/div[1]/div[1]/button[1]")
    public WebElement перевести;

    @FindBy(xpath = "//input[@id='amount']")
    public WebElement полеВводаСуммы;

}
