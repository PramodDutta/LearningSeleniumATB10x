package com.thetestingacademy.ex08_SVG_Elements;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

import static com.thetestingacademy.ex07_WaitHelper.WaitHelpers.checkVisibility;
import static com.thetestingacademy.ex07_WaitHelper.WaitHelpers.waitJVM;

public class Lab31_SVG_MAP {

    EdgeDriver driver;


    @BeforeTest
    public void openBrowser(){
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--guest");
        driver = new EdgeDriver(edgeOptions);
        driver.manage().window().maximize();

    }


    @Description("Verify Tripura is present in the map and click to zoom it")
    @Test
    public void test_India_map_SVG(){

        String URL = "https://www.amcharts.com/svg-maps/?map=india";
        driver.get(URL);
        driver.manage().window().maximize();

        waitJVM(3000);

        List<WebElement> states = driver.findElements(By.xpath("//*[name()='svg']/*[name()='g'][7]/*[name()='g']/*[name()='g']/*[name()='path']"));
        for (WebElement state: states){
            System.out.println(state.getDomAttribute("aria-label"));
            if(state.getDomAttribute("aria-label").contains("Tripura")) {
                state.click();
            }
        }










    }


    @AfterTest
    public void closeBrowser(){
        waitJVM(10000);
        driver.quit();
    }



}
