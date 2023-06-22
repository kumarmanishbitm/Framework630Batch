package com.saucelab.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SauceProductPage {
	
	// create obj. of webdriver
	WebDriver ldriver;
	
	// Create constructor
	public SauceProductPage(WebDriver rdriver){
		
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//div[text()='Sauce Labs Backpack']")
	WebElement productName;
	
	@FindBy(id="add-to-cart-sauce-labs-backpack")
	WebElement AddToCartBtn;
	
	
	public void clickOnProductName(){
		productName.click();
	}
	
	public void clickOnAddToCartBtn(){
		AddToCartBtn.click();
	}

	

}
