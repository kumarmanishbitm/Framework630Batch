package com.saucelab.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SauceOverviewPage {
	
	// create obj. of webdriver
		WebDriver ldriver;
		
		// Create constructor
		public SauceOverviewPage(WebDriver rdriver){
			
			ldriver=rdriver;
			PageFactory.initElements(rdriver, this);
		}
		
	@FindBy(id="finish")
	WebElement finishBtn;
	
	public void clickOnFinishBtn(){
		finishBtn.click();
	}

}
