package com.WebMbtest.UI.stepDefs;

import com.WebMbTest.UI.dataProviders.ConfigReader;
import com.WebMbTest.UI.methods.Helper;
import com.WebMbTest.UI.pageObjectNAlymjan.HomePage;
import com.WebMbTest.UI.pageObjectNAlymjan.MajorPage;
import com.WebMbTest.UI.pageObjectNAlymjan.PayForService;
import com.WebMbTest.UI.utils.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;

public class MegacomNASteps {
    WebDriver driver = Driver.getDriver();
    HomePage homePage = new HomePage();
    MajorPage majorPage = new MajorPage();

    PayForService payForService = new PayForService();



    @Given("пользователь в тестовом портале Н.Алымжана")
    public void пользователь_в_тестовом_портале_н_алымжана() {
        driver.get(ConfigReader.getProperty("environment"));
        Helper.sendKeys(homePage.полеВводаНомераТелефона, "999160199");
        Helper.sendKeys(homePage.полеВводаПароля, "qwe123##");
        Helper.click(homePage.кнопкаВойти);
        Helper.pause(3000);
        Helper.click(majorPage.оплатить);
    }
    @Given("кликаем на иконку оплатить услуги")
    public void кликаем_на_иконку_оплатить_услуги() {
       Helper.click(payForService.иконкаОплатитьУслуги);
    }
    @Given("далее услиги Pay24")
    public void далее_услиги_pay24() {
      Helper.click(payForService.УслугиPay24);
    }
    @Given("Megacom")
    public void megacom() {
       Helper.click(payForService.иконкаMegacom);
    }
    @Given("вводим номер телефона")
    public void вводим_номер_телефона() {
        Helper.sendKeys(payForService.полеВводаНомераМегаком,"999015635");
    }
    @Given("вводим сумму оплаты")
    public void вводим_сумму_оплаты() {
       Helper.sendKeys(payForService.полеВводаСуммы,"10");
    }
    @Given("кликаем на продолжить")
    public void кликаем_на_продолжить() {
     Helper.click(payForService.конопкаПродолжитьВМегаком);
    }

    @Then("кликаем на оплатить")
    public void кликаем_на_оплатить() {
      Helper.click(payForService.кнопкаОплатитьВМегаком);
      Helper.pause(3000);
    }


}
