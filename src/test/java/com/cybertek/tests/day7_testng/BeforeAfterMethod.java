package com.cybertek.tests.day7_testng;

import org.testng.annotations.*;

public class BeforeAfterMethod {

    @Test
    public void test1(){
        System.out.println("First test case");

    }

    @BeforeClass
    public  void setUpClass(){
        System.out.println("Its running once before eveything" +
                "this is your before class method");
    }

    @AfterClass
    public void tearDownClass(){
        System.out.println("this is the end this words is comming from after class method");
    }
    @Test
    public void test2(){
        System.out.println("second test case");

    }

    @Test
    public void test3(){
        System.out.println("Third test case");

    }

    @BeforeMethod
    public void setUp(){
        System.out.println("Wrbdriver , Open Browser , Get Url");
    }


    @AfterMethod
    public void tearDown(){
        System.out.println("Wrbdriver , Open Browser , Get Url");
    }

}
