package com.cybertek.tests.day9_popups_tabs_frames;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;

public class MultibleWindows2 {
    WebDriver driver;

    @BeforeMethod
    public void setUp(){

        driver= WebDriverFactory.getDriver("chroME");

    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

    @Test
    public void MultipleWindow () throws InterruptedException {
        driver.get("http://practice.cybertekschool.com/windows");
        Thread.sleep(1234);
        String t1 = driver.getTitle();
        String handle1 = driver.getWindowHandle();
        driver.findElement(By.linkText("Click Here")).click();
        Thread.sleep(1234);
        Set<String> windowHandles = driver.getWindowHandles();

        for (String handle : windowHandles) {
            if (!handle.equals(handle1)){
                driver.switchTo().window(handle);
            }
        }
    }


    @Test
    public void MultipleWindowS() throws InterruptedException {
        driver.get("http://practice.cybertekschool.com/windows");
        Thread.sleep(1234);
        String t1 = driver.getTitle();
        System.out.println("t1 = " + t1);
        String handle1 = driver.getWindowHandle();
        driver.findElement(By.linkText("Click Here")).click();
        Thread.sleep(1234);
        Set<String> windowHandles = driver.getWindowHandles();
        for (String handle : windowHandles) {
            driver.switchTo().window(handle);
            if (driver.getTitle().equals("New Window")){
                break;
            }
        }
        String t2 = driver.getTitle();
        System.out.println("t2 = " + t2);
    }

}
