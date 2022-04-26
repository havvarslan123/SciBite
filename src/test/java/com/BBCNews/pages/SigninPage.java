package com.BBCNews.pages;

import com.BBCNews.utilities.ConfigurationReader;
import com.BBCNews.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SigninPage {

    public SigninPage(){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(id= "user-identifier-input")
    public WebElement usernameInput;

    @FindBy(id= "password-input")
    public WebElement passwordInput;

    @FindBy(id= "submit-button")
    public WebElement submitButton;

    @FindBy(className = "form-message__text")
    public WebElement errorMessage;

    public void login(String username, String password){
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        submitButton.click();
    }

    public void login2(){
        String username = ConfigurationReader.get("username");
        String password= ConfigurationReader.get("password");
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        submitButton.click();
    }

    public void verifySignInPage(String expectedsigninPageTitle){
        String actualTitle = Driver.get().getTitle();
        Assert.assertEquals("Verify header", expectedsigninPageTitle, actualTitle);

    }


}
