package ex10_Actions_Class;

import com.thetestingacademy.TestCaseBoilerPlate;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Lab32_ActionClass extends TestCaseBoilerPlate {

        EdgeDriver driver;

        @Test
        public void test_actions(){

            String URL = "https://awesomeqa.com/practice.html";
            driver.get(URL);
            driver.manage().window().maximize();






        }



}
