package com.cybertek.tests.day13_pom;

import com.cybertek.pages.*;
import com.cybertek.tests.TestBase;
import com.cybertek.utilities.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RepeatOptionsTest extends TestBase {

      /*VERIFY RADIO BUTTONS
    Open Chrome browser
    Login as driver
    Go to Activities->Calendar Events
    Click on create calendar events
    Click on repeat
    Verify that repeat every days is checked
    verify that repeat weekday is not checked
    * */
    @Test
    public void test1(){

        // login as driver
        LoginPage loginPage= new LoginPage();
        loginPage.loginAsDriver();

        // Go to Activities->Calendar Events
        DashboardPage dashboardPage= new DashboardPage();
        dashboardPage.navigateToModule("Activities","Calendar Events");


        // Click on create calendar events
        // create a pageObject to find and click the button
        CalendarEventsPage calendarEventsPage =new CalendarEventsPage();
        //need to wait for pages object upload
        calendarEventsPage.waitUntilLoaderScreenDisappear();
        //BrowserUtils.waitForClickablility(calendarEventsPage.createCalendarEvent,50);
        calendarEventsPage.createCalendarEvent.click();

        CreateCalendarEventsPage createCalendarEventsPage =new CreateCalendarEventsPage();
        createCalendarEventsPage.repeat.click();

        Assert.assertTrue(createCalendarEventsPage.days.isSelected(),"verify days selected");
        Assert.assertFalse(createCalendarEventsPage.weekday.isSelected(),"verify weekdays not  selected");

    }



    /*
     VERIFY REPEAT OPTIONS
        Open Chrome browser
        Login as driver
        Go to Activities->Calendar Events
        Click on create calendar events button
        Click on repeat checkbox
        Verify that repeat options are Daily, Weekly, Monthly,Yearly(in this order)
     */

    @Test
    public void test2() throws InterruptedException {
        // login as driver
        LoginPage loginPage= new LoginPage();
        loginPage.loginAsDriver();

        // Go to Activities->Calendar Events
        DashboardPage dashboardPage= new DashboardPage();
        dashboardPage.navigateToModule("Activities","Calendar Events");

        // Click on create calendar events
        // create a pageObject to find and click the button
        CalendarEventsPage calendarEventsPage =new CalendarEventsPage();
        //need to wait for pages object upload
        //calendarEventsPage.waitUntilLoaderScreenDisappear();
        //Thread.sleep(2222);
        BrowserUtils.waitFor(2);
        //BrowserUtils.waitForClickablility(calendarEventsPage.createCalendarEvent,50);
       // BrowserUtils.waitForPageToLoad(2);
        calendarEventsPage.createCalendarEvent.click();

        //Click on repeat checkbox (first create a page object for CreatCalendarEvents PAge
        CreateCalendarEventsPage createCalendarEventsPage =new CreateCalendarEventsPage();
        createCalendarEventsPage.repeat.click();

        // Verify that repeat options are Daily, Weekly, Monthly,Yearly(in this order)

        Select repeatsDropdown = createCalendarEventsPage.repeatOptionsList();

        List<String> expectedList = Arrays.asList("Daily", "Weekly", "Monthly","Yearly");

        List<String> actualList = new ArrayList<>(); // an epty list to take the actual options (text /string format)

        List<WebElement> actualOptions = repeatsDropdown.getOptions(); // this lists members is not string They are webelement objects so i need to take their names (getText) to compare their

        for (WebElement option : actualOptions) {

            //get text of each element and add to actual list
            actualList.add(option.getText());

        }

        Assert.assertEquals(actualList,expectedList,"verify that the two list is all same");
    }


}