package com.cybertek.tests.assignments;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HWTestCase3_Wiki {

    @Test
    public void TestWiki() throws InterruptedException {

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://www.wikipedia.org/");
        driver.findElement(By.cssSelector("input#searchInput")).sendKeys("selenium webdriver");
        Thread.sleep(1500);
        driver.findElement(By.cssSelector(".sprite.svg-search-icon")).click();


        // buradan devam
        //verify that url endswith or contains your search  word
        // u sould use the assert falan ne ise iste dun TestNG de göstedigi fonksiyon

        if(driver.getCurrentUrl().contains("selenium+webdriver")){
            System.out.println("pass");

        }else {
            System.out.println("fail by url");
        }

        Thread.sleep(2500);
        driver.quit();

    }



}
