package com.cybertek.tests.day13_pom;

import com.cybertek.pages.CalendarEventsPage;
import com.cybertek.pages.DashboardPage;
import com.cybertek.pages.LoginPage;
import com.cybertek.tests.TestBase;
import com.cybertek.utilities.BrowserUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PageSubtitleTest extends TestBase {

    /**
     * Test case
     * Open Chrome browser
     * Login as a Driver
     * Verify that page subtitle is Quick Launchpad
     * Go to Activities -> Calendar Events
     * verify that page subtitle is Calendar Events
     */
    @Test
    public void test1() throws InterruptedException {

        LoginPage loginPage =new LoginPage();

        loginPage.loginAsDriver();

        String expectedSubtitle = "Quick Launchpad";

        DashboardPage dashboardPage = new DashboardPage();

        String actualSubtitle = dashboardPage.getPageSubTitle();

        Assert.assertEquals(actualSubtitle,expectedSubtitle,"verify the subtitle ..1");

        dashboardPage.navigateToModule("Activities", "Calendar Events");

        //Thread.sleep(1234);
        CalendarEventsPage calendarEventsPage =new CalendarEventsPage(); // to locating calender events we switch to calenderevents page so we need to create a page object model
        BrowserUtils.waitFor(2);
        Assert.assertEquals(calendarEventsPage.getPageSubTitle(), "Calendar Events","verify subtitle");


    }
}
