package com.BBCNews.step_definitions;

import com.BBCNews.pages.HomePage;
import com.BBCNews.pages.SigninPage;
import com.BBCNews.utilities.CommanBrowserUtils;
import com.BBCNews.utilities.ConfigurationReader;
import com.BBCNews.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class SigninStepDefs {

    HomePage homePage = new HomePage();
    SigninPage signinPage = new SigninPage();

    @Given("the user in on BBC news home page")
    public void the_user_in_on_BBC_news_home_page() {
        homePage.getBBCNewsPageUrl();
        homePage.signinButton.click();
    }

    @Given("the user navigate the Sign in page")
    public void the_user_navigate_the_Sign_in_page() {

    }
    @Given("the Sign in page have {string} title")
    public void the_Sign_in_page_have_title(String title) {
        CommanBrowserUtils.waitFor(2);
        Assert.assertEquals("Verify title", title.toString(), Driver.get().getTitle().toString());
    }

    @When("the user enters username and password")
    public void the_user_enters_username_and_password() {
        signinPage.login2();
    }

    @Then("{string} is displayed")
    public void is_displayed(String message) {
        Assert.assertEquals("Verify title", message, Driver.get().getTitle());
    }
}
