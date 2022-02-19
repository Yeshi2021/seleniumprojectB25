package com.cydeo.tests.day5_testNG_intro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T4_SimpleDropdowns {
    WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
        //1. Open Chrome browser
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //2. Go to https://practice.cydeo.com/dropdown
        driver.get("https://practice.cydeo.com/dropdown");

    }
    @Test
    public void simpleDropdownTest(){

        //3. Verify “Simple dropdown” default selected value is correct 
        Select simpleDropdown = new Select(driver.findElement(By.xpath("//select[@id='dropdown']")));

        WebElement currentlySelectedOptions = simpleDropdown.getFirstSelectedOption();

        String actualSimpleDropdownText = currentlySelectedOptions.getText();

        String  expectedSimpleDropdownText = "please select an option";



       // 4. Verify “State selection” default selected value is correct
        Select stateDropdown = new Select(driver.findElement(By.xpath("//select[@id='state']")));
        //Expected: "Select a State
        String expectedStateDropdownText = "Select a State";

        String actualStateDropDownText = stateDropdown.getFirstSelectedOption().getText();


       // Expected: “Select a State”



    }
}
