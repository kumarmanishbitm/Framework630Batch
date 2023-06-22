package com.saucelab.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.saucelab.pageObject.SauceCartPage;
import com.saucelab.pageObject.SauceInformationPage;
import com.saucelab.pageObject.SauceLoginPage;
import com.saucelab.pageObject.SauceOverviewPage;
import com.saucelab.pageObject.SauceProductPage;



public class SauceOverviewTest extends BaseClass{
	
	@Test
	public void login() throws IOException, InterruptedException{
		
		driver.get(url);
		logger.info("URL Opened");
		
		SauceLoginPage sauceLogin = new SauceLoginPage(driver);	
		sauceLogin.enterUsernae();
		logger.info("Username entered");
		sauceLogin.enterPassword();
		logger.info("Password entered");
		sauceLogin.clickOnLoginBtn();
		logger.info("Clicked on Login button.");
		
		String title = driver.getTitle();
		System.out.println("Product page title is :" + title);
		
		if(title.equals("Swag Labs"))
		{
			logger.info("VerifyLogin - Passed");
			Assert.assertTrue(true);
		}
		else
		{
			logger.info("VerifyLogin - Failed");
			captureScreenShot(driver,"VerifyLogin");
			Assert.assertTrue(false);

		}
		
		SauceProductPage productPage =  new SauceProductPage(driver);
		
		productPage.clickOnProductName();
		productPage.clickOnAddToCartBtn();
		
		String prodUrl = driver.getCurrentUrl();
		System.out.println("Product page prodUrl is :" + url);
		
		if(prodUrl.equals("https://www.saucedemo.com/inventory-item.html?id=4"))
		{
			logger.info("VerifyProductP - Passed");
			Assert.assertTrue(true);
		}
		else
		{
			logger.info("VerifyProductF - Failed");
			captureScreenShot(driver,"VerifyProduct");
			Assert.assertTrue(false);

		}
		
		SauceCartPage cartPage = new SauceCartPage(driver);
		
		cartPage.clickOnCartBtn();
		cartPage.clickOnCheckoutBtn();
		
		String checkOUturl = driver.getCurrentUrl();
		System.out.println("Product page title is :" + checkOUturl);
		
		if(checkOUturl.equals("https://www.saucedemo.com/checkout-step-one.html"))
		{
			logger.info("VerifyLogin - Passed");
			Assert.assertTrue(true);
		}
		else
		{
			logger.info("VerifyLogin - Failed");
			captureScreenShot(driver,"VerifyLogin");
			Assert.assertTrue(false);

		}
		
		SauceInformationPage infoPage = new SauceInformationPage(driver);
		infoPage.enterFirstname();
		infoPage.enterLastname();
		infoPage.enterZipcode();
		Thread.sleep(5000);
		infoPage.clickOnContinueBtn();
		
		String overviewUrl = driver.getCurrentUrl();
		System.out.println("Product page title is :" + overviewUrl);
		
		if(overviewUrl.equals("https://www.saucedemo.com/checkout-step-two.html"))
		{
			logger.info("VerifyLogin - Passed");
			Assert.assertTrue(true);
		}
		else
		{
			logger.info("VerifyLogin - Failed");
			captureScreenShot(driver,"VerifyLogin");
			Assert.assertTrue(false);

		}
		
		SauceOverviewPage overview = new SauceOverviewPage(driver);
		overview.clickOnFinishBtn();
		
		
		
		logger.info("Browser Closed.");
	}

}
