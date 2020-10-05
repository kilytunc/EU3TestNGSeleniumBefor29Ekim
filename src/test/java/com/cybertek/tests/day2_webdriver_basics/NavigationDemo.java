package com.cybertek.tests.day2_webdriver_basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationDemo {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver =new ChromeDriver();

        driver.get("https://www.google.com");

        Thread.sleep(2000);

        driver.navigate().to("https://www.facebook.com");

        Thread.sleep(2000);

        driver.navigate().to("https://www.yahoo.com");

        Thread.sleep(2000);

        // goes back to previus page
        driver.navigate().back();

        Thread.sleep(2000);

        // goes back to previus page
        driver.navigate().back();

        // refresh to webpage
        Thread.sleep(2000);
        driver.navigate().refresh();

        Thread.sleep(1000);
        driver.navigate().forward();
    }

}
