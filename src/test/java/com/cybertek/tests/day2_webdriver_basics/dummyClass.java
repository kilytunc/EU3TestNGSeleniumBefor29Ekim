package com.cybertek.tests.day2_webdriver_basics;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;

public class dummyClass {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("fireFOx");

        driver.get("https://www.amazon.com");

        Thread.sleep(2000);

        driver.navigate().to("https://www.youtube.com");

        String title = driver.getTitle();
        System.out.println("title = " + title);

        driver.navigate().back();
        String title1 = driver.getTitle();
        System.out.println("title1 = " + title1);

        driver.navigate().forward();
        System.out.println(driver.getPageSource());

        Thread.sleep(2000);
        driver.quit();



    }
}
