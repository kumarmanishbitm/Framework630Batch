package com.saucelab.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SauceInformationPage {
	
	// create obj. of webdriver
		WebDriver ldriver;
		
		// Create constructor
		public SauceInformationPage(WebDriver rdriver){
			
			ldriver=rdriver;
			PageFactory.initElements(rdriver, this);
		}
		
	@FindBy(id="first-name")
	WebElement firstname;
	
	@FindBy(id="last-name")
	WebElement lastname;
	
	@FindBy(id="postal-code")
	WebElement postalcode;
	
	@FindBy(id="continue")
	WebElement contunueBtn;
	
	
	public void enterFirstname(){
		firstname.sendKeys("David");
	}
	
	public void enterLastname(){
		lastname.sendKeys("millor");
	}
	
	public void enterZipcode(){
		postalcode.sendKeys("00000");
	}
	
	public void clickOnContinueBtn(){
		contunueBtn.click();
	}

}
