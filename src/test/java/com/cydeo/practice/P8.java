package com.cydeo.practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P8 {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        // navigate to check box  page fro practice site
        driver.get("http://practice.cybertekschool.com/dropdown");
        //identify the select element

        WebElement dropDownEle = driver.findElement(By.id("dropDown"));
    }
}
