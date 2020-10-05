package com.cybertek.tests.day8_types_of_elements_2;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class ListOfElements {
    WebDriver driver;

    @BeforeMethod
    public void setup (){
    driver= WebDriverFactory.getDriver("ChrOme");

    }
    @AfterMethod
    public void tearDown () throws InterruptedException {
        Thread.sleep(1000);
        driver.quit();
    }


    @Test
    public void test1(){
    driver.get("http://practice.cybertekschool.com/multiple_buttons");

        //save our web elements inside the list
        List<WebElement> buttons = driver.findElements(By.tagName("button"));
        System.out.println("buttons.size() = " + buttons.size());
        //verify buttons.size()
        Assert.assertEquals(buttons.size(), 6,"verify buttons size");

        for (WebElement button : buttons) {
            //System.out.println(button.getText());
            System.out.println("button.isDisplayed() = " + button.isDisplayed());
            Assert.assertTrue(button.isDisplayed(),"verify buttuns are displayed");

        }

        //click button 2
        buttons.get(1).click();



    }


    @Test
    public void Test2(){
        driver.get("http://practice.cybertekschool.com/multiple_buttons");

        //driver.findElement(By.tagName("buttodfas"));
        List<WebElement> buttons = driver.findElements(By.tagName("buttosdsdn"));
        System.out.println("buttons.size() " + buttons.size());


    }





}
