package com.cydeo.tests.day5_testNG_intro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class T3_RadioButton_cont {

    public static void main(String[] args) {
//        TC #3: Utility method task for (continuation of Task2)
//            1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

//        2. Go to https://practice.cydeo.com/radio_buttons
        driver.get("https://practice.cydeo.com/radio_buttons");


        //Locate name='sport' radio buttons and store them in a List of Web Element
        List<WebElement> sportRadioButton = driver.findElements(By.name("sport"));

        //Loop through the List of WebElement and select matching result
        for(WebElement each : sportRadioButton){

            String eachId = each.getAttribute("id");

            System.out.println("eachId = " + eachId);

            if(eachId.equals("hockey")){

                each.click();
                System.out.println("Hockey is selecred : "+ each.isSelected());
                break;
            }
        }


    }
}
