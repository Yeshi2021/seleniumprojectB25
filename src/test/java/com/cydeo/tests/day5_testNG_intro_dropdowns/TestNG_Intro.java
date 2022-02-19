package com.cydeo.tests.day5_testNG_intro_dropdowns;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG_Intro {


    @Test
    public void test1(){
        System.out.println("Test 1 is running...");

       //ASSERT EQUALS: compare 2 of the same things
        String actual = "apple";
        String expected = "apple";

        Assert.assertEquals(actual,expected);

    }
    @Test
    public void test2(){
        System.out.println("Test 2 is running...");
       //AssertTrue
        String actual = "apple";
        String expected = "apple";

        Assert.assertTrue(actual.equals(expected));

    }

    @BeforeMethod
    public void setupMethod(){
        System.out.println("---------> BeforeClass is running");
    }
    @AfterClass
    public void tearDownClass(){
        System.out.println("-----> AfterClass is running!");

    }


    @BeforeMethod
    public void setUpMethod(){
        System.out.println("-------> BeforeMethod is running!");
    }
    @AfterMethod
    public  void tearDownMethod(){
        System.out.println("------> AfterMethod is running!");

    }


}
