package com.example.selenium;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.util.concurrent.TimeUnit;

// this tells Junit to let Cucumber handle executing the code: allows for us to make use of feature files
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:features",
        glue = "com.example.selenium.steps",
        plugin = {"pretty","html:src/test/resources/reports/html-reports.html"}
)
public class TestRunner {

    public static WebDriver driver;

    public static WebDriverWait wait;

    @BeforeClass
    public static void setup(){
        WebDriverManager.chromedriver().setup();
        // this interacts with the browser
        driver = new ChromeDriver();
        // this tells the driver to wait up to 1 second for elements in the browser to be interactable
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        // this tells the driver to wait for whatever condition we specify in our step code
        wait = new WebDriverWait(driver, 1);
    }







    // added this main method to validate driver was working
    // need correct version of driver to make manual setup work, managed option is easier to work with
    // but not always an option, depending on the company
    public static void main(String[] args) {
        setUpDriverAutomatically();
    }

    public static void setUpDriverManually(){
        try{
            File chromedriver = new File("src/test/resources/chromedriver.exe");
            System.setProperty("webdriver.chrome.driver", chromedriver.getAbsolutePath());
            driver = new ChromeDriver();
            driver.get("https://www.wikipedia.org/");
        } finally {
            driver.quit();
        }
    }

    public static void setUpDriverAutomatically(){
        try{
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.get("https://www.wikipedia.org/");
        } finally {
            driver.quit();
        }

    }

}
