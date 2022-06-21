package com.WebMbTest.UI.methods;

import org.assertj.core.data.Index;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDownHelper {

    public static void selectUsingVisibleText(WebElement element,String visibleText){
        Select select = new Select(element);
        select.selectByVisibleText(visibleText);


    }
    public static void selectByIndex(WebElement element,int index){
        Select select = new Select(element);
        select.selectByIndex(index);
    }
}
