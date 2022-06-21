package com.WebMbTest.UI.pageObjectNAlymjan;

import com.WebMbTest.UI.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BetweenUserAccounts {

    public BetweenUserAccounts() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//div[@class='products-action-buttons-wrapper']//button[2]")
    public WebElement перевести;

    @FindBy(xpath = "//span[contains(text(),'Между счетами')]")
    public WebElement междуСчетами;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/section[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/span[2]/div[1]")

    public WebElement дропДаунменю;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/section[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/span[1]")
    public WebElement второйДропдаунМеню;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/section[1]/main[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]")
    public WebElement сомовыйСчет690k;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/section[1]/main[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]")
    public WebElement второйСомовыйСчет1301k;

    @FindBy(css = "#amount")
    public WebElement полеВводаСуммы;

    @FindBy(css = "button[type='submit'] span")
    public WebElement кнопкаПродолжить;

    @FindBy(xpath = "//span[contains(text(),'Перевести')]")
    public WebElement кнопкапПеревести;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/section[1]/main[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[2]/span[1]/span[1]")
    public WebElement долларовыйСчет2120;

}
