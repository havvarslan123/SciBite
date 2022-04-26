package com.BBCNews.step_definitions;

import com.BBCNews.pages.UkNewsPage;
import com.BBCNews.utilities.CommanBrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class UkNewsStepDefs {
    UkNewsPage ukNewsPage = new UkNewsPage();

    @When("the user navigate to UK news button")
    public void the_user_navigate_to_UK_news_button() {
        CommanBrowserUtils.waitFor(3);
        ukNewsPage.clickUkNewsButton();
    }

    @When("click the Scotland news")
    public void click_the_Scotland_news() {
        CommanBrowserUtils.waitFor(3);
        ukNewsPage.scotlandNewsButton.click();
    }

    @When("click the Glasgow & West news")
    public void click_the_Glasgow_West_news() {
        CommanBrowserUtils.waitFor(3);
        ukNewsPage.glasgowWestNewsButton.click();
    }

    @Then("Glasgow weather is displayed")
    public void glasgow_weather_is_displayed() {
        CommanBrowserUtils.scrollToElement(ukNewsPage.glasgowWeather);
        Assert.assertTrue(ukNewsPage.glasgowWeather.isDisplayed());
    }

}


