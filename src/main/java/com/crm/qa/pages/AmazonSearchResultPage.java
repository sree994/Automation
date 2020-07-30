package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class AmazonSearchResultPage extends TestBase {
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/div[1]/span[3]/div[2]/div[13]/div[1]/span[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/h2[1]/a[1]/span[1]")
	
	WebElement iphone11;
	
	public AmazonSearchResultPage(){
		PageFactory.initElements(driver, this);

	}
	
	public AmazonCataloguePage verifyCataloguePage()
	{
		iphone11.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new AmazonCataloguePage();
		
	}
}
