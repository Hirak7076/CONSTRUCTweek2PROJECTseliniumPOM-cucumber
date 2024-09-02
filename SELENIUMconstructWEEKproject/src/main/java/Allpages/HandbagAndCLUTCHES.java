package Allpages;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

public class HandbagAndCLUTCHES {

WebDriver driver;
WebDriverWait wait;
Actions act;
Select select;
JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
	
	public HandbagAndCLUTCHES(WebDriver driver) {
		
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(className = "cate_head")
	private WebElement HCcategories;
	
	@FindBy(xpath = "(//span[@class='catIconMenu footwear'])[1]")
	private WebElement HCFootwearANDBags;
	
	@FindBy(xpath = "(//a[@href='/shop-online/footwear-travel-bags/bags/handbags-slingbags.html'])[1]")
	private WebElement HChandbagsANDclutches;
	
	@FindBy(xpath = "(//img[@title=\"Online Shopping in India\"])[2]")
	private WebElement HCLogo;
	
	@FindBy(id = "localization_dropdown")
	private WebElement HCLanguageDROPdown;
	
	@FindBy(id = "login-panel-link")
	private WebElement HClogin;
	
	@FindBy(css = "[title='Close']")
	private WebElement HCclose;
	
	@FindBy(id = "registration-panel-link")
	private WebElement HCregister;
	
	@FindBy(xpath = "(//a[@href=\"/mobile-apps.html\"])[1]")
	private WebElement HCdownloadAPP;
	
	@FindBy(xpath = "(//a[@href=\"/faces/jsp/becomeASeller/becomASeller.jsp\"])[1]")
	private WebElement HCbecomeSELLER;
	
	@FindBy(xpath = "(//a[@href=\"/aboutus/career.html\"])[1]")
	private WebElement HCcareertop;
	
	@FindBy(xpath = "(//a[@href='/'])[4]")
	private WebElement HChome;
	
	@FindBy(xpath = "(//a[@href='/shop-online/footwear-travel-bags.html'])[3]")
	private WebElement HCfootwareTravelbags;
	
	@FindBy(xpath = "(//a[@title=\"Women Makeup Travel Organizer\"])[2]")
	private WebElement HCItem;
	
	@FindBy(id = "iscod")
	private WebElement HCCOD;
	
	@FindBy(id = "isexoutStock")
	private WebElement HCoutSTOCK;
	
	@FindBy(id = "isexoutStock")
	private WebElement HCfreespipping;
	
	@FindBy(css = "[onclick=\"productSearch.setPersonalisedFilter(false);\"]")
	private WebElement HCSetBUTTON;
	
	@FindBy(id = "brandFilterBox38493")
	private WebElement HCbrand;
	
	@FindBy(id = "priceFilterBox1")
	private WebElement HCprice;
	
	@FindBy(id = "discountFilterBox1")
	private WebElement HCdiscount;
	
	@FindBy(id = "featureFilterBox0f4")
	private WebElement HCgender;
	
	@FindBy(id = "brandtoggle")
	private WebElement HCbrandTOGGLE;
	
	@FindBy(id = "pricetoggle")
	private WebElement HCpriceTOGGLE;
	
	@FindBy(id = "discounttoggle")
	private WebElement HCdiscountTOGGLE;
	
	@FindBy(id = "featuretoggle1")
	private WebElement HCgenderTOGGLE;
	
	@FindBy(id = "fromPriceRange")
	private WebElement HCfromPRICE;
	
	@FindBy(id = "toPriceRange")
	private WebElement HCtoPRICE;
	
	@FindBy(xpath = "(//a[@class=\"button_1\"])[2]")
	private WebElement HCgoBUTTON;
	
	@FindBy(css = "[href=\"/aboutus/about-naaptol.html\"]")
	private WebElement HCabout;
	
	@FindBy(xpath = "(//a[@href=\"/aboutus/career.html\"])[2]")
	private WebElement HCcareerbottom;
	
	@FindBy(css = "[href=\"/aboutus/pressroom.html\"]")
	private WebElement HCpressroom;
	
	@FindBy(css = "[href=\"/aboutus/investor-relation.html\"]")
	private WebElement HCinvestorrelation;
	
	@FindBy(css = "[href=\"/help/faq.html\"]")
	private WebElement HCfaq;
	
	@FindBy(css = "[href=\"/help/pre-purchase.html\"]")
	private WebElement HCprepurchase;
	
	@FindBy(css = "[href=\"/help/shipping-options.html\"]")
	private WebElement HCshippingoptions;
	
	@FindBy(css = "[href=\"/help/payment-options.html\"]")
	private WebElement HCpaymentoptions;
	
	@FindBy(css = "[href=\"https://www.naaptol.com/refund-n-return.html\"]")
	private WebElement HCrefund;
	
	@FindBy(css = "[href=\"/help/unsubscribe.html\"]")
	private WebElement HCunsubscribe;
	
	@FindBy(css = "[href=\"/customer-support/feedback.html\"]")
	private WebElement HCfeedback;
	
	@FindBy(css = "[href=\"/customer-support/contactus.html\"]")
	private WebElement HCcontactus;
	
	@FindBy(xpath = "(//a[@href=\"/faces/jsp/becomeASeller/becomASeller.jsp\"])[2]")
	private WebElement HCbecomASeller;
	
	@FindBy(css = "[href=\"/customer-support/seller-faq.html\"]")
	private WebElement HCsellerfaq;
	
	@FindBy(css = "[href=\"/online-store/hot-deals-store/si-1435-p.html\"]")
	private WebElement HChotdealsstore;
	
	@FindBy(css = "[href=\"/app-deal-categories.html\"]")
	private WebElement HCappdealcategories;
	
	@FindBy(css = "[href=\"/sitemap.html\"]")
	private WebElement HCsitemap;
	
	@FindBy(css = "[href=\"/live-tv/schedule.html\"]")
	private WebElement HClivetv;
	
	@FindBy(xpath = "(//a[@href=\"/shop-online/apparels-accessories.html\"])[4]")
	private WebElement HCapparelsaccessories;
	
	@FindBy(xpath = "(//a[@href=\"/shop-online/footwear-travel-bags.html\"])[5]")
	private WebElement HCfootweartravelbags;
	
	@FindBy(xpath = "(//a[@href=\"/shop-online/mobile-phones.html\"])[4]")
	private WebElement HCmobilephones;
	
	@FindBy(xpath = "(//a[@href=\"/shop-online/computers-peripherals.html\"])[4]")
	private WebElement HCcomputersperipherals;
	
	@FindBy(xpath = "(//a[@href=\"/shop-online/home-kitchen-appliances.html\"])[4]")
	private WebElement HChomekitchenappliances;
	
	@FindBy(xpath = "(//a[@href=\"/shop-online/home-decor.html\"])[4]")
	private WebElement HChomedecor;
	
	@FindBy(xpath = "(//a[@href=\"/shop-online/jewellery-watches.html\"])[4]")
	private WebElement HCjewellerywatches;
	
	@FindBy(xpath = "(//a[@href=\"/shop-online/automobiles.html\"])[4]")
	private WebElement HCautomobiles;
	
	@FindBy(xpath = "(//a[@href=\"/shop-online/consumer-electronics.html\"])[4]")
	private WebElement HCconsumerelectronics;
	
	@FindBy(xpath = "(//a[@href=\"/shop-online/toys-nursery.html\"])[4]")
	private WebElement HCtoysnursery;
	
	@FindBy(xpath = "(//a[@href=\"/shop-online/health-beauty.html\"])[4]")
	private WebElement HChealthbeauty;

	@FindBy(xpath = "(//a[@href=\"/shop-online/sports-fitness.html\"])[4]")
	private WebElement HCsportsfitness;
	
	@FindBy(xpath = "(//a[@href=\"/categories.html\"])[4]")
	private WebElement HCcategoriesBOTTOM;
	
	@FindBy(css = "[name=\"header_search_text\"]")
	private WebElement HCsearch;
	
	@FindBy(xpath = "(//div[@class=\"search\"])[2]")
	private WebElement HCsearchbutton;
	
	@FindBy(xpath = "//a[@title=\"Buy online\"]/span")
	private WebElement HCBUYonline;
	
	@FindBy(xpath = "//li[@id=\"productPriceDisplay\"]/span")
	private WebElement HCnotAVAILABLEdisplay;

	public WebElement getHCcategories() {
		return HCcategories;
	}

	public WebElement getHCFootwearANDBags() {
		return HCFootwearANDBags;
	}

	public WebElement getHChandbagsANDclutches() {
		return HChandbagsANDclutches;
	}

	public WebElement getHCLogo() {
		return HCLogo;
	}

	public WebElement getHCLanguageDROPdown() {
		return HCLanguageDROPdown;
	}

	public WebElement getHClogin() {
		return HClogin;
	}

	public WebElement getHCclose() {
		return HCclose;
	}

	public WebElement getHCregister() {
		return HCregister;
	}

	public WebElement getHCdownloadAPP() {
		return HCdownloadAPP;
	}

	public WebElement getHCbecomeSELLER() {
		return HCbecomeSELLER;
	}

	public WebElement getHCcareertop() {
		return HCcareertop;
	}

	public WebElement getHChome() {
		return HChome;
	}

	public WebElement getHCfootwareTravelbags() {
		return HCfootwareTravelbags;
	}

	public WebElement getHCItem() {
		return HCItem;
	}

	public WebElement getHCCOD() {
		return HCCOD;
	}

	public WebElement getHCoutSTOCK() {
		return HCoutSTOCK;
	}

	public WebElement getHCfreespipping() {
		return HCfreespipping;
	}

	public WebElement getHCSetBUTTON() {
		return HCSetBUTTON;
	}

	public WebElement getHCbrand() {
		return HCbrand;
	}

	public WebElement getHCprice() {
		return HCprice;
	}

	public WebElement getHCdiscount() {
		return HCdiscount;
	}

	public WebElement getHCgender() {
		return HCgender;
	}

	public WebElement getHCbrandTOGGLE() {
		return HCbrandTOGGLE;
	}

	public WebElement getHCpriceTOGGLE() {
		return HCpriceTOGGLE;
	}

	public WebElement getHCdiscountTOGGLE() {
		return HCdiscountTOGGLE;
	}

	public WebElement getHCgenderTOGGLE() {
		return HCgenderTOGGLE;
	}

	public WebElement getHCfromPRICE() {
		return HCfromPRICE;
	}

	public WebElement getHCtoPRICE() {
		return HCtoPRICE;
	}

	public WebElement getHCgoBUTTON() {
		return HCgoBUTTON;
	}

	public WebElement getHCabout() {
		return HCabout;
	}

	public WebElement getHCcareerbottom() {
		return HCcareerbottom;
	}

	public WebElement getHCpressroom() {
		return HCpressroom;
	}

	public WebElement getHCinvestorrelation() {
		return HCinvestorrelation;
	}

	public WebElement getHCfaq() {
		return HCfaq;
	}

	public WebElement getHCprepurchase() {
		return HCprepurchase;
	}

	public WebElement getHCshippingoptions() {
		return HCshippingoptions;
	}

	public WebElement getHCpaymentoptions() {
		return HCpaymentoptions;
	}

	public WebElement getHCrefund() {
		return HCrefund;
	}

	public WebElement getHCunsubscribe() {
		return HCunsubscribe;
	}

	public WebElement getHCfeedback() {
		return HCfeedback;
	}

	public WebElement getHCcontactus() {
		return HCcontactus;
	}

	public WebElement getHCbecomASeller() {
		return HCbecomASeller;
	}

	public WebElement getHCsellerfaq() {
		return HCsellerfaq;
	}

	public WebElement getHChotdealsstore() {
		return HChotdealsstore;
	}

	public WebElement getHCappdealcategories() {
		return HCappdealcategories;
	}

	public WebElement getHCsitemap() {
		return HCsitemap;
	}

	public WebElement getHClivetv() {
		return HClivetv;
	}

	public WebElement getHCapparelsaccessories() {
		return HCapparelsaccessories;
	}

	public WebElement getHCfootweartravelbags() {
		return HCfootweartravelbags;
	}

	public WebElement getHCmobilephones() {
		return HCmobilephones;
	}

	public WebElement getHCcomputersperipherals() {
		return HCcomputersperipherals;
	}

	public WebElement getHChomekitchenappliances() {
		return HChomekitchenappliances;
	}

	public WebElement getHChomedecor() {
		return HChomedecor;
	}

	public WebElement getHCjewellerywatches() {
		return HCjewellerywatches;
	}

	public WebElement getHCautomobiles() {
		return HCautomobiles;
	}

	public WebElement getHCconsumerelectronics() {
		return HCconsumerelectronics;
	}

	public WebElement getHCtoysnursery() {
		return HCtoysnursery;
	}

	public WebElement getHChealthbeauty() {
		return HChealthbeauty;
	}

	public WebElement getHCsportsfitness() {
		return HCsportsfitness;
	}

	public WebElement getHCcategoriesBOTTOM() {
		return HCcategoriesBOTTOM;
	}

	public WebElement getHCsearch() {
		return HCsearch;
	}

	public WebElement getHCsearchbutton() {
		return HCsearchbutton;
	}
	
	public WebElement getHCBUYonline() {
		return HCBUYonline;
	}

	public WebElement getHCnotAVAILABLEdisplay() {
		return HCnotAVAILABLEdisplay;
	}

	public void HCheader(String PLanguage) throws InterruptedException {
		
		act = new Actions(driver);
		act.moveToElement(HCcategories).build().perform();
		act.moveToElement(HCFootwearANDBags).build().perform();
		act.moveToElement(HChandbagsANDclutches).build().perform();
		HChandbagsANDclutches.click();
		HCLogo.click();
		driver.navigate().back();
		select = new Select(HCLanguageDROPdown);
		select.selectByVisibleText(PLanguage);
		Thread.sleep(800);
		HClogin.click();
		Thread.sleep(800);
		HCclose.click();
		HCregister.click();
		Thread.sleep(800);
		HCclose.click();
		HCdownloadAPP.click();
		driver.navigate().back();
		HCbecomASeller.click();
		driver.navigate().back();
		HCcareertop.click();
		driver.navigate().back();
		HChome.click();
		driver.navigate().back();
		HCfootwareTravelbags.click();
		driver.navigate().back();
		
		HCoutSTOCK.click();
		HCSetBUTTON.click();
		
	}
	
//	public void HCmiddle(String PNotDISPLAY) {
//		
//		HCoutSTOCK.click();
//		HCSetBUTTON.click();
//		
//		SoftAssert sA = new SoftAssert();
//		String Parent = driver.getWindowHandle();
//		HCItem.click();
//		wait.until(ExpectedConditions.numberOfWindowsToBe(2));
//		Set<String> allWindows = driver.getWindowHandles();
//		for (String window : allWindows) {
//			if (!window.equals(Parent)) {
//		        driver.switchTo().window(window);
//		        break;
//		    }
//		}
//		String Display = HCBUYonline.getText();
//		sA.assertEquals(Display, PNotDISPLAY);
//		sA.assertAll();
//		driver.close();
//		driver.switchTo().window(Parent);
//		
//	}
	
	public void HCLeftbar(String PFromPrice, String PToPrice) throws InterruptedException {
		
		HCCOD.click();
		Thread.sleep(800);
		HCSetBUTTON.click();
		Thread.sleep(800);
		HCCOD.click();
		Thread.sleep(800);
		HCoutSTOCK.click();
		Thread.sleep(800);
		HCSetBUTTON.click();
		Thread.sleep(800);
		HCoutSTOCK.click();
		Thread.sleep(800);
		HCfreespipping.click();
		Thread.sleep(800);
		HCSetBUTTON.click();
		Thread.sleep(800);
		HCfreespipping.click();
		Thread.sleep(800);
		HCSetBUTTON.click();
		Thread.sleep(800);
		
		HCbrand.click();
		Thread.sleep(800);
		HCprice.click();
		Thread.sleep(800);
		HCdiscount.click();
		Thread.sleep(800);
		HCgender.click();
		Thread.sleep(800);
		HCbrand.click();
		Thread.sleep(800);
		HCprice.click();
		Thread.sleep(800);
		HCdiscount.click();
		Thread.sleep(800);
		HCgender.click();
		
		HCbrandTOGGLE.click();
		HCpriceTOGGLE.click();
		HCdiscountTOGGLE.click();
		HCgenderTOGGLE.click();
		HCbrandTOGGLE.click();
		HCpriceTOGGLE.click();
		HCdiscountTOGGLE.click();
		HCgenderTOGGLE.click();	
		
		HCfromPRICE.sendKeys(PFromPrice);
		HCtoPRICE.sendKeys(PToPrice);
		
	}
	
	public void HCfooter(String HandbagAndClutchesURL) throws InterruptedException {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to(HandbagAndClutchesURL);
		HCabout.click();
		driver.navigate().back();
		Thread.sleep(500);
		HCcareerbottom.click();
		driver.navigate().back();
		Thread.sleep(500);
		HCpressroom.click();
		driver.navigate().back();
		Thread.sleep(500);
		HCinvestorrelation.click();
		driver.navigate().back();
		Thread.sleep(500);
		HCfaq.click();
		driver.navigate().back();
		Thread.sleep(500);
		HCprepurchase.click();
		driver.navigate().back();
		Thread.sleep(500);
		HCshippingoptions.click();
		driver.navigate().back();
		Thread.sleep(500);
		HCrefund.click();
		driver.navigate().back();
		Thread.sleep(500);
		HCunsubscribe.click();
		driver.navigate().back();
		Thread.sleep(500);
		HCfeedback.click();
		driver.navigate().back();
		Thread.sleep(500);
		HCcontactus.click();
		driver.navigate().back();
		Thread.sleep(500);
		HCbecomASeller.click();
		driver.navigate().back();
		Thread.sleep(500);
		HCsellerfaq.click();
		driver.navigate().back();
		Thread.sleep(500);
		HChotdealsstore.click();
		driver.navigate().back();
		Thread.sleep(500);
		HCsitemap.click();
		driver.navigate().back();
		Thread.sleep(500);
		HClivetv.click();
		driver.navigate().back();
		Thread.sleep(500);
		HCapparelsaccessories.click();
		driver.navigate().back();
		Thread.sleep(500);
		HCmobilephones.click();
		driver.navigate().back();
		Thread.sleep(500);
		HCcomputersperipherals.click();
		driver.navigate().back();
		Thread.sleep(500);
		HChomekitchenappliances.click();
		driver.navigate().back();
		Thread.sleep(500);
		HChomedecor.click();
		driver.navigate().back();
		Thread.sleep(500);
		HCjewellerywatches.click();
		driver.navigate().back();
		Thread.sleep(500);
		HCautomobiles.click();
		driver.navigate().back();
		Thread.sleep(500);
		HCconsumerelectronics.click();
		driver.navigate().back();
		Thread.sleep(500);
		HCtoysnursery.click();
		driver.navigate().back();
		Thread.sleep(500);
		HChealthbeauty.click();
		driver.navigate().back();
		Thread.sleep(500);
		HCsportsfitness.click();
		driver.navigate().back();
		Thread.sleep(500);
		HCcategoriesBOTTOM.click();
		driver.navigate().back();
		
	}
	
}
