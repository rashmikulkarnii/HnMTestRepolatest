package com.HnM.qe.framework.common;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.HnM.qe.framework.web.helpers.WebDriverHelper;

import cucumber.api.Scenario;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;


public class CommonActionHelper extends WebDriverHelper{

	private static final  Logger logger = Logger.getLogger(CommonActionHelper.class);
	private WebElement objElement;
	private Select objSelectDropdown;
	private WebDriverWait wait;;
	private AppiumDriver<MobileElement> mobileDriver;

	private static final int SWIPE_DURATION = 1500;
	private static final int SWIPE_EDGE_OFFSET = 100;
	private boolean isStepPass = false;


	public CommonActionHelper() {
	}

	public CommonActionHelper(AppiumDriver<MobileElement> driver) {
		this.mobileDriver = driver;
	}


	/**
	 * Waits for an element to be visible for a specified time(Webdriver wait)
	 * 
	 * @param element
	 * @return
	 * @throws Exception
	 * @throws NoSuchElementException
	 */
	public WebElement waitForElement(WebElement element) {
		logger.info("Waiting for element : " + element);
		if (driver != null) {
			wait = new WebDriverWait(driver, explicitWaitTime);
		} /*else if (mobileDriver != null) {
			wait = new WebDriverWait(mobileDriver,Integer.parseInt(webPropHelper.getConfigPropProperty("WEBDRIVER_WAIT")));
		}*/
		if(element != null){
			wait.until(ExpectedConditions.elementToBeClickable(element));
			wait.until(ExpectedConditions.visibilityOf(element));
			
		}
		return element;
	}

	public boolean isClickable(WebElement element){
		try	{
			WebDriverWait wait = new WebDriverWait(getDriver(), explicitWaitTime);
			wait.until(ExpectedConditions.elementToBeClickable(element));
			logger.debug("Element is clickable true");
			return true;
		}catch (Exception e){
			logger.debug("Element is clickable false");
			return false;
		}
	}
	/*public static void waitForPageLoad() {
	    WebDriverWait wait = new WebDriverWait(driver, 60);

	    Predicate<RemoteWebDriver> pageLoaded = new Predicate<RemoteWebDriver>() {

	        @Override
	        public boolean apply(RemoteWebDriver input) {
	            return ((JavascriptExecutor) driver).executeScript("return document.readyState").equals("complete");
	        }

	    };
	    wait.until(pageLoaded);
	}*/


	public static boolean waitForPageLoad(RemoteWebDriver driver) {
		boolean pageLoadwaitFlag= false;
		try{
			ExpectedCondition<Boolean> pageLoadCondition = new
					ExpectedCondition<Boolean>() {
				public Boolean apply(WebDriver driver) {
					return ((JavascriptExecutor)driver).executeScript("return document.readyState").equals("complete");
				}
			};

			WebDriverWait wait = new WebDriverWait(driver, pageLoadWaitTime);
			wait.until(pageLoadCondition);
			pageLoadwaitFlag= true;
		}catch (Exception e) {
			logger.error("Page Load Wait exception msg::"+e.getMessage());
		}
		logger.debug("Page load wait time seconds:"+pageLoadWaitTime+" :: isPageLoaded:"+pageLoadwaitFlag);
		return pageLoadwaitFlag;
	}

	/**
	 * Get the title of a page
	 * 
	 * @return title of the screen
	 * @throws Exception
	 */
	public String getTitle() {
		String screenTitle = driver.getTitle();
		logger.info("The title is " + screenTitle);

		return screenTitle;
	}

	/**
	 * Get the current URL of the application
	 * 
	 * @return returns the url of the page
	 * @throws Exception
	 */
	public String getCurrentPageURL() {
		logger.info("Get the current page url");
		String appURL = driver.getCurrentUrl();
		return appURL;
	}

	/**
	 * Get the text of a label
	 * 
	 * @param WebElement
	 *            as the paramter
	 * @return text associated with the WebElement
	 */
	protected String getText(WebElement element) {
		String actualText = null;
		this.objElement = waitForElement(element);
		if(objElement.isEnabled()){
			actualText = objElement.getText();
			captureScreenShot(Constants.PASS);
		}else{
			captureScreenShot(Constants.FAIL);
		}
		logger.info("The text associated with the WebElement is " + actualText);
		return actualText;
	}


	/**
	 * Set the textfield value
	 * 
	 * @param element
	 * @param text
	 * @throws Exception
	 */
	protected void setInputText(WebElement element, String text) {
		logger.info("Input the text box value : " + text);
		this.objElement = waitForElement(element);
		if(objElement.isEnabled()){
			objElement.sendKeys(text);
			captureScreenShot(Constants.PASS);
		}else{
			captureScreenShot(Constants.FAIL);
		}

	}

	protected void setInputTextWithEnterKey(WebElement element, String text) {
		logger.info("Input the text box value : " + text);
		this.objElement = waitForElement(element);
		if(objElement.isEnabled()){
			objElement.sendKeys(text+"\n");
			captureScreenShot(Constants.PASS);
		}else{
			captureScreenShot(Constants.FAIL);
		}

	}

	public void scrollPageToWebElement(WebElement element) {
		logger.info("ScrollPage to Element");
	try{
		Thread.sleep(1000);
		if(element != null){
			((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
			//((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", element);
			/*Actions actions = new Actions(driver);
		actions.moveToElement(element);
		actions.perform();*/
			captureScreenShot(Constants.PASS);
		}else {
			captureScreenShot(Constants.FAIL);
		}
	}catch (Exception e) {
		logger.error("ScrollToElement Exception Msg:: "+e.getMessage());
		captureScreenShot(Constants.FAIL);
	}
}

	/**
	 * Press the TAB button
	 * 
	 * @param element
	 * @throws Exception
	 */
	protected void tabInputBox(WebElement element) {
		logger.info("Press the TAB");
		this.objElement = waitForElement(element);
		if(objElement.isEnabled()){
			objElement.sendKeys(Keys.TAB);
			captureScreenShot(Constants.PASS);
		}else{
			captureScreenShot(Constants.FAIL);
		}
	}

	/**
	 * Clears the value from the TextBox
	 * 
	 * @param element
	 * @throws Exception
	 */
	protected void clearInputBox(WebElement element) {
		logger.info("Clear the Input box value");
		this.objElement = waitForElement(element);
		if(objElement.isEnabled()){
			objElement.clear();
			captureScreenShot(Constants.PASS);
		}else{
			captureScreenShot(Constants.FAIL);
		}

		//checkForSnapshot();
	}


	/**
	 * Clicks on the Button
	 * 
	 * @param element
	 * @throws Exception
	 */
	protected boolean clickOnButton(WebElement element) {
		boolean flag = false;
		try{
			logger.info("Click on the button");
			this.objElement = waitForElement(element);
			if (objElement.isEnabled()) {
				objElement.click();
				flag = true;
				captureScreenShot(Constants.PASS);
			} else {

				captureScreenShot(Constants.FAIL);
			}
		}catch (Exception e) {
			logger.error("clickOnButton exception msg::"+e.getMessage());
			//e.printStackTrace();
		}
		return flag;
	}

	protected void clickOnButton(WebElement element, String elementDescription) {
		logger.info("Click on the button");
		this.objElement = waitForElement(element);
		if (objElement.isEnabled()) {
			objElement.click();

			captureScreenShot(Constants.PASS);
		} else {

			captureScreenShot(Constants.FAIL);
		}
	}

	public WebElement getfindElementByXPath(String xpath){
		WebElement element = null;
		try{

			if(xpath != null){
				element = getDriver().findElementByXPath(xpath);
			}
		}catch (Exception e) {
			logger.error("getfindElementByXPath exception msg::"+e.getMessage());
			e.printStackTrace();
		}
		return element;
	}
	/**
	 * Clicks on the Radio Button
	 * 
	 * @param element
	 * @throws Exception
	 */
	protected void clickOnRadioButton(WebElement element) {
		logger.info("Click on the Radio button");
		this.objElement = waitForElement(element);
		if (objElement.isEnabled()) {
			objElement.click();
			captureScreenShot(Constants.PASS);
		} else {
			captureScreenShot(Constants.FAIL);
		}
	}

	protected void clickOnRadioButton(WebElement element,
			String elementDescription) {
		logger.info("Click on the Radio button");
		this.objElement = waitForElement(element);
		if (objElement.isEnabled()) {
			objElement.click();
			captureScreenShot(Constants.PASS);
		} else {
			captureScreenShot(Constants.FAIL);
		}
	}

	/**
	 * Clicks on the Link
	 * 
	 * @param element
	 * @throws Exception
	 */
	public void clickOnLink(WebElement element) {
		logger.info("Click on the Link");
		this.objElement = waitForElement(element);
		if(objElement != null){
			objElement.click();
			captureScreenShot(Constants.PASS);
		}else{
			captureScreenShot(Constants.FAIL);
		}
	}

	protected void clickOnLink(WebElement element, String elementDescription) {
		logger.info("Click on the Link");
		this.objElement = waitForElement(element);
		objElement.click();

	}

	/**
	 * Selects an dropdown value by visible text
	 * 
	 * @param element
	 * @param text
	 * @throws Exception
	 */
	protected void selectByText(WebElement element, String text) {
		logger.info("The Checkbox value to be selected is : " + text);
		this.objElement = waitForElement(element);
		this.objSelectDropdown = new Select(objElement);
		if (objElement.isEnabled()) {
			objSelectDropdown.selectByVisibleText(text);
			captureScreenShot(Constants.PASS);
		} else {

		}captureScreenShot(Constants.FAIL);
	}

	/**
	 * Selects an dropdown value by Value attribute of the entry
	 * 
	 * @param element
	 * @param text
	 * @throws Exception
	 */
	protected void selectByValue(WebElement element, String text) {
		logger.info("The Checkbox value(by Value) to be selected is : " + text);
		this.objElement = waitForElement(element);
		this.objSelectDropdown = new Select(objElement);
		if (objElement.isEnabled()) {
			objSelectDropdown.selectByValue(text);
			captureScreenShot(Constants.PASS);
		} else {
			captureScreenShot(Constants.FAIL);
		}
	}

	/**
	 * Checks if the Webelement is enabled
	 * 
	 * @param WebElement
	 * @throws Exception
	 */
	protected boolean isEnabled(WebElement element) {
		logger.info("Check if the Webelement is enabled");
		boolean flag;
		this.objElement = waitForElement(element);
		flag = this.objElement.isEnabled();
		if (flag) {
			captureScreenShot(Constants.PASS);
		}
		return flag;
	}

	protected boolean isEnabled(WebElement element, String elementDescription) {
		logger.info("Check if the Webelement is enabled");
		boolean flag;
		this.objElement = waitForElement(element);
		flag = this.objElement.isEnabled();
		if (flag) {
			captureScreenShot(Constants.PASS);
		}
		return flag;
	}

	/**
	 * Checks if the Webelement is displayed
	 * 
	 * @param WebElement
	 * @throws Exception
	 */
	protected boolean isDisplayed(WebElement element) {
		logger.info("Check if the Webelement is displayed");
		boolean flag;
		this.objElement = waitForElement(element);
		flag = this.objElement.isDisplayed();
		if (flag) {
			captureScreenShot(Constants.PASS);
		}else{
			captureScreenShot(Constants.FAIL);
		}
		return flag;
	}

	protected boolean isDisplayed(WebElement element, String elementDescription) {
		logger.info("Check if the Webelement is displayed");
		boolean flag;
		this.objElement = waitForElement(element);
		flag = this.objElement.isDisplayed();
		if (flag) {
			captureScreenShot(Constants.PASS);
		}
		return flag;
	}

	/**
	 * Checks if the Webelement is selected
	 * 
	 * @param WebElement
	 * @throws Exception
	 */
	protected boolean isSelected(WebElement element) {
		logger.info("Check if the Webelement is selected");
		boolean flag;
		this.objElement = waitForElement(element);
		flag = this.objElement.isSelected();
		if (flag) {
			captureScreenShot(Constants.PASS);
		}
		return flag;
	}

	protected boolean isSelected(WebElement element, String elementDescription) {
		logger.info("Check if the Webelement is selected");
		boolean flag;
		this.objElement = waitForElement(element);
		flag = this.objElement.isSelected();
		if (flag) {
			captureScreenShot(Constants.PASS);
		}
		return flag;
	}

	/**
	 * Convenience method for swiping across the screen. Specified by:
	 * swipe(...) in TouchShortcuts Parameters: startx starting x coordinate.
	 * starty starting y coordinate. endx ending x coordinate. endy ending y
	 * coordinate. duration amount of time in milliseconds for the entire swipe
	 * action to take
	 */
	protected void swipe(int startX, int startY, int endX, int endY,
			int swipeDuration) {
		//mobileDriver.swipe(startX, startY, endX, endY, swipeDuration);

	}

	/**
	 * method for tapping a position on the screen.
	 * 
	 * Specified by: tap(...) in TouchShortcuts Parameters: fingers number of
	 * fingers/appendages to tap with. x x coordinate. y y coordinate. duration
	 * how long between pressing down, and lifting fingers/appendages.
	 */
	protected void preciseTap(int xPosition, int yPosition, int duration) {
		//int numOfFingers = 1;
		//mobileDriver.tap(numOfFingers, xPosition, yPosition, duration);

	}

	/**
	 * Hides the keyboard if it is showing. On iOS, there are multiple
	 * strategies for hiding the keyboard. Defaults to the "tapOutside" strategy
	 * (taps outside the keyboard). Switch to using
	 * hideKeyboard(HideKeyboardStrategy.PRESS_KEY, "Done") if this doesn't
	 * work.
	 * 
	 * Specified by: hideKeyboard() in DeviceActionShortcuts
	 */
	protected void hideKeyBorad() {
		mobileDriver.hideKeyboard();

	}

	/**
	 * method to navigate to back
	 * 
	 */
	protected void clickBackButton() {
		if(mobileDriver!=null){
			mobileDriver.navigate().back();
		}
		if(driver!=null){
			driver.navigate().back();
		}
	}

	/**
	 * method to set the context to required view.
	 * 
	 * Views are NATIVE_APP , WEBVIEW_1
	 * 
	 * @param context
	 *            view to be set
	 * @throws InterruptedException 
	 */
	public void setContext(String context) throws InterruptedException {
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			logger.error(e);
			throw e;
		}
		Set<String> contextNames = mobileDriver.getContextHandles();
		logger.info("Context Names : " + contextNames);
		if (context.contains("NATIVE")) {
			mobileDriver.context((String) contextNames.toArray()[0]);
		} else if (context.contains("WEBVIEW")) {
			mobileDriver.context((String) contextNames.toArray()[1]);
		}
		logger.info("Current context" + mobileDriver.getContext());
	}

	/**
	 * clears text form input field
	 * 
	 * @param webElement
	 */
	protected void clearText(WebElement webElement) {
		webElement.clear();
	}

	/**
	 * method to find element
	 * 
	 * @param by
	 * @return true if element present
	 * @return false if element not present
	 */
	public boolean isElementPresent(By by) {
		try {
			if (mobileDriver != null) {
				mobileDriver.findElement(by);
			}
			if (driver != null) {
				driver.findElement(by);
			}
			return true;
		} catch (NoSuchElementException e) {
			logger.error(e);
			return false;
		}
	}

	/**
	 * method to swipe right
	 */
	public void swipeRight() {
		Dimension size = driver.manage().window().getSize();
		int startx = (int) (size.width * 0.9);
		int endx = (int) (size.width * 0.20);
		int starty = size.height / 2;
		swipe(startx, starty, endx, starty, 5000);
	}

	/**
	 * method to swipe left
	 */
	public void swipeLeft() {
		Dimension size = driver.manage().window().getSize();
		int startx = (int) (size.width * 0.8);
		int endx = (int) (size.width * 0.20);
		int starty = size.height / 2;
		swipe(startx, starty, endx, starty, 1000);
	}

	/**
	 * method to swipe left for specified mobileElement
	 * 
	 * @param mobileElement
	 */
	public void swipeLeft(MobileElement mobileElement) {
		Point currentLocation = mobileElement.getLocation();
		Dimension elementSize = mobileElement.getSize();
		int x = currentLocation.getX() + elementSize.getWidth() - 1;
		int y = currentLocation.getY();
		int endx = currentLocation.getX();
		swipe(x, y, endx, y, 1000);
	}

	/**
	 * method to swipe right for specified mobileElement
	 * 
	 * @param mobileElement
	 */
	public void swipeRight(MobileElement mobileElement) {
		Point currentLocation = mobileElement.getLocation();
		Dimension elementSize = mobileElement.getSize();
		int x = currentLocation.getX();
		int y = currentLocation.getY();
		int endx = x + elementSize.getWidth() - 1;
		swipe(x, y, endx, y, 1000);
	}

	/**
	 * method to swipeUp in a mobile page
	 */
	public void swipeUp() {
		Dimension dimensions = mobileDriver.manage().window().getSize();
		int startY = (int) (dimensions.getHeight() * 0.5);
		int endY = (int) (dimensions.getHeight() * 0.2);
		swipe(0, startY, 0, endY, 1000);
	}

	/**
	 * method to scroll to visible element in a mobile page
	 * 
	 * @param by
	 *            is to identify a element example By.id or By.xpath..etc
	 * @param MAX_SCROLL_COUNT
	 *            is a count to scroll in mobile page
	 * @throws Exception 
	 */
	public void scrollToVisibleElementInPage(By by, int maxscrollcount) throws Exception {
		Dimension dimension = mobileDriver.manage().window().getSize();
		int height = dimension.getHeight() - SWIPE_EDGE_OFFSET;
		int startx = dimension.getWidth() / 2;
		boolean found = false;
		for (int i = 0; i < maxscrollcount; i++) {
			if (isElementPresent(by)) {
				found = true;
				break;
			}
			swipe(startx, height, startx, 0, SWIPE_DURATION);
		}
		if (!found && !isElementPresent(by)) {
			// giving up scrolling for element to be displayed after
			// MAX_SCROLL_COUNT reached.
			//throw new ModException("element was not visible after scrolling");
		}
	}

	/**
	 * method scroll to visible text in a list and it will click on that element
	 * 
	 * @param elementName
	 */
	public void androidScrollToVisibleTextInListAndClick(String elementName) {
		AndroidDriver<MobileElement> ad = (AndroidDriver<MobileElement>) mobileDriver;
		MobileElement element = ad
				.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()"
						// +".resourceId(\"android:id/list\")).scrollIntoView("
						+ ".className(\"android.widget.ListView\")).scrollIntoView("
						+ "new UiSelector().text(\"" + elementName + "\"));");
		element.click();
	}



	/**
	 * method to scroll to the text and clicks on the text
	 * 
	 * @param text
	 * @return true if it clicked successfully
	 */
	public boolean androidScrollToTextAndClick(String text) {
		try {
			MobileElement el = mobileDriver
					.findElement(MobileBy
							.AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("
									+ "new UiSelector().text(\""
									+ text
									+ "\"));"));
			el.click();
		} catch (Exception e) {
			logger.error(e);
			return false;
		}
		return true;
	}

	/**
	 * method to scroll to the text in the page
	 * 
	 * @param text
	 * @return true if it scroll to text successfully
	 */
	public boolean androidScrollToText(String text) {
		try {
			mobileDriver
			.findElement(MobileBy
					.AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("
							+ "new UiSelector().text(\""
							+ text
							+ "\"));"));
		} catch (Exception e) {
			logger.error(e);
			return false;
		}
		return true;
	}

	/**
	 * method to scroll to Text and return an element
	 * 
	 * @param text
	 * @return element
	 */
	public MobileElement androidScrollToTextAndGetElement(String text) {
		return mobileDriver
				.findElement(MobileBy
						.AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("
								+ "new UiSelector().text(\"" + text + "\"));"));
	}



	//=========================================================================
	  
	public static boolean embedScreenshot(Scenario scenario) {  
		boolean flag =false;
			try { 
				takeScreenshot();
				scenario.embed(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES), "image/png");  
				flag =true;
			} catch (WebDriverException wde) { 
				logger.error("embedScreenshot() inside WebDriverException while execution::"+wde.getMessage());
			} catch (ClassCastException cce) { 
				logger.error("embedScreenshot() inside ClassCastException while execution::"+cce.getMessage());
			}  
			logger.debug("EmbedScreenshot flag::"+flag);
			return flag;
	}  


	public void captureScreenShot(String status) { 
		logger.debug("Status::"+status);

		if(Constants.PASS.equalsIgnoreCase(status)){
			this.isStepPass = true;
		}else{
			this.isStepPass = false;
		}

		if("yes".equalsIgnoreCase(webPropHelper.captureScreenShot)){

			if("no".equalsIgnoreCase(webPropHelper.captureOnlyFAIL) && !isStepPass){
					//(Constants.FAIL.equalsIgnoreCase(status) || Constants.PARTIALLYPASS.equalsIgnoreCase(status))){
				takeScreenshot();
			}/*else if("no".equalsIgnoreCase(webPropHelper.captureOnlyFAIL)){
				takeScreenshot();
			}*/
		}
	}


	public static void takeScreenshot(){

		try {
			File src=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src, new File("Report/Screenshots/"+Constants.screenShortTagNames+"_"+new SimpleDateFormat("ddMMyyyyHHmmss").format(new Date())+".png"));

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public boolean isStepPass() {
		return isStepPass;
	}

	public void setStepPass(boolean isStepPass) {
		this.isStepPass = isStepPass;
	}

	public void close() {
		try{
			captureScreenShot(Constants.PASS);
			if(driver != null){
				driver.quit();
			}
		}catch (Exception e) {
			logger.error("close driver() inside Exception while execution::"+e.getMessage());
			captureScreenShot(Constants.FAIL);
		}
	}
}