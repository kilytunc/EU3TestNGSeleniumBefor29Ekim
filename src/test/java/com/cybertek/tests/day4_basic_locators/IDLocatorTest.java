package com.cybertek.tests.day4_basic_locators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IDLocatorTest {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chromE");
        driver.get("http://practice.cybertekschool.com/multiple_buttons");

        //click dont click

        WebElement dontClickButton = driver.findElement(By.id("disappearing_button"));
        Thread.sleep(1000);
        dontClickButton.click();

        Thread.sleep(2000);
        driver.quit();
    }
}
