package com.WebMbTest.UI.methods;

import com.WebMbTest.UI.utils.Driver;
import com.WebMbTest.UI.utils.Log4JDemo;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Helper {

    private  static Logger logger = LogManager.getLogger(Log4JDemo.class);


    public static void click (WebElement element){
        logger.info("I am trying to click " + element);
        try {
            waitElementToBeDisplayed(element);
            waitForElementToBeClickAble(element);
            navigateToElement(element);
            element.click();
            logger.info("Element is clicked");
        }catch (ElementClickInterceptedException e){
            logger.warn("Element is not clickable but i clicked JS click");
            jsClick(element);
        }

    }


    public static void waitElementToBeDisplayed(WebElement element){
        logger.debug("Waiting for element to be Displayed " + element);
        new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(element));
    }

    public static void waitForElementToBeClickAble(WebElement element){
        logger.info("Waiting for element to be clickable");
        new WebDriverWait(Driver.getDriver(),Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(element));
    }

    public static void sendKeys(WebElement element, Keys button){
        element.sendKeys(button);
    }                                                                   // OVERLOADING SAME NAMES,DIFFERENT PARAMETR

    public static void sendKeys(WebElement element, String value){
        element.sendKeys(value);

    }
    public static void pause(Integer milliseconds){
        logger.info("Pausing the System for " + milliseconds);
        try {
            logger.debug("Trying to pause the System");
            TimeUnit.MILLISECONDS.sleep(milliseconds);
        }catch (InterruptedException e){
            logger.error("can not pause the System");
            e.printStackTrace();
        }
    }

    public static String getTextValue(WebElement element){
        waitElementToBeDisplayed(element);
        return element.getText();
    }

    public static void jsClick(WebElement element){
        waitElementToBeDisplayed(element);
        waitForElementToBeClickAble(element);
        element.click();
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].click;",element);

    }

    public static void navigateToElement(WebElement element){
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(element).perform();

    }

    public static void multiClick(WebElement element,int howManyTimes){
        int counter = howManyTimes;
        waitElementToBeDisplayed(element);
        waitForElementToBeClickAble(element);
        while (counter>0){
            element.click();
            counter--;
        }

    }
}
