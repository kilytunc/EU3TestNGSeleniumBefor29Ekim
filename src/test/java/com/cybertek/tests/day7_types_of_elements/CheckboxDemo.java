package com.cybertek.tests.day7_types_of_elements;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckboxDemo {


    @Test
    public  void test1() throws InterruptedException{

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        //driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com/checkboxes");
        Thread.sleep(1000);

        WebElement checkbox1 = driver.findElement((By.xpath("//input[1]")));
        WebElement checkbox2 = driver.findElement((By.xpath("//input[2]")));

        // how to verify checkbox is selected or not ??

        System.out.println("checkbox1.isSelected ()  = "+ checkbox1.isSelected());
        System.out.println("checkbox2.isSelected ()  = "+ checkbox2.isSelected());

        // verify checkbox 1 is not selected, 2 is selected

        Assert.assertFalse(checkbox1.isSelected(),"verify checkbox 1 is NOt selected");
        Assert.assertTrue(checkbox2.isSelected(),"verify checkbox 2 is  selected");

        // how to check checkboxex
        checkbox1.click();

        Thread.sleep(1250);

        // verify after click
        Assert.assertTrue(checkbox1.isSelected(),"verify checkbox 1 is  selected");
        Assert.assertTrue(checkbox2.isSelected(),"verify checkbox 2 is  selected");

        System.out.println("checkbox1.isSelected ()  = "+ checkbox1.isSelected());
        System.out.println("checkbox2.isSelected ()  = "+ checkbox2.isSelected());
        driver.quit();

    }

}
