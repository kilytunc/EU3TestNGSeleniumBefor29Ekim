package com.cybertek.tests.day9_popups_tabs_frames;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;

public class MultipleWindows {
    WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = WebDriverFactory.getDriver("ChrOme");

    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(1000);
        driver.quit();
    }


    //// html popup its easy...
    @Test
    public void test1() throws InterruptedException {
        driver.get("http://practice.cybertekschool.com/windows");

        // get current title (before click
        System.out.println("BEFORE driver.getTitle() = " + driver.getTitle());

        //find link and click lazy way
        driver.findElement(By.linkText("Click Here")).click();

        //get current title after linked
        System.out.println("AFTER driver.getTitle() = " + driver.getTitle());

        //getWindowHandle
        System.out.println("driver.getWindowHandle() = " + driver.getWindowHandle());

        String currnetWindowHandle = driver.getWindowHandle();

        // a list of unig members and no aloowed to use index!!
        Set<String> windowHandles = driver.getWindowHandles();

        for (String handle : windowHandles) {
              if (!handle.equals(currnetWindowHandle)) {
                driver.switchTo().window(handle);
            }
        }

        //get current title after switch with handle
        System.out.println("AFTER driver.getTitle() = " + driver.getTitle());

    }

    @Test
    public void test2(){

        driver.get("http://practice.cybertekschool.com/windows");

        System.out.println("Title Before Click" + driver.getTitle());

        driver.findElement(By.linkText("Click Here")).click();

        Set<String> windowHandles = driver.getWindowHandles();

        for (String handle : windowHandles) {                   // loop throw each window
            driver.switchTo().window(handle);                   // switch one by one using handle
                if (driver.getTitle().equals("New Window")){    // if matched mit expected title
                    break;                                      // than quit the loop and stay there
                 }
        }


        System.out.println("After all clicking switching matchin your window title is : " + driver.getTitle());
    }

}

