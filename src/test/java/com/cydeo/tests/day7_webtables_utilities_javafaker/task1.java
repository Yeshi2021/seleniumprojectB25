package com.cydeo.tests.day7_webtables_utilities_javafaker;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class task1 {
    WebDriver driver;


        @BeforeMethod
        public void setupMethod () {
            driver = WebDriverFactory.getDriver("chrome");
            driver.manage().window().maximize();
            ;
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            //1. Go to: https://practice.cydeo.com/web-tables
            driver.get("https://practice.cydeo.com/web-tables");
        }

        //TC #3: Login scenario
        @Test
        public void window_handling_test () {


//        find Bob name cell
            WebElement bobNameCell = driver.findElement(By.xpath("//table[@class='SampleTable']//td[.='Bob Martin']"));
            String actualListedName = bobNameCell.getText();

            //2. verify Bob's name is listed as expected .
            //Expected: “Bob Martin”
            String expectedName = "Bob Martin";
            Assert.assertEquals(actualListedName, expectedName, "Name not match");
        }
        @Test
    public  void orderDate() {
            String actualDate = driver.findElement(By.xpath("//table[@class='SampleTable']//td[.='Bob Martin']/following-sibling::td[3]")).getText();
            //3. Verify Bob Martin’s order date is as expected
            // Expected: 12/31/2021
            String expectedDate = "12/31/2021";
            Assert.assertEquals(actualDate, expectedDate, "Incorrect date");
        }
        @AfterMethod
    public void done(){
            driver.quit();






            //3. Verify Bob Martin’s order date is as expected
           // Expected: 12/31/2021
        }
    }

