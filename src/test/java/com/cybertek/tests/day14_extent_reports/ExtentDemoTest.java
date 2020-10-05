package com.cybertek.tests.day14_extent_reports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.cybertek.utilities.ConfigurationReader;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ExtentDemoTest {

    //this class is used for starting nad building reports
    ExtentReports report;

    //this class is used to create HTML report file
    ExtentHtmlReporter htmlReporter;

    //this class will define a test, enables adding logs, authors, test steps
    ExtentTest extentLogger;

    @BeforeMethod
    public void setup(){
        //initialize the class
        report = new ExtentReports();

        //create a report path
        String projetPath= System.getProperty("user.dir");
        String path = projetPath+ "/test-output/report.html";

        //initialize the html reporter with the report path
        htmlReporter= new ExtentHtmlReporter(path);

        //attach the html report to report object
        report.attachReporter(htmlReporter);

        //title in report
        htmlReporter.config().setReportName("Vytrack Smoke Test");

        //set enviroment information
        report.setSystemInfo("Environment", "QA");
        report.setSystemInfo("Browser", ConfigurationReader.get("browser"));
        report.setSystemInfo("OS", System.getProperty("os.name"));

    }

    @Test
    public void test1(){
        // give name to current test
        extentLogger=report.createTest("Test Case Login As Driver Test");

        //test steps
        extentLogger.info("Open Chhrome browser");

        extentLogger.info("Go to this URLLL");

        extentLogger.info("Enter driver username password");

        extentLogger.info("Click login");

        extentLogger.info("verify logged in");

        //pass() --> marks the test case as passed
        extentLogger.pass("test case is Passed");

    }

    @AfterMethod
    public void teardown(){
        // this is the report creation actually.
        report.flush(); //flush it!
    }




}
