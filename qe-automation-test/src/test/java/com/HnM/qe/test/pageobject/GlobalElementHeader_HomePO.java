package com.HnM.qe.test.pageobject;

import static org.junit.Assert.assertTrue;
import static org.testng.Assert.assertEquals;

import java.util.HashMap;
import java.util.List;
import java.util.UUID;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

import com.HnM.qe.framework.common.CommonActionHelper;

public class GlobalElementHeader_HomePO extends CommonActionHelper {
	private static final Logger logger = Logger.getLogger(GlobalElementHeader_HomePO.class);
	
	
	
		
	@FindBy(xpath="//a[@data-auid='logo']")public WebElement imgAcademyLogo;
	@FindBy(xpath="//button[@data-auid='submitSearchButton_m']") public  WebElement btnSearchLens;
	@FindBy(xpath="//div[@class='a-findAStore']//span[text()='Find a store']")  public  WebElement txtFindAStore;
	@FindBy(xpath="//a[@data-auid='weeklyAds_m']") public  WebElement txtWeeklyADBurgerMenu;
	@FindBy(xpath="//button[@data-auid='hamburgerMenuToggleBtn_m']") public WebElement btnBurgerMenu;
	@FindBy(xpath="//button[@data-auid='hamburgerMenuToggleBtn_m']")  public WebElement btnXBurgerMenu;
	@FindBy(id="*********") WebElement btnMyAccount;
	//@FindBy(id="*********") WebElement btnSignIn;
	@FindBy(xpath="//a[@data-auid=\"level1Category-SHOP\"]") public WebElement btnShopCategory;
	@FindBy(xpath="//a[@data-auid='level2Category-CLOTHING_m'] | //a[@data-auid='level2Category-CLOTHING']")public WebElement btnClothingCategory;
	@FindBy(xpath="//a[@data-auid='level3Category-Mens']")public WebElement btnMens_Clothing_Shop;
//	@FindBy(xpath="//li[@data-auid='l1Category 2']/a") WebElement lnkClothingHovering;
	@FindBy(xpath="//a[@data-auid='level3Category-Mens_m']/*")public WebElement btnMen_Clothing_Shop;
	//@FindBy(xpath="//a[@data-auid=\"level4Category-Men's Shirts_m\"]")public WebElement btnMensShirt_Men_Clothing_Shop;shopByCategory_0
	@FindBy(xpath="//a[@data-auid='level4Category-Shirts_m'] | //a[@data-auid='level4Category-Shirts']")public WebElement btnMensShirt_Men_Clothing_Shop;
	@FindBy(xpath="(//a[contains(@data-auid,'productCard_')])[3]")public WebElement imgMensShortShirt; 
	//@FindBy(xpath="//a[text()='Athletic Clothing']") public WebElement lnkMensShirts;
	@FindBy(xpath="(//span[@class='line-separator'])[3]/following::span") public WebElement lnkMensShirts;
	//@FindBy(xpath="//span[text()='Athletic Clothing']") public WebElement lnkMensShirtsnotclickable;
	@FindBy(xpath="(//span[@class='line-separator'])[3]/following::span") public WebElement lnkMensShirtsnotclickable;
	@FindBy(xpath="//a[text()=\"Father's Day Gifts\"]") public WebElement lnkMensClothing;
	@FindBy(xpath="//span[text()=\"Father's Day Gifts\"]") public WebElement lnkMensClothingnotclickable;
	
	
	
	@FindBy(xpath="//span[@class='facet-trigger']")public WebElement btnFilterFacet;
	
	@FindBy(xpath="//a[@data-auid='findAStore_m']")public WebElement btnFindAStoreBurgerMenu;
	@FindBy(xpath="//a[@data-auid='signInCta-m']") public  WebElement btnMyAccountBurgerMenu;
	@FindBy(xpath="//div[@data-auid='facetdrawer-level1Category-SHOP_m']")public WebElement btnSHOPBurgerMenu;
	@FindBy(xpath="//div[@data-auid='facetdrawer-level1Category-TRENDING_m']") public  WebElement btnTRENDINGBurgerMenu;
	@FindBy(xpath="//div[@data-auid='facetdrawer-level1Category-DEALS_m']") public  WebElement btnDEALSBurgerMenu;
	@FindBy(xpath="//a[@data-auid='logo_m']//parent::div[@class='nav-brand']//img") public WebElement imgAcademyLogoMobile;
	//@FindBy(linkText="Academy Sports + Outdoors Brand Logo") public WebElement imgAcademyLogoMobile;
	
	@FindBys( {
		@FindBy(linkText="Academy Sports Outdoors Brand Logo") 
	} )
	public List<WebElement> academyLogoList;
	
	@FindBy(xpath="//div[@class='mobile-search px-1 py-half border-bottom']") public WebElement ovlySearchTextBarMobile;//XXX
	@FindBy(xpath="//a[@data-auid='navigateTo-SHOP_m']") public WebElement txtToNavigateClothingBurgerMenuMobile;
	@FindBy(xpath="//a[@data-auid='navigateTo-CLOTHING_m']") public WebElement txtToNavigateMensBurgerMenuMobile;
    @FindBy(xpath="//a[@data-auid=\"logo\"]") public WebElement academyLogo;
	@FindBy(xpath="//div[text()='THIS IS ACADEMY']") public WebElement txtFooterACADEMY;	
	@FindBy(xpath="//a[@data-auid='FOOTER_LINK_4']") public WebElement iconinstagram;
	@FindBy(xpath="//a[@data-auid='FOOTER_LINK_3']") public WebElement iconyoutube;
	@FindBy(xpath="//a[@data-auid='FOOTER_LINK_2']") public WebElement iconpinterest;
	@FindBy(xpath="//a[@data-auid='FOOTER_LINK_1']") public WebElement icontwitter;
	@FindBy(xpath="//a[@data-auid='FOOTER_LINK_0']") public WebElement iconfacebook;
	@FindBy(xpath="//a[@data-auid='FOOTER_LINK_CHAT NOW']") public WebElement lnkchatnow;
	@FindBy(xpath="//a[@data-auid='FOOTER_LINK_SIGN UP FOR MORE DEALS']") public WebElement lnkSIGNUPFORMOREDEALS;
	@FindBy(xpath="//a[@data-auid='FOOTER_LINK_Find A Store']") public WebElement lnkfindastore;
	@FindBy(xpath="//a[@data-auid='FOOTER_LINK_Store Services']") public WebElement lnkStoreServices;
	@FindBy(xpath="//a[@data-auid='FOOTER_LINK_Academy Credit Card']") public WebElement lnkAcademyCreditCards;
	@FindBy(xpath="//a[@data-auid='FOOTER_LINK_Gift Cards']") public WebElement lnkgiftcards;
	@FindBy(xpath="//a[@data-auid='FOOTER_LINK_Customer Care']") public WebElement lnkcustomercare;
	@FindBy(xpath="//a[@data-auid='FOOTER_LINK_Contact Us']") public WebElement lnkcontactus;
	@FindBy(xpath="//a[@data-auid='FOOTER_LINK_Rebates']") public WebElement lnkrebates;
	@FindBy(xpath="//a[@data-auid='FOOTER_LINK_Product Recall']") public WebElement lnkproductrecall;
	@FindBy(xpath="//a[@data-auid='FOOTER_LINK_Return Policy']") public WebElement lnkreturnpolicy;
	@FindBy(xpath="//a[@data-auid='FOOTER_LINK_Check Order']") public WebElement lnkcheckorder;
	@FindBy(xpath="//a[@data-auid='FOOTER_LINK_Giving Back']") public WebElement lnkgivingback;
	@FindBy(xpath="//a[@data-auid='FOOTER_LINK_Press Room']") public WebElement lnkpressroom;
	@FindBy(xpath="//a[@data-auid='FOOTER_LINK_Careers']") public WebElement lnkcareers;
	@FindBy(xpath="//a[@data-auid='FOOTER_LINK_Our History']") public WebElement lnkourhistory;
	@FindBy(xpath="//span[@class='academyicon icon-cart']") public WebElement iconcart;
	@FindBy(id="nav-search-form") public WebElement txtSearchBox;
	
	@FindBy(xpath="//li[@data-auid='DEALS']") public  WebElement btnDEALS;
	@FindBy(xpath="//li[@data-auid='TRENDING']") public  WebElement btnTRENDING;
	@FindBy(xpath="//a[@data-auid='find_a_store']")public WebElement btnFindAStore;
	@FindBy(xpath="//span[text()='Weekly Ads']")  public WebElement txtWeeklyAD;
	@FindBy(id="react-tabs-0") public WebElement tabdetailsandspecs;
	@FindBy(id="react-tabs-2") public WebElement tabreviews;
	@FindBy(id="react-tabs-4") public WebElement tabQandA;
	
	@FindBy(xpath="//html//div[@class='product-details-content']/div[1]/div[1]") public WebElement expandall_details_specs;
	@FindBy(xpath="//html//div[@class='product-details-content']/div[2]/div[1]") public WebElement expandall_reviews;
	@FindBy(xpath="//html//div[@class='product-details-content']/div[3]/div[1]") public WebElement expandall_QA;
	@FindBy(xpath="//div[@class='drawerContainer']/div[2]/div[1]") public WebElement expandall_Academy;	
	
		@FindBy(xpath ="//input[@type='email'][@class='fields email required z-form-control m-b1 m-rauto m-lauto show-block']") public WebElement enteremail;
		@FindBy(xpath ="//input[@name='postal_code']") public WebElement enterpostal;
		@FindBy(xpath ="//input[@value='SUBMIT'][@class='z-btn z-btn-ghost-white m-rauto m-lauto show-block']") public WebElement clicksubmit;
		
		@FindBy(xpath ="//div[@class='leftNav leftColumn']")
		public WebElement myAccountMenu;
		@FindBy(id ="rh-signin-link-xs-signout")
		public WebElement btnsignout_mobile;
		@FindBy(id ="rh-signin-inout-btn")
		public WebElement btnsignout;
		
		
		@FindBy(id = "myAccountQuickLink")
		public WebElement accountSummaryFromMyAccount;
		
		@FindBy(id = "rh-signin-link-xs")
		public WebElement accountSummaryFromMyAccount_Mobile;
		
		@FindBy(id = "wishListQuickLink")
		public WebElement wishListFromMyAccount;
		@FindBy(id = "rh-signin-link-xs-wishlist-btn")
		public WebElement wishListFromMyAccount_Mobile;
		@FindBy(id = "rh-signin-link-in")
		public WebElement myAccountDropDown;
		@FindBy(id = "btnForgotPassword")
		public WebElement btnForgotPasswordSubmit;
		@FindBy(id = "forgot-email")
		public WebElement txtForgotEmail;
		@FindBy(xpath = "//a[@class='z-link btnforgot-pw-container']")
		public WebElement lnkForgotYourPassword;
		@FindBy(id = "newUserSubmit")
		public WebElement btnSignupbutton;
		@FindBy(id = "passwordRegisterField")
		public WebElement txtPasswordForSignUp;
		@FindBy(id = "emailRegisterField")
		public WebElement txtEmail;
		@FindBy(xpath = "//input[@name='logonPasswordVerify']")
		public WebElement txtConfirmPassword;
		@FindBy(xpath = "//input[@name='lastName']")
		public WebElement txtLastName;
		@FindBy(xpath = "//input[@name='firstName']")
		public WebElement txtFirstName;
		@FindBy(id = "signup-link-from-login")
		WebElement lnkSignUp;
		@FindBy(id = "logonSubmit")
		public WebElement btnSubmit;
		@FindBy(xpath = "//input[@type='password']")
		public WebElement txtPassword;
		@FindBy(xpath = "//input[@type='email']")
		public WebElement txtEmailAddress;
		
		//@FindBy(id = "rh-signin-link") public WebElement btnSignIn;signInCta
		//@FindBy(xpath = "//a[@data-auid='sign In CTA']") public WebElement btnSignIn;
		@FindBy(xpath = "//a[@data-auid='signInCta']") public WebElement btnSignIn;
		//@FindBy(xpath = "//a[@data-auid='account_info']") public WebElement btnSignIn_mobile;
		@FindBy(id = "rh-signin-link-xs")
		public WebElement btnSignIn_Mobile;
		//@FindBy(xpath ="//a[@href='https://www.academy.com/shop/LogonForm']") public WebElement btnSignIn;
		@FindBy(id = "logonErrorMessage")
		public WebElement errormessage;
		@FindBy(id = "logonIdError")
		public WebElement errormessage_email;
		@FindBy(id = "logonPasswordError")
		public WebElement errormessage_password;
		
		
		
		@FindBy(xpath = "//h1[@id='landingTitle']")
		public WebElement accountSummaryTxt;
		@FindBy(xpath = "//h1[@id='landingTitle']")
		public WebElement personalInformationTxt;
		@FindBy(xpath = "//h1[@id='landingTitle']")
		public WebElement addressBookTxt;
		@FindBy(xpath = "//h1[@id='landingTitle']")
		public WebElement wishlistsTxt;
		@FindBy(xpath = "//a[@id='personalInformation']")
		public WebElement lnkPersonalInformation;
		@FindBy(xpath = "//a[@id='addressBook']")
		public WebElement lnkAddressBookInformation;
		@FindBy(xpath = "//a[@id='wishLists']")
		public WebElement lnkwishlistsInformation;
		//@FindBy(xpath = "//button[@class='academyicon icon-menu']")
		//WebElement btnAcademyIconMenu;
		
		//KER-3964
		@FindBy(xpath="//a[@tabindex='0'][contains(text(),'Next >')]") public WebElement btnNext;
		@FindBy(xpath="//button[contains(text(),' Clear All')]") public WebElement btnClearAll;
		@FindBy(xpath="//button[@data-auid='submitSearchButton']") public WebElement btnGO;	
		@FindBy(xpath="//button[@data-auid='submitSearchButton_m']") public WebElement btnGO_mobile;
		@FindBy(xpath="//section[@class='css-hzbk0k my-3']//span | //section[@class='css-a88apo my-3']//span") public WebElement nulldescription;
		@FindBy(xpath="//div[@data-auid='shopbycategorysection']") public WebElement categorydescription;
		@FindBy(xpath="//h1") public WebElement description;
		@FindBy(xpath="//span[text()=\"Magellan Outdoors Men's  Eagle Pass Deluxe  Long Sleeve Shirt\"]") public WebElement productnotclickable;;
		//@FindBy(xpath="//span[text()=\"Magellan Outdoors Men's  Eagle Pass Deluxe  Long Sleeve Shirt\"]") public WebElement txtproductselected;
		@FindBy(xpath="((//span[@class='line-separator'])[4])/following::span[1]") public WebElement txtproductselected;
		@FindBy(xpath="(//input[@id='nav-search-form'])[2]") public WebElement txtSearchBox_mobile;
		
		@FindBy(xpath=" //a[@data-auid='FOOTER_LINK_0_Privacy Policy']") public WebElement lnkprivatepolicy;
		@FindBy(xpath="//a[@data-auid='FOOTER_LINK_1_Terms & Conditions']") public WebElement lnktermsandconditions;
		@FindBy(xpath="///a[@data-auid='FOOTER_LINK_2_California Proposition 65 California Transparency in Supply Chains Act (SB 657)']") public WebElement lnklegalpolicy; //danush 19/july
		
		@FindBy(xpath="//button[text()='SERVICES']") public WebElement expandall_Academy_services;	
		@FindBy(xpath="//button[text()='NEED HELP?']") public WebElement expandall_Academy_needhelp;
		@FindBy(xpath="//button[text()='THIS IS ACADEMY']") public WebElement expandall_Academy_academy;
		
		
		//KER-3274
		@FindBy(xpath="//div[text()='You Might try:']") public WebElement labelforsearch;
		@FindBy(xpath="//span[text()='016157299']") public WebElement skuID;
		@FindBy(xpath="//span[contains(text(),\"We couldn't find anything for\")]") public WebElement txtPleaseTryAnotherSearch;
		
		@FindBy(xpath="//section[@class='css-a88apo my-3']//span") public WebElement characterSearchLimitTitle;
		//@FindBy(xpath="//section[@class='css-hzbk0k my-3']//span") public WebElement searchDescription; a-mobile-hidden col-8
		@FindBy(xpath="//div[contains(text(),'Top Results for')]") public WebElement characterSearhTitle;
		@FindBy(xpath="(//strong[contains(text(),'sh')])[1]") WebElement listsuggestion_productcard;

		
		//Rashmi created below locators for sanity script related
		@FindBy(xpath="//div[@data-auid='shopbycategorysection']") public WebElement ContainerL1;
		@FindBy(xpath="//div[@data-auid='product-listing']") public WebElement ContainerL2;
		@FindBy(xpath="//div[@data-auid='product-listing']") public WebElement ContainerL3;
		@FindBy(xpath="//div[@class='content-wrapper']") public WebElement btnAddToCart;
		@FindBy(xpath="//div[@data-auid='product-listing']") public WebElement txtSearchResults;
		@FindBy(xpath="//div[@data-auid='shopByCategory_1']") public WebElement CategoryL1;
		@FindBy(xpath="//div[@data-auid='shopByCategory_4']") public WebElement CategoryL2;
		@FindBy(xpath="(//div[contains(@data-auid,'productCard_')]//img)[1]")  public WebElement PLPProduct;
		@FindBy(xpath="//div[@data-component='searchResult']") public WebElement txtSearchPage;
		@FindBy(linkText="Academy") public WebElement lnkbreadcrumbtext;
		@FindBy(xpath="//div[@class='breadCrumbComponent offset-sm-1 px-4']") public WebElement lnkbreadcrumb;
		@FindBy(xpath="//div[@class='row justify-content-center']") public WebElement lnkL2Pagination;
		@FindBy(xpath="//div[@class='row justify-content-center']") public WebElement lnkL3Pagination;
		@FindBy(linkText="2") public WebElement lnkPagination2;
		@FindBy(linkText="3") public WebElement lnkPagination3;
		@FindBy(xpath="//a[@data-auid='submit search term']") public WebElement btnSearch_Desktop;
		@FindBy(xpath="//a[@data-auid='Mens']")public WebElement lnkMens_HomePage;
		@FindBy(xpath="//li[@data-auid='Shirts']/a/span")public WebElement lnkshirts_HomePage;
	
		//Rashmi changed end.
		
		//KER-3270 Ak start
				@FindBy(xpath="//div[@class='container']//b[1]") public WebElement searchTitle;
				@FindBy(xpath="//span[text()='Skechers']") public WebElement specificSearchTitle;
				@FindBy(xpath="//div[@class='container css-tnijvs']/h2[text()='Skechers']") public WebElement specificSearchTitle_M;
				@FindBy(xpath="//span[text()='Water Parks & Slides']") public WebElement searchTerm;
				@FindBy(xpath="//div[@class='container css-tnijvs']//h2") public WebElement searchTerm_M;
				@FindBy(xpath="//a[@data-auid='productCard_4210061']//div[@class='c-product__title mb-0 mb-md-half']")
				public WebElement txtSearchTerm;
			    //KER-3270 Ak end
				
				//KER-3238 Ak start
				@FindBy(xpath="//a[@data-auid='level3Category-Shooting']") public WebElement txtShooting;
				@FindBy(xpath="//a[@data-auid='level2Category-OUTDOORS_m']") public WebElement txtOutDoor_M;
				@FindBy(xpath="//a[@data-auid='level3Category-Shooting_m'][1]") public WebElement txtShooting_M;
				@FindBy(xpath="//a[@data-auid='navigateTo-OUTDOORS_m'][1]") public WebElement txtShootingNavg_M;
				@FindBy(xpath="//p[contains(text(),'Sightmark Ultra Shot Plus and 3x Tactical Magnifier Set')]") public WebElement txtimageShooting;
				//KER-3238 Ak end
		
		//KER-2339
		@FindBy(xpath="//h1[text()='Clothing']") public WebElement titleclothing;
		@FindBy(xpath="//h2[text()='Mens Clothing']") public WebElement titleMensclothing;
		@FindBy(xpath="//h3[text()='Mens Shirts']") public WebElement titleMensShirtclothing;

		public void accountSummaryDeatils(String exceptedAccountSummaryTxt) throws Exception {
			String actualAccountSummaryTxt = getText(accountSummaryTxt);
			logger.debug("accountSummaryTxt:: " + actualAccountSummaryTxt);
			Assert.assertEquals(actualAccountSummaryTxt, exceptedAccountSummaryTxt);
		}
		
		public void validationmessage(String exceptederrormessage) throws Exception {
			String actualexceptederrormessageTxt = getText(errormessage);
			logger.debug("errormessage:: " + actualexceptederrormessageTxt);
			Assert.assertEquals(actualexceptederrormessageTxt, exceptederrormessage);
		}

		public void validationmessage_email(String exceptederrormessage) throws Exception {
			String actualexceptederrormessageTxt = getText(errormessage_email);
			logger.debug("errormessage:: " + actualexceptederrormessageTxt);
			Assert.assertEquals(actualexceptederrormessageTxt, exceptederrormessage);
		}
		public void validationmessage_password(String exceptederrormessage) throws Exception {
			String actualexceptederrormessageTxt = getText(errormessage_password);
			logger.debug("errormessage:: " + actualexceptederrormessageTxt);
			Assert.assertEquals(actualexceptederrormessageTxt, exceptederrormessage);
		}
		
		public void personalInformationDeatils(String exceptedPersonalInformationTxt) throws Exception {
			String actualPersonalInformationTxt = getText(personalInformationTxt);
			logger.debug("personalInformationTxt:: " + actualPersonalInformationTxt);
			Assert.assertEquals(actualPersonalInformationTxt, exceptedPersonalInformationTxt);
		}

		public void addressBookDeatils(String exceptedAddressBookTxt) throws Exception {
			String actualAddressBookTxt = getText(addressBookTxt);
			logger.debug("addressbookTxt:: " + actualAddressBookTxt);
			Assert.assertEquals(actualAddressBookTxt, exceptedAddressBookTxt);
		}

		public void wishlistsDeatils(String exceptedWishlistsTxt) throws Exception {
			String actualWishlistsTxt = getText(wishlistsTxt);
			logger.debug("WishListsTxt:: " + actualWishlistsTxt);
			Assert.assertEquals(actualWishlistsTxt, exceptedWishlistsTxt);
		}

		public void clickMyAccountDropDown() throws Exception {

			assertTrue(clickOnButton(myAccountDropDown));

		}
		public void clickSignoutFromMyAccount() throws Exception {

			assertTrue(clickOnButton(btnsignout));

		}
		
		public void clickSignoutFromMyAccount_Mobile() throws Exception {

			assertTrue(clickOnButton(btnsignout_mobile));

		}
		public void clickOnWishListsFromMyAccount() throws Exception {

			assertTrue(clickOnButton(wishListFromMyAccount));

		}
		public void clickOnWishListsFromMyAccount_Mobile() throws Exception {

			assertTrue(clickOnButton(wishListFromMyAccount_Mobile));

		}
		public void clickOnAccountSummaryFromMyAccount() throws Exception {

			assertTrue(clickOnButton(accountSummaryFromMyAccount));

		}
		public void clickOnAccountSummaryFromMyAccount_mobile() throws Exception {

			assertTrue(clickOnButton(accountSummaryFromMyAccount_Mobile));

		}
		public void clickSignInLink() throws Exception {

			assertTrue(clickOnButton(btnSignIn));

		
		}
		
		public void clickSignInLink_mobile() throws Exception {

			
			assertTrue(clickOnButton(btnSignIn_Mobile));
			/*setInputText(enteremail, "rashika.kowtikwar@gmail.com");
			setInputText(enterpostal, "560035");
			WebElement webElement = driver.findElementByXPath("//input[@type='submit']");
			webElement.sendKeys(Keys.TAB);
			//assertTrue(clickOnButton(clicksubmit));
			assertTrue(clickOnButton(btnBurgerMenu));
			assertTrue(clickOnButton(btnSignIn_Mobile));*/
			
		}
		

		public void clickForgotYourPassword() throws Exception {

			assertTrue(clickOnButton(lnkForgotYourPassword));

		}

		public void clickSignupLink() throws Exception {

			assertTrue(clickOnButton(lnkSignUp));

		}

		public void enterInvalidEmailAddressandPassword() throws Exception {

			setInputText(txtEmailAddress, "rashika@gmail.com");
			setInputText(txtPassword, "rashika@123");

		}

		public void enterEmptyEmailAddress() throws Exception {
System.out.println("before88888888888888888888888");
			setInputText(txtEmailAddress, "");
			//setInputText(txtPassword, "");
			System.out.println("after88888888");
		}

		public void enterEmailAddressandPassword() throws Exception {

			setInputText(txtEmailAddress, "rashika.kowtikwar@gmail.com");
			setInputText(txtPassword, "rashika@123");

		}
		
		public void enterEmailAddress() throws Exception {

			setInputText(txtEmailAddress, "rashika.kowtikwar@gmail.com");
			//setInputText(txtPassword, "rashika@123");

		}
		public void enterEmailAddress_signup() throws Exception {
			
			 UUID uuid = UUID.randomUUID();
		     String randomUUIDString = uuid.toString();
		     
		     String txtemailaddress_random="abc"+randomUUIDString+"@gmail.com";

			setInputText(txtEmail, txtemailaddress_random);

		}
		public void enterForgotEmail() throws Exception {

			setInputText(txtForgotEmail, "abcd@gmail.com");

		}

		public void enterEmail() throws Exception {

			setInputText(txtEmail, "abcd@gmail.com");

		}

		public void enterFirstName() throws Exception {

			setInputText(txtFirstName, "Rashika");

			
		}

		public void enterLastName() throws Exception {

			setInputText(txtLastName, "Kowtikwar");

			
		}

		public void enterPassword() throws Exception {

			setInputText(txtPassword, "rashika@123");

			
		}

		public void enterPasswordForSignUp() throws Exception {

			setInputText(txtPasswordForSignUp, "abcd@123");

			
		}

		public void enterConfirmPassword() throws Exception {

			setInputText(txtConfirmPassword, "abcd@123");

				}

		public void enterInvalidPassword() throws Exception {

			setInputText(txtPassword, "123456");

			
		}

		public void enterEmptyPassword() throws Exception {

			setInputText(txtPassword, "");

			
		}

		public void clickSubmitButton() throws Exception {

			assertTrue(clickOnButton(btnSubmit));
			
		}

		public void clickPersonalInformationLink() throws Exception {

			
			assertTrue(clickOnButton(lnkPersonalInformation));

		}
		public void clickPersonalInformationLink_Mobile() throws Exception {

			assertTrue(clickOnButton(myAccountMenu));
			assertTrue(clickOnButton(lnkPersonalInformation));

		}
		public void clickAddressBookLink() throws Exception {

			assertTrue(clickOnButton(lnkAddressBookInformation));

		}
		public void clickAddressBookLink_Mobile() throws Exception {
			assertTrue(clickOnButton(myAccountMenu));
			assertTrue(clickOnButton(lnkAddressBookInformation));

		}
		public void clickWishlistsLink() throws Exception {

			assertTrue(clickOnButton(lnkwishlistsInformation));

		}

		public void clickWishlistsLink_Mobile() throws Exception {
			assertTrue(clickOnButton(myAccountMenu));
			assertTrue(clickOnButton(lnkwishlistsInformation));

		}

		public void clickForgotPasswordSubmitButton() throws Exception {

			
			assertTrue(clickOnButton(btnForgotPasswordSubmit));
			
		}

		public void clickOnSignUpButton() throws Exception {

			
			assertTrue(clickOnButton(btnSignupbutton));
			
		}

		public void verifypresenceofsigninlink() throws Exception {
			if("mobile".equalsIgnoreCase(testtype)){
				isDisplayed(btnSignIn);
				assertTrue(isClickable(btnSignIn_Mobile));
				logger.debug("our history link is not displayed");
			}else {
				isDisplayed(btnSignIn);
				assertTrue(isClickable(btnSignIn));
				logger.debug("our history link is displayed++++++++++++++++++++++++==");
			}
		}
		public void clickASO_LOGO() throws Exception{
			isDisplayed(imgAcademyLogo);
			assertTrue(isClickable(imgAcademyLogo));
			//assertEquals("http://35.202.244.154/", getCurrentPageURL());
		}

		public void verifypresenceoffacebookicon() throws Exception {
			if("mobile".equalsIgnoreCase(testtype)){
				isDisplayed(iconfacebook);
				assertTrue(isClickable(iconfacebook));
				logger.debug("our history link is not displayed");
			}else {
				isDisplayed(iconfacebook);
				assertTrue(isClickable(iconfacebook));
				logger.debug("our history link is displayed++++++++++++++++++++++++==");
			}
		}
		public void verifypresenceofpinteresticon() throws Exception {
			if("mobile".equalsIgnoreCase(testtype)){
				isDisplayed(iconpinterest);
				assertTrue(isClickable(iconpinterest));
				logger.debug("our history link is not displayed");
			}else {
				isDisplayed(iconpinterest);
				assertTrue(isClickable(iconpinterest));
				logger.debug("our history link is displayed++++++++++++++++++++++++==");
			}
		}
		
		public void verifypresenceoftwittericon() throws Exception {
			if("mobile".equalsIgnoreCase(testtype)){
				isDisplayed(icontwitter);
				assertTrue(isClickable(icontwitter));
				logger.debug("our history link is not displayed");
			}else {
				isDisplayed(icontwitter);
				assertTrue(isClickable(icontwitter));
				logger.debug("our history link is displayed++++++++++++++++++++++++==");
			}
		}
		public void verifypresenceofyoutubeicon() throws Exception {
			if("mobile".equalsIgnoreCase(testtype)){
				isDisplayed(iconinstagram);
				assertTrue(isClickable(iconinstagram));
				logger.debug("our history link is not displayed");
			}else {
				isDisplayed(iconinstagram);
				assertTrue(isClickable(iconinstagram));
				logger.debug("our history link is displayed++++++++++++++++++++++++==");
			}
		}
		public void verifypresenceofinstagramicon() throws Exception {
			if("mobile".equalsIgnoreCase(testtype)){
				isDisplayed(iconinstagram);
				assertTrue(isClickable(iconinstagram));
				logger.debug("our history link is not displayed");
			}else {
				isDisplayed(iconinstagram);
				assertTrue(isClickable(iconinstagram));
				logger.debug("our history link is displayed++++++++++++++++++++++++==");
			}
		}
	/*public GlobalElementHeader_HomePO(WebDriver driver) {

	}*/
	//		PageFactory.initElements(driver, this);


	public void navigateToPLPFromHomePageViaSearch() throws Exception{

		setInputText(txtSearchBox, "Men's Shoes");
		assertTrue(clickOnButton(btnGO));
		//Assert.assertEquals("validating the PLP PAGE","Men's Shoes");//Framework Method need to be used
	}

	public void navigateToPLPViaClick_Desktop() throws Exception{
		
		assertTrue(clickOnButton(btnShopCategory));
		Actions hover = new Actions(getDriver());
		hover.moveToElement(btnClothingCategory).build().perform();
		//assertTrue(clickOnButton(btnMen_Clothing_Shop));
		assertTrue(clickOnButton(btnMensShirt_Men_Clothing_Shop));
	}
	
	public void navigateToL2ViaClick_Desktop() throws Exception{
		
		assertTrue(clickOnButton(btnShopCategory));
		Actions hover = new Actions(getDriver());
		hover.moveToElement(btnClothingCategory).build().perform();
		assertTrue(clickOnButton(btnMensShirt_Men_Clothing_Shop));
	}

	public void navigateToPLPViaClick_Mobile() throws Exception{
	
		assertTrue(clickOnButton(btnBurgerMenu));
		//assertTrue(clickOnButton(btnShopCategory));
		assertTrue(clickOnButton(btnClothingCategory));
		assertTrue(clickOnButton(btnMen_Clothing_Shop));
		assertTrue(clickOnButton(btnMensShirt_Men_Clothing_Shop));
	}

	public void navigateToL2PageViaClick_Mobile() throws Exception{
		
		assertTrue(clickOnButton(btnBurgerMenu));
		//assertTrue(clickOnButton(btnShopCategory));
		assertTrue(clickOnButton(btnClothingCategory));
		assertTrue(clickOnButton(btnMen_Clothing_Shop));
		assertTrue(clickOnButton(btnMen_Clothing_Shop));
	}

	public void validateASO_LOGOPresence() throws Exception{
		//scrollPageToWebElement(imgAcademyLogo);
		if(isDisplayed(imgAcademyLogo))
			logger.debug("Academy logo is displayed");	
		else
			logger.debug("Academy logo is NOT displayed");	


	}
	public void clickASO_LOGOAndValidateHomePage() throws Exception{

		assertTrue(clickOnButton(imgAcademyLogo));
		//assertEquals("http://35.202.244.154/", getCurrentPageURL());
	}

	public void validatingWeeklyAdAndFindStore() throws Exception{

		//	Assert.assertEquals("Validating the presence for txt Weekly Ad");//Framework Method need to be used
		//	Assert.assertEquals("Validating the presence for txt Find A Store");//Framework Method need to be used
	}

	public void validatingTxtSearchBox() throws Exception{
		if("mobile".equalsIgnoreCase(testtype)){
			isDisplayed(txtSearchBox_mobile);
			logger.debug("txtSearchBox is displayed");
		}else {
			isDisplayed(txtSearchBox);
			logger.debug("txtSearchBox is displayed");
		}
		//	Assert.assertEquals("Validating the presence for txtSearch Box Open");//Framework Method need to be used

	}
	
	public void entertheSearchData() throws Exception{
		if("mobile".equalsIgnoreCase(testtype)){
			Actions actions = new Actions(driver);
			actions.moveToElement(txtSearchBox_mobile);
			actions.click();
			actions.sendKeys("Magellan Outdoors Men's Eagle Pass Deluxe Long Sleeve Shirt");
			actions.build().perform();
		}else {
			
			Actions actions = new Actions(driver);
			actions.moveToElement(txtSearchBox);
			actions.click();
			//actions.sendKeys("Magellan Outdoors Men's Eagle Pass Deluxe Long Sleeve Shirt");
			actions.sendKeys("Magellan Outdoors Men's Eagle Pass Deluxe Shirt");
			actions.build().perform();
			
		}
	
	}
	
	
	
	public void entertheData() throws Exception{
		if("mobile".equalsIgnoreCase(testtype)){
			Actions actions = new Actions(driver);
			actions.moveToElement(txtSearchBox_mobile);
			actions.click();
			actions.sendKeys("Clothing");
			actions.build().perform();
		}else {
			
			Actions actions = new Actions(driver);
			actions.moveToElement(txtSearchBox);
			actions.click();
			actions.sendKeys("Clothing");
			actions.build().perform();
			
		}
	
	}
	public void entertheSearchDataForPagination() throws Exception{
		if("mobile".equalsIgnoreCase(testtype)){
			Actions actions = new Actions(driver);
			actions.moveToElement(txtSearchBox_mobile);
			actions.click();
			actions.sendKeys("Running Shoes");
			actions.build().perform();
			assertTrue(clickOnButton(btnGO_mobile));
			//scrollPageToWebElement(btnNext);
			assertTrue(clickOnButton(btnNext));
			//scrollPageToWebElement(btnNext);
			assertTrue(clickOnButton(btnNext));
		}else {
			
			Actions actions = new Actions(driver);
			actions.moveToElement(txtSearchBox);
			actions.click();
			actions.sendKeys("Running Shoes");
			actions.build().perform();
			assertTrue(clickOnButton(btnGO));
			scrollPageToWebElement(btnNext);
			assertTrue(clickOnButton(btnNext));
			scrollPageToWebElement(btnNext);
			assertTrue(clickOnButton(btnNext));
		}
	
	}
	public void entertheNullData() throws Exception{
		if("mobile".equalsIgnoreCase(testtype)){
			Actions actions = new Actions(driver);
			actions.moveToElement(txtSearchBox_mobile);
			actions.click();
			actions.sendKeys("null");
			actions.build().perform();
		}else {
			
			Actions actions = new Actions(driver);
			actions.moveToElement(txtSearchBox);
			actions.click();
			actions.sendKeys("null");
			actions.build().perform();
			
		}
	
	}
	public void entertheColor() throws Exception{
		if("mobile".equalsIgnoreCase(testtype)){
			Actions actions = new Actions(driver);
			actions.moveToElement(txtSearchBox_mobile);
			actions.click();
			actions.sendKeys("red");
			actions.build().perform();
		}else {
			
			Actions actions = new Actions(driver);
			actions.moveToElement(txtSearchBox);
			actions.click();
			actions.sendKeys("red");
			actions.build().perform();
			
		}
	
	}
	public void clickOnButton() throws Exception{
		if("mobile".equalsIgnoreCase(testtype)){
			assertTrue(clickOnButton(btnGO_mobile));
			logger.debug("btnGO is clicked");
		}else {
			
			assertTrue(clickOnButton(btnGO));
			logger.debug("btnGO is clicked");
		}
		
	}
	
	public void clickClearAllButton() throws Exception{
		if("mobile".equalsIgnoreCase(testtype)){
			Actions actions = new Actions(driver);
			actions.moveToElement(txtSearchBox_mobile);
			actions.click();
			actions.sendKeys(" ");
			
			actions.build().perform();
			assertTrue(clickOnButton(btnClearAll));
			logger.debug("btnClearAll is clicked");
		}else {
			Actions actions = new Actions(driver);
			actions.moveToElement(txtSearchBox);
			actions.click();
			actions.sendKeys("");
			actions.build().perform();
			assertTrue(clickOnButton(btnClearAll));
			logger.debug("btnClearAll is clicked");
		}
		
	}
	public void verifyThePDPPage() throws Exception{
		if("mobile".equalsIgnoreCase(testtype)){
			assertTrue(isDisplayed(description));
			logger.debug("Description is displayed");
		}else {
			
			assertTrue(isDisplayed(description));
			logger.debug("Description is displayed");
		}
		
	}
	
	
	
	public void clickOnSuggestion(String searchItemTxt) throws Exception{
				
			
			String searchItemXpath = "//a[contains(@data-auid,'"+searchItemTxt+"')]";
			System.out.println("&&&&&&&&&&**********************searchItemXpath:: "+searchItemXpath);
			assertTrue(clickOnButton(getfindElementByXPath(searchItemXpath)));
			logger.debug("searchitem is clicked");
		}
		
		
	
	@FindBy(xpath="//div[contains(@class,'suggestion-lists')]") WebElement listsuggestion;
	
	public boolean verifySuggestionPage(String inputSearchTxt) throws Exception{
		boolean flag = false;
		if("mobile".equalsIgnoreCase(testtype)){Actions actions = new Actions(driver);
		actions.moveToElement(txtSearchBox_mobile);
		actions.click();
		actions.sendKeys(inputSearchTxt);
		actions.build().perform();
		Thread.sleep(10000);
		waitForElement(listsuggestion);
		Actions search = new Actions(driver);
		search.moveToElement(listsuggestion);
		search.build().perform();
		String searchResultTxt = listsuggestion.getText();
		System.out.println("&&&&&&&&&&&&&&&&&&&*****************************ss:: "+searchResultTxt);
		String searchTxtArray[]=searchResultTxt.split("\\r?\\n");
		for(String txt: searchTxtArray){
			if(txt != null && !(txt.contains("CATEGORY")||txt.contains("BRAND")||txt.contains("Clear")) && txt.contains(inputSearchTxt)){
				flag = true;
			}
		}
		System.out.println("verifySuggestionPage Flag::"+flag);
		}else {
								
			Actions actions = new Actions(driver);
			actions.moveToElement(txtSearchBox);
			actions.click();
			actions.sendKeys(inputSearchTxt);
			actions.build().perform();
			Thread.sleep(10000);
			waitForElement(listsuggestion);
			Actions search = new Actions(driver);
			search.moveToElement(listsuggestion);
			search.build().perform();
			String searchResultTxt = listsuggestion.getText();
			System.out.println("&&&&&&&&&&&&&&&&&&&*****************************ss:: "+searchResultTxt);
			String searchTxtArray[]=searchResultTxt.split("\\r?\\n");
			for(String txt: searchTxtArray){
				if(txt != null && !(txt.contains("CATEGORY")||txt.contains("BRAND")||txt.contains("Clear")) && txt.contains(inputSearchTxt)){
					flag = true;
				}
			}
			System.out.println("verifySuggestionPage Flag::"+flag);
		}
		return flag;	
	}
	
	
	
	
	public boolean verifyDuplicateSuggestion(String inputSearchTxt) throws Exception{
		boolean flag = false;
		if("mobile".equalsIgnoreCase(testtype)){
			HashMap<String, String> seachMap = new HashMap<String, String>();
			Actions actions = new Actions(driver);
			actions.moveToElement(txtSearchBox_mobile);
			actions.click();
			actions.sendKeys(inputSearchTxt);
			actions.build().perform();
			Thread.sleep(10000);
			waitForElement(listsuggestion);
			Actions search = new Actions(driver);
			search.moveToElement(listsuggestion);
			search.build().perform();
			waitForElement(listsuggestion);
			Thread.sleep(10000);
			String searchResultTxt = listsuggestion.getText();
			
			logger.debug("&&&&&&&&&&&&&&&&&&&**************************ss:: "+searchResultTxt);
			//System.out.println("&&&&&&&&&&&&&&&&&&&*****************************ss:: "+searchResultTxt);
			String searchTxtArray[]=searchResultTxt.split("\\r?\\n");
			for(String txt: searchTxtArray){
				if(txt != null ){
					if(seachMap.containsKey(txt)) {
						flag = false;
						break;
					}else {
						seachMap.put(txt, txt);
						flag = true;
					}
					
				}
			}
			System.out.println("verifyDuplicateSuggestion Flag::"+flag);
		}else {
				
			HashMap<String, String> seachMap = new HashMap<String, String>();
			Actions actions = new Actions(driver);
			actions.moveToElement(txtSearchBox);
			actions.click();
			actions.sendKeys(inputSearchTxt);
			actions.build().perform();
			Thread.sleep(10000);
			waitForElement(listsuggestion);
			Actions search = new Actions(driver);
			search.moveToElement(listsuggestion);
			search.build().perform();
			waitForElement(listsuggestion);
			Thread.sleep(10000);
			String searchResultTxt = listsuggestion.getText();
			
			logger.debug("&&&&&&&&&&&&&&&&&&&**************************ss:: "+searchResultTxt);
			//System.out.println("&&&&&&&&&&&&&&&&&&&*****************************ss:: "+searchResultTxt);
			String searchTxtArray[]=searchResultTxt.split("\\r?\\n");
			for(String txt: searchTxtArray){
				if(txt != null ){
					if(seachMap.containsKey(txt)) {
						flag = false;
						break;
					}else {
						seachMap.put(txt, txt);
						flag = true;
					}
					
				}
			}
			System.out.println("verifyDuplicateSuggestion Flag::"+flag);
		}
		return flag;	
	}
	public void verifyTheCLPPage() throws Exception{
		if("mobile".equalsIgnoreCase(testtype)){
			assertTrue(isDisplayed(categorydescription));
			logger.debug("categorydescription is displayed");
		}else {
			
			assertTrue(isDisplayed(categorydescription));
			logger.debug("categorydescription is displayed");
		}
		
	}
	public void verifyTheNullPage() throws Exception{
		if("mobile".equalsIgnoreCase(testtype)){
			assertTrue(isDisplayed(nulldescription));
			logger.debug("Description is displayed");
		}else {
			
			assertTrue(isDisplayed(nulldescription));
			logger.debug("Description is displayed");
		}
		
	}public void verifyTheColorPage() throws Exception{
		if("mobile".equalsIgnoreCase(testtype)){
			assertTrue(isDisplayed(nulldescription));
			logger.debug("Description is displayed");
		}else {
			
			assertTrue(isDisplayed(nulldescription));
			logger.debug("Description is displayed");
		}
		
	}
	public void validatingAddtoCartIcon() throws Exception{
		if("mobile".equalsIgnoreCase(testtype)){
			isDisplayed(iconcart);
			logger.debug("iconcart is not displayed");
		}else {
			isDisplayed(iconcart);
			logger.debug("iconcart is displayed");
		}}
		
		public void clickexpandall_academy() throws Exception{
			assertTrue(clickOnButton(expandall_Academy_academy));
	

	}
		public void validatingOurhistory() throws Exception{
			
			if("mobile".equalsIgnoreCase(testtype)){
				isDisplayed(lnkourhistory);
				assertTrue(isClickable(lnkourhistory));
				logger.debug("our history link is not displayed");
			}else {
				isDisplayed(lnkourhistory);
				assertTrue(isClickable(lnkourhistory));
				logger.debug("our history link is displayed");
			}
			
	}
		public void validatingCareers() throws Exception{
			if("mobile".equalsIgnoreCase(testtype)){
				isDisplayed(lnkcareers);
				assertTrue(isClickable(lnkcareers));
				logger.debug("our history link is not displayed");
			}else {
				isDisplayed(lnkcareers);
				assertTrue(isClickable(lnkcareers));
				logger.debug("our history link is displayed++++++++++++++++++++++++==");
			}
		

	}
		
		public void validatingPressRoom() throws Exception{
			if("mobile".equalsIgnoreCase(testtype)){
				isDisplayed(lnkpressroom);
				assertTrue(isClickable(lnkpressroom));
				logger.debug("pressroom is not displayed");
			}else {
				isDisplayed(lnkpressroom);
				assertTrue(isClickable(lnkpressroom));
				logger.debug("press room  link is displayed");
			}
		//	Assert.assertEquals("Validating the presence for txtSearch Box Open");//Framework Method need to be used

	}
		public void validatingGivingBack() throws Exception{
			if("mobile".equalsIgnoreCase(testtype)){
				isDisplayed(lnkgivingback);
				assertTrue(isClickable(lnkgivingback));
				logger.debug("our history link is not displayed");
			}else {
				isDisplayed(lnkgivingback);
				isClickable(lnkgivingback);
				logger.debug("our history link is displayed++++++++++++++++++++++++==");
			}
		//	Assert.assertEquals("Validating the presence for txtSearch Box Open");//Framework Method need to be used

	}
		public void validatingCheckOrder() throws Exception{
			if("mobile".equalsIgnoreCase(testtype)){
				isDisplayed(lnkcheckorder);
				assertTrue(isClickable(lnkcheckorder));
				logger.debug("CheckOrder link is not displayed");
			}else {
				isDisplayed(lnkcheckorder);
				isClickable(lnkcheckorder);
				logger.debug("CheckOrder link is displayed++++++++++++++++++++++++==");
			}
		}
			public void validatingReturnPolicy() throws Exception{
				if("mobile".equalsIgnoreCase(testtype)){
					isDisplayed(lnkreturnpolicy);
					assertTrue(isClickable(lnkreturnpolicy));
					logger.debug("CheckOrder link is not displayed");
				}else {
					isDisplayed(lnkreturnpolicy);
					isClickable(lnkreturnpolicy);
					logger.debug("CheckOrder link is displayed++++++++++++++++++++++++==");
				}
		//	Assert.assertEquals("Validating the presence for txtSearch Box Open");//Framework Method need to be used

	}
			
			public void validatingProductRecall() throws Exception{
				if("mobile".equalsIgnoreCase(testtype)){
					isDisplayed(lnkproductrecall);
					assertTrue(isClickable(lnkproductrecall));
					logger.debug("lnkproductrecall link is not displayed");
				}else {
					isDisplayed(lnkproductrecall);
					isClickable(lnkproductrecall);
					logger.debug("lnkproductrecall link is displayed++++++++++++++++++++++++==");
				}
		//	Assert.assertEquals("Validating the presence for txtSearch Box Open");//Framework Method need to be used

	}
			public void validatingRebates() throws Exception{
				if("mobile".equalsIgnoreCase(testtype)){
					isDisplayed(lnkrebates);
					assertTrue(isClickable(lnkrebates));
					logger.debug("lnkproductrecall link is not displayed");
				}else {
					isDisplayed(lnkrebates);
					isClickable(lnkrebates);
					logger.debug("lnkproductrecall link is displayed++++++++++++++++++++++++==");
				}
		//	Assert.assertEquals("Validating the presence for txtSearch Box Open");//Framework Method need to be used

	}
			public void validatingContactUs() throws Exception{
				if("mobile".equalsIgnoreCase(testtype)){
					isDisplayed(lnkcontactus);
					assertTrue(isClickable(lnkcontactus));
					logger.debug("lnkproductrecall link is not displayed");
				}else {
					isDisplayed(lnkcontactus);
					isClickable(lnkcontactus);
					logger.debug("lnkproductrecall link is displayed++++++++++++++++++++++++==");
				}
		

	}
			public void validatingCustomercare() throws Exception{
				if("mobile".equalsIgnoreCase(testtype)){
					isDisplayed(lnkcustomercare);
					assertTrue(isClickable(lnkcustomercare));
					logger.debug("lnkcustomercare link is not displayed");
				}else {
					isDisplayed(lnkcustomercare);
					isClickable(lnkcustomercare);
					logger.debug("lnkcustomercare link is displayed++++++++++++++++++++++++==");
				}
		

	}
			
			public void validatingGiftcards() throws Exception{
				if("mobile".equalsIgnoreCase(testtype)){
					isDisplayed(lnkgiftcards);
					assertTrue(isClickable(lnkgiftcards));
					logger.debug("lnkcustomercare link is not displayed");
				}else {
					isDisplayed(lnkgiftcards);
					isClickable(lnkgiftcards);
					logger.debug("lnkcustomercare link is displayed++++++++++++++++++++++++==");
				}
		

	}
			
			public void validatingAcademyCreditCard() throws Exception{
				if("mobile".equalsIgnoreCase(testtype)){
					isDisplayed(lnkAcademyCreditCards);
					assertTrue(isClickable(lnkAcademyCreditCards));
					logger.debug("lnkcustomercare link is not displayed");
				}else {
					isDisplayed(lnkAcademyCreditCards);
					isClickable(lnkAcademyCreditCards);
					logger.debug("lnkcustomercare link is displayed++++++++++++++++++++++++==");
				}
		

	}
			public void validatingStoreServices() throws Exception{
				if("mobile".equalsIgnoreCase(testtype)){
					isDisplayed(lnkStoreServices);
					assertTrue(isClickable(lnkStoreServices));
					logger.debug("lnkcustomercare link is not displayed");
				}else {
					isDisplayed(lnkStoreServices);
					isClickable(lnkStoreServices);
					logger.debug("lnkcustomercare link is displayed++++++++++++++++++++++++==");
				}
		

	}
			
			public void validatingFindaStore() throws Exception{
				if("mobile".equalsIgnoreCase(testtype)){
					isDisplayed(lnkfindastore);
					assertTrue(isClickable(lnkfindastore));
					logger.debug("lnkcustomercare link is not displayed");
				}else {
					isDisplayed(lnkfindastore);
					isClickable(lnkfindastore);
					logger.debug("lnkcustomercare link is displayed++++++++++++++++++++++++==");
				}
		

	}
			
			public void validatingsignupformoredeals() throws Exception{
				if("mobile".equalsIgnoreCase(testtype)){
					isDisplayed(lnkSIGNUPFORMOREDEALS);
					assertTrue(isClickable(lnkSIGNUPFORMOREDEALS));
					logger.debug("lnkcustomercare link is not displayed");
				}else {
					isDisplayed(lnkSIGNUPFORMOREDEALS);
					isClickable(lnkSIGNUPFORMOREDEALS);
					logger.debug("lnkcustomercare link is displayed++++++++++++++++++++++++==");
				}
		

	}
			
			public void validatingchatnow() throws Exception{
				if("mobile".equalsIgnoreCase(testtype)){
					isDisplayed(lnkchatnow);
					assertTrue(isClickable(lnkchatnow));
					logger.debug("lnkcustomercare link is not displayed");
				}else {
					isDisplayed(lnkchatnow);
					isClickable(lnkchatnow);
					logger.debug("lnkcustomercare link is displayed++++++++++++++++++++++++==");
				}
		

	}
	public void validatingShopCategory() throws Exception{
		if("mobile".equalsIgnoreCase(testtype)){
			isDisplayed(btnShopCategory);
			logger.debug("shop is not displayed");
		}else {
			isDisplayed(btnShopCategory);
			logger.debug("shop is displayed");
		}
		//	Assert.assertEquals("Validating the presence for txtSearch Box Open");//Framework Method need to be used

	}
	public void validatingTrendingCategory() throws Exception{
		if("mobile".equalsIgnoreCase(testtype)){
			isDisplayed(btnTRENDINGBurgerMenu);
			logger.debug("trending is not displayed");
		}else {
			isDisplayed(btnTRENDING);
			logger.debug("trending is displayed");
		}
		//	Assert.assertEquals("Validating the presence for txtSearch Box Open");//Framework Method need to be used

	}
	
	public void validatingDealsCategory() throws Exception{
		if("mobile".equalsIgnoreCase(testtype)){
			isDisplayed(btnDEALSBurgerMenu);
			logger.debug("deals is not displayed");
		}else {
			isDisplayed(btnDEALS);
			logger.debug("deals is displayed");
		}
		//	Assert.assertEquals("Validating the presence for txtSearch Box Open");//Framework Method need to be used

	}
	public void validatingShopByDepartmentSlide_BurgerMenu() throws Exception{

		//	Assert.assertEquals("Validating the presence for available Categories ");//Framework Method need to be used
		//	Assert.assertEquals("Validating the presence for MyAccount ");//Framework Method need to be used
		//	Assert.assertEquals("Validating the presence for SignIn");//Framework Method need to be used
	}

	public void validitingClickingOnSearchLens() throws Exception{
		clickOnButton(btnSearchLens);
		//	Assert.assertEquals("Validating the presence for serach text box should display ");//Framework Method need to be used

	}

	public void findAndClickStoreinGH() throws Exception{

		if(isDisplayed(txtFindAStore)) {

			assertTrue(clickOnButton(txtFindAStore));
		}else
			logger.debug("Find A store link is not displayed ");	

	}


	public void validateStoreNameExist(String expectedStoreName) throws Exception{
		String actualStoreName = getText(txtFindAStore);

		if(actualStoreName.equals(expectedStoreName))
			logger.debug("User is selected the store succesfully");	
		else
			logger.debug("User is NOT selected the store succesfully");	


	}


	public void validateWeeklyAdLinkPresence() throws InterruptedException {
		if("mobile".equalsIgnoreCase(testtype)){
			isDisplayed(txtWeeklyADBurgerMenu);
		}else {
			isDisplayed(txtWeeklyAD);
		}
	}


	public void validatingPresenceOfTextSearchBox() {
		
		if(isDisplayed(txtSearchBox_mobile)) {
			System.out.println("Search Icon is displayed");
	    	logger.debug("Search Icon is displayed");	
		
	    //	assertTrue(clickOnButton(btnSearchLens));
		    
	    	if(isDisplayed(txtSearchBox_mobile)) {
	    		System.out.println("Fluid Search text bar is displayed");
		              	logger.debug("Fluid Search text bar is displayed");	
	    	}    else 
		               logger.debug("Fluid Search text bar is NOT displayed");	
		}
		
	}


	public void validatePreseneceOfFindStore() {
		if("mobile".equalsIgnoreCase(testtype)){
			isDisplayed(btnFindAStoreBurgerMenu);
			logger.debug("Find A Store link is displayed in Mobile BurgerMenu");
		}else {
			isDisplayed(btnFindAStore);
			logger.debug("Find A Store link is displayed");
		}
		/*if(isDisplayed(btnFindAStoreBurgerMenu))
			logger.debug("Find A Store link is displayed in Mobile BurgerMenu");	
		else
			logger.debug("Find A Store link is NOT displayed in Mobile BurgerMenu");	*/
	}


	public void validatePresenceOfNavigationCategories() {
		if(isDisplayed(btnDEALSBurgerMenu)&&isDisplayed(btnSHOPBurgerMenu)&&isDisplayed(btnTRENDINGBurgerMenu))
		logger.debug("Category links for navigation are displayed");	
		else
			logger.debug("Category links for navigation are NOT displayed");	
	}


	public void validatePresenceOfMyAccountLink() {
		
		if(isDisplayed(btnMyAccountBurgerMenu))
			logger.debug("My Account link is displayed in Mobile BurgerMenu");	
		else
			logger.debug("My Account link is NOT displayed in Mobile BurgerMenu");	
		
	}
	public void validatingPrivatPolicy() throws Exception{
		if("mobile".equalsIgnoreCase(testtype)){
			isDisplayed(lnkprivatepolicy);
			assertTrue(isClickable(lnkprivatepolicy));
			logger.debug("lnkcustomercare link is not displayed");
		}else {
			isDisplayed(lnkprivatepolicy);
			isClickable(lnkprivatepolicy);
			logger.debug("lnkcustomercare link is displayed++++++++++++++++++++++++==");
		}


}
	public void validatingTermsAndConditions() throws Exception{
		if("mobile".equalsIgnoreCase(testtype)){
			isDisplayed(lnktermsandconditions);
			assertTrue(isClickable(lnktermsandconditions));
			logger.debug("lnkcustomercare link is not displayed");
		}else {
			isDisplayed(lnktermsandconditions);
			isClickable(lnktermsandconditions);
			logger.debug("lnkcustomercare link is displayed++++++++++++++++++++++++==");
		}


}
	public void validatingLegalPolicy() throws Exception{
		if("mobile".equalsIgnoreCase(testtype)){
			isDisplayed(lnklegalpolicy);
			assertTrue(isClickable(lnklegalpolicy));
			logger.debug("lnkcustomercare link is not displayed");
		}else {
			isDisplayed(lnklegalpolicy);
			isClickable(lnklegalpolicy);
			logger.debug("lnkcustomercare link is displayed++++++++++++++++++++++++==");
		}


}
	
	//Anuj changes on 26/06/2018 KER-721 
	public void validatingPresenceOfTextSearchBoxHomePage() {

		if(isDisplayed(btnSearchLens)) {
			System.out.println("Search Icon is displayed");
			logger.debug("Search Icon is displayed");

			if(isDisplayed(ovlySearchTextBarMobile)) {
				logger.debug("Fluid Search text bar is displayed");	
			}    else 
				logger.debug("Fluid Search text bar is NOT displayed");	
		}

	}
//Rashika's changes for 720 footer 
	public void clickexpandall_services() throws Exception{
		assertTrue(clickOnButton(expandall_Academy_services));
	}
	public void clickexpandall_needhelp() throws Exception{
		assertTrue(clickOnButton(expandall_Academy_needhelp));
	}
	
//KER-3274	
	public void verifyTheLabelForSearch() throws Exception{
		if("mobile".equalsIgnoreCase(testtype)){
			assertTrue(isDisplayed(labelforsearch));
			logger.debug("label is displayed");
			
		}else {
			
			assertTrue(isDisplayed(labelforsearch));
			logger.debug("label is displayed");
		}
		
	}
	
	public void verifySuggestionPage_Productcard(String inputSearchTxt) throws Exception{
		Actions actions = new Actions(driver);
		actions.moveToElement(txtSearchBox);
		actions.click();
		actions.sendKeys(Keys.BACK_SPACE);
		actions.sendKeys(Keys.BACK_SPACE);
		actions.sendKeys(inputSearchTxt);
		actions.build().perform();
		Thread.sleep(10000);
		assertTrue(isDisplayed(listsuggestion_productcard));
		assertTrue(clickOnButton(listsuggestion_productcard));
	
	}
	
	public void entertheSearchData(String str) throws Exception{
		if("mobile".equalsIgnoreCase(testtype)){
			Actions actions = new Actions(driver);
			actions.moveToElement(txtSearchBox_mobile);
			actions.click();
			actions.sendKeys(str);
			actions.build().perform();
		}else {
			
			Actions actions = new Actions(driver);
			actions.moveToElement(txtSearchBox);
			actions.click();
			actions.sendKeys(str);
			actions.build().perform();
			
		}
	
	}

	//Rashmi Sanity changes
	public void verifypresenceofL1Page() throws Exception {
		if("mobile".equalsIgnoreCase(testtype)){
			assertTrue(isDisplayed(ContainerL1));
		 	logger.debug("L1 Page is not displayed");
		}else {
			assertTrue(isDisplayed(ContainerL1));
			logger.debug("L1 Page is not displayed");
		}
	}
	
	
	public void verifypresenceofL2Page() throws Exception {
		if("mobile".equalsIgnoreCase(testtype)){
			assertTrue(isDisplayed(ContainerL2));
		 	logger.debug("L2 Page is not displayed");
		}else {
			assertTrue(isDisplayed(ContainerL2));
			logger.debug("L2 Page is not displayed");
		}
	}
	
	public void verifypresenceofL3Page() throws Exception {
		if("mobile".equalsIgnoreCase(testtype)){
			assertTrue(isDisplayed(ContainerL3));
		 	logger.debug("L3 Page is not displayed");
		}else {
			assertTrue(isDisplayed(ContainerL3));
			logger.debug("L3 Page is not displayed");
		}
	}
	
	public void navigateToL2ViaClick_DesktopHomepage() throws Exception{
		
		assertTrue(clickOnButton(btnShopCategory));
		Actions hover = new Actions(getDriver());
		hover.moveToElement(btnClothingCategory).build().perform();
		assertTrue(clickOnButton(lnkMens_HomePage));
	}	
	
	
    public void navigateToL3ViaClick_DesktopHomepage() throws Exception{
		
		assertTrue(clickOnButton(btnShopCategory));
		Actions hover = new Actions(getDriver());
		hover.moveToElement(btnClothingCategory).build().perform();
		assertTrue(clickOnButton(lnkshirts_HomePage));
	}	

public void enterthePDPSearchData() throws Exception{
	    txtSearchBox.sendKeys("Nike Women's Nike Cheer Scorpion Cheerleading Shoes");
	 	assertTrue(clickOnButton(btnSearch_Desktop));
}


public void entertheSearchDataForResultsPage() throws Exception{
    txtSearchBox.sendKeys("Pants");
 	assertTrue(clickOnButton(btnSearch_Desktop));
}	


public void verifypresenceofSearchResultsPage() throws Exception {
	if("mobile".equalsIgnoreCase(testtype)){
		assertTrue(isDisplayed(txtSearchPage));
	 	logger.debug("Search Page is not displayed");
	}else {
		assertTrue(isDisplayed(txtSearchPage));
	    logger.debug("Search Page is not displayed");
	}
}


public void verifypresenceofPDPPage() throws Exception {
	if("mobile".equalsIgnoreCase(testtype)){
		assertTrue(isDisplayed(btnAddToCart));
	 	logger.debug("PDP Page is not displayed");
	}else {
		assertTrue(isDisplayed(btnAddToCart));
	    logger.debug("PDP Page is not displayed");
	}
}

public void verifypresenceofPDPComponents() throws Exception {
	if("mobile".equalsIgnoreCase(testtype)){
		assertTrue(isDisplayed(btnAddToCart));
		assertTrue(isDisplayed(btnAddToCart));
	 	logger.debug("PDP Page is not displayed");
	}else {
		assertTrue(isDisplayed(btnAddToCart));
	    logger.debug("PDP Page is not displayed");
	}
}

public void verifypresenceofSearchResultsage() throws Exception {
	if("mobile".equalsIgnoreCase(testtype)){
		assertTrue(isDisplayed(txtSearchResults));
	 	logger.debug("Search Results Page is not displayed");
	}else {
		assertTrue(isDisplayed(txtSearchResults));
	    logger.debug("Search Results Page is not displayed");
	}
}


}
