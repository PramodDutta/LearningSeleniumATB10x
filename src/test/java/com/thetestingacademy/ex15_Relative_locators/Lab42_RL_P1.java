package com.thetestingacademy.ex15_Relative_locators;

import com.thetestingacademy.TestCaseBoilerPlate;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static com.thetestingacademy.ex07_WaitHelper.WaitHelpers.waitJVM;

import static org.openqa.selenium.support.locators.RelativeLocator.*;


public class Lab42_RL_P1 extends TestCaseBoilerPlate {

    @Test
    public void test_js() {
        driver.get("https://awesomeqa.com/practice.html");
        driver.manage().window().maximize();

        WebElement span_element = driver.findElement(By.xpath("//span[normalize-space()='Years of Experience']"));

        driver.findElement(with(By.id("exp-2")).toRightOf(span_element)).click();













    }





















    }



