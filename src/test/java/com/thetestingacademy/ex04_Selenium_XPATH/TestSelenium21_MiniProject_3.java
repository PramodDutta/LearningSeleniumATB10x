package com.thetestingacademy.ex04_Selenium_XPATH;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class TestSelenium21_MiniProject_3 {

    // https://katalon-demo-cura.herokuapp.com/

    @Description("Verify that with valid email, pass, appointment page is loaded")
    @Test
    public void test_katalon_login() throws Exception {


        WebDriver driver = new EdgeDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com/");

//        WebElement make_appointment_btn_id = driver.findElement(By.id("btn-make-appointment"));
//        make_appointment_btn_id.click();

        WebElement make_appointment_btn_xpath = driver.findElement(By.xpath("//a[@id='btn-make-appointment']"));
        make_appointment_btn_xpath.click();

//      WebElement username_input_box_id = driver.findElement(By.id("txt-username"));
//      WebElement username_input_box_name = driver.findElement(By.name("username"));
//
//

//        WebElement username_input_box_xpath = driver.findElement(By.xpath("//input[@name='username']"));
//        username_input_box_xpath.sendKeys("John Doe");


        List<WebElement> username_input_box_xpath_placeholder = driver.findElements(By.xpath("//input[@placeholder='Username']"));
        username_input_box_xpath_placeholder.get(1).sendKeys("John Doe");


        List<WebElement> password_input_box = driver.findElements(By.xpath("//input[@placeholder='Password']"));
        password_input_box.get(1).sendKeys("ThisIsNotAPassword");

        WebElement login_input_box = driver.findElement(By.xpath("//button[@id=\"btn-login\"]"));
        login_input_box.click();

        Assert.assertEquals(driver.getCurrentUrl(),"https://katalon-demo-cura.herokuapp.com/profile.php#login");

        driver.quit();











    }


}
