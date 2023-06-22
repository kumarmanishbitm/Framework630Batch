package com.saucelab.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SauceLoginPage {
	
	// create obj. of webdriver
	WebDriver ldriver;
	
	// Create constructor
	public SauceLoginPage(WebDriver rdriver){
		
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(id="user-name")
	WebElement username;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(id="login-button")
	WebElement login;
	
	
	public void enterUsernae(){
		username.sendKeys("standard_user");
	}
	
	public void enterPassword(){
		password.sendKeys("secret_sauce");
	}
	
	public void clickOnLoginBtn(){
		login.click();
	}
	

}
