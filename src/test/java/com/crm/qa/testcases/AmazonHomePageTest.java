package com.crm.qa.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.AmazonHomePage;
import com.crm.qa.pages.AmazonLoginPage;


public class AmazonHomePageTest extends TestBase {
	
	AmazonHomePage amazonHomePage;
	AmazonLoginPage amazonLoginPage;
	
	
	public AmazonHomePageTest(){
		super();
		
	}
	
	@BeforeMethod
	public void setUp(){
		initialization();
		amazonHomePage= new AmazonHomePage();
		amazonLoginPage = new AmazonLoginPage();
		amazonHomePage = amazonLoginPage.login(prop.getProperty("email"), prop.getProperty("password"));
		
		}
	
	@Test
	public void searchproductTest() {
		
		amazonHomePage.searchProduct("apple");
		
	}
	
	
	
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}

}
