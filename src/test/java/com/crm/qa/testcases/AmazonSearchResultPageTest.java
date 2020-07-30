package com.crm.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.AmazonHomePage;
import com.crm.qa.pages.AmazonLoginPage;
import com.crm.qa.pages.AmazonSearchResultPage;

public class AmazonSearchResultPageTest extends TestBase {
	AmazonHomePage amazonHomePage;
	AmazonLoginPage amazonLoginPage;
	AmazonSearchResultPage amznsrchrespage;
	
	
	
	public AmazonSearchResultPageTest(){
		super();
		
	}
	
	@BeforeMethod
	public void setUp(){
		initialization();
	
		amazonLoginPage = new AmazonLoginPage();
		amazonHomePage = amazonLoginPage.login(prop.getProperty("email"), prop.getProperty("password"));
		amznsrchrespage=amazonHomePage.searchProduct("apple");
		}
	
	@Test
	public void CataloguePageTest() {
		amznsrchrespage.verifyCataloguePage();
	}
	
	
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}

}



