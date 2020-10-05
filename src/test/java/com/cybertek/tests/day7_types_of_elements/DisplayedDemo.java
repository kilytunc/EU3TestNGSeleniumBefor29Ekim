package com.cybertek.tests.day7_types_of_elements;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DisplayedDemo {

    @Test
    public void Test1() throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        //driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com/dynamic_loading/1");
        Thread.sleep(1000);
        WebElement usernameInput = driver.findElement(By.id("username"));

        System.out.println("usernameInput.isDisplayed() = " + usernameInput.isDisplayed());

       // Assert.assertEquals("sda2s","sdas","verify that two strings equal if they not you can read these words");

        //TASK
        //verify username inputbox is not displayed on the screen
        Assert.assertFalse(usernameInput.isDisplayed(), "unfortunately  you wrong its on screen noW!");
        //click start button
        driver.findElement(By.cssSelector("#start>button")).click();

         Thread.sleep(7222);
        //verify username displayed on the screen
        Assert.assertTrue(usernameInput.isDisplayed(), "unfortunately  you wrong its  NOT on screen YET !");

        //Assert.as

        driver.quit();





    }

}
