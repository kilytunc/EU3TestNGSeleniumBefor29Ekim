package com.cybertek.tests.day5_xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class xPathLocator {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver= WebDriverFactory.getDriver("ChroME");
        driver.get("http://practice.cybertekschool.com/multiple_buttons");

        WebElement button1 = driver.findElement(By.xpath("//*[@*='button1()']"));
        button1.click();
        Thread.sleep(5000);
        driver.navigate().back();
        WebElement button2 = driver.findElement(By.xpath("//*[@*='button1()']"));
        button2.click();
        Thread.sleep(5000);


        driver.quit();


       /* WebDriver driver2 = WebDriverFactory.getDriver("fireFOX");
        driver.get("http://practice.cybertekschool.com/multiple_buttons");

        WebElement

        */

    }
}
