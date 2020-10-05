package com.cybertek.tests.day12_properties_driver_tests;

import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class sss {
     @Test
    public void test(){

         WebDriver driver = Driver.get();
         driver.get("https://learn.cybertekschool.com/courses/362/pages/recording-day13-%7C-09-slash-20-slash-2020?module_item_id=29599");

     }
}
