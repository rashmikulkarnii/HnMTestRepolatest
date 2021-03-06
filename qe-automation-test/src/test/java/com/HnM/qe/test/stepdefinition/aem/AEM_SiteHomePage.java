package com.HnM.qe.test.stepdefinition.aem;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.support.PageFactory;
import org.testng.log4testng.Logger;

import com.HnM.qe.framework.common.CommonActionHelper;
import com.HnM.qe.test.pageobject.AEM_SiteHomePagePO;
import com.HnM.qe.test.pageobject.FindStorePO;
import com.HnM.qe.test.pageobject.GlobalElementHeader_HomePO;
import com.HnM.qe.test.pageobject.SearchProductPO;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;


public class AEM_SiteHomePage extends CommonActionHelper{
	private static final Logger logger = Logger.getLogger(AEM_SiteHomePage.class);
	AEM_SiteHomePagePO aemsite_po = PageFactory.initElements(getDriver(), AEM_SiteHomePagePO.class);
	
	@Given("^User launches the browser and navigates to AEM$")
	public void user_launches_the_browser_and_navigates_to_ASO_page() throws Throwable
	{
		logger.debug("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&& loading WebDriver");
		initializeDriver();
		homeURL = webPropHelper.getConfigPropProperty("AEM");
		logger.debug("Open Chrome browser with URL::"+homeURL);
		logger.debug("HomeURL:: "+homeURL);
		driver.get(homeURL);
		
	}

	@When("^user enter the login credentials$")
	public void user_enter_the_login_credentials() throws Throwable {
		aemsite_po.enterLogindeatils();
		assertTrue(clickOnButton(aemsite_po.btnsubmitbutton));
	}

	@When("^user click on Sites$")
	public void user_click_on_Sites() throws Throwable {
		assertTrue(clickOnButton(aemsite_po.btnSites));
	}

	@When("^user click on Academy sports$")
	public void user_click_on_Academy_sports() throws Throwable {
		assertTrue(clickOnButton(aemsite_po.btnAcademysports));
	}

	@When("^user click on Website Pages image$")
	public void user_click_on_Website_Pages_image() throws Throwable {
		assertTrue(clickOnButton(aemsite_po.imgWebsite));
	}

	@When("^user click on create icon$")
	public void user_click_on_create_icon() throws Throwable {
		assertTrue(clickOnButton(aemsite_po.btncreate));
	}

	@When("^user click on Page icon$")
	public void user_click_on_Page_icon() throws Throwable {
		assertTrue(clickOnButton(aemsite_po.btnpage));
	}

	@When("^user click on Home Page Template image$")
	public void user_click_on_Home_Page_Template_image() throws Throwable {
		assertTrue(clickOnButton(aemsite_po.btnHomepageTemplate));
	}

	@When("^click on Next button$")
	public void click_on_Next_button() throws Throwable {
		assertTrue(clickOnButton(aemsite_po.btnNext));
	}

	@When("^user enter details in Title and Tags tab$")
	public void user_enter_details_in_Title_and_Tags_tab() throws Throwable {
		aemsite_po.enterTitleandtagsndeatils();
	}

	@When("^click on ACADEMY tab$")
	public void click_on_ACADEMY_tab() throws Throwable {
		assertTrue(clickOnButton(aemsite_po.tabAcademy));
	}

	@When("^user enter details in Academy tab$")
	public void user_enter_details_in_Academy_tab() throws Throwable {
		aemsite_po.enterAcademyndeatils();
	}

	@When("^user click on create button$")
	public void user_click_on_create_button() throws Throwable {
		assertTrue(clickOnButton(aemsite_po.btnoncreatepage));
	}

	@When("^user click on open button in popup$")
	public void user_click_on_open_button_in_popup() throws Throwable {
		assertTrue(clickOnButton(aemsite_po.btnopen));
	    
	}
}
