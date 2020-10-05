package com.cybertek.tests.assignments;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HW_Checkbox {

    @Test
    public void test1 () throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://www.seleniumeasy.com/test/basic-checkbox-demo.html");

        WebElement text = driver.findElement(By.id("txtAge"));
        Assert.assertFalse(text.isDisplayed(),"verify that text is not enabled");

        Thread.sleep(1250);
        System.out.println("click the button !");
        Thread.sleep(1250);
        driver.findElement(By.xpath("//*[@id='isAgeSelected']")).click();
        Assert.assertTrue(text.isDisplayed(),"verify that text is  enabled after click");
        Thread.sleep(1250);
        driver.quit();

    }

    @Test
    public void Test2(){

        WebDriver driver =WebDriverFactory.getDriver("firefox");
        driver.get("http://www.seleniumeasy.com/test/basic-checkbox-demo.html");



    }


}
