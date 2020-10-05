package com.cybertek.tests.day8_types_of_elements_2;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class NoSelectDropdown {
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


    @Test
    public void test1() {
        driver.get("http://practice.cybertekschool.com/dropdown");
        WebElement dropdpwnElement = driver.findElement(By.id("dropdownMenuLink"));

       // Select selectaWebside = new Select(dropdpwnElement); // ---> its not working because there is no sellect tag at its html code so the Select clas cannot work here

        // click dropdwn to see the options
       dropdpwnElement.click();

       // GET THE OPTIONS WITH FIND ELEMENTS METHOD AND FINDING COMMON LOCATOR BETWEEN THEM  --> HERE its Class -- " dropdown-item "
        List<WebElement> dropdownOptions = driver.findElements(By.className("dropdown-item"));  // take the webelement object as a list here. because u are loating more than one element. than you get them in a list
        System.out.println("dropdownOptions.size() = " + dropdownOptions.size());

        // sout them one by one
        for (WebElement option : dropdownOptions) {
            System.out.println("option = " + option.getText());

        }

        //click to Yahoo
        dropdownOptions.get(2).click();


    }

}
