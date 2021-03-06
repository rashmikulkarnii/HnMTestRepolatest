package com.HnM.qe.test.stepdefinition.aem;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import com.HnM.qe.framework.common.CommonActionHelper;
import com.HnM.qe.test.pageobject.AEM_AppHomePagePO;

import cucumber.api.java.en.When;


public class AEM_AppHomePage extends CommonActionHelper{
	
	AEM_AppHomePagePO aemapp_po = PageFactory.initElements(getDriver(), AEM_AppHomePagePO.class);
	
	
	@When("^user switch to AppHomePage window$")
	public void user_switch_to_AppHomePage_window() throws Throwable {
		//SwitchNewWindow();
	}
	
	@When("^user click on Global Bar Edit button$")
	public void user_click_on_Global_Bar_Edit_button() throws Throwable {
		assertTrue(clickOnButton(aemapp_po.btnEdit));
	}

	@When("^user click on railLeft icon$")
	public void user_click_on_railLeft_icon() throws Throwable {
		assertTrue(clickOnButton(aemapp_po.btnrailleft));
	}

	@When("^user double click on Drag component$")
	public void user_double_click_on_Drag_component() throws Throwable {
		Actions action = new Actions(getDriver());
		action.doubleClick(aemapp_po.btnDragcomponent).build().perform();
		action.doubleClick(aemapp_po.btnDragcomponent).build().perform();
	}

	@When("^user search New component$")
	public void user_search_New_component() throws Throwable {
		aemapp_po.entersearchcomponent();
	}

	@When("^user click on search component$")
	public void user_click_on_search_component() throws Throwable {
		assertTrue(clickOnButton(aemapp_po.clkBanner));
	}

	@When("^user click on click here to edit banner button$")
	public void user_click_on_click_here_to_edit_banner_button() throws Throwable {
		Actions action = new Actions(getDriver());
		action.doubleClick(aemapp_po.btneditBanner).build().perform();
	}

	@When("^user click on Configure icon$")
	public void user_click_on_Configure_icon() throws Throwable {
		assertTrue(clickOnButton(aemapp_po.btnConfigure));
	}

	@When("^user enter details in banner popup and click on save button$")
	public void user_enter_details_in_banner_popup_and_click_on_save_button() throws Throwable {
		assertTrue(clickOnButton(aemapp_po.btnBannerCopy));
	}


}
