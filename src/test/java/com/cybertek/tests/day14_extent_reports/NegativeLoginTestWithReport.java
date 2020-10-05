package com.cybertek.tests.day14_extent_reports;

import com.cybertek.pages.LoginPage;
import com.cybertek.tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NegativeLoginTestWithReport extends TestBase {
    @Test
    public void wrongPasswordTest(){

        //name of test for report
        extentLogger=report.createTest("Wrong Password Test");

        LoginPage loginPage = new LoginPage();
        extentLogger.info("Enter User name : user1 ");
        loginPage.usernameInput.sendKeys("user1");

        extentLogger.info("Enterin wrong password : somepassword");
        loginPage.passwordInput.sendKeys("somepassword");

        extentLogger.info("Clicking login button");
        loginPage.loginBtn.click();

        extentLogger.info("Vrify the Page URL");
        Assert.assertEquals(driver.getCurrentUrl(),"https://qa1.vytrack.com/user/login");

        extentLogger.pass("Wrong password test is passed");
    }

    @Test
    public void  wrongUsernameTest(){

        //name of test for report
        extentLogger=report.createTest("Wrong username Test");

        LoginPage loginPage=new LoginPage();

        extentLogger.info("enter a wrong username : someusername");
        loginPage.usernameInput.sendKeys("someusername");

        extentLogger.info("enter password : UserUser123");
        loginPage.passwordInput.sendKeys("UserUser123");

        extentLogger.info("click login button");
        loginPage.loginBtn.click();

        extentLogger.info("verify the url");
        Assert.assertEquals(driver.getCurrentUrl(),"https://qa1.vytrack.com/user/login");

        extentLogger.pass("Wrong username test iss passed..");
    }

}
