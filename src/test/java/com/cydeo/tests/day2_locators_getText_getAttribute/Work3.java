package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Work3 {

    public static void main(String[] args) {
//        TC #3: Back and forth navigation

//        1- Open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
//        2- Go to: https://google.com
        driver.get("https://google.com");
//        3- Click to Gmail from top right.
        WebElement searchGmail = driver.findElement(By.linkText("Gmail"));
        searchGmail.sendKeys(Keys.ENTER);

//        4- Verify title contains:
        //Expected: Gmail
        String ExpectedTitledContain = "Gmail";
        String ActualTitle = driver.getTitle();
        if(ActualTitle.contains(ExpectedTitledContain)){
            System.out.println("Title  Verification PASS!");
        }else{
            System.out.println("Title  Verification FAILED!!!");
        }

//        5- Go back to Google by using the .back();
        driver.navigate().back();
//        6- Verify title equals:
        String ExpectedTitle = "Google";
        String ActualTitle2 = driver.getTitle();
        if(ActualTitle2.equals(ExpectedTitle)){
            System.out.println(" Google Title Verification PASS! ");
        }else{
            System.out.println(" Google Title Verification FAILED!!! ");
        }
//        Expected: Google
    }
}
