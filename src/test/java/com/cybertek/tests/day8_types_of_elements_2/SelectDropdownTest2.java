package com.cybertek.tests.day8_types_of_elements_2;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class SelectDropdownTest2 {
    WebDriver driver;

    @BeforeMethod
    public void setup(){
        driver= WebDriverFactory.getDriver("ChroME");
    }
    @AfterMethod
    public void tearDown () throws InterruptedException {
        Thread.sleep(1234);
        driver.quit();
    }


    @Test
    public void test1(){
        driver.get("http://practice.cybertekschool.com/dropdown");
        //locate your dropdown
        WebElement dropdownElement = driver.findElement(By.id("state"));

        //create Select object (pass the element in constrctr)
        Select stateDropdown = new Select(dropdownElement);

        // using getOptions and declare a list to take all available options
        List<WebElement> options = stateDropdown.getOptions();
        System.out.println("options.size() = " + options.size());

        for (WebElement option : options) {
            System.out.println( option.getText());

        }

    }

    @Test
    public void test2() throws InterruptedException {
        driver.get("http://practice.cybertekschool.com/dropdown");
        //locate your dropdown
        WebElement dropdownElement = driver.findElement(By.id("state"));

        //create Select object (pass the element in constrctr)
        Select stateDropdown = new Select(dropdownElement);

        //verify that first selection is Select a State
        String expectedOption = "Select a State";
        String actualOption =  stateDropdown.getFirstSelectedOption().getText();
        Assert.assertEquals(actualOption,expectedOption,"verify the default is Select a state");

        Thread.sleep(2232);
        //selecting an other option and verify it selected  USING VISIBLE TEXT FOR OPTION
        stateDropdown.selectByVisibleText("Virginia");
        expectedOption = stateDropdown.getFirstSelectedOption().getText();
        actualOption="Virginia";
        Assert.assertEquals(actualOption,expectedOption,"verify Virginia Selcted");

        // SELECETING OPTION BY USING INDEX
        Thread.sleep(1222);
        stateDropdown.selectByIndex(51);
        expectedOption = "Wyoming";
        actualOption = stateDropdown.getFirstSelectedOption().getText();
        Assert.assertEquals(actualOption,expectedOption,"verify the option which selected by index");


        // Selecting by using value
        Thread.sleep(1234);
        stateDropdown.selectByValue("KY"); // find the option and select it
        //verify it
        expectedOption = "Kentucky";
        actualOption = stateDropdown.getFirstSelectedOption().getText();
        Assert.assertEquals(actualOption,expectedOption,"verify the Kentucky which selected by KY value");




    }

}
