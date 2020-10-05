package com.cybertek.tests.day7_types_of_elements;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.swing.*;

public class AttributeTest {


    @Test
            public void test1() throws InterruptedException {


        WebDriver driver = WebDriverFactory.getDriver("chrome");
        //driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com/radio_buttons");
        Thread.sleep(1000);

        WebElement blueRadioBtn = driver.findElement(By.id("blue"));

        System.out.println("blueRadioBtn.getAttribute(\"value\") = " + blueRadioBtn.getAttribute("value"));

        // get the value of type attribute
        System.out.println("blueRadioBtn.getAttribute(\"type\")"+blueRadioBtn.getAttribute("type"));

        //get the value of name attribute
        System.out.println("blueRadioBtn.getAttribute(\"name\")"+blueRadioBtn.getAttribute("name"));

        //get the value of checked attribute
        // since checked attribute does not keep any value, it will return true or false based on the condition
        System.out.println("blueRadioBtn.getAttribute(\"checked\")"+blueRadioBtn.getAttribute("checked"));

        //trying ti get attribute that does not exist
        //when we use non exist attribute it will return NULL in lowercase to us
        System.out.println("blueRadioBtn.getAttribute(\"href\")"+blueRadioBtn.getAttribute("href"));

        driver.get("http://practice.cybertekschool.com/multiple_buttons");
        WebElement button2 =driver.findElement(By.name("button2"));
        System.out.println("button2.getAttribute(\"outerHTML\")"+button2.getAttribute("outerHTML"));

        String outerHTML = button2.getAttribute("outerHTML");
        Assert.assertTrue(outerHTML.contains("Button 2"),"it not contains that word");

        System.out.println();
        System.out.println("button2.getAttribute(\"innerHTML\")"+button2.getAttribute("innerHTML"));


        Thread.sleep(2090);
        driver.quit();
    }
}
