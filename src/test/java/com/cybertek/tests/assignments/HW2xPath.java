package com.cybertek.tests.assignments;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HW2xPath {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chromE");
        driver.get("http://practice.cybertekschool.com/forgot_password");

        //home
        System.out.println(driver.findElement(By.xpath("//a[@class='nav-link']")).getText()+" ==> ADRESS IN xPATH ==> "+driver.findElement(By.xpath("//a[@class='nav-link']")));
        Thread.sleep(500);
        //forgot Password
        System.out.println(driver.findElement(By.xpath("//*[@id='content']/div/h2")).getText() + " ==> ADRESS IN xPATH ==> "+  driver.findElement(By.xpath("//*[@id='content']/div/h2")));
        Thread.sleep(500);
        //E-mail
        System.out.println(driver.findElement(By.xpath("//*[@*='email'][1]")).getText() + " ==> ADRESS IN xPATH ==> "+ driver.findElement(By.xpath("//*[@*='email'][1]")));
        Thread.sleep(500);
        //E-mail Box
        driver.findElement(By.xpath("//*[@*='email'][2]")).sendKeys("example@mail.com");
        System.out.println(driver.findElement(By.xpath("//*[@*='email'][2]")) + " ==> ADRESS IN xPATH ==> "+ driver.findElement(By.xpath("//*[@*='email'][2]")));
        Thread.sleep(2000);

        //retrieve button

        System.out.println(driver.findElement(By.xpath("//*[@class='icon-2x icon-signin']")).getText() + " ==> ADRESS IN xPATH ==> " + driver.findElement(By.xpath("//*[@class='icon-2x icon-signin']")));
        driver.findElement(By.xpath("//*[@class='icon-2x icon-signin']")).click();
        Thread.sleep(2000);

    }
}
