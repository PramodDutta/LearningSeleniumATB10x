package com.thetestingacademy.ex13_Javascript_ex;

import com.thetestingacademy.TestCaseBoilerPlate;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.Set;

public class Lab40_JS_Code extends TestCaseBoilerPlate {

    @Test
    public void test_js() {
        driver.get("https://selectorshub.com/xpath-practice-page/");
        driver.manage().window().maximize();

        JavascriptExecutor js = (JavascriptExecutor) driver;

        WebElement div_to_scroll = driver.findElement(By.xpath("//div[@id='userName']"));


        js.executeScript("window.scrollBy(0, 500);");


        String url = js.executeScript("return document.URL;").toString();
        String title = js.executeScript("return document.title;").toString();

        System.out.println(url);
        System.out.println(title);







    }





















    }



