package com.BBCNews.pages;

import com.BBCNews.utilities.ConfigurationReader;
import com.BBCNews.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage {

    public HomePage(){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(id = "idcta-username")
    public WebElement signinButton;

    @FindBy(id = "//*[@id='top-navigation']")
    public List<WebElement> navigationList;

    @FindBy(id= "orbit-search-button")
    public WebElement searchButton;

    @FindBy(id= "se-searchbox-input-field")
    public WebElement searchBoxInput;

    @FindBy(xpath= "//*[@id='searchboxDrawerForm']/button[1]")
    public WebElement searchSubmitButton;

    @FindBy(xpath = "//*[@class='ssrcss-1ynlzyd-PromoLink e1f5wbog0']/span/p/span")
    public WebElement searchResult;

    public void getBBCNewsPageUrl(){
        Driver.get().get(ConfigurationReader.get("url"));
    }

    public void setSearchBoxInput (String searchInput){
        searchBoxInput.sendKeys(searchInput);
        searchSubmitButton.click();
    }

}
