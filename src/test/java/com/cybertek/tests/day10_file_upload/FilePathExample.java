package com.cybertek.tests.day10_file_upload;

import org.testng.annotations.Test;

public class FilePathExample {
    @Test
    public void test1(){
        // C:\Users\User\IdeaProjects\EU3TestNGSelenium\src\test\resources\textfile.txt
        // C:\Users\User\IdeaProjects\EU3TestNGSelenium
        //System.out.println("System.getProperty(\"user.dir\") = " + System.getProperty("user.dir"));
        String projectPath = System.getProperty("user.dir");
        String filePath = "src/test/resources/textfile.txt";
        String fullPath = projectPath+ "/"+filePath;
        System.out.println("full project path is  = " + fullPath);



    }
}
