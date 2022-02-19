package com.cydeo.tests.day5_testNG_intro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TC8_NG {

    WebDriver driver;

    //TC #8: Selecting value from multiple select dropdown
    //1. Open Chrome browser
    @BeforeMethod
    public void setupMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // 2. Go to https://practice.cydeo.com/dropdown
        driver.get("https://practice.cydeo.com/dropdown");
    }

    @Test
    public void allOptionDeselectTest() {
        // 3. Select all the options from multiple select dropdown.
        Select multiSelectDropDown = new Select(driver.findElement(By.xpath("//select[@name='Languages']")));
        for(int i = 0; i<6;i++){
            multiSelectDropDown.selectByIndex(i);
        }
        // 4. Print out all selected values.
        for(WebElement allSelectedOption:multiSelectDropDown.getAllSelectedOptions()){
            System.out.println("allSelectedOption.getAttribute(\"value\") = "
                    +allSelectedOption.getAttribute("value"));
        }
        //5. Deselect all values.
        multiSelectDropDown.deselectAll();
    }
}
