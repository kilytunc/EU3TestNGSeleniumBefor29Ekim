package com.cybertek.tests.day7_types_of_elements;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DisabledElements {
    @Test
    public void test1() throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
       // driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com/radio_buttons");
        Thread.sleep(1000);
        WebElement greenRadioBtn = driver.findElement(By.id("yellow"));  // disabled web elements

        //how to check any element is enabled or disabled

        //System.out.println(greenRadioBtn.isEnabled());
       // Assert.assertFalse(greenRadioBtn.isEnabled(), "aksi durum :  bu ulasilabilir suanda !");

        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].click();", greenRadioBtn );

    }

    @Test
    public void test2(){
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com/dynamic_controls");

        WebElement inputBox = driver.findElement(By.cssSelector("#input-example>input"));

        inputBox.sendKeys("some message");
        //System.out.println("inputBox.getAttribute(\"outerHTML\") = " + inputBox.getAttribute("outerHTML"));
       // JavascriptExecutor jse = (JavascriptExecutor) driver;
       // jse.executeScript("arguments[0].setAttribute('value', '" + "text" +"')", inputBox);

    }
}