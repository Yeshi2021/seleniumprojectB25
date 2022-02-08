package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Work4 {

    public static void main(String[] args) {

//        TC #4: Practice Cydeo – Class locator practice
//        1- Open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
//        2- Go to: https://practice.cydeo.com/inputs
        driver.get("https://practice.cydeo.com/inputs");
//        3- Click to “Home” link
        WebElement HomeLink = driver.findElement(By.className("nav-link"));
        HomeLink.click();
        //4- Verify title is as expected:
        // Expected: Practice
        String ExpectedTitle = "Practice";
        String ActualTitle = driver.getTitle();
        if(ActualTitle.equals(ExpectedTitle)){
            System.out.println("  Title Verification PASS! ");
        }else{
            System.out.println("  Title Verification FAILED!!! ");

        }



//
//        PS: Locate “Home” link using “className” locator
    }
}
