package com.HnM.qe.test.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.HnM.qe.framework.common.CommonActionHelper;

public class PDP_PO extends CommonActionHelper{
	//private static final Logger logger = Logger.getLogger(PDP_PO.class);

	//@FindBy(xpath="//div[@class='product-mixed-media-wrapper']//img[contains(@src,'')]") 
	//@FindBy(xpath="//div[@data-auid='swatchButton-image-0']/../following-sibling::div/div/img") 
	@FindBy(xpath="//div[@data-auid='swatchButton-image-0']/../following-sibling::div/div/img | //div[@data-component='productDetailsGeneric']/div[2]/div/div[2]//img")
	public WebElement imgProductMainMixedMedia;
	
	@FindBy(xpath="//h1") 
	public WebElement txtProductTitle;

	@FindBy(xpath="//div[@class='css-1u05fs2 e5lk8y40']") 
	public WebElement secProductAttributeSizes;

	@FindBy(xpath="//button[@data-auid='btnAddToCart']") 
	public WebElement btnAddToCart;

	@FindBy(xpath="//span[@data-auid='PDP_QC_DEC']") 
	public WebElement btnQuantityDec;

	@FindBy(xpath="//span[@data-auid='PDP_QC_INC']") 
	public   WebElement btnQuantityInc;

	@FindBy(xpath="//input[@aria-label='Enter Desired Quantity' and @value='1']") 
	public   WebElement txtDesiredQtyValue_1;

	
	//@FindBy(xpath="//span[contains(@class,'icon-check-circle')]//parent::div//following-sibling::div//div[contains(text(),'In Stock Online')]") 
	@FindBy(xpath="//span[contains(@class,'icon-check-mark')]//parent::div//following-sibling::div//div[contains(text(),'In Stock Online')]")
	public   WebElement txtInStock;

	//@FindBy(xpath="//li[contains(@id,'react-tabs') and text()='DETAILS & SPECS']|//div[text()='DETAILS & SPECS']/span") 
	@FindBy(xpath="//div[text()='DETAILS & SPECS']") //danush 19/july
	public   WebElement tabDetailsSpecs;

	//@FindBy(xpath="//li[contains(@id,'react-tabs') and text()='REVIEWS']|//div[text()='REVIEWS']/span") 
	@FindBy(xpath="//div[text()='REVIEWS']") //danush 19/july
	public   WebElement tabReviews;

	//@FindBy(xpath="//li[contains(@id,'react-tabs') and text()='Q&A']|//div[text()='Q&A']/span") 
	@FindBy(xpath="//div[text()='Q&A']") 
	public   WebElement tabQA;//danush 19/july

	@FindBy(xpath="//p[contains(@class,'css-8fkoyy')]") 
	public   WebElement secLongDescription;

	@FindBy(xpath="//p[@class='o-copy__14bold mb-2']") 
	public   WebElement textFeatureBenefits;

	@FindBy(xpath="//button[@data-auid='btnundefined' and text()='Read More']") 
	public   WebElement btnReadMore;

	@FindBy(xpath="//button[@data-auid='btnundefined' and text()='Read Less']") 
	public   WebElement btnReadLess;

	@FindBy(xpath="//img[@class='bv-trustmarkIcon-image']") 
	public   WebElement ImgHallmark;

	@FindBy(xpath="//div[text()='REVIEWS']") 
	public   WebElement textReviews;

	@FindBy(xpath="//div[text()='Q&A']") 
	public   WebElement textQuestions;

	//@FindBy(xpath="(//div[@class='css-yayy3r']//span[@class='pr-3'])[1]") 
	//@FindBy(xpath="//span[text()='SKU:']/following-sibling::span[1]")
	@FindBy(xpath="//span[text()='SKU:']/following-sibling::span[1] | //b[text()='SKU:']/..//following-sibling::span[1]")//danush 19/july
	public   WebElement txtProductSKU;

	//@FindBy(xpath="(//div[@class='css-yayy3r']//span[@class='pr-3'])[2]") 
	//@FindBy(xpath="//span[text()='ITEM:']/following-sibling::span[1]")
	@FindBy(xpath="//span[text()='ITEM:']/following-sibling::span[1] | //b[text()='ITEM:']/..//following-sibling::span[1]")//danush 19/july
	public   WebElement txtProductItemNumber;

	@FindBy(xpath="//div[@data-auid='swatchButton-image-4299']|//div[@data-auid='swatchButton-image-4060']") 
	public   WebElement secSize1;

	@FindBy(xpath="//div[@data-auid='swatchButton-image-4286']|//div[@data-auid='swatchButton-image-4076']") 
	public   WebElement secSize2;

	@FindBy(xpath="//button[@data-auid='btnviewCart']") 
	public WebElement btnViewCart;
	
	@FindBy(xpath="//button[@data-auid='btncheckout']") 
	public WebElement btnCheckout;
	
	@FindBy(xpath="//div[@class='wishListPopover']") 
	public WebElement btnAddToWishList; //Anuj Added for KER-1953
	
	
		//KER-1920
	@FindBy(xpath="//a[text()='Continue Shopping']") 
	public  WebElement lnkconitnueshopping;

		@FindBy(xpath="//button[@data-auid='close-addtocart-modal']") 
		public  WebElement closeicon;
		
		@FindBy(xpath="//img[@class='css-14pbatb e908uih3'][contains(@src,'')]") 
		public  WebElement productimage;
		
		@FindBy(xpath="//div[@class='css-sgomgw e908uih6']") 
		public  WebElement productprice;
		@FindBy(xpath="//div[contains(text(),\"Magellan Outdoors\")]") 
		public  WebElement productname;
		@FindBy(xpath="//h2[@class='css-mhoryu e908uih2'][text()='Item Added Successfully']") 
		public  WebElement addtocarttitle;
		@FindBy(xpath="//h1[text()='Shopping Cart']") 
		public  WebElement viewcarttitle;
		@FindBy(xpath="//div[@class='message'][contains(text(),'Sorry')]") 
		public  WebElement checkouttitle;
	
		
		


	public PDP_PO(WebDriver webDriver) {
		super();
	}

}
