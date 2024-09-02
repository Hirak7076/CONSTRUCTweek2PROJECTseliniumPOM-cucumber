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

public class TravelAndUTILITYbag {

WebDriver driver;
WebDriverWait wait;
Actions act;
Select select;
JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
	
	public TravelAndUTILITYbag(WebDriver driver) {
		
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(className = "cate_head")
	private WebElement TUBcategories;
	
	@FindBy(xpath = "(//span[@class='catIconMenu footwear'])[1]")
	private WebElement TUBFootwearANDBags;
	
	@FindBy(xpath = "(//a[@href='/shop-online/footwear-travel-bags/travel-utility-bags.html'])[1]")
	private WebElement TUBtravelUTILbags;
	
	@FindBy(xpath = "(//img[@title=\"Online Shopping in India\"])[2]")
	private WebElement TUBLogo;
	
	@FindBy(id = "localization_dropdown")
	private WebElement TUBLanguageDROPdown;
	
	@FindBy(id = "login-panel-link")
	private WebElement TUBlogin;
	
	@FindBy(css = "[title='Close']")
	private WebElement TUBclose;
	
	@FindBy(id = "registration-panel-link")
	private WebElement TUBregister;
	
	@FindBy(xpath = "(//a[@href=\"/mobile-apps.html\"])[1]")
	private WebElement TUBdownloadAPP;
	
	@FindBy(xpath = "(//a[@href=\"/faces/jsp/becomeASeller/becomASeller.jsp\"])[1]")
	private WebElement TUBbecomeSELLER;
	
	@FindBy(xpath = "(//a[@href=\"/aboutus/career.html\"])[1]")
	private WebElement TUBcareertop;
	
	@FindBy(xpath = "(//a[@href='/'])[4]")
	private WebElement TUBhome;
	
	@FindBy(xpath = "(//a[@href='/shop-online/footwear-travel-bags.html'])[3]")
	private WebElement TUBfootwareTravelbags;
	
	@FindBy(css = "[title=\"Backpack\"]")
	private WebElement TUBBackpack;
	
	@FindBy(css = "[title=\"Duffle Bag & Strolleys\"]")
	private WebElement TUBDuffleBagandStrolley;
	
	@FindBy(css = "[title=\"Travel Accessories\"]")
	private WebElement TUBTravelAccessories;
	
	@FindBy(xpath = "//a[@title='Branded']")
	private WebElement TUBBranded;
	
	@FindBy(xpath = "(//a[@title=\"Fidato\"])[1]")
	private WebElement TUBFidato;
	
	@FindBy(xpath = "//a[@title=\"Preety Crafts\"]")
	private WebElement TUBPreetyCrafts;
	
	@FindBy(xpath = "//a[@title=\"Scottish Club\"]")
	private WebElement TUBScottishClub;
	
	@FindBy(id = "sliderBannerContent-258")
	private WebElement TUBtopIMAGE;
	
	@FindBy(id = "sliderBannerContent-258")
	private WebElement TUBItemQV;
	
	@FindBy(xpath = "(//span[text()='Quick View'])[1]")
	private WebElement TUBquickView;
	
	@FindBy(xpath = "//span[@title=\"Scottish Club Set of 7 Family Travel Bags (7DB2K)\"]")
	private WebElement TUBItemVideo;
	
	@FindBy(xpath = "(//a[@title=\"Scottish Club Set of 7 Family Travel Bags (7DB2K)\"])[2]")
	private WebElement TUBItem1;
	
	@FindBy(xpath = "(//a[@title=\"Scottish Club Set of 7 Family Travel Bags (7DB1C)\"])[2]")
	private WebElement TUBItem2;
	
	@FindBy(xpath = "(//a[@title=\"Large Convertible Duffle Backpack Bag (2HB1)\"])[8]")
	private WebElement TUBItem3;
	
	@FindBy(xpath = "(//a[@title=\"6 Pcs Travel Suitcase Organiser (6TO-1)\"])[8]")
	private WebElement TUBItem4;
	
	@FindBy(xpath = "(//a[@title=\"Scottish Club Backpack with Reflective Strip + Free Bag Protector\"])[2]")
	private WebElement TUBItem5;
	
	@FindBy(xpath = "(//a[@title=\"Leatherrite Set of 5 Travel Bags Combo\"])[2]")
	private WebElement TUBItem6;
	
	@FindBy(css = "[href=\"/aboutus/about-naaptol.html\"]")
	private WebElement TUBabout;
	
	@FindBy(xpath = "(//a[@href=\"/aboutus/career.html\"])[2]")
	private WebElement TUBcareerbottom;
	
	@FindBy(css = "[href=\"/aboutus/pressroom.html\"]")
	private WebElement TUBpressroom;
	
	@FindBy(css = "[href=\"/aboutus/investor-relation.html\"]")
	private WebElement TUBinvestorrelation;
	
	@FindBy(css = "[href=\"/help/faq.html\"]")
	private WebElement TUBfaq;
	
	@FindBy(css = "[href=\"/help/pre-purchase.html\"]")
	private WebElement TUBprepurchase;
	
	@FindBy(css = "[href=\"/help/shipping-options.html\"]")
	private WebElement TUBshippingoptions;
	
	@FindBy(css = "[href=\"/help/payment-options.html\"]")
	private WebElement TUBpaymentoptions;
	
	@FindBy(css = "[href=\"https://www.naaptol.com/refund-n-return.html\"]")
	private WebElement TUBrefund;
	
	@FindBy(css = "[href=\"/help/unsubscribe.html\"]")
	private WebElement TUBunsubscribe;
	
	@FindBy(css = "[href=\"/customer-support/feedback.html\"]")
	private WebElement TUBfeedback;
	
	@FindBy(css = "[href=\"/customer-support/contactus.html\"]")
	private WebElement TUBcontactus;
	
	@FindBy(xpath = "(//a[@href=\"/faces/jsp/becomeASeller/becomASeller.jsp\"])[2]")
	private WebElement TUBbecomASeller;
	
	@FindBy(css = "[href=\"/customer-support/seller-faq.html\"]")
	private WebElement TUBsellerfaq;
	
	@FindBy(css = "[href=\"/online-store/hot-deals-store/si-1435-p.html\"]")
	private WebElement TUBhotdealsstore;
	
	@FindBy(css = "[href=\"/app-deal-categories.html\"]")
	private WebElement TUBappdealcategories;
	
	@FindBy(css = "[href=\"/sitemap.html\"]")
	private WebElement TUBsitemap;
	
	@FindBy(css = "[href=\"/live-tv/schedule.html\"]")
	private WebElement TUBlivetv;
	
	@FindBy(xpath = "(//a[@href=\"/shop-online/apparels-accessories.html\"])[4]")
	private WebElement TUBapparelsaccessories;
	
	@FindBy(xpath = "(//a[@href=\"/shop-online/footwear-travel-bags.html\"])[5]")
	private WebElement TUBfootweartravelbags;
	
	@FindBy(xpath = "(//a[@href=\"/shop-online/mobile-phones.html\"])[4]")
	private WebElement TUBmobilephones;
	
	@FindBy(xpath = "(//a[@href=\"/shop-online/computers-peripherals.html\"])[4]")
	private WebElement TUBcomputersperipherals;
	
	@FindBy(xpath = "(//a[@href=\"/shop-online/home-kitchen-appliances.html\"])[4]")
	private WebElement TUBhomekitchenappliances;
	
	@FindBy(xpath = "(//a[@href=\"/shop-online/home-decor.html\"])[4]")
	private WebElement TUBhomedecor;
	
	@FindBy(xpath = "(//a[@href=\"/shop-online/jewellery-watches.html\"])[4]")
	private WebElement TUBjewellerywatches;
	
	@FindBy(xpath = "(//a[@href=\"/shop-online/automobiles.html\"])[4]")
	private WebElement TUBautomobiles;
	
	@FindBy(xpath = "(//a[@href=\"/shop-online/consumer-electronics.html\"])[4]")
	private WebElement TUBconsumerelectronics;
	
	@FindBy(xpath = "(//a[@href=\"/shop-online/toys-nursery.html\"])[4]")
	private WebElement TUBtoysnursery;
	
	@FindBy(xpath = "(//a[@href=\"/shop-online/health-beauty.html\"])[4]")
	private WebElement TUBhealthbeauty;

	@FindBy(xpath = "(//a[@href=\"/shop-online/sports-fitness.html\"])[4]")
	private WebElement TUBsportsfitness;
	
	@FindBy(xpath = "(//a[@href=\"/categories.html\"])[4]")
	private WebElement TUBcategoriesBOTTOM;
	
	@FindBy(css = "[name=\"header_search_text\"]")
	private WebElement TUBsearch;
	
	@FindBy(xpath = "(//div[@class=\"search\"])[2]")
	private WebElement TUBsearchbutton;
	
	@FindBy(xpath = "//a[@title=\"Buy online\"]/span")
	private WebElement TUBBUYonline;
	
	@FindBy(xpath = "//li[@id=\"productPriceDisplay\"]/span")
	private WebElement TUBnotAVAILABLEdisplay;

	public WebElement getTUBcategories() {
		return TUBcategories;
	}

	public WebElement getTUBFootwearANDBags() {
		return TUBFootwearANDBags;
	}

	public WebElement getTUBtravelUTILbags() {
		return TUBtravelUTILbags;
	}

	public WebElement getTUBLogo() {
		return TUBLogo;
	}

	public WebElement getTUBLanguageDROPdown() {
		return TUBLanguageDROPdown;
	}

	public WebElement getTUBlogin() {
		return TUBlogin;
	}

	public WebElement getTUBclose() {
		return TUBclose;
	}

	public WebElement getTUBregister() {
		return TUBregister;
	}

	public WebElement getTUBdownloadAPP() {
		return TUBdownloadAPP;
	}

	public WebElement getTUBbecomeSELLER() {
		return TUBbecomeSELLER;
	}

	public WebElement getTUBcareertop() {
		return TUBcareertop;
	}

	public WebElement getTUBhome() {
		return TUBhome;
	}

	public WebElement getTUBfootwareTravelbags() {
		return TUBfootwareTravelbags;
	}

	public WebElement getTUBBackpack() {
		return TUBBackpack;
	}

	public WebElement getTUBDuffleBagandStrolley() {
		return TUBDuffleBagandStrolley;
	}

	public WebElement getTUBTravelAccessories() {
		return TUBTravelAccessories;
	}

	public WebElement getTUBBranded() {
		return TUBBranded;
	}

	public WebElement getTUBFidato() {
		return TUBFidato;
	}

	public WebElement getTUBPreetyCrafts() {
		return TUBPreetyCrafts;
	}

	public WebElement getTUBScottishClub() {
		return TUBScottishClub;
	}

	public WebElement getTUBtopIMAGE() {
		return TUBtopIMAGE;
	}

	public WebElement getTUBItemQV() {
		return TUBItemQV;
	}

	public WebElement getTUBquickView() {
		return TUBquickView;
	}

	public WebElement getTUBItemVideo() {
		return TUBItemVideo;
	}

	public WebElement getTUBItem1() {
		return TUBItem1;
	}

	public WebElement getTUBItem2() {
		return TUBItem2;
	}

	public WebElement getTUBItem3() {
		return TUBItem3;
	}

	public WebElement getTUBItem4() {
		return TUBItem4;
	}

	public WebElement getTUBItem5() {
		return TUBItem5;
	}

	public WebElement getTUBItem6() {
		return TUBItem6;
	}

	public WebElement getTUBabout() {
		return TUBabout;
	}

	public WebElement getTUBcareerbottom() {
		return TUBcareerbottom;
	}

	public WebElement getTUBpressroom() {
		return TUBpressroom;
	}

	public WebElement getTUBinvestorrelation() {
		return TUBinvestorrelation;
	}

	public WebElement getTUBfaq() {
		return TUBfaq;
	}

	public WebElement getTUBprepurchase() {
		return TUBprepurchase;
	}

	public WebElement getTUBshippingoptions() {
		return TUBshippingoptions;
	}

	public WebElement getTUBpaymentoptions() {
		return TUBpaymentoptions;
	}

	public WebElement getTUBrefund() {
		return TUBrefund;
	}

	public WebElement getTUBunsubscribe() {
		return TUBunsubscribe;
	}

	public WebElement getTUBfeedback() {
		return TUBfeedback;
	}

	public WebElement getTUBcontactus() {
		return TUBcontactus;
	}

	public WebElement getTUBbecomASeller() {
		return TUBbecomASeller;
	}

	public WebElement getTUBsellerfaq() {
		return TUBsellerfaq;
	}

	public WebElement getTUBhotdealsstore() {
		return TUBhotdealsstore;
	}

	public WebElement getTUBappdealcategories() {
		return TUBappdealcategories;
	}

	public WebElement getTUBsitemap() {
		return TUBsitemap;
	}

	public WebElement getTUBlivetv() {
		return TUBlivetv;
	}

	public WebElement getTUBapparelsaccessories() {
		return TUBapparelsaccessories;
	}

	public WebElement getTUBfootweartravelbags() {
		return TUBfootweartravelbags;
	}

	public WebElement getTUBmobilephones() {
		return TUBmobilephones;
	}

	public WebElement getTUBcomputersperipherals() {
		return TUBcomputersperipherals;
	}

	public WebElement getTUBhomekitchenappliances() {
		return TUBhomekitchenappliances;
	}

	public WebElement getTUBhomedecor() {
		return TUBhomedecor;
	}

	public WebElement getTUBjewellerywatches() {
		return TUBjewellerywatches;
	}

	public WebElement getTUBautomobiles() {
		return TUBautomobiles;
	}

	public WebElement getTUBconsumerelectronics() {
		return TUBconsumerelectronics;
	}

	public WebElement getTUBtoysnursery() {
		return TUBtoysnursery;
	}

	public WebElement getTUBhealthbeauty() {
		return TUBhealthbeauty;
	}

	public WebElement getTUBsportsfitness() {
		return TUBsportsfitness;
	}

	public WebElement getTUBcategoriesBOTTOM() {
		return TUBcategoriesBOTTOM;
	}

	public WebElement getTUBsearch() {
		return TUBsearch;
	}

	public WebElement getTUBsearchbutton() {
		return TUBsearchbutton;
	}
	
	public WebElement getTUBBUYonline() {
		return TUBBUYonline;
	}

	public WebElement getTUBnotAVAILABLEdisplay() {
		return TUBnotAVAILABLEdisplay;
	}

	public void TUBheader(String PLanguage) throws InterruptedException {
		
		act = new Actions(driver);
		act.moveToElement(TUBcategories).build().perform();
		act.moveToElement(TUBFootwearANDBags).build().perform();
		act.moveToElement(TUBtravelUTILbags).build().perform();
		TUBtravelUTILbags.click();
		TUBLogo.click();
		driver.navigate().back();
		select = new Select(TUBLanguageDROPdown);
		select.selectByVisibleText(PLanguage);
		Thread.sleep(800);
		TUBlogin.click();
		Thread.sleep(800);
		TUBclose.click();
		TUBregister.click();
		Thread.sleep(800);
		TUBclose.click();
		TUBdownloadAPP.click();
		driver.navigate().back();
		TUBbecomASeller.click();
		driver.navigate().back();
		TUBcareertop.click();
		driver.navigate().back();
		TUBhome.click();
		driver.navigate().back();
		TUBfootwareTravelbags.click();
		driver.navigate().back();
		
	}
	
//	public void TUBmiddle(String PTravelAndUtilityBagsURL, String PBuyDISPLAY) {
//		
//		TUBtopIMAGE.click();
//		act.moveToElement(TUBItemQV).build().perform();
//		wait.until(ExpectedConditions.visibilityOfElementLocated((By) TUBquickView)).click();
//		wait.until(ExpectedConditions.visibilityOfElementLocated((By) TUBclose)).click();
//		driver.navigate().to(PTravelAndUtilityBagsURL);
//		TUBItemVideo.click();
//		TUBclose.click();
//		SoftAssert sA = new SoftAssert();
//		String Parent = driver.getWindowHandle();
//		TUBItem1.click();
//		wait.until(ExpectedConditions.numberOfWindowsToBe(2));
//		Set<String> allWindows = driver.getWindowHandles();
//		for (String window : allWindows) {
//		    if (!window.equals(Parent)) {
//		        driver.switchTo().window(window);
//		        break;
//		    }
//		}
//		String Display = TUBBUYonline.getText();
//		sA.assertEquals(Display, PBuyDISPLAY);
//		sA.assertAll();
//		driver.close();
//		driver.switchTo().window(Parent);
//		
//		TUBItem2.click();
//		wait.until(ExpectedConditions.numberOfWindowsToBe(2));
//		Set<String> allWindows1 = driver.getWindowHandles();
//		for (String window : allWindows1) {
//		    if (!window.equals(Parent)) {
//		        driver.switchTo().window(window);
//		        break;
//		    }
//		}
//		String Display1 = TUBBUYonline.getText();
//		sA.assertEquals(Display1, PBuyDISPLAY);
//		sA.assertAll();
//		driver.close();
//		driver.switchTo().window(Parent);
//		
//		TUBItem3.click();
//		wait.until(ExpectedConditions.numberOfWindowsToBe(2));
//		Set<String> allWindows2 = driver.getWindowHandles();
//		for (String window : allWindows2) {
//		    if (!window.equals(Parent)) {
//		        driver.switchTo().window(window);
//		        break;
//		    }
//		}
//		String Display2 = TUBBUYonline.getText();
//		sA.assertEquals(Display2, PBuyDISPLAY);
//		sA.assertAll();
//		driver.close();
//		driver.switchTo().window(Parent);
//		
//		TUBItem4.click();
//		wait.until(ExpectedConditions.numberOfWindowsToBe(2));
//		Set<String> allWindows3 = driver.getWindowHandles();
//		for (String window : allWindows3) {
//		    if (!window.equals(Parent)) {
//		        driver.switchTo().window(window);
//		        break;
//		    }
//		}
//		String Display3 = TUBBUYonline.getText();
//		sA.assertEquals(Display3, PBuyDISPLAY);
//		sA.assertAll();
//		driver.close();
//		driver.switchTo().window(Parent);
//		
//		TUBItem5.click();
//		wait.until(ExpectedConditions.numberOfWindowsToBe(2));
//		Set<String> allWindows4 = driver.getWindowHandles();
//		for (String window : allWindows4) {
//		    if (!window.equals(Parent)) {
//		        driver.switchTo().window(window);
//		        break;
//		    }
//		}
//		String Display4 = TUBBUYonline.getText();
//		sA.assertEquals(Display4, PBuyDISPLAY);
//		sA.assertAll();
//		driver.close();
//		driver.switchTo().window(Parent);
//		
//		TUBItem6.click();
//		wait.until(ExpectedConditions.numberOfWindowsToBe(2));
//		Set<String> allWindows5 = driver.getWindowHandles();
//		for (String window : allWindows5) {
//		    if (!window.equals(Parent)) {
//		        driver.switchTo().window(window);
//		        break;
//		    }
//		}
//		String Display5 = TUBBUYonline.getText();
//		sA.assertEquals(Display5, PBuyDISPLAY);
//		sA.assertAll();
//		driver.close();
//		driver.switchTo().window(Parent);
//		
//	}
	
	public void TUBLeftbar() throws InterruptedException {
		
		Thread.sleep(1000);
		TUBDuffleBagandStrolley.click();
		driver.navigate().back();
		TUBTravelAccessories.click();
		driver.navigate().back();
		TUBBranded.click();
		driver.navigate().back();
		TUBFidato.click();
		driver.navigate().back();
		TUBPreetyCrafts.click();
		driver.navigate().back();
		TUBScottishClub.click();
		driver.navigate().back();
		
	}
	
	public void TUBfooter(String PTravelAndUtilityBagsURL) throws InterruptedException {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to(PTravelAndUtilityBagsURL);
		TUBabout.click();
		driver.navigate().back();
		Thread.sleep(500);
		TUBcareerbottom.click();
		driver.navigate().back();
		Thread.sleep(500);
		TUBpressroom.click();
		driver.navigate().back();
		Thread.sleep(500);
		TUBinvestorrelation.click();
		driver.navigate().back();
		Thread.sleep(500);
		TUBfaq.click();
		driver.navigate().back();
		Thread.sleep(500);
		TUBprepurchase.click();
		driver.navigate().back();
		Thread.sleep(500);
		TUBshippingoptions.click();
		driver.navigate().back();
		Thread.sleep(500);
		TUBrefund.click();
		driver.navigate().back();
		Thread.sleep(500);
		TUBunsubscribe.click();
		driver.navigate().back();
		Thread.sleep(500);
		TUBfeedback.click();
		driver.navigate().back();
		Thread.sleep(500);
		TUBcontactus.click();
		driver.navigate().back();
		Thread.sleep(500);
		TUBbecomASeller.click();
		driver.navigate().back();
		Thread.sleep(500);
		TUBsellerfaq.click();
		driver.navigate().back();
		Thread.sleep(500);
		TUBhotdealsstore.click();
		driver.navigate().back();
		Thread.sleep(500);
		TUBsitemap.click();
		driver.navigate().back();
		Thread.sleep(500);
		TUBlivetv.click();
		driver.navigate().back();
		Thread.sleep(500);
		TUBapparelsaccessories.click();
		driver.navigate().back();
		Thread.sleep(500);
		TUBmobilephones.click();
		driver.navigate().back();
		Thread.sleep(500);
		TUBcomputersperipherals.click();
		driver.navigate().back();
		Thread.sleep(500);
		TUBhomekitchenappliances.click();
		driver.navigate().back();
		Thread.sleep(500);
		TUBhomedecor.click();
		driver.navigate().back();
		Thread.sleep(500);
		TUBjewellerywatches.click();
		driver.navigate().back();
		Thread.sleep(500);
		TUBautomobiles.click();
		driver.navigate().back();
		Thread.sleep(500);
		TUBconsumerelectronics.click();
		driver.navigate().back();
		Thread.sleep(500);
		TUBtoysnursery.click();
		driver.navigate().back();
		Thread.sleep(500);
		TUBhealthbeauty.click();
		driver.navigate().back();
		Thread.sleep(500);
		TUBsportsfitness.click();
		driver.navigate().back();
		Thread.sleep(500);
		TUBcategoriesBOTTOM.click();
		driver.navigate().back();
		
	}
	
}
