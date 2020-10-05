package com.cybertek.tests.trendyol;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class trend {

WebDriver driver;
   @BeforeMethod
    public void setUp(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://www.trendyol.com/s/elite");
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
      //  driver.quit();
    }



    @Test
    public void enter() throws InterruptedException {

     /*   //Create a map to store  preferences
        Map<String, Object> prefs = new HashMap<String, Object>();

//add key and value to map as follow to switch off browser notification
//Pass the argument 1 to allow and 2 to block
        prefs.put("profile.default_content_setting_values.notifications", 2);

//Create an instance of ChromeOptions
        ChromeOptions options = new ChromeOptions();

// set ExperimentalOption - prefs
        options.setExperimentalOption("prefs", prefs);

//Now Pass ChromeOptions instance to ChromeDriver Constructor to initialize chrome driver which will switch off this browser notification on the chrome browser
        WebDriver driver = new ChromeDriver(options);

        driver.get("https://www.trendyol.com/s/elite");*/

        Thread.sleep(3000);   // notification click manually  --> Cindulla Yetis :)

        WebElement girisyap = driver.findElement(By.cssSelector("#not-logged-in-container"));
        Actions act = new Actions(driver);
        act.moveToElement(girisyap).perform();
        driver.findElement(By.xpath("//*[@id='not-logged-in-container']/div/div[2]")).click();
        driver.findElement(By.cssSelector("#email")).sendKeys("art2ed22mis.arnez@intrees.org");
        driver.findElement(By.cssSelector("#password")).sendKeys("i_bit123");
        WebElement clck = driver.findElement(By.cssSelector("#MemberShipPolicy"));
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].click();", clck);
        driver.findElement(By.cssSelector("#registerSubmit")).click();

       /* Actions act2 = new Actions(driver);
        act2.click(clck).perform();*/


        Thread.sleep(3000);


     }


}
