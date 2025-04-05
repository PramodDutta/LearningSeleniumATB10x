package com.thetestingacademy.ex10_Actions_Class;

import com.thetestingacademy.TestCaseBoilerPlate;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Lab32_ActionClass extends TestCaseBoilerPlate {

    @Test
    public void test_actions() {

        String URL = "https://awesomeqa.com/practice.html";
        driver.get(URL);
        driver.manage().window().maximize();

        // Keys - Action classes
        WebElement firstName = driver.findElement(By.name("firstname"));

        // KeyBoard
        Actions actions = new Actions(driver);
        actions
                .keyDown(Keys.SHIFT)
                .sendKeys(firstName, "the testing academy")
                .keyUp(Keys.SHIFT).build().perform();


    }


}
