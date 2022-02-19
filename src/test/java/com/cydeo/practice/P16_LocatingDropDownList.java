package com.cydeo.practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class P16_LocatingDropDownList {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
      // navigate to check box  page fro practice site
        driver.get("http://practice.cybertekschool.com/dropdown");
        //identify the select element

        WebElement dropDownEle = driver.findElement(By.id("dropDown"));

        //wrap this element inside select object
        Select  selectObj = new Select(dropDownEle);
        //use reaqdy method to select options
        selectObj.selectByIndex(2);// 3rd item at index 2
        selectObj.selectByValue("1");//select item by value attribute
        selectObj.deselectByVisibleText("Option 2");

        driver.close();
    }
}
