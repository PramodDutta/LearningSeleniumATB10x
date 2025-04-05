package com.thetestingacademy.ex12_Windows;

import com.thetestingacademy.TestCaseBoilerPlate;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import javax.swing.*;
import java.util.Set;

public class Lab38_Windows_Part1 extends TestCaseBoilerPlate {

    @Test
    public void test_fileupload_p5() {


        String URL = "https://the-internet.herokuapp.com/windows";
        driver.get(URL);
        driver.manage().window().maximize();

        String parent = driver.getWindowHandle();
        System.out.println(parent); // 974535CFD9B87DA0B44B44CC2FFC0591

        driver.findElement(By.linkText("Click Here")).click();

        Set<String> windowHandles = driver.getWindowHandles();
        System.out.println("Window Handles: " + windowHandles); // [974535CFD9B87DA0B44B44CC2FFC0591, 8E6F9A52E8382019CBB64FB9E6F024EC]


        for (String handle: windowHandles){
            driver.switchTo().window(handle);
                if(driver.getPageSource().contains("New Window")){
                    System.out.println("Test Case Passed!");
                }
                driver.switchTo().window(parent);
            }
        }



















    }



