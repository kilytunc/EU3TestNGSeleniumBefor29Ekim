package com.cybertek.tests.day2_webdriver_basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleAndUrl {
    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("http://practice.cybertekschool.com");

        //getting title with selenium
        //shorcut for creating variable
        //Option or alt + enter
        // getTitle() --> gets your title of the page
        String title = driver.getTitle();
        System.out.println("title = " + title);

        // getting current url
        String currentUrl = driver.getCurrentUrl();
        System.out.println("currentUrl = " + currentUrl);

        //getting source code
       /*  String pageSource = driver.getPageSource();
           System.out.println("pageSource = " + pageSource);
        */

    }
}
