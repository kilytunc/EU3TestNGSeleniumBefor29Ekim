package com.cybertek.tests.day15_review;

import com.cybertek.pages.ContactInfoPage;
import com.cybertek.pages.ContactsPage;
import com.cybertek.pages.DashboardPage;
import com.cybertek.pages.LoginPage;
import com.cybertek.tests.TestBase;
import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.ConfigurationReader;
import org.testng.Assert;
import org.testng.annotations.Test;

public class verifyContactInfoTest  extends TestBase {
    /**
     * open the chrome
     * go to qa1.vytrack
     * login as a sales manager
     * navigate to customers ->contacts
     * click on email mbrackstone9@example.com
     * verify that full name is Mariam Brackstone
     * verify that email is mbrackstone9@example.com
     * verify that phone number is +18982323434
     */

    @Test
    public void contactDetailsTest(){

        extentLogger = report.createTest("Contact Info Verification");  //for report giving the reportname using report object

        LoginPage loginPage=new LoginPage();                                    // to login page creating a loginpageobj

        String username= ConfigurationReader.get("salesmanager_username");      // we have no directly method for salesmanager
        String password= ConfigurationReader.get("salesmanager_password");      // so we declaring to a string the credentials
        extentLogger.info("username"+username);
        extentLogger.info("password"+password);

        loginPage.login(username,password);

        extentLogger.info("Navigate to Contacts page");
        new DashboardPage().navigateToModule("Customers","Contacts");    // navigate to customers ->contacts navigating without creat an object with referans name


        ContactsPage contactsPage=new ContactsPage();
        extentLogger.info("click on email");
        contactsPage.waitUntilLoaderScreenDisappear();
        contactsPage.getContactEmail("mbrackstone9@example.com").click();

        ContactInfoPage contactInfoPage = new ContactInfoPage();

        String expectedFullName = "Mariam Brackstone";
        String actualFullName = contactInfoPage.fullName.getText();

        extentLogger.info("verify the name");
        Assert.assertEquals(actualFullName,expectedFullName,"verify that name true");

        extentLogger.info("verify the mail");
        Assert.assertEquals(contactInfoPage.email.getText(),"mbrackstone9@example.com" );

        extentLogger.info("verify the phone");
        Assert.assertEquals(contactInfoPage.phoneNumber.getText(),"+18982323434" );

        extentLogger.pass("Contact Info Verification");
    }




}
