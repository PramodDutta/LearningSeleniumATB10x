package com.thetestingacademy.ex10_Actions_Class;

import com.thetestingacademy.TestCaseBoilerPlate;
import com.thetestingacademy.ex07_WaitHelper.WaitHelpers;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.List;

import static com.thetestingacademy.ex07_WaitHelper.WaitHelpers.waitJVM;

public class Lab35_ActionClass_P4 extends TestCaseBoilerPlate {

    @Test
    public void test_actions_p5() {


        driver.get("https://thetestingacademy.com/");
        driver.manage().window().maximize();


        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).build().perform();



















    }


}
