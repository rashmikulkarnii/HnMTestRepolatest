package com.HnM.qe.test.pageobject;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.HnM.qe.framework.common.CommonActionHelper;

public class AEM_AppHomePagePO extends CommonActionHelper{
	
	@FindBy(xpath="//button[text()='Edit']") 
	public WebElement btnEdit;
	
	@FindBy(xpath="//coral-icon[@icon='railLeft']") 
	public WebElement btnrailleft;
	
	@FindBy(xpath="//div[@data-text='Drag components here']") 
	public WebElement btnDragcomponent;
	
	@FindBy(xpath="//input[@placeholder='Enter Keyword']") 
	public WebElement searchComponent;
	
	@FindBy(xpath="//coral-selectlist-item[text()='Banner']") 
	public WebElement clkBanner;
	
	@FindBy(xpath="//div[@title='Banner']") 
	public WebElement btneditBanner;
	
		
	@FindBy(xpath="//div[@title='Configure']") 
	public WebElement btnConfigure;
	
	
	@FindBy(xpath="//input[@name='./bannerCopy']") 
	public WebElement btnBannerCopy;
	
	@FindBy(xpath="//button[@title='Done']") 
	public WebElement btnDone;	
	
	
	public void entersearchcomponent() throws Exception {

		setInputText(btneditBanner, "Banner");
						
	}
	
	public void enterBannerdetails() throws Exception {

		setInputText(btnBannerCopy, "Automation");
		assertTrue(clickOnButton(btnDone));
				
	}
	
	
}
