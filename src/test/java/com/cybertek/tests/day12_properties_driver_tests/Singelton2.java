package com.cybertek.tests.day12_properties_driver_tests;

public class Singelton2 {

    private Singelton2(){}

    public static String str;

    public static String getInstance (){
        if (str==null){
            System.out.println("its empty. initilating");
            str="somevalue";
            }else {
            System.out.println("itsnot null returning it");
        }

        return str;

    }


}
