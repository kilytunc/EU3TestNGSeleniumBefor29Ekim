package com.cybertek.tests.assignments;

import com.cybertek.utilities.WebDriverFactory;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class HW2_TC_6 {
    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver= WebDriverFactory.getDriver("Chrome");
       // driver.manage().timeouts().implicitlyWait(Vis)
    }
    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(2222);
       // driver.quit();
    }

    @Test
    public void TC6_mail_subject(){
        driver.get("https://www.fakemail.net/");                                          // go to fake mail saving
        String email = driver.findElement(By.id("email")).getText();                      // save it we will chack it later
        System.out.println("email = " + email);
        driver.get("https://practice-cybertekschool.herokuapp.com/");                     //navigate to fill form
        driver.findElement(By.partialLinkText("Sign")).click();

        Faker fake = new Faker();                                                         //create a faker object to fill the form with valid fakes
        driver.findElement(By.xpath("//input[@name='full_name']")).sendKeys(fake.name().fullName());
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys(email);
        driver.findElement(By.xpath("//button[@name='wooden_spoon']")).click();
        Assert.assertEquals(driver.findElement(By.xpath("//h3")).getText(),"Thank you for signing up. Click the button below to return to the home page.");
        driver.navigate().to("https://www.fakemail.net/");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
       /*
        WebElement newMAilFrom = driver.findElement(By.xpath("//span[@class='odMobil'][.='do-not-reply@practice.cybertekschool.com']"));
        //System.out.println("newMAilFrom = " + newMAilFrom.getAttribute("innerHTML"));
        Assert.assertEquals(newMAilFrom.getAttribute("innerHTML"),"do-notreply@practice.cybertekschool.com");
 */





        // ----------------------------------------------------------------------------





    }



}
