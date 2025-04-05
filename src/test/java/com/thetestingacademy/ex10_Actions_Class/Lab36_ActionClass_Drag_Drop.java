package com.thetestingacademy.ex10_Actions_Class;

import com.thetestingacademy.TestCaseBoilerPlate;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Lab36_ActionClass_Drag_Drop extends TestCaseBoilerPlate {

    @Test
    public void test_actions_p5() {


        driver.get("https://the-internet.herokuapp.com/drag_and_drop");
        driver.manage().window().maximize();

        Actions actions = new Actions(driver);

        // Source , Destination
        //  from and to
        WebElement from = driver.findElement(By.id("column-a"));
        WebElement to = driver.findElement(By.id("column-b"));

        actions.dragAndDrop(from,to).build().perform();


















    }


}
