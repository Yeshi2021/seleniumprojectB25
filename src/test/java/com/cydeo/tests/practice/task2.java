package com.cydeo.tests.practice;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class task2 {

    WebDriver driver;


    @BeforeMethod
    public void setup() {
        driver = WebDriverFactory.getDriver("Chrome");
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.facebook.com");
    }

    @Test
    public void Method() {
        WebElement usernameBtn = driver.findElement(By.xpath("//input[@name='email']"));
        usernameBtn.sendKeys("incorrect");

        WebElement passwordBtn = driver.findElement(By.xpath("//input[@placeholder='Password']"));
        passwordBtn.sendKeys("incorrect2" + Keys.ENTER);

        driver.navigate().refresh();

        String expectedTitle = "Log into Facebook";
        Assert.assertEquals(driver.getTitle(), expectedTitle, "Title does not match");

    }

    @AfterMethod
    public void tearDownMethod() {
        driver.close();
    }
}