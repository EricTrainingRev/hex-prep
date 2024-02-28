package com.example.selenium.poms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class EnglishHomePom {

    private WebDriver driver;

    private String pageTitle = "Wikipedia, the free encyclopedia";

    public EnglishHomePom(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String getDesiredPageTitle(){
        return pageTitle;
    }

    public String getCurrentPageTitle(){
        return driver.getTitle();
    }



}
