package com.BBCNews.pages;

import com.BBCNews.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class UkNewsPage {
    public UkNewsPage(){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "//*[@id='orb-modules']/header/div[2]/div[1]/div[1]/nav/ul/li[5]")
    public WebElement ukNewsButton;

    @FindBy(xpath = "//*[@id=\"orb-modules\"]/header/div[2]/div[2]/div[1]/nav/ul/li[3]")
    public WebElement scotlandNewsButton;

    @FindBy(xpath = "//*[@id='orb-modules']/header/div[2]/div[2]/div[1]/nav/ul/li[4]")
    public WebElement glasgowWestNewsButton;

    @FindBy(xpath = "//*[@id='weather-component']/div[1]/div/div/div/h3")
    public WebElement glasgowWeather;

    public void clickUkNewsButton(){
        ukNewsButton.click();
    }

    public List<String> ukNewsDropdown(){
        Select dropdown = new Select(ukNewsButton);
        List<WebElement> dropdownListed = dropdown.getOptions();
        List<String> allOptions = new ArrayList<>();
        for (WebElement option : dropdownListed) {
            allOptions.add(option.getText());
        }
        System.out.println(allOptions);
        return allOptions;
    }
}
