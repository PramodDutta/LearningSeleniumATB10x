package com.thetestingacademy.ex01_Selenium_Basics;

import io.qameta.allure.Description;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium02 {


    @Description("Open the app.vwo.com and verify the title!")
    @Test
    public void test_Selenium02(){
        // Open the URL
        EdgeDriver driver  = new EdgeDriver();
        // new EdgeDriver(); -> POST Request(Browser Driver) (localhost:XXXXX), Create New Session Endpoint


        // Navigate the URL -> get the URL
        driver.get("https://app.vwo.com");


        // Assert the URL - Validation - TestNG Assertions
        Assert.assertEquals(driver.getCurrentUrl(),"https://app.vwo.com/#/login");

        driver.quit();






    }





}
