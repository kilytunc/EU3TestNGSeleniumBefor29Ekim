package com.cybertek.tests.day10_actions_js;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HoverHW {

    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = WebDriverFactory.getDriver("chrome");

    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }

    /**
     * hover over each image in the website
     * verify each name:user text is displayed
     */

    @Test
    public void test1(){

        driver.get("http://practice.cybertekschool.com/hovers");
        Actions act = new Actions(driver);

        int size = driver.findElements(By.xpath("//img")).size();
        for (int i=1 ; i<=size; i++){

            WebElement element = driver.findElement(By.xpath("(//img)["+i+"]"));
            act.moveToElement(element).perform();
            String searchImgText= "(//div[@*='figcaption'])["+i+"]";
            Assert.assertTrue(driver.findElement(By.xpath(searchImgText)).isDisplayed(),"Text isDisplayed");
            System.out.println("IMAGE Text"+i +"isDisplayed-->"+ driver.findElement(By.xpath(searchImgText)).isDisplayed());

        }
    }

    @Test
    public void test2(){
        driver.get("http://practice.cybertekschool.com/hovers");




    }

}
    /*

List<WebElement> figures = driver.findElements(By.xpath("//div[@class='figure']"));
    int figureSize= figures.size();
    Actions action = new Actions(driver);
    int count=1;
    for (WebElement element : figures) {
        if(count<= figureSize) {
                String str = "(//h5)["+count+"]";
                action.moveToElement(element).perform();
                WebElement name = driver.findElement(By.xpath(str));
                Assert.assertTrue(name.isDisplayed(), "vrify that name is displayed");
                count++;
        }else{
            break ;
        }

        */

/*   JAMALL
*   @Test
    public void test2() throws InterruptedException {
        driver.get("http://practice.cybertekschool.com/hovers");

        for (int i = 1; i <= 3; i++) {

            String xpathImg = "(//img)["+i+"]";
            WebElement img = driver.findElement(By.xpath(xpathImg));
            System.out.println(xpathImg);

            Actions actions = new Actions(driver);
            Thread.sleep(1000);
            actions.moveToElement(img).perform();

            String textXpath = "//h5[.='name: user"+i+"']";
            WebElement text1 = driver.findElement(By.xpath(textXpath));
            System.out.println(textXpath);
            Assert.assertTrue(text1.isDisplayed(),"verify user "+i+" is displayed");

        }
* */