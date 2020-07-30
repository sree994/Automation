package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.AmazonLoginPage;

public class AmazonHomePage extends TestBase{
	
	@FindBy(id="twotabsearchtextbox")
	WebElement searchtxt;
	
	@FindBy(css=".nav-input[type='submit']")
	WebElement btnsearch;
	
	
	public AmazonHomePage(){
		PageFactory.initElements(driver, this);
	}

public AmazonSearchResultPage searchProduct(String productName)
{
	searchtxt.sendKeys(productName);
	btnsearch.click();
	return new AmazonSearchResultPage();

}
}