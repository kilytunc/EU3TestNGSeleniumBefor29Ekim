package com.cybertek.pages;

import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.get(),this);  // dont need to know backroud. sallaa
        }

        //driver.findElement(By.id("prependedInput"));
        @FindAll({                                                  // FindAll returns if one of them true its enoug            like | or
                @FindBy(id = "prependedInput"),                     // FindBys returns nedds all statemnts needs to find it     like & and
                @FindBy(name = "_username")                         // both syntx is same ({ *** *** })
        })
        public WebElement usernameInput;

        @FindBy(id = "prependedInput2")                             // no equalmark because the this keyword at the paremeter of the constructor provides equalyt between this two pesepese lines
        public WebElement passwordInput;

        @FindBy(id = "_submit")                                     //driver.findElement(By.id("_submit"));
        public WebElement loginBtn;

        public void login(String username, String password){
            usernameInput.sendKeys(username);
            passwordInput.sendKeys(password);
            loginBtn.click();
        }

    public void loginAsStoreManager(){
        String username = ConfigurationReader.get("storemanager_username");
        String password = ConfigurationReader.get("storemanager_password");

        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginBtn.click();
    }

    public void loginAsDriver(){
        String username = ConfigurationReader.get("driver_username");
        String password = ConfigurationReader.get("driver_password");

        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginBtn.click();
    }
}
