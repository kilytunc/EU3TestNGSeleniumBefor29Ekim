package com.cybertek.tests.day3_webelement_intro;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class verifyURLchanged {

                /*
                Verify URL changed
            open browser
            go to http://practice.cybertekschool.com/forgot_password Links to an external site.
            enter any email
            click on Retrieve password
            verify that url changed to http://practice.cybertekschool.com/email_sent
            :+1:
            1

                 */
                public static void main(String[] args) throws InterruptedException {

                  //open chrome browser
                    WebDriver driver = WebDriverFactory.getDriver("Chrome");

                  // go to url
                  driver.get("http://practice.cybertekschool.com/forgot_password");

                  //find  email box
                    WebElement emailInputBox = driver.findElement(By.name("email"));

                  // sendKeys ( --> send keybored
                    emailInputBox.sendKeys("mike@fakemail.com");
/*

                    // save current url before clicking buttn
                    String expectedUrl = driver.getCurrentUrl();
*/


                  //click on Retrieve password

                    WebElement retriveButton = driver.findElement(By.id("form_submit"));
                    retriveButton.click();
                    Thread.sleep(1000);

                    //verify that url changed to http://practice.cybertekschool.com/email_sent


              /*      // save actual url after clicking buttn
                    String actualUrl = driver.getCurrentUrl();

                    if (!actualUrl.equals(expectedUrl)){
                        System.out.println("Succsess");
                    }else {
                        System.out.println("Fail");

                        }
*/
                    // JAMALLLLL   saving expected url
                    String expectedUrl = "http://practice.cybertekschool.com/email_sent";

                    // saving actual url using getCurrentUrl method
                    String actualUrl = driver.getCurrentUrl();

                    if (expectedUrl.equals(actualUrl)){
                        System.out.println("PASS");
                    }else {
                        System.out.println("fail");
                        System.out.println("expected" + expectedUrl);
                        System.out.println("actual" + actualUrl);
                        }



                    // close quit
                    driver.quit();



                }

}
