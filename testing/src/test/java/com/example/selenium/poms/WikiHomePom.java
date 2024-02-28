package com.example.selenium.poms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WikiHomePom {

    private WebDriver driver;

    private String wikiUrl = "https://www.wikipedia.org/";

    @FindBy(id = "js-link-box-en")
    private WebElement englishLink;

    @FindBy(id = "js-link-box-es")
    private WebElement spanishLink;

    public WikiHomePom(WebDriver driver){
        // this driver will be provided by the TestRunner
        this.driver = driver;
        // the PageFactory handles creating Java objects to represent your web elements in the POM
        PageFactory.initElements(driver, this);
    }

    public void goToWikipediaHomepage(){
        driver.get(wikiUrl);
    }

    public void clickEnglishLink(){
        // because the PageFactory knows what Driver object we are using, when the POM is created
        // the driver will have our WebElement information, so we can just reference the element and
        // the action we want accomplished, and the driver should handle the rest
        englishLink.click();
    }

    public void clickSpanishLink(){
        spanishLink.click();
    }

}
