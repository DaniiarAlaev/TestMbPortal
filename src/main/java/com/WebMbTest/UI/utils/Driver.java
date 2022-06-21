package com.WebMbTest.UI.utils;

import com.WebMbTest.UI.dataProviders.ConfigReader;
import org.openqa.selenium.WebDriver;

public class Driver {

    private Driver(){
        // Single pattern - единственный экземпляр
    }
    private static WebDriver driver;

    public static  WebDriver getDriver(){
        if(driver == null){
            switch (ConfigReader.getProperty("browser").toLowerCase()){
                default:
                    driver = ChromeWebDriver.loadChromeDriver();
                    break;
                case "firefox":
                    driver = FirefoxWebDriver.loadFirefoxDriver();
                    break;
                case "edge":
                    driver = MicrosoftEdgeWebDriver.loadMicrosoftEdge();
                    break;
            }
        }
        return driver;
    }


    public static void closeDriver(){
        try{
            if(driver != null){
                driver.close();
                driver.quit();
                driver = null;
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
