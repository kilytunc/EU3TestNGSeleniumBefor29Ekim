package com.cybertek.tests.day4_basic_locators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class nameLocatorTest {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("ChROme");
        //make browser full screen
        driver.manage().window().maximize();

        driver.get ("http://practice.cybertekschool.com/sign_up");
        Thread.sleep(500);
        // find the name inbox and fill it
        WebElement fullNameInput = driver.findElement(By.name("full_name"));
        fullNameInput.sendKeys("Mike Smith");

        Thread.sleep(500);
        // find put an email
        WebElement mailInputBox = driver.findElement(By.name("email"));
        mailInputBox.sendKeys("mike@smith.com");

        Thread.sleep(500);
        //find button and click
       // WebElement signUpButton = driver.findElement(By.name("wooden_spoon"));
        //signUpButton.click();


        // lazy way for using webElent without saving , less code..
        driver.findElement(By.name("wooden_spoon")).click();

    }
}
