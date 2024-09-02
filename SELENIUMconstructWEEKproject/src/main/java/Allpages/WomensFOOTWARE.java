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

public class WomensFOOTWARE {

WebDriver driver;
WebDriverWait wait;
Actions act;
Select select;
JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
	
	public WomensFOOTWARE(WebDriver driver) {
		
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(className = "cate_head")
	private WebElement WFcategories;
	
	@FindBy(xpath = "(//span[@class='catIconMenu footwear'])[1]")
	private WebElement WFFootwearANDBags;
	
	@FindBy(xpath = "(//a[@href='/shop-online/footwear-travel-bags/mens-footwear/footwear-combos.html'])[1]")
	private WebElement WFwomensfootwear;
	
	@FindBy(xpath = "(//img[@title=\"Online Shopping in India\"])[2]")
	private WebElement WFLogo;
	
	@FindBy(id = "localization_dropdown")
	private WebElement WFLanguageDROPdown;
	
	@FindBy(id = "login-panel-link")
	private WebElement WFlogin;
	
	@FindBy(css = "[title='Close']")
	private WebElement WFclose;
	
	@FindBy(id = "registration-panel-link")
	private WebElement WFregister;
	
	@FindBy(xpath = "(//a[@href=\"/mobile-apps.html\"])[1]")
	private WebElement WFdownloadAPP;
	
	@FindBy(xpath = "(//a[@href=\"/faces/jsp/becomeASeller/becomASeller.jsp\"])[1]")
	private WebElement WFbecomeSELLER;
	
	@FindBy(xpath = "(//a[@href=\"/aboutus/career.html\"])[1]")
	private WebElement WFcareertop;
	
	@FindBy(xpath = "(//a[@href='/'])[4]")
	private WebElement WFhome;
	
	@FindBy(xpath = "(//a[@href='/shop-online/footwear-travel-bags.html'])[3]")
	private WebElement WFfootwareTravelbags;
	
	@FindBy(xpath = "(//a[@class='button_1'])[1]")
	private WebElement WFsetButton;
	
	@FindBy(css = "[title=\"Womens Footwear Combos\"]")
	private WebElement WFWomensFootwearCombos;
	
	@FindBy(css = "[title=\"Womens Sandals\"]")
	private WebElement WFWomensSandals;
	
	@FindBy(xpath = "//a[@title='Branded']")
	private WebElement WFBranded;
	
	@FindBy(xpath = "//a[@title='Liberty']")
	private WebElement WFLiberty;
	
	@FindBy(xpath = "//a[@title='Torri']")
	private WebElement WFTorri;
	
	@FindBy(xpath = "//a[@title='FW16']")
	private WebElement WFFW16;
	
	@FindBy(css = "[alt=\"Womens-Footwear\"]")
	private WebElement WFtopIMAGE;
	
	@FindBy(id = "productItem1")
	private WebElement WFItemQV;
	
	@FindBy(xpath = "(//span[text()='Quick View'])[1]")
	private WebElement WFQuickView;
	
	@FindBy(xpath = "(//span[@title=\"Pack of 3 Ladies Sandals (LS3)\"])[1]")
	private WebElement WFItemVideo;
	
	@FindBy(xpath = "(//a[@title=\"Pack of 2 Designer Ladies Sandals + Golden Watch Free (LSW1)\"])[2]")
	private WebElement WFItem1;
	
	@FindBy(xpath = "(//a[@title=\"Pack of 3 Ladies Sandals (LS3)\"])[2]")
	private WebElement WFItem2;
	
	@FindBy(xpath = "(//a[@title=\"Pack of 2 Ladies Sandals And Free Golden Watch (LSW6)\"])[2]")
	private WebElement WFItem3;
	
	@FindBy(xpath = "(//a[@title=\"Pick Any 1 Extra Comfortable Stylish Shoes for Women (WS2)\"])[2]")
	private WebElement WFItem4;
	
	@FindBy(xpath = "(//a[@title=\"Pick Any 1 Light Weight Ladies Sandals + Free Golden Watch (LSW9)\"])[2]")
	private WebElement WFItem5;
	
	@FindBy(xpath = "(//a[@title=\"Pack of 2 Designer Ladies Sandals + Free Sunglasses + Aluminium Wallet (LSW8)\"])[2]")
	private WebElement WFItem6;	
	
	@FindBy(css = "[href=\"/aboutus/about-naaptol.html\"]")
	private WebElement WFabout;
	
	@FindBy(xpath = "(//a[@href=\"/aboutus/career.html\"])[2]")
	private WebElement WFcareerbottom;
	
	@FindBy(css = "[href=\"/aboutus/pressroom.html\"]")
	private WebElement WFpressroom;
	
	@FindBy(css = "[href=\"/aboutus/investor-relation.html\"]")
	private WebElement WFinvestorrelation;
	
	@FindBy(css = "[href=\"/help/faq.html\"]")
	private WebElement WFfaq;
	
	@FindBy(css = "[href=\"/help/pre-purchase.html\"]")
	private WebElement WFprepurchase;
	
	@FindBy(css = "[href=\"/help/shipping-options.html\"]")
	private WebElement WFshippingoptions;
	
	@FindBy(css = "[href=\"/help/payment-options.html\"]")
	private WebElement WFpaymentoptions;
	
	@FindBy(css = "[href=\"https://www.naaptol.com/refund-n-return.html\"]")
	private WebElement WFrefund;
	
	@FindBy(css = "[href=\"/help/unsubscribe.html\"]")
	private WebElement WFunsubscribe;
	
	@FindBy(css = "[href=\"/customer-support/feedback.html\"]")
	private WebElement WFfeedback;
	
	@FindBy(css = "[href=\"/customer-support/contactus.html\"]")
	private WebElement WFcontactus;
	
	@FindBy(xpath = "(//a[@href=\"/faces/jsp/becomeASeller/becomASeller.jsp\"])[2]")
	private WebElement WFbecomASeller;
	
	@FindBy(css = "[href=\"/customer-support/seller-faq.html\"]")
	private WebElement WFsellerfaq;
	
	@FindBy(css = "[href=\"/online-store/hot-deals-store/si-1435-p.html\"]")
	private WebElement WFhotdealsstore;
	
	@FindBy(css = "[href=\"/app-deal-categories.html\"]")
	private WebElement WFappdealcategories;
	
	@FindBy(css = "[href=\"/sitemap.html\"]")
	private WebElement WFsitemap;
	
	@FindBy(css = "[href=\"/live-tv/schedule.html\"]")
	private WebElement WFlivetv;
	
	@FindBy(xpath = "(//a[@href=\"/shop-online/apparels-accessories.html\"])[4]")
	private WebElement WFapparelsaccessories;
	
	@FindBy(xpath = "(//a[@href=\"/shop-online/footwear-travel-bags.html\"])[5]")
	private WebElement WFfootweartravelbags;
	
	@FindBy(xpath = "(//a[@href=\"/shop-online/mobile-phones.html\"])[4]")
	private WebElement WFmobilephones;
	
	@FindBy(xpath = "(//a[@href=\"/shop-online/computers-peripherals.html\"])[4]")
	private WebElement WFcomputersperipherals;
	
	@FindBy(xpath = "(//a[@href=\"/shop-online/home-kitchen-appliances.html\"])[4]")
	private WebElement WFhomekitchenappliances;
	
	@FindBy(xpath = "(//a[@href=\"/shop-online/home-decor.html\"])[4]")
	private WebElement WFhomedecor;
	
	@FindBy(xpath = "(//a[@href=\"/shop-online/jewellery-watches.html\"])[4]")
	private WebElement WFjewellerywatches;
	
	@FindBy(xpath = "(//a[@href=\"/shop-online/automobiles.html\"])[4]")
	private WebElement WFautomobiles;
	
	@FindBy(xpath = "(//a[@href=\"/shop-online/consumer-electronics.html\"])[4]")
	private WebElement WFconsumerelectronics;
	
	@FindBy(xpath = "(//a[@href=\"/shop-online/toys-nursery.html\"])[4]")
	private WebElement WFtoysnursery;
	
	@FindBy(xpath = "(//a[@href=\"/shop-online/health-beauty.html\"])[4]")
	private WebElement WFhealthbeauty;

	@FindBy(xpath = "(//a[@href=\"/shop-online/sports-fitness.html\"])[4]")
	private WebElement WFsportsfitness;
	
	@FindBy(xpath = "(//a[@href=\"/categories.html\"])[4]")
	private WebElement WFcategoriesBOTTOM;
	
	@FindBy(css = "[name=\"header_search_text\"]")
	private WebElement WFsearch;
	
	@FindBy(xpath = "(//div[@class=\"search\"])[2]")
	private WebElement WFsearchbutton;
	
	@FindBy(xpath = "//a[@title=\"Buy online\"]/span")
	private WebElement WFBUYonline;
	
	@FindBy(xpath = "//li[@id=\"productPriceDisplay\"]/span")
	private WebElement WFnotAVAILABLEdisplay;

	public WebElement getWFcategories() {
		return WFcategories;
	}

	public WebElement getWFFootwearANDBags() {
		return WFFootwearANDBags;
	}

	public WebElement getWFfootwearCombos() {
		return WFwomensfootwear;
	}

	public WebElement getWFLogo() {
		return WFLogo;
	}

	public WebElement getWFLanguageDROPdown() {
		return WFLanguageDROPdown;
	}

	public WebElement getWFlogin() {
		return WFlogin;
	}

	public WebElement getWFclose() {
		return WFclose;
	}

	public WebElement getWFregister() {
		return WFregister;
	}

	public WebElement getWFdownloadAPP() {
		return WFdownloadAPP;
	}

	public WebElement getWFbecomeSELLER() {
		return WFbecomeSELLER;
	}

	public WebElement getWFcareertop() {
		return WFcareertop;
	}

	public WebElement getWFhome() {
		return WFhome;
	}

	public WebElement getWFfootwareTravelbags() {
		return WFfootwareTravelbags;
	}

	public WebElement getWFsetButton() {
		return WFsetButton;
	}

	public WebElement getWFWomensFootwearCombos() {
		return WFWomensFootwearCombos;
	}

	public WebElement getWFWomensSandals() {
		return WFWomensSandals;
	}

	public WebElement getWFBranded() {
		return WFBranded;
	}

	public WebElement getWFLiberty() {
		return WFLiberty;
	}

	public WebElement getWFTorri() {
		return WFTorri;
	}

	public WebElement getWFFW16() {
		return WFFW16;
	}

	public WebElement getWFtopIMAGE() {
		return WFtopIMAGE;
	}

	public WebElement getWFItemQV() {
		return WFItemQV;
	}

	public WebElement getWFQuickView() {
		return WFQuickView;
	}

	public WebElement getWFItemVideo() {
		return WFItemVideo;
	}

	public WebElement getWFItem1() {
		return WFItem1;
	}

	public WebElement getWFItem2() {
		return WFItem2;
	}

	public WebElement getWFItem3() {
		return WFItem3;
	}

	public WebElement getWFItem4() {
		return WFItem4;
	}

	public WebElement getWFItem5() {
		return WFItem5;
	}

	public WebElement getWFItem6() {
		return WFItem6;
	}

	public WebElement getWFabout() {
		return WFabout;
	}

	public WebElement getWFcareerbottom() {
		return WFcareerbottom;
	}

	public WebElement getWFpressroom() {
		return WFpressroom;
	}

	public WebElement getWFinvestorrelation() {
		return WFinvestorrelation;
	}

	public WebElement getWFfaq() {
		return WFfaq;
	}

	public WebElement getWFprepurchase() {
		return WFprepurchase;
	}

	public WebElement getWFshippingoptions() {
		return WFshippingoptions;
	}

	public WebElement getWFpaymentoptions() {
		return WFpaymentoptions;
	}

	public WebElement getWFrefund() {
		return WFrefund;
	}

	public WebElement getWFunsubscribe() {
		return WFunsubscribe;
	}

	public WebElement getWFfeedback() {
		return WFfeedback;
	}

	public WebElement getWFcontactus() {
		return WFcontactus;
	}

	public WebElement getWFbecomASeller() {
		return WFbecomASeller;
	}

	public WebElement getWFsellerfaq() {
		return WFsellerfaq;
	}

	public WebElement getWFhotdealsstore() {
		return WFhotdealsstore;
	}

	public WebElement getWFappdealcategories() {
		return WFappdealcategories;
	}

	public WebElement getWFsitemap() {
		return WFsitemap;
	}

	public WebElement getWFlivetv() {
		return WFlivetv;
	}

	public WebElement getWFapparelsaccessories() {
		return WFapparelsaccessories;
	}

	public WebElement getWFfootweartravelbags() {
		return WFfootweartravelbags;
	}

	public WebElement getWFmobilephones() {
		return WFmobilephones;
	}

	public WebElement getWFcomputersperipherals() {
		return WFcomputersperipherals;
	}

	public WebElement getWFhomekitchenappliances() {
		return WFhomekitchenappliances;
	}

	public WebElement getWFhomedecor() {
		return WFhomedecor;
	}

	public WebElement getWFjewellerywatches() {
		return WFjewellerywatches;
	}

	public WebElement getWFautomobiles() {
		return WFautomobiles;
	}

	public WebElement getWFconsumerelectronics() {
		return WFconsumerelectronics;
	}

	public WebElement getWFtoysnursery() {
		return WFtoysnursery;
	}

	public WebElement getWFhealthbeauty() {
		return WFhealthbeauty;
	}

	public WebElement getWFsportsfitness() {
		return WFsportsfitness;
	}

	public WebElement getWFcategoriesBOTTOM() {
		return WFcategoriesBOTTOM;
	}

	public WebElement getWFsearch() {
		return WFsearch;
	}

	public WebElement getWFsearchbutton() {
		return WFsearchbutton;
	}
	
	public WebElement getWFBUYonline() {
		return WFBUYonline;
	}

	public WebElement getWFnotAVAILABLEdisplay() {
		return WFnotAVAILABLEdisplay;
	}

	public void WFheader(String PLanguage) throws InterruptedException {
		
		act = new Actions(driver);
		act.moveToElement(WFcategories).build().perform();
		act.moveToElement(WFFootwearANDBags).build().perform();
		act.moveToElement(WFwomensfootwear).build().perform();
		WFwomensfootwear.click();
		WFLogo.click();
		driver.navigate().back();
		select = new Select(WFLanguageDROPdown);
		select.selectByVisibleText(PLanguage);
		Thread.sleep(800);
		WFlogin.click();
		Thread.sleep(800);
		WFclose.click();
		WFregister.click();
		Thread.sleep(800);
		WFclose.click();
		WFdownloadAPP.click();
		driver.navigate().back();
		WFbecomASeller.click();
		driver.navigate().back();
		WFcareertop.click();
		driver.navigate().back();
		WFhome.click();
		driver.navigate().back();
		WFfootwareTravelbags.click();
		driver.navigate().back();
		
	}
	
//	public void WFmiddle(String PWomensFootwearUR, String PNotDISPLAY) {
//		
//		WFtopIMAGE.click();
//		act.moveToElement(WFItemQV).build().perform();
//		wait.until(ExpectedConditions.visibilityOfElementLocated((By) WFQuickView)).click();
//		wait.until(ExpectedConditions.visibilityOfElementLocated((By) WFclose)).click();
//		driver.navigate().to(PWomensFootwearUR);
//		WFItemVideo.click();
//		WFclose.click();
//		
//		SoftAssert sA = new SoftAssert();
//		String Parent = driver.getWindowHandle();
//		WFItem1.click();
//		wait.until(ExpectedConditions.numberOfWindowsToBe(2));
//		Set<String> allWindows = driver.getWindowHandles();
//		for (String window : allWindows) {
//		    if (!window.equals(Parent)) {
//		        driver.switchTo().window(window);
//		        break;
//		    }
//		}
//		String Display = WFnotAVAILABLEdisplay.getText();
//		sA.assertEquals(Display, PNotDISPLAY);
//		sA.assertAll();
//		driver.close();
//		driver.switchTo().window(Parent);
//		
//		WFItem2.click();
//		wait.until(ExpectedConditions.numberOfWindowsToBe(2));
//		Set<String> allWindows1 = driver.getWindowHandles();
//		for (String window : allWindows1) {
//		    if (!window.equals(Parent)) {
//		        driver.switchTo().window(window);
//		        break;
//		    }
//		}
//		String Display1 = WFnotAVAILABLEdisplay.getText();
//		sA.assertEquals(Display1, PNotDISPLAY);
//		sA.assertAll();
//		driver.close();
//		driver.switchTo().window(Parent);
//		
//		WFItem3.click();
//		wait.until(ExpectedConditions.numberOfWindowsToBe(2));
//		Set<String> allWindows2 = driver.getWindowHandles();
//		for (String window : allWindows2) {
//		    if (!window.equals(Parent)) {
//		        driver.switchTo().window(window);
//		        break;
//		    }
//		}
//		String Display2 = WFnotAVAILABLEdisplay.getText();
//		sA.assertEquals(Display2, PNotDISPLAY);
//		sA.assertAll();
//		driver.close();
//		driver.switchTo().window(Parent);
//		
//		WFItem4.click();
//		wait.until(ExpectedConditions.numberOfWindowsToBe(2));
//		Set<String> allWindows3 = driver.getWindowHandles();
//		for (String window : allWindows3) {
//		    if (!window.equals(Parent)) {
//		        driver.switchTo().window(window);
//		        break;
//		    }
//		}
//		String Display3 = WFnotAVAILABLEdisplay.getText();
//		sA.assertEquals(Display3, PNotDISPLAY);
//		sA.assertAll();
//		driver.close();
//		driver.switchTo().window(Parent);
//		
//		WFItem5.click();
//		wait.until(ExpectedConditions.numberOfWindowsToBe(2));
//		Set<String> allWindows4 = driver.getWindowHandles();
//		for (String window : allWindows4) {
//		    if (!window.equals(Parent)) {
//		        driver.switchTo().window(window);
//		        break;
//		    }
//		}
//		String Display4 = WFnotAVAILABLEdisplay.getText();
//		sA.assertEquals(Display4, PNotDISPLAY);
//		sA.assertAll();
//		driver.close();
//		driver.switchTo().window(Parent);
//		
//		WFItem6.click();
//		wait.until(ExpectedConditions.numberOfWindowsToBe(2));
//		Set<String> allWindows5 = driver.getWindowHandles();
//		for (String window : allWindows5) {
//		    if (!window.equals(Parent)) {
//		        driver.switchTo().window(window);
//		        break;
//		    }
//		}
//		String Display5 = WFnotAVAILABLEdisplay.getText();
//		sA.assertEquals(Display5, PNotDISPLAY);
//		sA.assertAll();
//		driver.close();
//		driver.switchTo().window(Parent);
//		
//	}
	
	public void WFLeftbar(String PWomensFootwearURL) throws InterruptedException {
		
		driver.navigate().to(PWomensFootwearURL);
		Thread.sleep(1000);
		WFWomensFootwearCombos.click();
		driver.navigate().back();
		WFWomensSandals.click();
		driver.navigate().back();
		WFBranded.click();
		driver.navigate().back();
		WFLiberty.click();
		driver.navigate().back();
		WFTorri.click();
		driver.navigate().back();
		WFFW16.click();
		driver.navigate().back();
		
	}
	
	public void WFfooter(String PWomensFootwearURL) throws InterruptedException {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to(PWomensFootwearURL);
		WFabout.click();
		driver.navigate().back();
		Thread.sleep(500);
		WFcareerbottom.click();
		driver.navigate().back();
		Thread.sleep(500);
		WFpressroom.click();
		driver.navigate().back();
		Thread.sleep(500);
		WFinvestorrelation.click();
		driver.navigate().back();
		Thread.sleep(500);
		WFfaq.click();
		driver.navigate().back();
		Thread.sleep(500);
		WFprepurchase.click();
		driver.navigate().back();
		Thread.sleep(500);
		WFshippingoptions.click();
		driver.navigate().back();
		Thread.sleep(500);
		WFrefund.click();
		driver.navigate().back();
		Thread.sleep(500);
		WFunsubscribe.click();
		driver.navigate().back();
		Thread.sleep(500);
		WFfeedback.click();
		driver.navigate().back();
		Thread.sleep(500);
		WFcontactus.click();
		driver.navigate().back();
		Thread.sleep(500);
		WFbecomASeller.click();
		driver.navigate().back();
		Thread.sleep(500);
		WFsellerfaq.click();
		driver.navigate().back();
		Thread.sleep(500);
		WFhotdealsstore.click();
		driver.navigate().back();
		Thread.sleep(500);
		WFsitemap.click();
		driver.navigate().back();
		Thread.sleep(500);
		WFlivetv.click();
		driver.navigate().back();
		Thread.sleep(500);
		WFapparelsaccessories.click();
		driver.navigate().back();
		Thread.sleep(500);
		WFmobilephones.click();
		driver.navigate().back();
		Thread.sleep(500);
		WFcomputersperipherals.click();
		driver.navigate().back();
		Thread.sleep(500);
		WFhomekitchenappliances.click();
		driver.navigate().back();
		Thread.sleep(500);
		WFhomedecor.click();
		driver.navigate().back();
		Thread.sleep(500);
		WFjewellerywatches.click();
		driver.navigate().back();
		Thread.sleep(500);
		WFautomobiles.click();
		driver.navigate().back();
		Thread.sleep(500);
		WFconsumerelectronics.click();
		driver.navigate().back();
		Thread.sleep(500);
		WFtoysnursery.click();
		driver.navigate().back();
		Thread.sleep(500);
		WFhealthbeauty.click();
		driver.navigate().back();
		Thread.sleep(500);
		WFsportsfitness.click();
		driver.navigate().back();
		Thread.sleep(500);
		WFcategoriesBOTTOM.click();
		driver.navigate().back();
		
	}
	
}
