package com.cydeo.practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class P17_LocatingDropDownList_Multiple {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        // navigate to check box  page fro practice site
        driver.get("http://practice.cybertekschool.com/dropdown");
        //identify the select element

        WebElement dropDownEle = driver.findElement(By.id("dropDown"));

        //identify the dropDown with multiple select options
        WebElement multiItemDropDown = driver.findElement(By.name("Languages"));
        //wrap this element into a select object
        Select  multiItemSelect = new Select(multiItemDropDown);

        //check if  this element has multi select option
        System.out.println("multiItemSelect.isMultiple() = "
             + multiItemSelect.isMultiple());

        //check if this a multy select  list
        multiItemSelect.selectByIndex(3);
        multiItemSelect.selectByValue("c#");
        multiItemSelect.selectByVisibleText("Java");


        //deselect item
        multiItemSelect.deselectByIndex(3);
        multiItemSelect.selectByValue("c#");
        multiItemSelect.deselectByVisibleText("Java");
        multiItemSelect.deselectAll();


        //quit the browser
        driver.quit();

    }
}
