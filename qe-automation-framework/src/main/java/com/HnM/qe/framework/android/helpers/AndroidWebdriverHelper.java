package com.HnM.qe.framework.android.helpers;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.HnM.qe.framework.common.Constants;
import com.HnM.qe.framework.common.PropertiesHelper;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;



public class AndroidWebdriverHelper {
	private static final Logger logger = Logger.getLogger(AndroidWebdriverHelper.class);
	public RemoteWebDriver driver;
	public WebDriverWait wait;
	public PropertiesHelper propertiesHelperInstance = PropertiesHelper.getInstance();

	//opening mobile browser
	public void launchMobileBrowserAndOpenURL(String browserType,String url) throws Throwable{
		this.driver =  getWebDriver(browserType);
		logger.debug("Browser Opening URL:: "+propertiesHelperInstance.getConfigPropProperty(url));
		driver.get(propertiesHelperInstance.getConfigPropProperty(url));

		logger.debug("URL Opend.............");
	}

	public RemoteWebDriver getWebDriver(String browserType) throws MalformedURLException, InterruptedException {
		RemoteWebDriver driver = null;
		logger.debug("loading web driver.....process take time......");
		driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), getCapabilities(propertiesHelperInstance.getConfigPropProperty(browserType)));
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		logger.debug("Web Driver loading Done.");
		return driver;
	}

	public DesiredCapabilities getCapabilities(String browserType){
		logger.debug("Preparing Android DesiredCapabilities.......");
		DesiredCapabilities capabilities=DesiredCapabilities.android();
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,propertiesHelperInstance.getConfigPropProperty("a.deviceName"));
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,propertiesHelperInstance.getConfigPropProperty("a.platformName"));
		capabilities.setCapability(MobileCapabilityType.VERSION,propertiesHelperInstance.getConfigPropProperty("a.platformVersion"));
		
		String cleanFilesFlag = propertiesHelperInstance.getConfigPropProperty("a.clearSystemFiles");
		if ("true".equalsIgnoreCase(cleanFilesFlag) || "false".equalsIgnoreCase(cleanFilesFlag)) {
		    capabilities.setCapability(MobileCapabilityType.CLEAR_SYSTEM_FILES,Boolean.parseBoolean(cleanFilesFlag));  
		} 
		

		if("chrome".equalsIgnoreCase(browserType)){
			System.setProperty("webdriver.chrome.driver",Constants.DRIVERSFOLDERPATH+propertiesHelperInstance.getConfigPropProperty("a.chromedriverExecutable"));
			capabilities.setCapability(MobileCapabilityType.BROWSER_NAME,BrowserType.CHROME);
			capabilities.setCapability("chromedriverExecutable", Constants.DRIVERSFOLDERPATH+propertiesHelperInstance.getConfigPropProperty("a.chromedriverExecutable"));
		}
		//capabilities.setCapability("avd","Nexus5");
		//capabilities.setCapability("avdArgs","netfast");

		return capabilities;
	} 

	public void quitAndroidDriver() {

		if (driver != null) {
			driver.quit();
		}
	}

}
