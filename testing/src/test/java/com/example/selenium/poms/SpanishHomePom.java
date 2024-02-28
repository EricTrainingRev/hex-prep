package com.example.selenium.poms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class SpanishHomePom {

    private WebDriver driver;

    private String pageTitle = "Wikipedia, la enciclopedia libre";

    public SpanishHomePom(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String getDesiredPageTitle(){
        return pageTitle;
    }

    public String getActualPageTitle(){
        return driver.getTitle();
    }
}
