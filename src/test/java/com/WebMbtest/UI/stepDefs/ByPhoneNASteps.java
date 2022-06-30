package com.WebMbtest.UI.stepDefs;

import com.WebMbTest.UI.dataProviders.ConfigReader;
import com.WebMbTest.UI.methods.Helper;
import com.WebMbTest.UI.pageObjectNAlymjan.BetweenUserAccounts;
import com.WebMbTest.UI.pageObjectNAlymjan.ByPhone;
import com.WebMbTest.UI.pageObjectNAlymjan.HomePage;
import com.WebMbTest.UI.pageObjectNAlymjan.MajorPage;
import com.WebMbTest.UI.utils.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;

public class ByPhoneNASteps {

    WebDriver driver = Driver.getDriver();
    HomePage homePage = new HomePage();
    MajorPage majorPage = new MajorPage();
    BetweenUserAccounts betweenUserAccounts = new BetweenUserAccounts();

    ByPhone byPhone = new ByPhone();

    @Given("пользователь в тестовом портале Н.Алымжана перевод по ном тел")
    public void пользователь_в_тестовом_портале_н_алымжана_перевод_по_ном_тел() {
        driver.get(ConfigReader.getProperty("environment"));
        Helper.sendKeys(homePage.полеВводаНомераТелефона, "999160199");
        Helper.sendKeys(homePage.полеВводаПароля, "qwe123##");
        Helper.click(homePage.кнопкаВойти);
        Helper.pause(3000);
        Helper.click(majorPage.оплатить);
        Helper.click(betweenUserAccounts.перевести);
        Helper.pause(3000);
    }
    @Given("кликнуть на перевести по номеру телефона")
    public void кликнуть_на_перевести_по_номеру_телефона() {
       Helper.click(byPhone.иконкаПереводаПоНомеруТелефона);
    }
    @Given("ввести номер телефона получателя")
    public void ввести_номер_телефона_получателя() {
        Helper.sendKeys(byPhone.полеВводаНомераТелефонаПолучателя,"700010105");
    }
    @Given("кликнуть на продолдить1")
    public void кликнуть_на_продолдить1() {
      Helper.click(byPhone.кнопкаПродолжитьВПереводеПоНомеруТелефона1);
    }
    @Given("ввести сумму перевода")
    public void ввести_сумму_перевода() {
     Helper.sendKeys(byPhone.полеВводаСуммыВПереводеПоНомеруТелефона,"10");
    }
    @Given("кликнуть на продолжить2")
    public void кликнуть_на_продолжить2() {
       Helper.click(byPhone.кнопкаПродолжитьВПереволеПоНомеруТелефона2);
    }
    @Then("кликнуть на перевсети")
    public void кликнуть_на_перевсети() {
       Helper.click(byPhone.кнопкаПеревестиВПереводеПоНомеруТелефона);
    }

}
