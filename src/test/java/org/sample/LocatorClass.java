package org.sample;

import java.sql.Driver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LocatorClass extends BaseClass {
	public LocatorClass() {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getTxtsearch() {
		return txtsearch;
	}

	public WebElement getClick() {
		return click;
	}

	public WebElement getIphone() {
		return iphone;
	}

	public WebElement getPrice() {
		return price;
	}

	@FindBy(xpath="//input[@type='text']")
	private WebElement txtsearch;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement click;
	
	@FindBy(xpath="//div[@class='_4rR01T']")
	private WebElement iphone;
	
	@FindBy(xpath="//div[@class='_30jeq3 _1_WHN1']")
    private WebElement price;
	
	@FindBy(xpath="//span[@role='button']")
	private WebElement closebutton;

	public WebElement getClosebutton() {
		return closebutton;
	}
}
