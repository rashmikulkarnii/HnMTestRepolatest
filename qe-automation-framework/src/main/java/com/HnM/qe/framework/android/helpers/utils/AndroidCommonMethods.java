package com.HnM.qe.framework.android.helpers.utils;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.junit.After;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;

import com.HnM.qe.framework.android.helpers.AndroidWebdriverHelper;
import com.HnM.qe.framework.common.Constants;

import cucumber.api.Scenario;

public class AndroidCommonMethods extends AndroidWebdriverHelper {
	private static final Logger logger = Logger.getLogger(AndroidCommonMethods.class);
	private boolean isStepPass = false;

	public WebElement getWebElementByXpath(String locatorValue){
		WebElement webElement = null;
		try{
			
		}catch (Exception e) {
			captureScreenShot(driver, Constants.FAIL);
			logger.error("WebElement not found"+e.getMessage());
			e.printStackTrace();
		}

		return webElement;
	}

	public void click(String obj) {
		try{
			WebElement clickElement = getWebElementByXpath(obj);
			if(clickElement != null){
				clickElement.click();
				captureScreenShot(driver, Constants.PASS);
			}
		}catch (Exception e) {
			captureScreenShot(driver, Constants.FAIL);
		}
	}

	public WebElement getWebElement(String obj) {
		return getWebElementByXpath(obj);
	}

	public void IsDisplayed(String obj) {
		try{
			WebElement displayedElement = getWebElementByXpath(obj);
			if(displayedElement != null){
				displayedElement.isDisplayed();
				captureScreenShot(driver, Constants.PASS);
			}
		}catch (Exception e) {
			captureScreenShot(driver, Constants.FAIL);
		}
	}

	public void search(String obj) {
		try{
			WebElement searchElement = getWebElementByXpath(obj);
			if(searchElement != null){
				searchElement.sendKeys();
				captureScreenShot(driver, Constants.PASS);
			}
		}catch (Exception e) {
			captureScreenShot(driver, Constants.FAIL);
		}
	}

	public void sendkeys(String object, String value)  {
		try{
			WebElement sendKeysElement = getWebElementByXpath(object);
			if(sendKeysElement != null){
				sendKeysElement.sendKeys(value);
				captureScreenShot(driver, Constants.PASS);
			}
		}catch (Exception e) {
			captureScreenShot(driver, Constants.FAIL);
		}
	}

	public void close() {
		captureScreenShot(driver, Constants.PARTIALLYPASS);
		driver.quit();
	}

	public void hitEnter(String objectName) 
	{
		try{
			WebElement hitEnterElement = getWebElementByXpath(objectName);
			if(hitEnterElement != null){
				hitEnterElement.sendKeys(Keys.ENTER);
				captureScreenShot(driver, Constants.PASS);
			}
		}catch (Exception e) {
			captureScreenShot(driver, Constants.FAIL);
		}
	}

	@After  
	public void embedScreenshot(Scenario scenario) {  
		if (scenario.isFailed()) {  
			try {  
				byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);  
				scenario.embed(screenshot, "image/png");  
			} catch (WebDriverException wde) {  
				logger.error("embedScreenshot.WebDriverException"+wde.getMessage());  
			} catch (ClassCastException cce) {  
				logger.error("embedScreenshot.ClassCastException"+cce.getMessage()); 
				cce.printStackTrace();  
			}  
		}  
	}  


	public void captureScreenShot(WebDriver ldriver, String status) {
		logger.debug("Status::"+status);
		if(Constants.PASS.equalsIgnoreCase(status)){
			this.isStepPass = true;
		}else{
			this.isStepPass = false;
		}

		if("yes".equalsIgnoreCase(propertiesHelperInstance.captureScreenShot)){

			if("yes".equalsIgnoreCase(propertiesHelperInstance.captureOnlyFAIL) && 
					(Constants.FAIL.equalsIgnoreCase(status) || Constants.PARTIALLYPASS.equalsIgnoreCase(status))){
				takeScreenshot(ldriver);
			}else if("no".equalsIgnoreCase(propertiesHelperInstance.captureOnlyFAIL)){
				takeScreenshot(ldriver);
			}
		}
	}


	public void takeScreenshot(WebDriver webDriver){

		try {
			File src=((TakesScreenshot) webDriver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src, new File("Report/Screenshots/"+System.currentTimeMillis()+".png"));

		} catch (Exception e) {
			logger.error("takeScreenshot.Exception"+e.getMessage()); 
			e.printStackTrace();  
		}
	}

	public boolean isStepPass() {
		return isStepPass;
	}

	public void setStepPass(boolean isStepPass) {
		this.isStepPass = isStepPass;
	}
}
