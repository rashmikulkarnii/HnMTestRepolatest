package com.HnM.qe.test.pageobject;

import static org.junit.Assert.assertTrue;
import static org.testng.Assert.assertEquals;

import java.util.HashMap;
import java.util.List;
import java.util.UUID;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

import com.HnM.qe.framework.common.CommonActionHelper;

public class HnM_Home_PagePO extends CommonActionHelper {
	private static final Logger logger = Logger.getLogger(HnM_Home_PagePO.class);
	
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	
	@FindBy(xpath="((//a[contains(text(),'Customer Service')])[1]")public WebElement Link_CustomerService;
	@FindBy(xpath="(//a[contains(text(),'Connexion') or contains(text(),'Sign in')])[8]")public WebElement Link_Sign_In;
	@FindBy(xpath="((//button[@id=\"onetrust-accept-btn-handler\" or @id='onetrust-accept-btn-handler']))")public WebElement Btn_Accept_All_Cookies;
	@FindBy(xpath="(//button[contains(text(),'DEVENIR MEMBRE') or contains(text(),'BECOME A MEMBER')])[1]")public WebElement Btn_Become_Member;

	
	public void clickCustomerLink()
	 
	{
		assertTrue(isDisplayed(Link_CustomerService));
		clickOnLink(Link_CustomerService);
	}
	
	public void clickSignInLink(String Exptxt) throws InterruptedException
	 
	{
		//jse.executeScript("browserstack_executor: {\"action\": \"setSessionName\", \"arguments\": {\"name\":\"<Sign In>\" }}");
		assertTrue(isDisplayed(Link_Sign_In));
//		if(isDisplayed(Link_Sign_In))
//		{
//		
//			     jse.executeScript("browserstack_executor: {\"action\": \"setSessionName\", \"arguments\": {\"status\": \"passed\", \"reason\": \"Link Displayed!\"}}");
//		}
//			 else 
//			 {
//				
//			      jse.executeScript("browserstack_executor: {\"action\": \"setSessionName\", \"arguments\": {\"status\":\"FAILED\", \"reason\": \"Link not Displayed\"}}");
//		}    
		
		String actualSignInTxt = getText(Link_Sign_In);
		logger.debug("actualSignInTxt:: " + actualSignInTxt);
		Assert.assertEquals(actualSignInTxt, Exptxt);
		System.out.println("Exptxt" + Exptxt);
		clickOnLink(Link_Sign_In);
		Thread.sleep(2000);
		
		
		
	}
	
	public void AcceptCookie() throws InterruptedException
	{
		//jse.executeScript("browserstack_executor: {\"action\": \"setSessionName\", \"arguments\": {\"name\":\"<Accept Cookie>\" }}");
		assertTrue(isDisplayed(Btn_Accept_All_Cookies));
//		if(isDisplayed(Btn_Accept_All_Cookies))
//		{      jse.executeScript("browserstack_executor: {\"action\": \"setSessionName\", \"arguments\": {\"status\": \"passed\", \"reason\": \"Cookie accepted\"}}");
//		}
//		 else {
//		      jse.executeScript("browserstack_executor: {\"action\": \"setSessionName\", \"arguments\": {\"status\":\"failed\", \"reason\": \"Cookie accepted\"}}");
//		    }
		clickOnButton(Btn_Accept_All_Cookies);
		Thread.sleep(2000);
	}
		

	public void ClickBecomeMemberButton() throws InterruptedException
	{
		assertTrue(isDisplayed(Btn_Become_Member));
		clickOnButton(Btn_Become_Member);
		Thread.sleep(2000);
	}
		
		
	
		
	
		
			


}
