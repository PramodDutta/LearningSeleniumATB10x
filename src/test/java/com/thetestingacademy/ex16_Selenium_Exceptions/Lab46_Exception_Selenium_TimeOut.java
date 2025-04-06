package com.thetestingacademy.ex16_Selenium_Exceptions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class Lab46_Exception_Selenium_TimeOut {

    public EdgeDriver driver;

    @BeforeTest
    public void openBrowser(){

        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--guest");
        driver = new EdgeDriver(edgeOptions);

    }

    @Test
    public void test_selenium_exceptions() {

        System.out.println("Start of program");

        driver.get("https://google.com");
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//textarea[@id='abc']")));


            // org.openqa.selenium.TimeoutException: Expected condition failed: waiting for visibility of element located by By.xpath: //textarea[@id='abc'] (tried for 10 second(s) with 500 milliseconds interval)


            WebElement search_inputbox = driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
            search_inputbox.sendKeys("the testing academy");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


        System.out.println("End of program");



    }



    @AfterTest
    public void closeBrowser(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
    }

}
