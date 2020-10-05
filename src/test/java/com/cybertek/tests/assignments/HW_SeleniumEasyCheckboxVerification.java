package com.cybertek.tests.assignments;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HW_SeleniumEasyCheckboxVerification {
    WebDriver driver;
    @BeforeMethod
    public void setup (){
        driver = WebDriverFactory.getDriver("chrome");
        }

    @AfterMethod
    public void tearDown() throws InterruptedException {
       Thread.sleep(1234);
        driver.quit();
    }

    @Test
    public void Test() throws InterruptedException {

        driver.get("http://www.seleniumeasy.com/test/basic-checkbox-demo.html");
        WebElement btn = driver.findElement(By.id("check1"));

        //Verify “Check All” button text is “Check All”
        String textOnButton1 = btn.getAttribute("value");

        System.out.println("textOnButton1 = " + textOnButton1);
        Assert.assertEquals(textOnButton1,"Check All", "verify button text before click");

        //Click to “Check All” button
        btn.click();


        //Verify all check boxes are checked
        for (int i=2; i<6; i++) {
            Assert.assertTrue(driver.findElement(By.xpath("(//div[@class='checkbox']//input)["+i+"]")).isSelected());
            System.out.println(i+". checkbox  isSelected ? --> " + driver.findElement(By.xpath("(//div[@class='checkbox']//input)["+i+"]")).isSelected());
            Thread.sleep(300);
        }

        //Verify button text changed to “Uncheck All”
        String textOnButton2 = btn.getAttribute("value");
        System.out.println("textOnButton2 = " + textOnButton2);
        Assert.assertEquals(textOnButton2,"Uncheck All", "verify button text after click");

    }
}
