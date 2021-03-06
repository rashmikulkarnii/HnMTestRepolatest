package com.HnM.qe.test.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.HnM.qe.framework.common.CommonActionHelper;

public class FindStorePO extends CommonActionHelper{
	//private static final Logger logger = Logger.getLogger(FindStorePO.class);
	
	
	@FindBy(xpath="//h2[@id='slModalTitle']//ancestor::div[@class='modal-content']") 
	public WebElement ovly_FindStore;
	
	@FindBy(id="searchText") public WebElement ovly_searchTextBox;
	@FindBy(id="slModalCloses") public WebElement ovly_btnCloseCross;
	@FindBy(id="loadStores") public WebElement ovly_btnGO;
	
	@FindBy(xpath="(//button[@class='z-btn z-btn-blue make-my-store'])[2]") public WebElement ovly_btnMakeMyStore_1;
	
	@FindBy(xpath="(//button[@class='z-btn z-btn-blue make-my-store']//ancestor::ul//ul/li[@class='store-name-container'])[2]") public WebElement ovly_secStore ;

	public FindStorePO(WebDriver webDriver) {
		super();
	}
		
	public boolean validatingFindStoreDisplayed() {
		
		boolean isDisplayed = isDisplayed(ovly_FindStore);
		return isDisplayed;
		
	}
			   
	
	//Enter data
	// click on Go
	// search for link "Make my store"
	// get the store name 
	// Click on close 
			
	public String selectAStore(String value){
		
		setInputText(ovly_searchTextBox,value);
		clickOnButton(ovly_btnGO);
		String selectedStoreTitle = getText(ovly_secStore);
		clickOnButton(ovly_btnMakeMyStore_1);
		//clickOnButton(ovly_btnCloseContainer);
		//Expected change the title should happen in the title
		return selectedStoreTitle;
		
		
	}
		
		public void validateErrorMsg() {
			
			/*if(isDisplayed(txtNoStoreText))
				logger.debug("Error Message is displayed");
			else
				logger.debug("Error message is not displayed");*/
			
		}
		
	


}
