package com.crm.qa.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;

import com.crm.qa.base.TestBase;
import com.crm.qa.util.TestUtil;

public class AmazonLoginPage extends TestBase{
	//div[@id='nav-signin-tooltip']//span[contains(text(),'Sign in')]
	
		
		@FindBy(xpath="//div[@id='nav-signin-tooltip']//span[contains(text(),'Sign in')]")
	     WebElement signin;
		
		
		
		@FindBy(name="email")
		WebElement email;
		
		@FindBy(xpath="//input[@id='continue']")
		WebElement Continue;
		
		@FindBy(name="password")
		WebElement password;
		
		@FindBy(id="signInSubmit")
		WebElement loginBtn;
		
		public AmazonLoginPage(){
			PageFactory.initElements(driver, this);
		}
		
		//Actions:
		
		
		
		public  AmazonHomePage login(String em, String pm){
			
			signin.click();
			email.sendKeys(em);
			Continue.click();
			password.sendKeys(pm);
			 loginBtn.click();
			 
			 
			 return new AmazonHomePage();
			
		
			    	
			    	
		
		}
		
	}



