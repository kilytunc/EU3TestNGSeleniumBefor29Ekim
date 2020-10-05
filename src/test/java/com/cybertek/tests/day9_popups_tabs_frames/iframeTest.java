package com.cybertek.tests.day9_popups_tabs_frames;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class iframeTest {


    WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = WebDriverFactory.getDriver("ChrOme");

    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }


    @Test
    public void test1() throws InterruptedException {
        driver.get("http://practice.cybertekschool.com/iframe");
        Thread.sleep(2000);



        //1. FIRST WAY of switching
        driver.findElement(By.id("tinymce"));
        driver.switchTo().frame("mce_0_ifr");
        Thread.sleep(500);
        driver.findElement(By.id("tinymce")).clear();
        Thread.sleep(500);
        driver.findElement(By.cssSelector("#tinymce")).sendKeys("mike smith");
        Thread.sleep(500);
        //to come back switch back
        driver.switchTo().defaultContent();// comes to upperstttt
        Thread.sleep(500);
        //--------------------------------------------------
        Thread.sleep(500);

        //2.  switching with Index
        Thread.sleep(500);
        driver.switchTo().frame(0);

        //nakarat
        driver.findElement(By.cssSelector("#tinymce")).clear();
        Thread.sleep(500);
        driver.findElement(By.cssSelector("#tinymce")).sendKeys("mike smith   WITH SWICHING INDEXXXXXXXXX");

        //second way of switching back
        driver.switchTo().parentFrame();


        //3. Switching with using WEBELEMENT


        WebElement iframeWebElement = driver.findElement(By.tagName("iframe"));
        driver.switchTo().frame(iframeWebElement);
        //nakarat
        driver.findElement(By.cssSelector("#tinymce")).clear();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("#tinymce")).sendKeys("mike smith   3. way of switching  WEBELEMENT");
        Thread.sleep(1500);



    }




    @Test
    public void test2() throws InterruptedException {

        driver.get("http://practice.cybertekschool.com/nested_frames");

        //önce oglana geciyoz (2 oglan (birinden 3 torun) + 1 dede toplam 6 erkegiz
        driver.switchTo().frame("frame-top");

        //now swiching to boy
        driver.switchTo().frame("frame-middle");

        System.out.println(driver.findElement(By.id("content")).getText());
        Thread.sleep(1222);
        //------------------------
        //sindi önce babaya
        driver.switchTo().parentFrame();
        //sora kardasa
        driver.switchTo().frame(2);
        System.out.println(driver.findElement(By.tagName("body")).getText());

        Thread.sleep(1222);

        // go to main and switch to uncle (bottom)
        driver.switchTo().defaultContent();
        driver.switchTo().frame(1);
        System.out.println(driver.findElement(By.tagName("body")).getText());
        Thread.sleep(1222);


    }
}