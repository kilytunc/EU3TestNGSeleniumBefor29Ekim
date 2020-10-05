package com.cybertek.tests.day7_testng;

import org.testng.annotations.Test;

public class FirstTestNGTest {

    @Test
    public void test1(){
        System.out.println("my first test case akif");
    }

    public static void methd(){
        System.out.println("blal flaflaflf");
    }

    @Test
    public void test2(){
        int a=5, b=3;
        int reslt=5*a+8*b/2;
        methd();
        test1();
        System.out.println( "second test");
    }

}
