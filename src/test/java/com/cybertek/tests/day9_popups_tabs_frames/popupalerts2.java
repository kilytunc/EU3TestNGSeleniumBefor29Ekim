package com.cybertek.tests.day9_popups_tabs_frames;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class popupalerts2 {
    WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = WebDriverFactory.getDriver("ChrOme");

    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(1000);
      //  driver.quit();
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
        System.out.println("driver.findElement(By.cssSelector(\"#result\")).isDisplayed() = " + driver.findElement(By.cssSelector("#result")).isDisplayed());


        Assert.assertFalse(driver.findElement(By.cssSelector("#result")).isDisplayed());
        Thread.sleep(1234);



        driver.findElement(By.xpath("//button[1]")).click(); // dügmeyi buldum bastim ve javascript alerti karsima cikti artik htmlde bunu cozemem cunlu fareyi kipirdatamiyorum htmklde javadan kurtulmak icin once javanin istedigini yapmaklaziom javanin istedigini java code a switch yaparak halledebiliriz hadi ziplayalim java koda

        Thread.sleep(1221);
        driver.switchTo().alert().accept();
        Assert.assertTrue(driver.findElement(By.cssSelector("#result")).isDisplayed());
        System.out.println("driver.findElement(By.cssSelector(\"#result\")).isDisplayed() = " + driver.findElement(By.cssSelector("#result")).isDisplayed());

        //  ilk dügme test bitti süper

        // ikinci dügme testi

        driver.findElement(By.xpath("//button[2]")).click();
        Thread.sleep(821);
        Alert alertButton2 = driver.switchTo().alert();
        Thread.sleep(821);
        alertButton2.accept();
        Thread.sleep(821);

        String expectedResult = "You clicked: Ok";
        String actualResult = driver.findElement(By.cssSelector("#result")).getText();
        System.out.println("actualResult = " + actualResult);
        Thread.sleep(821);
        Assert.assertEquals(actualResult,expectedResult,"verify that result is OK");


        // second button clicking dissmiss
        driver.findElement(By.xpath("//button[2]")).click();
        Thread.sleep(821);
        alertButton2.dismiss();
        Thread.sleep(821);
        System.out.println("driver.findElement(By.id(\"result\")).getText() = " + driver.findElement(By.id("result")).getText());
        Thread.sleep(821);
        Assert.assertTrue(driver.findElement(By.id("result")).getText().contains("Cancel"));

        //  ---------------- button 3 clicking

        driver.findElement(By.xpath("//button[3]")).click();

        Alert alertButton3 = driver.switchTo().alert();
        alertButton3.sendKeys("akif tunc");
        alertButton3.accept();
        System.out.println(driver.findElement(By.cssSelector("#result")).getText());


    }

}
