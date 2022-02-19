package com.cydeo.tests.practice;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class task4 {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
        //1. Open browser
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //2. Go to https://www.facebook.com
        driver.get(" https://www.facebook.com");
    }
    @Test
    public void CreatedPage(){
        //            3. Verify “Create a page” link href value contains text:
        //    Expected: “registration_form”
        WebElement CreatedLink = driver.findElement(By.xpath("//a[.='Create a Page']"));
        //CreatedLink.click();
        String expectedValue = CreatedLink.getAttribute("href");
        String expectedHrefValue = "registration_form ";

        Assert.assertTrue(expectedHrefValue.contains(expectedHrefValue));


    }
    @AfterMethod
    public void tearDownMethod(){
        driver.close();
    }

}

//2. Go to https://www.facebook.com
//            3. Verify “Create a page” link href value contains text:
//    Expected: “registration_form”