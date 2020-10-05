package com.cybertek.tests.assignments;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HWTestCase2 {

    public static void main(String[] args) throws InterruptedException {

        String searchWord = "Java";
        WebDriver driver = WebDriverFactory.getDriver("Chrome");
        driver.get("https://www.ebay.com");

        WebElement searchBox = driver.findElement(By.xpath("//*[@*='Search for anything']"));
        searchBox.sendKeys(searchWord);
        Thread.sleep(1500);


        WebElement searchButton = driver.findElement(By.xpath("//*[@*='Search']"));
        searchButton.click();
        Thread.sleep(1500);

       /* WebElement searchResult = driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/div/div[2]/div/div[1]/h1/span[1]"));
        System.out.println(searchResult.getText());
        Thread.sleep(1500);*/

        if (driver.getTitle().contains(searchWord)){
            System.out.println("pass");
        }else {
            System.out.println("fail about title");
        }

        Thread.sleep(5000);
       driver.quit();


    }
}
