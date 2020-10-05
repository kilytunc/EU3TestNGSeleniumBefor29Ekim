package com.cybertek.tests.day4_basic_locators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tagNameLocator {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
      //  driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/sign_up");

        // find name input and fill it by using tag name
        WebElement fullNameInput = driver.findElement(By.tagName("input"));
        fullNameInput.sendKeys("Mike Smith");

        Thread.sleep(500);
        // find mail input and fill it by using tag name
        WebElement mailInput = driver.findElement(By.name("email"));
        mailInput.sendKeys("mike@smith.com");

        Thread.sleep(1000);
        //find the button and click with the lazy way
        driver.findElement(By.tagName("button")).click();
        Thread.sleep(1000);
        driver.quit();
    }
}
