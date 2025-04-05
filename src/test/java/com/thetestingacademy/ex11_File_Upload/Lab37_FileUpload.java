package com.thetestingacademy.ex11_File_Upload;

import com.thetestingacademy.TestCaseBoilerPlate;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Lab37_FileUpload extends TestCaseBoilerPlate {

    @Test
    public void test_fileupload_p5() {


        driver.get("https://awesomeqa.com/selenium/upload.html");
        WebElement uploadFileInput = driver.findElement(By.id("fileToUpload"));

        String working_dir = System.getProperty("user.dir");
        System.out.println(working_dir);
        // /Users/promode/IdeaProjects/LearningSeleniumATB10x



        uploadFileInput.sendKeys(working_dir+"/src/test/java/com/thetestingacademy/ex11_File_Upload/TestData.txt");
        driver.findElement(By.name("submit")).click();


















    }


}
