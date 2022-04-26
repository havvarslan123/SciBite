package com.BBCNews.step_definitions;

import com.BBCNews.pages.HomePage;
import com.BBCNews.pages.SigninPage;
import com.BBCNews.utilities.CommanBrowserUtils;
import com.BBCNews.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class HomePageTopNavigationStepDefs {

    HomePage homePage = new HomePage();
    SigninPage signinPage = new SigninPage();

    @Given("the user logs in")
    public void the_user_logs_in() {
        homePage.getBBCNewsPageUrl();
        homePage.signinButton.click();
        CommanBrowserUtils.waitFor(2);
        signinPage.login2();
    }

    @When("the page have the title {string}")
    public void the_page_have_the_title(String PageTitle) {
        Assert.assertEquals("Verify title", PageTitle, Driver.get().getTitle());
    }

    @When("click the search box")
    public void click_the_search_box() {
        homePage.searchButton.click();
    }

    @Then("search for {string}")
    public void search_for(String searchKey) {
        CommanBrowserUtils.waitFor(2);
        homePage.setSearchBoxInput(searchKey);
    }

    @Then("verify the first news title is {string}")
    public void verify_the_first_news_title_is(String searchResultTitle) {
        CommanBrowserUtils.waitFor(2);
        Assert.assertEquals(searchResultTitle, homePage.searchResult.getText());
    }

}
