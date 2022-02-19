package com.cydeo.tests.day5_testNG_intro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TC5_NG {


        WebDriver driver;

        //  TC #5: Selecting state from State dropdown and verifying result
        //1. Open Chrome browser

        @BeforeMethod
        public void setupMethod () {


            driver = WebDriverFactory.getDriver("chrome");
            driver.manage().window().maximize();

            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

            //2. Go to http://practice.cybertekschool.com/dropdown
            driver.get("http://practice.cybertekschool.com/dropdown");
    }
            @Test
            public void dropDownStateSelection(){
            //   3. Select Illinois
             Select dropdown  = new Select(driver.findElement(By.xpath("//select[@id='state']")));
             dropdown.selectByVisibleText("Illinois");

                //4. Select Virginia
                dropdown.selectByValue("VA");

            //5. Select California
                dropdown.selectByIndex(5);
            //6. Verify
                //   final selected option is California.
                String expected = "California";
                String actualState = dropdown.getFirstSelectedOption().getText();

                Assert.assertEquals(actualState,expected, " Verification  Fail");

            //  Use all Select options. (visible text, value, index)

        }
    @AfterMethod
    public void tearDownMethod(){
        driver.close();
    }
    }
