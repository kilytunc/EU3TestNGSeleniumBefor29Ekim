package com.cybertek.tests.day3_webelement_intro;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class verifyConfirmationMessage2 {
    public static void main(String[] args) throws InterruptedException {

       /*
               * Verify confirmation message
        open browser
        go to http://practice.cybertekschool.com/forgot_password Links to an external site.
        enter any email
        verify that email is displayed in the input box
        click on Retrieve password
        verify that confirmation message says 'Your e-mail's been sent!

               *
       * */
            // open browser
        WebDriver driver = WebDriverFactory.getDriver( "Chrome");
        // get the page
        driver.get("http://practice.cybertekschool.com/forgot_password");

        // find the email box
        WebElement emailInputBox = driver.findElement(By.name("email"));

       //  fill the input box wit an assigned variable (expectedMail)
        String expectedMail = "mike@smith.com";
        emailInputBox.sendKeys(expectedMail);      // sendKEys --> sendind action from keybord (or a variable as here ) use this method --> OBJECTNAME   .   sendKeys


        // take the value which eenterd to inputMailBOx .. using a method for it and...
        //  .... save the mail to variable which want to see in input box for verify
        String actualMail = emailInputBox.getAttribute("value");


        // verify
        if(expectedMail.equals(actualMail)){
            System.out.println("pass the mail is in the inputmailbox  ...");
        }else{
            System.out.println("FAILLL  The mail is not expected one in the box");
        }

        //Click on retrieve Password BUTTON
        // first find this button
        WebElement retrieveButton = driver.findElement(By.id("form_submit"));
        retrieveButton.click();

        //first i need to assign my expected message than i will check them equal or not
        String expectedMessage = "Your e-mail's been sent!";

        // verify the message is on screen
        WebElement actualConfirmationMessage = driver.findElement(By.name("confirmation_message"));
        // this one is an object so i need to take its value using getTExt message


        String actualMessage = actualConfirmationMessage.getText();

        if (actualMessage.equals(expectedMessage)){
            System.out.println("PAssed about the message. The message on the screen is equal to expected");
        }else{
            System.out.println("FAIL the message on screen is not expected");
        }

        Thread.sleep(2000);

        // close all
        driver.quit();
    }
}
