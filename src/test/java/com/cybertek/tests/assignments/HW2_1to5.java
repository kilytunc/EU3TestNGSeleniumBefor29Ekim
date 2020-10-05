package com.cybertek.tests.assignments;

import com.cybertek.utilities.WebDriverFactory;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Random;

public class HW2_1to5 {
    WebDriver driver;
      @BeforeMethod
    public void setUp () {
        driver= WebDriverFactory.getDriver("ChRome");
       }
   @AfterMethod
   public void tearDown() throws InterruptedException {
        Thread.sleep(2234);
        //driver.quit();
   }

   @Test
    public void TC1() throws InterruptedException {
        driver.get("https://practice-cybertekschool.herokuapp.com/");
        Thread.sleep(1232);
        driver.findElement(By.linkText("Registration Form")).click();
        driver.findElement(By.xpath("//*[@*='MM/DD/YYYY']")).sendKeys("32/22/1808");
        Thread.sleep(3444);
        WebElement message = driver.findElement(By.xpath("//*[@id=\"registrationForm\"]/div[8]/div/small[2]"));
        System.out.println("message = " + message.getText());
        Assert.assertTrue(message.isDisplayed());
        Assert.assertEquals(message.getText(),"The date of birth is not valid","Verify that the message is true");

   }

    @Test
    public void TC2() throws InterruptedException {

        driver.get("https://practice-cybertekschool.herokuapp.com/");
        Thread.sleep(1232);
        driver.findElement(By.linkText("Registration Form")).click();
        Assert.assertTrue(driver.findElement(By.id("inlineCheckbox1")).isDisplayed());  // C++  isDisplayed?
        System.out.println("driver.findElement(By.id(\"inlineCheckbox1\")).isDisplayed() = " + driver.findElement(By.id("inlineCheckbox1")).isDisplayed());

        Assert.assertTrue(driver.findElement(By.id("inlineCheckbox2")).isDisplayed());  // Java isDisplayed?
        System.out.println("driver.findElement(By.id(\"inlineCheckbox2\")).isDisplayed() = " + driver.findElement(By.id("inlineCheckbox2")).isDisplayed());

        Assert.assertTrue(driver.findElement(By.id("inlineCheckbox3")).isDisplayed());  // JaSc isDisplayed?
        System.out.println("driver.findElement(By.id(\"inlineCheckbox3\")).isDisplayed() = " + driver.findElement(By.id("inlineCheckbox3")).isDisplayed());

    }

    @Test
    public void TC3() throws InterruptedException {

        driver.get("https://practice-cybertekschool.herokuapp.com/");
        Thread.sleep(1232);
        driver.findElement(By.linkText("Registration Form")).click();
        WebElement firstnameInput = driver.findElement(By.xpath("//input[@*='firstname']"));
        firstnameInput.sendKeys("a");
        //String a = firstnameInput.getText();
        //Assert.assertEquals(a.length(),1,"verify the input length is 1");
        WebElement textAlert = driver.findElement(By.xpath("(//*[@*='stringLength'])[1]"));
        Assert.assertTrue(textAlert.isDisplayed());
        Assert.assertEquals(textAlert.getText(),"first name must be more than 2 and less than 64 characters long", "assert the message has right text");



    }

    @Test
    public void TC4() throws InterruptedException {
        driver.get("https://practice-cybertekschool.herokuapp.com/");
        Thread.sleep(1232);
        driver.findElement(By.linkText("Registration Form")).click();
        driver.findElement(By.xpath("//input[@*='lastname']")).sendKeys("a");
        WebElement textMsg = driver.findElement(By.xpath("//small[.='The last name must be more than 2 and less than 64 characters long']"));
        Assert.assertTrue(textMsg.isDisplayed());
        System.out.println(textMsg.getText());

    }

    @Test
    public void TC5() throws InterruptedException{
        driver.get("https://practice-cybertekschool.herokuapp.com/");

        driver.findElement(By.linkText("Registration Form")).click();
        Faker faker = new Faker();
        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(faker.name().firstName());

        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(faker.name().lastName());

        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("mehmet");

        driver.findElement(By.xpath("//input[@name='email']")).sendKeys(faker.internet().emailAddress());

        driver.findElement(By.xpath("//input[@name='password']")).sendKeys(faker.internet().password());

        driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("547-808-5656");

        driver.findElement(By.xpath("//input[@value='male']")).click();

        driver.findElement(By.xpath("//input[@name='birthday']")).sendKeys("08/21/1985");

        WebElement deprtmnt = driver.findElement(By.xpath("//select[@name='department']"));
        Select select= new Select(deprtmnt);
        List<WebElement> optionS = select.getOptions();
        Random rn = new Random();
        select.selectByIndex(rn.nextInt(optionS.size()-1));
        //System.out.println("rn = " + rn);
        //System.out.println("optionS = " + optionS.size());

        WebElement jobTitle = driver.findElement(By.xpath("//select[@name='job_title']"));
        select = new Select(jobTitle);
        optionS=select.getOptions();
        select.selectByIndex(rn.nextInt(optionS.size()-1));
        //System.out.println("optionS22 = " + optionS.size());

        driver.findElement(By.cssSelector("#inlineCheckbox2")).click();
        driver.findElement(By.cssSelector("#wooden_spoon")).click();
        System.out.println(driver.findElement(By.xpath("//p")).getText());
        Assert.assertEquals(driver.findElement(By.xpath("//p")).getText(),"You've successfully completed registration!");
    }
    
}
