package com.WebMbTest.UI.utils;

import com.WebMbTest.UI.dataProviders.ConfigReader;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import java.time.Duration;

public class MicrosoftEdgeWebDriver {


    public static WebDriver loadMicrosoftEdge(){
        WebDriverManager.edgedriver().setup();
        EdgeOptions options = new EdgeOptions();

        WebDriver driver = new EdgeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        return driver;
    }
}
