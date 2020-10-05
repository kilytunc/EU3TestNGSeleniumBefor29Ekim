package com.cybertek.tests.day9_popups_tabs_frames;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PopupsAndAlerts {

    WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = WebDriverFactory.getDriver("ChrOme");

    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(1000);
        driver.quit();
    }



     //// html popup its easy...
    @Test
    public void test1() throws InterruptedException {
        driver.get("https://www.primefaces.org/showcase/ui/overlay/confirmDialog.xhtml");

        Thread.sleep(523);
        //click the button (Destroy the World)
        driver.findElement(By.xpath("//button[.='Destroy the World']")).click();
        Thread.sleep(523);

        // click NO button
        driver.findElement(By.xpath("//button[.='No']")).click();

        Thread.sleep(523);

    }


    @Test

    public void test2() throws InterruptedException {
        driver.get("http://practice.cybertekschool.com/javascript_alerts");
        Thread.sleep(323);
        // find the Jsalert button and click it without saving
        driver.findElement(By.xpath("//button[1]")).click();
        Thread.sleep(323);

        // find the js alert and accept it  USING A SPECIAL CLASS
        //switch to JS alert pop up
        Alert alert = driver.switchTo().alert(); // this is not a java class this comes from selenium
        Thread.sleep(823);
        alert.accept();             // we have this element now and after this point
        Thread.sleep(923);


        // --------------------------

        // clicking button to and cancel
        // find the button to and click lazy way
        driver.findElement(By.xpath("//button[2]")).click();
        Thread.sleep(923);
        alert.dismiss();            // this element is comin upper paragraf and now just calling a method " dismiss"   // there were 4 methods for alert  : accept - dismiss - getText - sendKEys


        // find button 3 and click
        driver.findElement(By.xpath("//button[3]")).click();
        Thread.sleep(923);
        alert.sendKeys("akif tunc");
        Thread.sleep(1223);
        alert.accept();
        Thread.sleep(1223);


    }

}
