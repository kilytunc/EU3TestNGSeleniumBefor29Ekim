package com.cybertek.tests.day1_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenBrowser {
    public static void main(String[] args) {
    /*    // we have to enter this line every time we want to open chrome
        // hey webdrivemanager can you make me chrome ready for me to automation
        WebDriverManager.chromedriver().setup();

        // webDriver represent the browser
        // we are creating driver for chrome browser
        // new ChromeDriver(); this part will open chrome browser
        WebDriver driver = new ChromeDriver();

        driver.get("https://cybertekschool.com");

*/
        WebDriverManager.firefoxdriver().setup();

        WebDriver driver2 = new FirefoxDriver();

        driver2.get("https://www.facebook.com");


    }
}
