package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Work2 {


    public static void main(String[] args) {

//        TC #2: Zero Bank header verification
//        1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

//        2. Go to http://zero.webappsecurity.com/login.html
        driver.get("http://zero.webappsecurity.com/login.html");
//        3. Verify header text
        WebElement headerText = driver.findElement(By.tagName("h3"));


//        Expected: “Log in to ZeroBank”
        String ExpectedHeaderText = "Log in to ZeroBank";
        String ActualHeaderText = headerText.getText();
        if(ActualHeaderText.equals(ExpectedHeaderText)){
            System.out.println("Header text verification PASS!");
        }else{
            System.out.println("Header text verification FAILED!!!");
        }
        driver.close();
    }
}
