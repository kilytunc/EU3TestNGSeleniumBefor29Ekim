package com.cybertek.tests.day7_types_of_elements;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DynamicControls {

    @Test
    public void test1() throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        // driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com/dynamic_controls");
        Thread.sleep(1000);
        WebElement inputBox = driver.findElement(By.cssSelector("[type='text']"));
        Assert.assertFalse(driver.findElement(By.cssSelector("[type='text']")).isEnabled());
        System.out.println("inputBox is enabled  ?>>"+  inputBox.isEnabled());




    }
}
