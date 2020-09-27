package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.AmazonLoginPage;
import com.crm.qa.util.TestUtil;

public class AmazonLoginPageTest extends TestBase {
	
		AmazonLoginPage amazonLoginPage;
		
		//public static String TESTDATA_SHEET_PATH = "C:\\Users\\Hp\\Downloads\\PageObjectModel-master\\PageObjectModel-master\\src\\main\\java\\com\\crm\\qa\\testdata\\LoginTestData.xlsx";

		
		public AmazonLoginPageTest(){
			super();
		}
		
		@BeforeMethod
		public void setUp(){
			initialization("browserName");
			amazonLoginPage= new AmazonLoginPage();	
			
		}
		
	/*@DataProvider 
		public Object[][] getLoginData()
		{
		Object data[][]=TestUtil.getTestData("Sheet1");
			return data;
		}
		
		
		
		@Test(dataProvider="getLoginData")*/
		
		
		
		@Test
		public void verifytitle() {
			amazonLoginPage.title();
			
			
			
	}
		
		
		
		
		@Test
		public void loginTest() {
			
				amazonLoginPage.login(prop.getProperty("email"), prop.getProperty("password"));
			
			
			/*amazonLoginPage.login(email,password);
			System.out.println("email is :"+email );
			System.out.println("pass is :"+password );
			String Successlogin="success";
			System.out.println("Am i into successful login??? :"+Successlogin );*/
			
		
			
		}
		
		
		
		@AfterMethod
		public void tearDown(){
			driver.quit();
		}
		
		
		
		

	
		
		

	}

