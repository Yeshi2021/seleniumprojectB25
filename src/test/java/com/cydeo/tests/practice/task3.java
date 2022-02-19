package com.cydeo.tests.practice;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class task3 {
    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
        //1. Open browser
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //2. Go to website: //https:www.facebook.com
        driver.get("https://www.facebook.com");
    }

    @Test
    public void headerVerification() {
        String expectedHeader = "Facebook helps you connect and share with the people in your life.";
        String actualHeader = driver.findElement(By.xpath("//H2")).getText();

        Assert.assertEquals(actualHeader,expectedHeader);
    }

    @AfterMethod
    public void tearDownMethod() {
        driver.close();

    }
}


