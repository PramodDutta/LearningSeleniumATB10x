package com.thetestingacademy.ex05_Selenium_Waits;

import io.qameta.allure.Description;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestSelenium22_Waits {
    @Description("Verify Ebay Print the prices (iMac)")
    @Test
    public void test_verify_print_imac_price() {


        EdgeDriver driver = new EdgeDriver();
        driver.get("https://app.vwo.com");

        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

        try {
            Thread.sleep(200000); // JVM to halt
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }
}
