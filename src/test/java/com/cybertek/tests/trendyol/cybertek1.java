package com.cybertek.tests.trendyol;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class cybertek1 {
    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        driver.get("https://learn.cybertekschool.com/courses/362");
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(20000);
        // driver.quit();
    }

    @Test
    public void takeList() throws InterruptedException {
    driver.findElement(By.cssSelector("#okta-signin-username")).sendKeys("kilyneu@gmail.com");
    driver.findElement(By.cssSelector("#okta-signin-password")).sendKeys("Tevfik2021."+ Keys.ENTER );
    Thread .sleep(8032);
    driver.get("https://www.yahoo.com");
    Thread.sleep(3234);
    driver.navigate().back();
    Thread.sleep(2333);
    List<WebElement> elements = driver.findElements(By.xpath("//*[@*='name ellipsis']"));
        for (WebElement element : elements) {
            System.out.println("element.getText() = " + element.getText());

        }


    }

}
