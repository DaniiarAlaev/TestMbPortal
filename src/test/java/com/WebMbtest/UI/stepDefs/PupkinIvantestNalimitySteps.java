package com.WebMbtest.UI.stepDefs;

import com.WebMbTest.UI.dataProviders.ConfigReader;
import com.WebMbTest.UI.methods.DropDownHelper;
import com.WebMbTest.UI.methods.Helper;
import com.WebMbTest.UI.pageObjectNAlymjan.BetweenUserAccounts;
import com.WebMbTest.UI.pageObjectNAlymjan.ByPhone;
import com.WebMbTest.UI.pageObjectNAlymjan.HomePage;
import com.WebMbTest.UI.pageObjectNAlymjan.MajorPage;
import com.WebMbTest.UI.pageObjectNAlymjan.pageObjectModelPupkinIvan.BetweenAccountsPupkinIvan;
import com.WebMbTest.UI.pageObjectNAlymjan.pageObjectModelPupkinIvan.ByPhonePupkinIvan;
import com.WebMbTest.UI.utils.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class PupkinIvantestNalimitySteps {

    WebDriver driver = Driver.getDriver();
    HomePage homePage = new HomePage();
    MajorPage majorPage = new MajorPage();
    BetweenUserAccounts betweenUserAccounts = new BetweenUserAccounts();
    BetweenAccountsPupkinIvan betweenAccountsPupkinIvan = new BetweenAccountsPupkinIvan();

    ByPhone byPhone = new ByPhone();
    ByPhonePupkinIvan byPhonePupkinIvan = new ByPhonePupkinIvan();


    @Given("пользователь в тестовом портале Пупкин Иванов")
    public void пользователь_в_тестовом_портале_пупкин_иванов() {
        driver.get(ConfigReader.getProperty("environment"));
        Helper.sendKeys(homePage.полеВводаНомераТелефона, "701000015");
        Helper.sendKeys(homePage.полеВводаПароля, "1313");
        Helper.click(homePage.кнопкаВойти);
        Helper.click(majorPage.оплатить);
        Helper.click(betweenUserAccounts.перевести);
        Helper.pause(3000);
    }
    @When("пользователь кликает на перевод между счетами")
    public void пользователь_кликает_на_перевод_между_счетами() {
     Helper.click(betweenUserAccounts.междуСчетами);
    }
    @When("нажать на поле выбора счета")
    public void нажать_на_поле_выбора_счета() {
      Helper.jsClick(betweenAccountsPupkinIvan.полеВыборасчета1);
      Helper.pause(2000);
      Helper.jsClick(betweenAccountsPupkinIvan.сомовыйСчет1);
    }

    @When("выбирает второй счет")
    public void выбирает_второй_счет() {
        Helper.jsClick(betweenAccountsPupkinIvan.полеВыбораСчета2);
        Helper.pause(2000);
        Helper.jsClick(betweenAccountsPupkinIvan.сомовыйСчет2);
    }
    @When("ввод суммы")
    public void ввод_суммы() {
        Helper.sendKeys(betweenAccountsPupkinIvan.полеВводаСуммы,"10");
    }
    @When("кликнуть на продолжить у Пупкина")
    public void кликнуть_на_продолжить_у_пупкина() {
     Helper.click(betweenAccountsPupkinIvan.продолжить);
    }
    @Then("кликнуть на перевести у Пупкина")
    public void кликнуть_на_перевести_у_пупкина() {
        Helper.click(betweenAccountsPupkinIvan.перевести);
    }














    @When("пользователь кликает на перевод по номеру телефона")
    public void пользователь_кликает_на_перевод_по_номеру_телефона() {
       Helper.click(byPhone.иконкаПереводаПоНомеруТелефона);
    }
    @When("ввести номер телефона получателя Пупкин Иван")
    public void ввести_номер_телефона_получателя_пупкин_иван() {
      Helper.sendKeys(byPhone.полеВводаНомераТелефонаПолучателя,"700010105");
    }
    @When("кликнуть на продолжить в переводе по номеру телефона Пупкин Иван")
    public void кликнуть_на_продолжить_в_переводе_по_номеру_телефона_пупкин_иван() {
      Helper.click(byPhonePupkinIvan.продолжитьвПереводеПоНомеруТ);
    }
    @When("ввести сумму платежа Пупкин Иван")
    public void ввести_сумму_платежа_пупкин_иван() {
      Helper.sendKeys(byPhone.полеВводаСуммыВПереводеПоНомеруТелефона,"1010");
    }
    @When("кликнуть на продолжить после ввода суммы Пупкин Иван")
    public void кликнуть_на_продолжить_после_ввода_суммы_пупкин_иван() {
       Helper.click(byPhone.кнопкаПродолжитьВПереводеПоНомеруТелефона1);
    }
    @When("кликнуть перевести в переводе по номеру телефона")
    public void кликнуть_перевести_в_переводе_по_номеру_телефона() {
       Helper.click(byPhone.кнопкаПеревестиВПереводеПоНомеруТелефона);
       Helper.pause(3000);
    }

}
