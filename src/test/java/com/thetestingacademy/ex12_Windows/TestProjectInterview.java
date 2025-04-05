package com.thetestingacademy.ex12_Windows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import javax.swing.*;
import java.util.List;
import java.util.Set;

import static com.thetestingacademy.ex07_WaitHelper.WaitHelpers.waitJVM;

public class TestProjectInterview {

    public EdgeDriver driver;


    @BeforeTest
    public void openBrowser(){

        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--guest");
        driver = new EdgeDriver(edgeOptions);

    }

    @Test
    public void test_interview_vwo_project() {

        driver.get("https://app.vwo.com/#/test/ab/13/heatmaps/1?token=eyJhY2NvdW50X2lkIjo2NjY0MDAsImV4cGVyaW1lbnRfaWQiOjEzLCJjcmVhdGVkX29uIjoxNjcxMjA1MDUwLCJ0eXBlIjoiY2FtcGFpZ24iLCJ2ZXJzaW9uIjoxLCJoYXNoIjoiY2IwNzBiYTc5MDM1MDI2N2QxNTM5MTBhZDE1MGU1YTUiLCJzY29wZSI6IiIsImZybiI6ZmFsc2V9&isHttpsOnly=1");
        driver.manage().window().maximize();

        waitJVM(5000);

        String parentWindowHandle = driver.getWindowHandle();
        System.out.println("Parent -> " + parentWindowHandle);

        List<WebElement> list_heatmaps = driver.findElements(By.cssSelector("[data-qa=\"yedexafobi\"]"));
        Actions actions = new Actions(driver);

        actions.moveToElement(list_heatmaps.get(1)).click().build().perform();

        waitJVM(15000);

        Set<String> allHandles = driver.getWindowHandles();
        System.out.println("All Window Handles: " + allHandles);

        // 2

        for (String handle: allHandles){
            if(!handle.equals(parentWindowHandle)){
                driver.switchTo().window(handle);
                // Now I am in the child window
                driver.switchTo().frame("heatmap-iframe");

                WebElement clickmap = driver.findElement(By.cssSelector("[data-qa='liqokuxuba']"));
                clickmap.click();




            }
        }


























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
