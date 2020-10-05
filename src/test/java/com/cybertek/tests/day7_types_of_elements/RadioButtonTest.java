
package com.cybertek.tests.day7_types_of_elements;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

    public class RadioButtonTest {


        @Test
        public void test1() throws InterruptedException {

            WebDriver driver = WebDriverFactory.getDriver("chrome");
            //driver.manage().window().maximize();

            driver.get("http://practice.cybertekschool.com/radio_buttons");

           //locating radio buttons
            WebElement blueRadioBtn = driver.findElement(By.id("blue"));
            WebElement redRadioBtn = driver.findElement(By.id("red"));

            System.out.println("blueRadioBtn.isSelected() ---> " + blueRadioBtn.isSelected());
            System.out.println("redRadioBtn.isSelected() ---> " + redRadioBtn.isSelected());

            //how to check radio button is selected ?
            Assert.assertTrue(blueRadioBtn.isSelected() ,"blue button is not selected !");
            Assert.assertFalse(redRadioBtn.isSelected() ,"red button is  selected !");

            Thread.sleep(500);

            // click red
            redRadioBtn.click();
            // verify that change
            Assert.assertTrue(!blueRadioBtn.isSelected() ,"blue button is  selected !");
            Assert.assertFalse(!redRadioBtn.isSelected() ,"red button is  not selected !");


            System.out.println("\\\\ after clicking to red button ////");
            System.out.println("blueRadioBtn.isSelected() ---> " + blueRadioBtn.isSelected());
            System.out.println("redRadioBtn.isSelected() ---> " + redRadioBtn.isSelected());

             Thread.sleep(2500);
             driver.quit();





        }


    }

