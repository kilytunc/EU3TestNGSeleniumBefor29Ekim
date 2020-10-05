package com.cybertek.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactInfoPage extends BasePage{

    @FindBy(css = "div.pull-left>.user-name")   public WebElement fullName;

    @FindBy(css = "a.email")    public WebElement email;

    @FindBy(css = "a.phone")  public WebElement phoneNumber;

}
