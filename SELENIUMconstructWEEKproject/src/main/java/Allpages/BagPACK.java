package Allpages;

import java.time.Duration;
import java.util.Set;

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

public class BagPACK {

WebDriver driver;
WebDriverWait wait;
Actions act;
Select select;
JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
	
	public BagPACK(WebDriver driver) {
		
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(className = "cate_head")
	private WebElement BPcategories;
	
	@FindBy(xpath = "(//span[@class='catIconMenu footwear'])[1]")
	private WebElement BPFootwearANDBags;
	
	@FindBy(xpath = "(//a[@href='/shop-online/footwear-travel-bags/travel-utility-bags/backpacks.html'])[1]")
	private WebElement BPbagPACK;
	
	@FindBy(xpath = "(//img[@title=\"Online Shopping in India\"])[2]")
	private WebElement BPLogo;
	
	@FindBy(id = "localization_dropdown")
	private WebElement BPLanguageDROPdown;
	
	@FindBy(id = "login-panel-link")
	private WebElement BPlogin;
	
	@FindBy(css = "[title='Close']")
	private WebElement BPclose;
	
	@FindBy(id = "registration-panel-link")
	private WebElement BPregister;
	
	@FindBy(xpath = "(//a[@href=\"/mobile-apps.html\"])[1]")
	private WebElement BPdownloadAPP;
	
	@FindBy(xpath = "(//a[@href=\"/faces/jsp/becomeASeller/becomASeller.jsp\"])[1]")
	private WebElement BPbecomeSELLER;
	
	@FindBy(xpath = "(//a[@href=\"/aboutus/career.html\"])[1]")
	private WebElement BPcareertop;
	
	@FindBy(xpath = "(//a[@href='/'])[4]")
	private WebElement BPhome;
	
	@FindBy(xpath = "(//a[@href='/shop-online/footwear-travel-bags.html'])[3]")
	private WebElement BPfootwareTravelbags;
	
	@FindBy(xpath = "(//a[@class='button_1'])[1]")
	private WebElement BPsetButton;
	
	@FindBy(xpath = "(//a[@title=\"Scottish Club Backpack with Reflective Strip + Free Bag Protector\"])[2]")
	private WebElement BPItem1;
	
	@FindBy(xpath = "(//a[@title=\"Scottish Club Large Size Travel Backpack (LB2)\"])[2]")
	private WebElement BPItem2;
	
	@FindBy(xpath = "(//a[@title=\"3 Compartment Sling Bag with Free Sunglasses\"])[2]")
	private WebElement BPItem3;
	
	@FindBy(xpath = "(//a[@title=\"School Backpack Bag for 2 to 6 Years Kids + Free Water Bottle\"])[2]")
	private WebElement BPItem4;
	
	@FindBy(xpath = "(//a[@title=\"Leatherite Backpack\"])[2]")
	private WebElement BPItem5;
	
	@FindBy(xpath = "(//a[@title=\"Scottish Club Backpack with Multiple Storage + Free Sunglasses\"])[2]")
	private WebElement BPItem6;
	
	@FindBy(id = "iscod")
	private WebElement BPCOD;
	
	@FindBy(id = "isexoutStock")
	private WebElement BPoutSTOCK;
	
	@FindBy(id = "isexoutStock")
	private WebElement BPfreespipping;
	
	@FindBy(css = "[onclick=\"productSearch.setPersonalisedFilter(false);\"]")
	private WebElement BPSetBUTTON;
	
	@FindBy(id = "brandFilterBox38493")
	private WebElement BPScottishCLUB;
	
	@FindBy(id = "priceFilterBox1")
	private WebElement BPPrice;
	
	@FindBy(id = "discountFilterBox2")
	private WebElement BPdiscount1;
	
	@FindBy(id = "discountFilterBox1")
	private WebElement BPdiscount2;
	
	@FindBy(id = "featureFilterBox0f2")
	private WebElement BPfeature;
	
	@FindBy(id = "brandtoggle")
	private WebElement BPbrandTOGGLE;
	
	@FindBy(id = "pricetoggle")
	private WebElement BPpriceTOGGLE;
	
	@FindBy(id = "discounttoggle")
	private WebElement BPdiscountTOGGLE;
	
	@FindBy(id = "featuretoggle1")
	private WebElement BPfeatureTOGGLE;
	
	@FindBy(id = "fromPriceRange")
	private WebElement BPfromPRICE;
	
	@FindBy(id = "toPriceRange")
	private WebElement BPtoPRICE;
	
	@FindBy(xpath = "(//a[@class=\"button_1\"])[2]")
	private WebElement BPgoBUTTON;
	
	@FindBy(id = "sortByFilter")
	private WebElement BPsortBY;	
	
	@FindBy(css = "[href=\"/aboutus/about-naaptol.html\"]")
	private WebElement BPabout;
	
	@FindBy(xpath = "(//a[@href=\"/aboutus/career.html\"])[2]")
	private WebElement BPcareerbottom;
	
	@FindBy(css = "[href=\"/aboutus/pressroom.html\"]")
	private WebElement BPpressroom;
	
	@FindBy(css = "[href=\"/aboutus/investor-relation.html\"]")
	private WebElement BPinvestorrelation;
	
	@FindBy(css = "[href=\"/help/faq.html\"]")
	private WebElement BPfaq;
	
	@FindBy(css = "[href=\"/help/pre-purchase.html\"]")
	private WebElement BPprepurchase;
	
	@FindBy(css = "[href=\"/help/shipping-options.html\"]")
	private WebElement BPshippingoptions;
	
	@FindBy(css = "[href=\"/help/payment-options.html\"]")
	private WebElement BPpaymentoptions;
	
	@FindBy(css = "[href=\"https://www.naaptol.com/refund-n-return.html\"]")
	private WebElement BPrefund;
	
	@FindBy(css = "[href=\"/help/unsubscribe.html\"]")
	private WebElement BPunsubscribe;
	
	@FindBy(css = "[href=\"/customer-support/feedback.html\"]")
	private WebElement BPfeedback;
	
	@FindBy(css = "[href=\"/customer-support/contactus.html\"]")
	private WebElement BPcontactus;
	
	@FindBy(xpath = "(//a[@href=\"/faces/jsp/becomeASeller/becomASeller.jsp\"])[2]")
	private WebElement BPbecomASeller;
	
	@FindBy(css = "[href=\"/customer-support/seller-faq.html\"]")
	private WebElement BPsellerfaq;
	
	@FindBy(css = "[href=\"/online-store/hot-deals-store/si-1435-p.html\"]")
	private WebElement BPhotdealsstore;
	
	@FindBy(css = "[href=\"/app-deal-categories.html\"]")
	private WebElement BPappdealcategories;
	
	@FindBy(css = "[href=\"/sitemap.html\"]")
	private WebElement BPsitemap;
	
	@FindBy(css = "[href=\"/live-tv/schedule.html\"]")
	private WebElement BPlivetv;
	
	@FindBy(xpath = "(//a[@href=\"/shop-online/apparels-accessories.html\"])[4]")
	private WebElement BPapparelsaccessories;
	
	@FindBy(xpath = "(//a[@href=\"/shop-online/footwear-travel-bags.html\"])[5]")
	private WebElement BPfootweartravelbags;
	
	@FindBy(xpath = "(//a[@href=\"/shop-online/mobile-phones.html\"])[4]")
	private WebElement BPmobilephones;
	
	@FindBy(xpath = "(//a[@href=\"/shop-online/computers-peripherals.html\"])[4]")
	private WebElement BPcomputersperipherals;
	
	@FindBy(xpath = "(//a[@href=\"/shop-online/home-kitchen-appliances.html\"])[4]")
	private WebElement BPhomekitchenappliances;
	
	@FindBy(xpath = "(//a[@href=\"/shop-online/home-decor.html\"])[4]")
	private WebElement BPhomedecor;
	
	@FindBy(xpath = "(//a[@href=\"/shop-online/jewellery-watches.html\"])[4]")
	private WebElement BPjewellerywatches;
	
	@FindBy(xpath = "(//a[@href=\"/shop-online/automobiles.html\"])[4]")
	private WebElement BPautomobiles;
	
	@FindBy(xpath = "(//a[@href=\"/shop-online/consumer-electronics.html\"])[4]")
	private WebElement BPconsumerelectronics;
	
	@FindBy(xpath = "(//a[@href=\"/shop-online/toys-nursery.html\"])[4]")
	private WebElement BPtoysnursery;
	
	@FindBy(xpath = "(//a[@href=\"/shop-online/health-beauty.html\"])[4]")
	private WebElement BPhealthbeauty;

	@FindBy(xpath = "(//a[@href=\"/shop-online/sports-fitness.html\"])[4]")
	private WebElement BPsportsfitness;
	
	@FindBy(xpath = "(//a[@href=\"/categories.html\"])[4]")
	private WebElement BPcategoriesBOTTOM;
	
	@FindBy(css = "[name=\"header_search_text\"]")
	private WebElement BPsearch;
	
	@FindBy(xpath = "(//div[@class=\"search\"])[2]")
	private WebElement BPsearchbutton;
	
	@FindBy(xpath = "//a[@title=\"Buy online\"]/span")
	private WebElement BPBuyonlineDISPLAY;
	
	@FindBy(xpath = "//li[@id=\"productPriceDisplay\"]/span")
	private WebElement BPnotAVAILABLEdisplay;
	
	@FindBy(xpath = "//a[@title=\"Buy online\"]/span")
	private WebElement BPBUYonline;

	public WebElement getBPabout() {
		return BPabout;
	}

	public void setBPabout(WebElement bPabout) {
		BPabout = bPabout;
	}

	public WebElement getBPcategories() {
		return BPcategories;
	}

	public WebElement getBPFootwearANDBags() {
		return BPFootwearANDBags;
	}

	public WebElement getBPbagPACK() {
		return BPbagPACK;
	}

	public WebElement getBPLogo() {
		return BPLogo;
	}

	public WebElement getBPLanguageDROPdown() {
		return BPLanguageDROPdown;
	}

	public WebElement getBPlogin() {
		return BPlogin;
	}

	public WebElement getBPclose() {
		return BPclose;
	}

	public WebElement getBPregister() {
		return BPregister;
	}

	public WebElement getBPdownloadAPP() {
		return BPdownloadAPP;
	}

	public WebElement getBPbecomeSELLER() {
		return BPbecomeSELLER;
	}

	public WebElement getBPcareertop() {
		return BPcareertop;
	}

	public WebElement getBPhome() {
		return BPhome;
	}

	public WebElement getBPfootwareTravelbags() {
		return BPfootwareTravelbags;
	}

	public WebElement getBPsetButton() {
		return BPsetButton;
	}

	public WebElement getBPItem1() {
		return BPItem1;
	}

	public WebElement getBPItem2() {
		return BPItem2;
	}

	public WebElement getBPItem3() {
		return BPItem3;
	}

	public WebElement getBPItem4() {
		return BPItem4;
	}

	public WebElement getBPItem5() {
		return BPItem5;
	}

	public WebElement getBPItem6() {
		return BPItem6;
	}

	public WebElement getBPCOD() {
		return BPCOD;
	}

	public WebElement getBPoutSTOCK() {
		return BPoutSTOCK;
	}

	public WebElement getBPfreespipping() {
		return BPfreespipping;
	}

	public WebElement getBPSetBUTTON() {
		return BPSetBUTTON;
	}

	public WebElement getBPScottishCLUB() {
		return BPScottishCLUB;
	}

	public WebElement getBPPrice() {
		return BPPrice;
	}

	public WebElement getBPdiscount1() {
		return BPdiscount1;
	}

	public WebElement getBPdiscount2() {
		return BPdiscount2;
	}

	public WebElement getBPfeature() {
		return BPfeature;
	}

	public WebElement getBPbrandTOGGLE() {
		return BPbrandTOGGLE;
	}

	public WebElement getBPpriceTOGGLE() {
		return BPpriceTOGGLE;
	}

	public WebElement getBPdiscountTOGGLE() {
		return BPdiscountTOGGLE;
	}

	public WebElement getBPfeatureTOGGLE() {
		return BPfeatureTOGGLE;
	}

	public WebElement getBPfromPRICE() {
		return BPfromPRICE;
	}

	public WebElement getBPtoPRICE() {
		return BPtoPRICE;
	}

	public WebElement getBPgoBUTTON() {
		return BPgoBUTTON;
	}

	public WebElement getBPsortBY() {
		return BPsortBY;
	}

	public WebElement getBPcareerbottom() {
		return BPcareerbottom;
	}

	public WebElement getBPpressroom() {
		return BPpressroom;
	}

	public WebElement getBPinvestorrelation() {
		return BPinvestorrelation;
	}

	public WebElement getBPfaq() {
		return BPfaq;
	}

	public WebElement getBPprepurchase() {
		return BPprepurchase;
	}

	public WebElement getBPshippingoptions() {
		return BPshippingoptions;
	}

	public WebElement getBPpaymentoptions() {
		return BPpaymentoptions;
	}

	public WebElement getBPrefund() {
		return BPrefund;
	}

	public WebElement getBPunsubscribe() {
		return BPunsubscribe;
	}

	public WebElement getBPfeedback() {
		return BPfeedback;
	}

	public WebElement getBPcontactus() {
		return BPcontactus;
	}

	public WebElement getBPbecomASeller() {
		return BPbecomASeller;
	}

	public WebElement getBPsellerfaq() {
		return BPsellerfaq;
	}

	public WebElement getBPhotdealsstore() {
		return BPhotdealsstore;
	}

	public WebElement getBPappdealcategories() {
		return BPappdealcategories;
	}

	public WebElement getBPsitemap() {
		return BPsitemap;
	}

	public WebElement getBPlivetv() {
		return BPlivetv;
	}

	public WebElement getBPapparelsaccessories() {
		return BPapparelsaccessories;
	}

	public WebElement getBPfootweartravelbags() {
		return BPfootweartravelbags;
	}

	public WebElement getBPmobilephones() {
		return BPmobilephones;
	}

	public WebElement getBPcomputersperipherals() {
		return BPcomputersperipherals;
	}

	public WebElement getBPhomekitchenappliances() {
		return BPhomekitchenappliances;
	}

	public WebElement getBPhomedecor() {
		return BPhomedecor;
	}

	public WebElement getBPjewellerywatches() {
		return BPjewellerywatches;
	}

	public WebElement getBPautomobiles() {
		return BPautomobiles;
	}

	public WebElement getBPconsumerelectronics() {
		return BPconsumerelectronics;
	}

	public WebElement getBPtoysnursery() {
		return BPtoysnursery;
	}

	public WebElement getBPhealthbeauty() {
		return BPhealthbeauty;
	}

	public WebElement getBPsportsfitness() {
		return BPsportsfitness;
	}

	public WebElement getBPcategoriesBOTTOM() {
		return BPcategoriesBOTTOM;
	}

	public WebElement getBPsearch() {
		return BPsearch;
	}

	public WebElement getBPsearchbutton() {
		return BPsearchbutton;
	}

	public WebElement getBPBuyonlineDISPLAY() {
		return BPBuyonlineDISPLAY;
	}

	public WebElement getBPnotAVAILABLEdisplay() {
		return BPnotAVAILABLEdisplay;
	}
	
	public WebElement getBPBUYonline() {
		return BPBUYonline;
	}

	public void BPheader(String PLanguage) throws InterruptedException {
		
		act = new Actions(driver);
		act.moveToElement(BPcategories).build().perform();
		act.moveToElement(BPFootwearANDBags).build().perform();
		act.moveToElement(BPbagPACK).build().perform();
		BPbagPACK.click();
		BPLogo.click();
		driver.navigate().back();
		select = new Select(BPLanguageDROPdown);
		select.selectByVisibleText(PLanguage);
		Thread.sleep(800);
		BPlogin.click();
		Thread.sleep(800);
		BPclose.click();
		BPregister.click();
		Thread.sleep(800);
		BPclose.click();
		BPdownloadAPP.click();
		driver.navigate().back();
		BPbecomASeller.click();
		driver.navigate().back();
		BPcareertop.click();
		driver.navigate().back();
		BPhome.click();
		driver.navigate().back();
		BPfootwareTravelbags.click();
		driver.navigate().back();
		
		
		
		
	}
	
	public void BPleftBAR(String PFromPrice,String PToPrice) throws InterruptedException {
		
		BPCOD.click();
		BPSetBUTTON.click();
		BPCOD.click();
		BPoutSTOCK.click();
		BPSetBUTTON.click();
		BPoutSTOCK.click();
		BPfreespipping.click();
		BPSetBUTTON.click();
		BPfreespipping.click();
		BPSetBUTTON.click();
		Thread.sleep(800);
		BPScottishCLUB.click();
		Thread.sleep(800);
		BPScottishCLUB.click();
		Thread.sleep(800);
		BPPrice.click();
		Thread.sleep(800);
		BPPrice.click();
		Thread.sleep(800);
		BPdiscount1.click();
		Thread.sleep(800);
		BPdiscount1.click();
		Thread.sleep(800);
		BPfeature.click();
		Thread.sleep(800);
		BPfeature.click();
		Thread.sleep(800);
		
		BPbrandTOGGLE.click();
		BPpriceTOGGLE.click();
		BPdiscountTOGGLE.click();
		BPfeatureTOGGLE.click();
		BPbrandTOGGLE.click();
		BPpriceTOGGLE.click();
		BPdiscountTOGGLE.click();
		BPfeatureTOGGLE.click();
		Thread.sleep(800);
		BPfromPRICE.sendKeys(PFromPrice);
		BPtoPRICE.sendKeys(PToPrice);
		BPgoBUTTON.click();
				
	}
	
//	public void BPMiddle(String PBackpackSearch, String PBuyDISPLAY, String Psort1, String Psort2, String Psort3, String Psort4, String Psort5, String Psort6) throws InterruptedException {
//		
//		SoftAssert sA = new SoftAssert();
//		String Parent = driver.getWindowHandle();
//		BPItem1.click();
//		wait.until(ExpectedConditions.numberOfWindowsToBe(2));
//		Set<String> allWindows = driver.getWindowHandles();
//		for (String window : allWindows) {
//		    if (!window.equals(Parent)) {
//		        driver.switchTo().window(window);
//		        break;
//		    }
//		}
//		String Display = BPBUYonline.getText();
//		sA.assertEquals(Display, PBuyDISPLAY);
//		sA.assertAll();
//		driver.close();
//		driver.switchTo().window(Parent);
//		
//		BPItem2.click();
//		wait.until(ExpectedConditions.numberOfWindowsToBe(2));
//		Set<String> allWindows1 = driver.getWindowHandles();
//		for (String window : allWindows1) {
//		    if (!window.equals(Parent)) {
//		        driver.switchTo().window(window);
//		        break;
//		    }
//		}
//		String Display1 = BPBUYonline.getText();
//		sA.assertEquals(Display1, PBuyDISPLAY);
//		sA.assertAll();
//		driver.close();
//		driver.switchTo().window(Parent);
//		
//		BPItem3.click();
//		wait.until(ExpectedConditions.numberOfWindowsToBe(2));
//		Set<String> allWindows2 = driver.getWindowHandles();
//		for (String window : allWindows2) {
//		    if (!window.equals(Parent)) {
//		        driver.switchTo().window(window);
//		        break;
//		    }
//		}
//		String Display2 = BPBUYonline.getText();
//		sA.assertEquals(Display2, PBuyDISPLAY);
//		sA.assertAll();
//		driver.close();
//		driver.switchTo().window(Parent);
//		
//		BPItem4.click();
//		wait.until(ExpectedConditions.numberOfWindowsToBe(2));
//		Set<String> allWindows3 = driver.getWindowHandles();
//		for (String window : allWindows3) {
//		    if (!window.equals(Parent)) {
//		        driver.switchTo().window(window);
//		        break;
//		    }
//		}
//		String Display3 = BPBUYonline.getText();
//		sA.assertEquals(Display3, PBuyDISPLAY);
//		sA.assertAll();
//		driver.close();
//		driver.switchTo().window(Parent);
//		
//		BPItem5.click();
//		wait.until(ExpectedConditions.numberOfWindowsToBe(2));
//		Set<String> allWindows4 = driver.getWindowHandles();
//		for (String window : allWindows4) {
//		    if (!window.equals(Parent)) {
//		        driver.switchTo().window(window);
//		        break;
//		    }
//		}
//		String Display4 = BPBUYonline.getText();
//		sA.assertEquals(Display4, PBuyDISPLAY);
//		sA.assertAll();
//		driver.close();
//		driver.switchTo().window(Parent);
//		
//		BPItem6.click();
//		wait.until(ExpectedConditions.numberOfWindowsToBe(2));
//		Set<String> allWindows5 = driver.getWindowHandles();
//		for (String window : allWindows5) {
//		    if (!window.equals(Parent)) {
//		        driver.switchTo().window(window);
//		        break;
//		    }
//		}
//		String Display5 = BPBUYonline.getText();
//		sA.assertEquals(Display5, PBuyDISPLAY);
//		sA.assertAll();
//		driver.close();
//		driver.switchTo().window(Parent);
//		
//		select = new Select(BPsortBY);
//		select.selectByVisibleText(Psort1);
//		select.selectByVisibleText(Psort2);
//		select.selectByVisibleText(Psort3);
//		select.selectByVisibleText(Psort4);
//		select.selectByVisibleText(Psort5);
//		select.selectByVisibleText(Psort6);
//		
//		BPsearch.sendKeys(PBackpackSearch);
//		BPsearchbutton.click();
//				
//	}
	
	public void BPfooter(String PBackpackURL) throws InterruptedException {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to(PBackpackURL);
		BPabout.click();
		driver.navigate().back();
		Thread.sleep(500);
		BPcareerbottom.click();
		driver.navigate().back();
		Thread.sleep(500);
		BPpressroom.click();
		driver.navigate().back();
		Thread.sleep(500);
		BPinvestorrelation.click();
		driver.navigate().back();
		Thread.sleep(500);
		BPfaq.click();
		driver.navigate().back();
		Thread.sleep(500);
		BPprepurchase.click();
		driver.navigate().back();
		Thread.sleep(500);
		BPshippingoptions.click();
		driver.navigate().back();
		Thread.sleep(500);
		BPrefund.click();
		driver.navigate().back();
		Thread.sleep(500);
		BPunsubscribe.click();
		driver.navigate().back();
		Thread.sleep(500);
		BPfeedback.click();
		driver.navigate().back();
		Thread.sleep(500);
		BPcontactus.click();
		driver.navigate().back();
		Thread.sleep(500);
		BPbecomASeller.click();
		driver.navigate().back();
		Thread.sleep(500);
		BPsellerfaq.click();
		driver.navigate().back();
		Thread.sleep(500);
		BPhotdealsstore.click();
		driver.navigate().back();
		Thread.sleep(500);
		BPsitemap.click();
		driver.navigate().back();
		Thread.sleep(500);
		BPlivetv.click();
		driver.navigate().back();
		Thread.sleep(500);
		BPapparelsaccessories.click();
		driver.navigate().back();
		Thread.sleep(500);
		BPmobilephones.click();
		driver.navigate().back();
		Thread.sleep(500);
		BPcomputersperipherals.click();
		driver.navigate().back();
		Thread.sleep(500);
		BPhomekitchenappliances.click();
		driver.navigate().back();
		Thread.sleep(500);
		BPhomedecor.click();
		driver.navigate().back();
		Thread.sleep(500);
		BPjewellerywatches.click();
		driver.navigate().back();
		Thread.sleep(500);
		BPautomobiles.click();
		driver.navigate().back();
		Thread.sleep(500);
		BPconsumerelectronics.click();
		driver.navigate().back();
		Thread.sleep(500);
		BPtoysnursery.click();
		driver.navigate().back();
		Thread.sleep(500);
		BPhealthbeauty.click();
		driver.navigate().back();
		Thread.sleep(500);
		BPsportsfitness.click();
		driver.navigate().back();
		Thread.sleep(500);
		BPcategoriesBOTTOM.click();
		driver.navigate().back();
		
		
	}
	
}
