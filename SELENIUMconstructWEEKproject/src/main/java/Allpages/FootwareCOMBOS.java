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

public class FootwareCOMBOS {

WebDriver driver;
WebDriverWait wait;
Actions act;
Select select;
JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
	
	public FootwareCOMBOS(WebDriver driver) {
		
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(className = "cate_head")
	private WebElement FCcategories;
	
	@FindBy(xpath = "(//span[@class='catIconMenu footwear'])[1]")
	private WebElement FCFootwearANDBags;
	
	@FindBy(xpath = "(//a[@href='/shop-online/footwear-travel-bags/mens-footwear/footwear-combos.html'])[1]")
	private WebElement FCFootwearCombos;
	
	@FindBy(xpath = "(//img[@title=\"Online Shopping in India\"])[2]")
	private WebElement FCLogo;
	
	@FindBy(id = "localization_dropdown")
	private WebElement FCLanguageDROPdown;
	
	@FindBy(id = "login-panel-link")
	private WebElement FClogin;
	
	@FindBy(css = "[title='Close']")
	private WebElement FCclose;
	
	@FindBy(id = "registration-panel-link")
	private WebElement FCregister;
	
	@FindBy(xpath = "(//a[@href=\"/mobile-apps.html\"])[1]")
	private WebElement FCdownloadAPP;
	
	@FindBy(xpath = "(//a[@href=\"/faces/jsp/becomeASeller/becomASeller.jsp\"])[1]")
	private WebElement FCbecomeSELLER;
	
	@FindBy(xpath = "(//a[@href=\"/aboutus/career.html\"])[1]")
	private WebElement FCcareertop;
	
	@FindBy(xpath = "(//a[@href='/'])[4]")
	private WebElement FChome;
	
	@FindBy(xpath = "(//a[@href='/shop-online/footwear-travel-bags.html'])[3]")
	private WebElement FCfootwareTravelbags;
	
	@FindBy(xpath = "(//a[@class='button_1'])[1]")
	private WebElement FCsetButton;
	
	@FindBy(xpath = "(//a[@title=\"High Performance Modern Sports Shoes with Free Heel Pad (SSC4)\"])[2]")
	private WebElement FCItem1;
	
	@FindBy(xpath = "(//a[@title=\"Comfortable Light Sports Shoes Pick Any 1 with Free Long Socks (SW83)\"])[1]")
	private WebElement FCItem2;
	
	@FindBy(xpath = "(//a[@title=\"High Performance Modern Sports Shoes with Free Heel Pad (SSC4)\"])[1]")
	private WebElement FCItem3;
	
	@FindBy(css = "[title=\"Super Comfortable Slip On Stylish Shoes - Pick Any 1 (SS10)\"]")
	private WebElement FCItem4;
	
	@FindBy(css = "[title=\"Pick Any 1 Stylish Leatherite Sandal + FREE Sunglasses + Watch + Wallet (SDC3)\"]")
	private WebElement FCItem5;
	
	@FindBy(css = "[title=\"Leatherite Sandals + Digital Watch Free - Pick Any 1 (SW48)\"]\"]")
	private WebElement FCItem6;
	
	@FindBy(id = "iscod")
	private WebElement FCCOD;
	
	@FindBy(id = "isexoutStock")
	private WebElement FCoutSTOCK;
	
	@FindBy(id = "isexoutStock")
	private WebElement FCfreespipping;
	
	@FindBy(css = "[onclick=\"productSearch.setPersonalisedFilter(false);\"]")
	private WebElement FCSetBUTTON;
	
	@FindBy(id = "brandFilterBox38776")
	private WebElement FCbrand1;
	
	@FindBy(id = "brandFilterBox8313")
	private WebElement FCbrand2;
	
	@FindBy(id = "priceFilterBox1")
	private WebElement FCprice1;
	
	@FindBy(id = "priceFilterBox2")
	private WebElement FCprice2;
	
	@FindBy(id = "discountFilterBox1")
	private WebElement FCdiscount1;
	
	@FindBy(id = "discountFilterBox2")
	private WebElement FCdiscount2;
	
	@FindBy(css = "[name=\"brand\"]")
	private WebElement FCbrandsearch;
	
	@FindBy(id = "sortByFilter")
	private WebElement FCsortBY;	
	
	@FindBy(css = "[href=\"/aboutus/about-naaptol.html\"]")
	private WebElement FCabout;
	
	@FindBy(xpath = "(//a[@href=\"/aboutus/career.html\"])[2]")
	private WebElement FCcareerbottom;
	
	@FindBy(css = "[href=\"/aboutus/pressroom.html\"]")
	private WebElement FCpressroom;
	
	@FindBy(css = "[href=\"/aboutus/investor-relation.html\"]")
	private WebElement FCinvestorrelation;
	
	@FindBy(css = "[href=\"/help/faq.html\"]")
	private WebElement FCfaq;
	
	@FindBy(css = "[href=\"/help/pre-purchase.html\"]")
	private WebElement FCprepurchase;
	
	@FindBy(css = "[href=\"/help/shipping-options.html\"]")
	private WebElement FCshippingoptions;
	
	@FindBy(css = "[href=\"/help/payment-options.html\"]")
	private WebElement FCpaymentoptions;
	
	@FindBy(css = "[href=\"https://www.naaptol.com/refund-n-return.html\"]")
	private WebElement FCrefund;
	
	@FindBy(css = "[href=\"/help/unsubscribe.html\"]")
	private WebElement FCunsubscribe;
	
	@FindBy(css = "[href=\"/customer-support/feedback.html\"]")
	private WebElement FCfeedback;
	
	@FindBy(css = "[href=\"/customer-support/contactus.html\"]")
	private WebElement FCcontactus;
	
	@FindBy(xpath = "(//a[@href=\"/faces/jsp/becomeASeller/becomASeller.jsp\"])[2]")
	private WebElement FCbecomASeller;
	
	@FindBy(css = "[href=\"/customer-support/seller-faq.html\"]")
	private WebElement FCsellerfaq;
	
	@FindBy(css = "[href=\"/online-store/hot-deals-store/si-1435-p.html\"]")
	private WebElement FChotdealsstore;
	
	@FindBy(css = "[href=\"/app-deal-categories.html\"]")
	private WebElement FCappdealcategories;
	
	@FindBy(css = "[href=\"/sitemap.html\"]")
	private WebElement FCsitemap;
	
	@FindBy(css = "[href=\"/live-tv/schedule.html\"]")
	private WebElement FClivetv;
	
	@FindBy(xpath = "(//a[@href=\"/shop-online/apparels-accessories.html\"])[4]")
	private WebElement FCapparelsaccessories;
	
	@FindBy(xpath = "(//a[@href=\"/shop-online/footwear-travel-bags.html\"])[5]")
	private WebElement FCfootweartravelbags;
	
	@FindBy(xpath = "(//a[@href=\"/shop-online/mobile-phones.html\"])[4]")
	private WebElement FCmobilephones;
	
	@FindBy(xpath = "(//a[@href=\"/shop-online/computers-peripherals.html\"])[4]")
	private WebElement FCcomputersperipherals;
	
	@FindBy(xpath = "(//a[@href=\"/shop-online/home-kitchen-appliances.html\"])[4]")
	private WebElement FChomekitchenappliances;
	
	@FindBy(xpath = "(//a[@href=\"/shop-online/home-decor.html\"])[4]")
	private WebElement FChomedecor;
	
	@FindBy(xpath = "(//a[@href=\"/shop-online/jewellery-watches.html\"])[4]")
	private WebElement FCjewellerywatches;
	
	@FindBy(xpath = "(//a[@href=\"/shop-online/automobiles.html\"])[4]")
	private WebElement FCautomobiles;
	
	@FindBy(xpath = "(//a[@href=\"/shop-online/consumer-electronics.html\"])[4]")
	private WebElement FCconsumerelectronics;
	
	@FindBy(xpath = "(//a[@href=\"/shop-online/toys-nursery.html\"])[4]")
	private WebElement FCtoysnursery;
	
	@FindBy(xpath = "(//a[@href=\"/shop-online/health-beauty.html\"])[4]")
	private WebElement FChealthbeauty;

	@FindBy(xpath = "(//a[@href=\"/shop-online/sports-fitness.html\"])[4]")
	private WebElement FCsportsfitness;
	
	@FindBy(xpath = "(//a[@href=\"/categories.html\"])[4]")
	private WebElement FCcategoriesBOTTOM;
	
	@FindBy(css = "[name=\"header_search_text\"]")
	private WebElement FCsearch;
	
	@FindBy(xpath = "(//div[@class=\"search\"])[2]")
	private WebElement FCsearchbutton;
	
	@FindBy(xpath = "//a[@title=\"Buy online\"]/span")
	private WebElement FCBUYonline;
	
	@FindBy(xpath = "//li[@id=\"productPriceDisplay\"]/span")
	private WebElement FCnotAVAILABLEdisplay;

	public WebElement getFCcategories() {
		return FCcategories;
	}

	public WebElement getFCFootwearANDBags() {
		return FCFootwearANDBags;
	}

	public WebElement getFCFootwearCombos() {
		return FCFootwearCombos;
	}

	public WebElement getFCLogo() {
		return FCLogo;
	}

	public WebElement getFCLanguageDROPdown() {
		return FCLanguageDROPdown;
	}

	public WebElement getFClogin() {
		return FClogin;
	}

	public WebElement getFCclose() {
		return FCclose;
	}

	public WebElement getFCregister() {
		return FCregister;
	}

	public WebElement getFCdownloadAPP() {
		return FCdownloadAPP;
	}

	public WebElement getFCbecomeSELLER() {
		return FCbecomeSELLER;
	}

	public WebElement getFCcareertop() {
		return FCcareertop;
	}

	public WebElement getFChome() {
		return FChome;
	}

	public WebElement getFCfootwareTravelbags() {
		return FCfootwareTravelbags;
	}

	public WebElement getFCsetButton() {
		return FCsetButton;
	}

	public WebElement getFCItem1() {
		return FCItem1;
	}

	public WebElement getFCItem2() {
		return FCItem2;
	}

	public WebElement getFCItem3() {
		return FCItem3;
	}

	public WebElement getFCItem4() {
		return FCItem4;
	}

	public WebElement getFCItem5() {
		return FCItem5;
	}

	public WebElement getFCItem6() {
		return FCItem6;
	}

	public WebElement getFCCOD() {
		return FCCOD;
	}

	public WebElement getFCoutSTOCK() {
		return FCoutSTOCK;
	}

	public WebElement getFCfreespipping() {
		return FCfreespipping;
	}

	public WebElement getFCSetBUTTON() {
		return FCSetBUTTON;
	}

	public WebElement getFCbrand1() {
		return FCbrand1;
	}

	public WebElement getFCbrand2() {
		return FCbrand2;
	}

	public WebElement getFCprice1() {
		return FCprice1;
	}

	public WebElement getFCprice2() {
		return FCprice2;
	}

	public WebElement getFCdiscount1() {
		return FCdiscount1;
	}

	public WebElement getFCdiscount2() {
		return FCdiscount2;
	}

	public WebElement getFCbrandsearch() {
		return FCbrandsearch;
	}

	public WebElement getFCsortBY() {
		return FCsortBY;
	}

	public WebElement getFCabout() {
		return FCabout;
	}

	public WebElement getFCcareerbottom() {
		return FCcareerbottom;
	}

	public WebElement getFCpressroom() {
		return FCpressroom;
	}

	public WebElement getFCinvestorrelation() {
		return FCinvestorrelation;
	}

	public WebElement getFCfaq() {
		return FCfaq;
	}

	public WebElement getFCprepurchase() {
		return FCprepurchase;
	}

	public WebElement getFCshippingoptions() {
		return FCshippingoptions;
	}

	public WebElement getFCpaymentoptions() {
		return FCpaymentoptions;
	}

	public WebElement getFCrefund() {
		return FCrefund;
	}

	public WebElement getFCunsubscribe() {
		return FCunsubscribe;
	}

	public WebElement getFCfeedback() {
		return FCfeedback;
	}

	public WebElement getFCcontactus() {
		return FCcontactus;
	}

	public WebElement getFCbecomASeller() {
		return FCbecomASeller;
	}

	public WebElement getFCsellerfaq() {
		return FCsellerfaq;
	}

	public WebElement getFChotdealsstore() {
		return FChotdealsstore;
	}

	public WebElement getFCappdealcategories() {
		return FCappdealcategories;
	}

	public WebElement getFCsitemap() {
		return FCsitemap;
	}

	public WebElement getFClivetv() {
		return FClivetv;
	}

	public WebElement getFCapparelsaccessories() {
		return FCapparelsaccessories;
	}

	public WebElement getFCfootweartravelbags() {
		return FCfootweartravelbags;
	}

	public WebElement getFCmobilephones() {
		return FCmobilephones;
	}

	public WebElement getFCcomputersperipherals() {
		return FCcomputersperipherals;
	}

	public WebElement getFChomekitchenappliances() {
		return FChomekitchenappliances;
	}

	public WebElement getFChomedecor() {
		return FChomedecor;
	}

	public WebElement getFCjewellerywatches() {
		return FCjewellerywatches;
	}

	public WebElement getFCautomobiles() {
		return FCautomobiles;
	}

	public WebElement getFCconsumerelectronics() {
		return FCconsumerelectronics;
	}

	public WebElement getFCtoysnursery() {
		return FCtoysnursery;
	}

	public WebElement getFChealthbeauty() {
		return FChealthbeauty;
	}

	public WebElement getFCsportsfitness() {
		return FCsportsfitness;
	}

	public WebElement getFCcategoriesBOTTOM() {
		return FCcategoriesBOTTOM;
	}

	public WebElement getFCsearch() {
		return FCsearch;
	}

	public WebElement getFCsearchbutton() {
		return FCsearchbutton;
	}
	
	public WebElement getFCBUYonline() {
		return FCBUYonline;
	}

	public WebElement getFCnotAVAILABLEdisplay() {
		return FCnotAVAILABLEdisplay;
	}

	public void FCheader(String PLanguage) throws InterruptedException {
		
		act = new Actions(driver);
		act.moveToElement(FCcategories).build().perform();
		act.moveToElement(FCFootwearANDBags).build().perform();
		act.moveToElement(FCFootwearCombos).build().perform();
		FCFootwearCombos.click();
		FCLogo.click();
		driver.navigate().back();
		select = new Select(FCLanguageDROPdown);
		select.selectByVisibleText(PLanguage);
		Thread.sleep(800);
		FClogin.click();
		Thread.sleep(800);
		FCclose.click();
		FCregister.click();
		Thread.sleep(800);
		FCclose.click();
		FCdownloadAPP.click();
		driver.navigate().back();
		FCbecomASeller.click();
		driver.navigate().back();
		FCcareertop.click();
		driver.navigate().back();
		FChome.click();
		driver.navigate().back();
		FCfootwareTravelbags.click();
		driver.navigate().back();
		
	}
	
//	public void FCmiddle(String PBuyDISPLAY, String PFootwearCombosSearch, String PNotDISPLAY, String Psort1, String Psort2, String Psort3, String Psort4, String Psort5, String Psort6) {
//		
//		SoftAssert sA = new SoftAssert();
//		String Parent = driver.getWindowHandle();
//		FCItem1.click();
//		wait.until(ExpectedConditions.numberOfWindowsToBe(2));
//		Set<String> allWindows = driver.getWindowHandles();
//		for (String window : allWindows) {
//			if (!window.equals(Parent)) {
//		        driver.switchTo().window(window);
//		        break;
//		    }
//		}
//		String Display = FCBUYonline.getText();
//		sA.assertEquals(Display, PBuyDISPLAY);
//		sA.assertAll();
//		driver.close();
//		driver.switchTo().window(Parent);
//		
//		FCItem2.click();
//		wait.until(ExpectedConditions.numberOfWindowsToBe(2));
//		Set<String> allWindows1 = driver.getWindowHandles();
//		for (String window : allWindows1) {
//		    if (!window.equals(Parent)) {
//		        driver.switchTo().window(window);
//		        break;
//		    }
//		}
//		String Display1 = FCBUYonline.getText();
//		sA.assertEquals(Display1, PBuyDISPLAY);
//		sA.assertAll();
//		driver.close();
//		driver.switchTo().window(Parent);
//		
//		FCItem3.click();
//		wait.until(ExpectedConditions.numberOfWindowsToBe(2));
//		Set<String> allWindows2 = driver.getWindowHandles();
//		for (String window : allWindows2) {
//		    if (!window.equals(Parent)) {
//		        driver.switchTo().window(window);
//		        break;
//		    }
//		}
//		String Display2 = FCBUYonline.getText();
//		sA.assertEquals(Display2, PBuyDISPLAY);
//		sA.assertAll();
//		driver.close();
//		driver.switchTo().window(Parent);
//		
//		FCItem4.click();
//		wait.until(ExpectedConditions.numberOfWindowsToBe(2));
//		Set<String> allWindows3 = driver.getWindowHandles();
//		for (String window : allWindows3) {
//		    if (!window.equals(Parent)) {
//		        driver.switchTo().window(window);
//		        break;
//		    }
//		}
//		String Display3 = FCBUYonline.getText();
//		sA.assertEquals(Display3, PBuyDISPLAY);
//		sA.assertAll();
//		driver.close();
//		driver.switchTo().window(Parent);
//		
//		FCItem5.click();
//		wait.until(ExpectedConditions.numberOfWindowsToBe(2));
//		Set<String> allWindows4 = driver.getWindowHandles();
//		for (String window : allWindows4) {
//		    if (!window.equals(Parent)) {
//		        driver.switchTo().window(window);
//		        break;
//		    }
//		}
//		String Display4 = FCBUYonline.getText();
//		sA.assertEquals(Display4, PBuyDISPLAY);
//		sA.assertAll();
//		driver.close();
//		driver.switchTo().window(Parent);
//		
//		FCItem6.click();
//		wait.until(ExpectedConditions.numberOfWindowsToBe(2));
//		Set<String> allWindows5 = driver.getWindowHandles();
//		for (String window : allWindows5) {
//		    if (!window.equals(Parent)) {
//		        driver.switchTo().window(window);
//		        break;
//		    }
//		}
//		String Display5 = FCnotAVAILABLEdisplay.getText();
//		sA.assertEquals(Display5, PNotDISPLAY);
//		sA.assertAll();
//		driver.close();
//		driver.switchTo().window(Parent);
//		
//		select = new Select(FCsortBY);
//		select.selectByVisibleText(Psort1);
//		select.selectByVisibleText(Psort2);
//		select.selectByVisibleText(Psort3);
//		select.selectByVisibleText(Psort4);
//		select.selectByVisibleText(Psort5);
//		select.selectByVisibleText(Psort6);
//		
//		FCsearch.sendKeys(PFootwearCombosSearch);
//		FCsearchbutton.click();
//		
//	}
	
	public void FCLeftbar() throws InterruptedException {
		
		FCCOD.click();
		Thread.sleep(800);
		FCSetBUTTON.click();
		Thread.sleep(800);
		FCCOD.click();
		Thread.sleep(800);
		FCoutSTOCK.click();
		Thread.sleep(800);
		FCSetBUTTON.click();
		Thread.sleep(800);
		FCoutSTOCK.click();
		Thread.sleep(800);
		FCfreespipping.click();
		Thread.sleep(800);
		FCSetBUTTON.click();
		Thread.sleep(800);
		FCfreespipping.click();
		Thread.sleep(800);
		FCSetBUTTON.click();
		Thread.sleep(800);
		
		FCbrand1.click();
		Thread.sleep(800);
		FCbrand2.click();
		Thread.sleep(800);
		FCbrand1.click();
		Thread.sleep(800);
		FCbrand2.click();
		Thread.sleep(800);
		
		FCprice1.click();
		Thread.sleep(800);
		FCprice2.click();
		Thread.sleep(800);
		FCprice1.click();
		Thread.sleep(800);
		FCprice2.click();
		Thread.sleep(800);
		
		FCdiscount1.click();
		Thread.sleep(800);
		FCdiscount2.click();
		Thread.sleep(800);
		FCdiscount1.click();
		Thread.sleep(800);
		FCdiscount2.click();
		
	}
	
	public void FCfooter(String PFootwearCombosURL) throws InterruptedException {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to(PFootwearCombosURL);
		FCabout.click();
		driver.navigate().back();
		Thread.sleep(500);
		FCcareerbottom.click();
		driver.navigate().back();
		Thread.sleep(500);
		FCpressroom.click();
		driver.navigate().back();
		Thread.sleep(500);
		FCinvestorrelation.click();
		driver.navigate().back();
		Thread.sleep(500);
		FCfaq.click();
		driver.navigate().back();
		Thread.sleep(500);
		FCprepurchase.click();
		driver.navigate().back();
		Thread.sleep(500);
		FCshippingoptions.click();
		driver.navigate().back();
		Thread.sleep(500);
		FCrefund.click();
		driver.navigate().back();
		Thread.sleep(500);
		FCunsubscribe.click();
		driver.navigate().back();
		Thread.sleep(500);
		FCfeedback.click();
		driver.navigate().back();
		Thread.sleep(500);
		FCcontactus.click();
		driver.navigate().back();
		Thread.sleep(500);
		FCbecomASeller.click();
		driver.navigate().back();
		Thread.sleep(500);
		FCsellerfaq.click();
		driver.navigate().back();
		Thread.sleep(500);
		FChotdealsstore.click();
		driver.navigate().back();
		Thread.sleep(500);
		FCsitemap.click();
		driver.navigate().back();
		Thread.sleep(500);
		FClivetv.click();
		driver.navigate().back();
		Thread.sleep(500);
		FCapparelsaccessories.click();
		driver.navigate().back();
		Thread.sleep(500);
		FCmobilephones.click();
		driver.navigate().back();
		Thread.sleep(500);
		FCcomputersperipherals.click();
		driver.navigate().back();
		Thread.sleep(500);
		FChomekitchenappliances.click();
		driver.navigate().back();
		Thread.sleep(500);
		FChomedecor.click();
		driver.navigate().back();
		Thread.sleep(500);
		FCjewellerywatches.click();
		driver.navigate().back();
		Thread.sleep(500);
		FCautomobiles.click();
		driver.navigate().back();
		Thread.sleep(500);
		FCconsumerelectronics.click();
		driver.navigate().back();
		Thread.sleep(500);
		FCtoysnursery.click();
		driver.navigate().back();
		Thread.sleep(500);
		FChealthbeauty.click();
		driver.navigate().back();
		Thread.sleep(500);
		FCsportsfitness.click();
		driver.navigate().back();
		Thread.sleep(500);
		FCcategoriesBOTTOM.click();
		driver.navigate().back();
		
	}
	
}
