package com.WebMbtest.UI.stepDefs;

import com.WebMbTest.UI.dataProviders.ConfigReader;
import com.WebMbTest.UI.methods.Helper;
import com.WebMbTest.UI.pageObjectNAlymjan.HomePage;
import com.WebMbTest.UI.pageObjectNAlymjan.MajorPage;
import com.WebMbTest.UI.pageObjectNAlymjan.BetweenUserAccounts;
import com.WebMbTest.UI.pageObjectNAlymjan.ByPhone;
import com.WebMbTest.UI.utils.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class PaymentsNAlymjanSteps {

    WebDriver driver = Driver.getDriver();
    HomePage homePage = new HomePage();
    MajorPage majorPage = new MajorPage();
    BetweenUserAccounts betweenUserAccounts = new BetweenUserAccounts();

    ByPhone byPhone = new ByPhone();


    @Given("пользователь в тестовом портале")
    public void пользователь_в_тестовом_портале() {
        driver.get(ConfigReader.getProperty("environment"));
        Helper.sendKeys(homePage.полеВводаНомераТелефона, "999160199");
        Helper.sendKeys(homePage.полеВводаПароля, "1313");
        Helper.click(homePage.кнопкаВойти);
        Helper.pause(3000);
        Helper.click(majorPage.оплатить);
        Helper.click(betweenUserAccounts.перевести);
        Helper.pause(3000);

    }      // Scenario 1

    @When("кликнуть на кпопку между счетами")
    public void кликнуть_на_кпопку_между_счетами() {
        Helper.click(betweenUserAccounts.междуСчетами);
    }

    @When("нажать на счет")
    public void нажать_на_счет() {
        Helper.click(betweenUserAccounts.дропДаунменю);
    }

    @Then("выбрать счет сомовый")
    public void выбрать_счет_сомовый() {
        Helper.click(betweenUserAccounts.сомовыйСчет690k);
    }

    @Then("нажать на поле второго счета")
    public void нажать_на_поле_второго_счета() {
        Helper.jsClick(betweenUserAccounts.второйДропдаунМеню);
    }

    @Then("выбрать второй сомовый счет")
    public void выбрать_второй_сомовый_счет() {
        Helper.jsClick(betweenUserAccounts.второйСомовыйСчет1301k);
    }

    @Then("ввести {int} сом")
    public void ввести_сом(Integer int1) {
        Helper.sendKeys(betweenUserAccounts.полеВводаСуммы, "10");
    }

    @Then("кликнуть на продолжить")
    public void кликнуть_на_продолжить() {
        Helper.click(betweenUserAccounts.кнопкаПродолжить);
        Helper.pause(3000);
    }

    @Then("нажать на кпопку перевести")
    public void нажать_на_кпопку_перевести() {
        Helper.click(betweenUserAccounts.кнопкапПеревести);
        Helper.pause(3000);
    }




    // Scenario 2


    @Given("кликнуть на перевести по номеру телефона")
    public void кликнуть_на_перевести_по_номеру_телефона() {
      Helper.click(byPhone.иконкаПереводаПоНомеруТелефона);
    }
    @Given("ввести номер телефона получателя")
    public void ввести_номер_телефона_получателя() {
     Helper.sendKeys(byPhone.полеВводаНомераТелефонаПолучателя,"700010105");
    }
    @Given("кликнуть на продолжить в переводе по номеру телефона")
    public void кликнуть_на_продолжить_в_переводе_по_номеру_телефона() {
      Helper.click(byPhone.кнопкаПродолжитьВПереводеПоНомеруТелефона1);
    }
    @Given("ввести сумму платежа")
    public void ввести_сумму_платежа() {
     Helper.sendKeys(byPhone.полеВводаСуммыВПереводеПоНомеруТелефона,"10");
    }
    @Given("кликнуть на продолжить после ввода суммы")
    public void кликнуть_на_продолжить_после_ввода_суммы() {
     Helper.click(byPhone.кнопкаПродолжитьВПереводеПоНомеруТелефона1);
     Helper.pause(3000);
    }
//    @Given("кликнуть перевести в переводе по номеру телефона")
//    public void кликнуть_перевести_в_переводе_по_номеру_телефона() {
//
//    }


}






