package com.crm.qa.pages;

import java.util.List;

import java.net.HttpURLConnection;
import java.net.URL;


import org.openqa.selenium.By;
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
	
	
public void verifyFooter() 
{
	WebElement footer =driver.findElement(By.xpath("//div[@id='navFooter']"));
	List<WebElement> links = footer.findElements(By.tagName("a"));
	System.out.println("Total links are "+links.size());
	for(int i=0; i<links.size(); i++) {
	WebElement element = links.get(i);

	String url=element.getAttribute("href");

	verifyLink(url);
	}
	}

	public static void verifyLink(String urlLink) {
	       
	        try {

	URL link = new URL(urlLink);

	HttpURLConnection httpConn =(HttpURLConnection)link.openConnection();

	httpConn.setConnectTimeout(2000);

	httpConn.connect();

	if(httpConn.getResponseCode()== 200) {
	System.out.println(urlLink+" - "+httpConn.getResponseMessage());
	}
	if(httpConn.getResponseCode()== 404) {
	System.out.println(urlLink+" - "+httpConn.getResponseMessage());
	}
	}
	//getResponseCode method returns = IOException - if an error occurred connecting to the server.
	catch (Exception e) {
	//e.printStackTrace();
	}
	    }
	






















	
	/*WebElement header =driver.findElement(By.id("nav-xshop"));
	List<WebElement> link2=header.findElements(By.tagName("a"));

	int count2=link2.size();
	System.out.println("The count is::" +count2);
	for(int i=0;i<link2.size();i++)
	{
		if(link2.get(i).getText().length()>1) {
			
		
		 System.out.println(link2.get(i).getText() + " - " + link2.get(i).getAttribute("href"));
	
	           
	
	
	}
	}*/
	
	
	
	
	
	
	

	
	

public AmazonSearchResultPage searchProduct(String productName)
{
	searchtxt.sendKeys(productName);
	btnsearch.click();
	return new AmazonSearchResultPage();

}

}