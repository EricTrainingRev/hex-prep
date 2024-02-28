package com.example.selenium.steps;

import com.example.selenium.TestRunner;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class WikiFeatureSteps {

    @Given("The User is on the main Wikipedia navigation page")
    public void the_English_User_is_on_the_main_Wikipedia_navigation_page() {
        TestRunner.wikiHomePom.goToWikipediaHomepage();
    }
    @When("The English User clicks on the English link")
    public void the_English_User_clicks_on_the_English_link() {
        TestRunner.wikiHomePom.clickEnglishLink();
    }
    @Then("The English User should be redirected to the English landing page")
    public void the_English_User_should_be_redirected_to_the_English_landing_page() {
        Assert.assertEquals(
                TestRunner.englishHomePom.getDesiredPageTitle(),
                TestRunner.englishHomePom.getCurrentPageTitle()
        );
    }

    @When("The Spanish User clicks on the Spanish link")
    public void the_Spanish_User_clicks_on_the_Spanish_link() {
        TestRunner.wikiHomePom.clickSpanishLink();
    }

    @Then("The Spanish User should be redirected to the Spanish landing page")
    public void the_Spanish_User_should_be_redirected_to_the_Spanish_landing_page() {
        Assert.assertEquals(
                TestRunner.spanishHomePom.getDesiredPageTitle(),
                TestRunner.spanishHomePom.getActualPageTitle()
        );

    }

}
