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

public class WomensSANDELS {

WebDriver driver;
WebDriverWait wait;
Actions act;
Select select;
JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
	
	public WomensSANDELS(WebDriver driver) {
		
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(className = "cate_head")
	private WebElement WScategories;
	
	@FindBy(xpath = "(//span[@class='catIconMenu footwear'])[1]")
	private WebElement WSFootwearANDBags;
	
	@FindBy(xpath = "(//a[@href=\"/shop-online/footwear-travel-bags/womens-footwear/womens-sandals.html\"])[1]")
	private WebElement WSwomenssandels;
	
	@FindBy(xpath = "(//img[@title=\"Online Shopping in India\"])[2]")
	private WebElement WSLogo;
	
	@FindBy(id = "localization_dropdown")
	private WebElement WSLanguageDROPdown;
	
	@FindBy(id = "login-panel-link")
	private WebElement WSlogin;
	
	@FindBy(css = "[title='Close']")
	private WebElement WSclose;
	
	@FindBy(id = "registration-panel-link")
	private WebElement WSregister;
	
	@FindBy(xpath = "(//a[@href=\"/mobile-apps.html\"])[1]")
	private WebElement WSdownloadAPP;
	
	@FindBy(xpath = "(//a[@href=\"/faces/jsp/becomeASeller/becomASeller.jsp\"])[1]")
	private WebElement WSbecomeSELLER;
	
	@FindBy(xpath = "(//a[@href=\"/aboutus/career.html\"])[1]")
	private WebElement WScareertop;
	
	@FindBy(xpath = "(//a[@href='/'])[4]")
	private WebElement WShome;
	
	@FindBy(xpath = "(//a[@href='/shop-online/footwear-travel-bags.html'])[3]")
	private WebElement WSfootwareTravelbags;
	
	@FindBy(xpath = "(//a[@class='button_1'])[1]")
	private WebElement WSsetButton;
	
	@FindBy(xpath = "(//a[@title=\"Women Comfortable Sandal - Buy 1 Get 1 Free (WS3)\"])[2]")
	private WebElement WSItem1;
	
	@FindBy(xpath = "(//a[@title=\"5 Pairs of Ladies Comfort Footwear\"])[2]")
	private WebElement WSItem2;
	
	@FindBy(id = "priceFilterBox2")
	private WebElement WSprice1;
	
	@FindBy(id = "priceFilterBox1")
	private WebElement WSprice2;
	
	@FindBy(xpath = "//a[@title=\"Buy online\"]/span")
	private WebElement WSBuyonlineDISPLAY;
	
	@FindBy(xpath = "//li[@id=\"productPriceDisplay\"]/span")
	private WebElement WSnotAVAILABLEdisplay;
	
	@FindBy(id = "iscod")
	private WebElement WSCOD;
	
	@FindBy(id = "isexoutStock")
	private WebElement WSoutSTOCK;
	
	@FindBy(id = "isexoutStock")
	private WebElement WSfreespipping;
	
	@FindBy(css = "[onclick=\"productSearch.setPersonalisedFilter(false);\"]")
	private WebElement WSSetBUTTON;
	
	@FindBy(id = "brandFilterBox38692")
	private WebElement WSbrand1;
	
	@FindBy(id = "brandFilterBox8313")
	private WebElement WSbrand2;
	
	@FindBy(id = "fromPriceRange")
	private WebElement WSfromPRICE;
	
	@FindBy(id = "toPriceRange")
	private WebElement WStoPRICE;
	
	@FindBy(xpath = "(//a[@class=\"button_1\"])[2]")
	private WebElement WSgoBUTTON;
	
	@FindBy(id = "discountFilterBox1")
	private WebElement WSdiscount1;
	
	@FindBy(id = "discountFilterBox2")
	private WebElement WSdiscount2;
	
	@FindBy(id = "sortByFilter")
	private WebElement WSsortBY;	
	
	@FindBy(css = "[href=\"/aboutus/about-naaptol.html\"]")
	private WebElement WSabout;
	
	@FindBy(xpath = "(//a[@href=\"/aboutus/career.html\"])[2]")
	private WebElement WScareerbottom;
	
	@FindBy(css = "[href=\"/aboutus/pressroom.html\"]")
	private WebElement WSpressroom;
	
	@FindBy(css = "[href=\"/aboutus/investor-relation.html\"]")
	private WebElement WSinvestorrelation;
	
	@FindBy(css = "[href=\"/help/faq.html\"]")
	private WebElement WSfaq;
	
	@FindBy(css = "[href=\"/help/pre-purchase.html\"]")
	private WebElement WSprepurchase;
	
	@FindBy(css = "[href=\"/help/shipping-options.html\"]")
	private WebElement WSshippingoptions;
	
	@FindBy(css = "[href=\"/help/payment-options.html\"]")
	private WebElement WSpaymentoptions;
	
	@FindBy(css = "[href=\"https://www.naaptol.com/refund-n-return.html\"]")
	private WebElement WSrefund;
	
	@FindBy(css = "[href=\"/help/unsubscribe.html\"]")
	private WebElement WSunsubscribe;
	
	@FindBy(css = "[href=\"/customer-support/feedback.html\"]")
	private WebElement WSfeedback;
	
	@FindBy(css = "[href=\"/customer-support/contactus.html\"]")
	private WebElement WScontactus;
	
	@FindBy(xpath = "(//a[@href=\"/faces/jsp/becomeASeller/becomASeller.jsp\"])[2]")
	private WebElement WSbecomASeller;
	
	@FindBy(css = "[href=\"/customer-support/seller-faq.html\"]")
	private WebElement WSsellerfaq;
	
	@FindBy(css = "[href=\"/online-store/hot-deals-store/si-1435-p.html\"]")
	private WebElement WShotdealsstore;
	
	@FindBy(css = "[href=\"/app-deal-categories.html\"]")
	private WebElement WSappdealcategories;
	
	@FindBy(css = "[href=\"/sitemap.html\"]")
	private WebElement WSsitemap;
	
	@FindBy(css = "[href=\"/live-tv/schedule.html\"]")
	private WebElement WSlivetv;
	
	@FindBy(xpath = "(//a[@href=\"/shop-online/apparels-accessories.html\"])[4]")
	private WebElement WSapparelsaccessories;
	
	@FindBy(xpath = "(//a[@href=\"/shop-online/footwear-travel-bags.html\"])[5]")
	private WebElement WSfootweartravelbags;
	
	@FindBy(xpath = "(//a[@href=\"/shop-online/mobile-phones.html\"])[4]")
	private WebElement WSmobilephones;
	
	@FindBy(xpath = "(//a[@href=\"/shop-online/computers-peripherals.html\"])[4]")
	private WebElement WScomputersperipherals;
	
	@FindBy(xpath = "(//a[@href=\"/shop-online/home-kitchen-appliances.html\"])[4]")
	private WebElement WShomekitchenappliances;
	
	@FindBy(xpath = "(//a[@href=\"/shop-online/home-decor.html\"])[4]")
	private WebElement WShomedecor;
	
	@FindBy(xpath = "(//a[@href=\"/shop-online/jewellery-watches.html\"])[4]")
	private WebElement WSjewellerywatches;
	
	@FindBy(xpath = "(//a[@href=\"/shop-online/automobiles.html\"])[4]")
	private WebElement WSautomobiles;
	
	@FindBy(xpath = "(//a[@href=\"/shop-online/consumer-electronics.html\"])[4]")
	private WebElement WSconsumerelectronics;
	
	@FindBy(xpath = "(//a[@href=\"/shop-online/toys-nursery.html\"])[4]")
	private WebElement WStoysnursery;
	
	@FindBy(xpath = "(//a[@href=\"/shop-online/health-beauty.html\"])[4]")
	private WebElement WShealthbeauty;

	@FindBy(xpath = "(//a[@href=\"/shop-online/sports-fitness.html\"])[4]")
	private WebElement WSsportsfitness;
	
	@FindBy(xpath = "(//a[@href=\"/categories.html\"])[4]")
	private WebElement WScategoriesBOTTOM;
	
	@FindBy(css = "[name=\"header_search_text\"]")
	private WebElement WSsearch;
	
	@FindBy(xpath = "(//div[@class=\"search\"])[2]")
	private WebElement WSsearchbutton;
	
	@FindBy(xpath = "//a[@title=\"Buy online\"]/span")
	private WebElement WSBUYonline;

	public WebElement getWScategories() {
		return WScategories;
	}

	public WebElement getWSFootwearANDBags() {
		return WSFootwearANDBags;
	}

	public WebElement getWSwomenssandels() {
		return WSwomenssandels;
	}

	public WebElement getWSLogo() {
		return WSLogo;
	}

	public WebElement getWSLanguageDROPdown() {
		return WSLanguageDROPdown;
	}

	public WebElement getWSlogin() {
		return WSlogin;
	}

	public WebElement getWSclose() {
		return WSclose;
	}

	public WebElement getWSregister() {
		return WSregister;
	}

	public WebElement getWSdownloadAPP() {
		return WSdownloadAPP;
	}

	public WebElement getWSbecomeSELLER() {
		return WSbecomeSELLER;
	}

	public WebElement getWScareertop() {
		return WScareertop;
	}

	public WebElement getWShome() {
		return WShome;
	}

	public WebElement getWSfootwareTravelbags() {
		return WSfootwareTravelbags;
	}

	public WebElement getWSsetButton() {
		return WSsetButton;
	}

	public WebElement getWSItem1() {
		return WSItem1;
	}

	public WebElement getWSItem2() {
		return WSItem2;
	}
	
	public WebElement getWSprice1() {
		return WSprice1;
	}

	public WebElement getWSprice2() {
		return WSprice2;
	}

	public WebElement getWSBuyonlineDISPLAY() {
		return WSBuyonlineDISPLAY;
	}

	public WebElement getWSnotAVAILABLEdisplay() {
		return WSnotAVAILABLEdisplay;
	}

	public WebElement getWSCOD() {
		return WSCOD;
	}

	public WebElement getWSoutSTOCK() {
		return WSoutSTOCK;
	}

	public WebElement getWSfreespipping() {
		return WSfreespipping;
	}

	public WebElement getWSSetBUTTON() {
		return WSSetBUTTON;
	}

	public WebElement getWSbrand1() {
		return WSbrand1;
	}

	public WebElement getWSbrand2() {
		return WSbrand2;
	}

	public WebElement getWSfromPRICE() {
		return WSfromPRICE;
	}

	public WebElement getWStoPRICE() {
		return WStoPRICE;
	}

	public WebElement getWSgoBUTTON() {
		return WSgoBUTTON;
	}

	public WebElement getWSdiscount1() {
		return WSdiscount1;
	}

	public WebElement getWSdiscount2() {
		return WSdiscount2;
	}

	public WebElement getWSsortBY() {
		return WSsortBY;
	}

	public WebElement getWSabout() {
		return WSabout;
	}

	public WebElement getWScareerbottom() {
		return WScareerbottom;
	}

	public WebElement getWSpressroom() {
		return WSpressroom;
	}

	public WebElement getWSinvestorrelation() {
		return WSinvestorrelation;
	}

	public WebElement getWSfaq() {
		return WSfaq;
	}

	public WebElement getWSprepurchase() {
		return WSprepurchase;
	}

	public WebElement getWSshippingoptions() {
		return WSshippingoptions;
	}

	public WebElement getWSpaymentoptions() {
		return WSpaymentoptions;
	}

	public WebElement getWSrefund() {
		return WSrefund;
	}

	public WebElement getWSunsubscribe() {
		return WSunsubscribe;
	}

	public WebElement getWSfeedback() {
		return WSfeedback;
	}

	public WebElement getWScontactus() {
		return WScontactus;
	}

	public WebElement getWSbecomASeller() {
		return WSbecomASeller;
	}

	public WebElement getWSsellerfaq() {
		return WSsellerfaq;
	}

	public WebElement getWShotdealsstore() {
		return WShotdealsstore;
	}

	public WebElement getWSappdealcategories() {
		return WSappdealcategories;
	}

	public WebElement getWSsitemap() {
		return WSsitemap;
	}

	public WebElement getWSlivetv() {
		return WSlivetv;
	}

	public WebElement getWSapparelsaccessories() {
		return WSapparelsaccessories;
	}

	public WebElement getWSfootweartravelbags() {
		return WSfootweartravelbags;
	}

	public WebElement getWSmobilephones() {
		return WSmobilephones;
	}

	public WebElement getWScomputersperipherals() {
		return WScomputersperipherals;
	}

	public WebElement getWShomekitchenappliances() {
		return WShomekitchenappliances;
	}

	public WebElement getWShomedecor() {
		return WShomedecor;
	}

	public WebElement getWSjewellerywatches() {
		return WSjewellerywatches;
	}

	public WebElement getWSautomobiles() {
		return WSautomobiles;
	}

	public WebElement getWSconsumerelectronics() {
		return WSconsumerelectronics;
	}

	public WebElement getWStoysnursery() {
		return WStoysnursery;
	}

	public WebElement getWShealthbeauty() {
		return WShealthbeauty;
	}

	public WebElement getWSsportsfitness() {
		return WSsportsfitness;
	}

	public WebElement getWScategoriesBOTTOM() {
		return WScategoriesBOTTOM;
	}

	public WebElement getWSsearch() {
		return WSsearch;
	}

	public WebElement getWSsearchbutton() {
		return WSsearchbutton;
	}
	
	public WebElement getWSBUYonline() {
		return WSBUYonline;
	}

	public void WSheader(String PLanguage) throws InterruptedException {
		
		act = new Actions(driver);
		act.moveToElement(WScategories).build().perform();
		act.moveToElement(WSFootwearANDBags).build().perform();
		act.moveToElement(WSwomenssandels).build().perform();
		WSwomenssandels.click();
		WSLogo.click();
		driver.navigate().back();
		select = new Select(WSLanguageDROPdown);
		select.selectByVisibleText(PLanguage);
		Thread.sleep(800);
		WSlogin.click();
		Thread.sleep(800);
		WSclose.click();
		WSregister.click();
		Thread.sleep(800);
		WSclose.click();
		WSdownloadAPP.click();
		driver.navigate().back();
		WSbecomASeller.click();
		driver.navigate().back();
		WScareertop.click();
		driver.navigate().back();
		WShome.click();
		driver.navigate().back();
		WSfootwareTravelbags.click();
		driver.navigate().back();
		
		WSoutSTOCK.click();
		WSSetBUTTON.click();
		
	}
	
//	public void WSmiddle(String PBuyDISPLAY, String PNotDISPLAY, String PWomensSandalsSearch, String Psort1, String Psort2, String Psort3, String Psort4, String Psort5, String Psort6) {
//		
//		SoftAssert sA = new SoftAssert();
//		String Parent = driver.getWindowHandle();
//		WSItem1.click();
//		wait.until(ExpectedConditions.numberOfWindowsToBe(2));
//		Set<String> allWindows = driver.getWindowHandles();
//		for (String window : allWindows) {
//		    if (!window.equals(Parent)) {
//		        driver.switchTo().window(window);
//		        break;
//		    }
//		}
//		String Display = WSBUYonline.getText();
//		sA.assertEquals(Display, PBuyDISPLAY);
//		sA.assertAll();
//		driver.close();
//		driver.switchTo().window(Parent);
//		
//		WSItem2.click();
//		wait.until(ExpectedConditions.numberOfWindowsToBe(2));
//		Set<String> allWindows1 = driver.getWindowHandles();
//		for (String window : allWindows1) {
//		    if (!window.equals(Parent)) {
//		        driver.switchTo().window(window);
//		        break;
//		    }
//		}
//		String Display1 = WSnotAVAILABLEdisplay.getText();
//		sA.assertEquals(Display1, PNotDISPLAY);
//		sA.assertAll();
//		driver.close();
//		driver.switchTo().window(Parent);
//		
//		select = new Select(WSsortBY);
//		select.selectByVisibleText(Psort1);
//		select.selectByVisibleText(Psort2);
//		select.selectByVisibleText(Psort3);
//		select.selectByVisibleText(Psort4);
//		select.selectByVisibleText(Psort5);
//		select.selectByVisibleText(Psort6);
//		
//		WSsearch.sendKeys(PWomensSandalsSearch);
//		WSsearchbutton.click();
//		
//	}
	
	public void WSLeftbar(String PToPrice, String PFromPrice) throws InterruptedException {
		
		WSCOD.click();
		WSSetBUTTON.click();
		WSCOD.click();
		WSoutSTOCK.click();
		WSSetBUTTON.click();
		WSoutSTOCK.click();
		WSfreespipping.click();
		WSSetBUTTON.click();
		WSfreespipping.click();
		WSSetBUTTON.click();
		Thread.sleep(800);
		WSbrand1.click();
		Thread.sleep(800);
		WSbrand2.click();
		Thread.sleep(800);
		WSprice1.click();
		Thread.sleep(800);
		WSprice2.click();
		Thread.sleep(800);
		WSbrand1.click();
		Thread.sleep(800);
		WSbrand2.click();
		Thread.sleep(800);
		WSprice1.click();
		Thread.sleep(800);
		WSprice2.click();
		Thread.sleep(800);
		
		WSdiscount1.click();
		Thread.sleep(800);
		WSdiscount2.click();
		Thread.sleep(800);
		WSdiscount1.click();
		Thread.sleep(800);
		WSdiscount2.click();
		Thread.sleep(800);
		
		WSfromPRICE.sendKeys(PFromPrice);
		WStoPRICE.sendKeys(PToPrice);
		WSgoBUTTON.click();
		
	}
	
	public void WSfooter(String PWomensSandalsURL) throws InterruptedException {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to(PWomensSandalsURL);
		WSabout.click();
		driver.navigate().back();
		Thread.sleep(500);
		WScareerbottom.click();
		driver.navigate().back();
		Thread.sleep(500);
		WSpressroom.click();
		driver.navigate().back();
		Thread.sleep(500);
		WSinvestorrelation.click();
		driver.navigate().back();
		Thread.sleep(500);
		WSfaq.click();
		driver.navigate().back();
		Thread.sleep(500);
		WSprepurchase.click();
		driver.navigate().back();
		Thread.sleep(500);
		WSshippingoptions.click();
		driver.navigate().back();
		Thread.sleep(500);
		WSrefund.click();
		driver.navigate().back();
		Thread.sleep(500);
		WSunsubscribe.click();
		driver.navigate().back();
		Thread.sleep(500);
		WSfeedback.click();
		driver.navigate().back();
		Thread.sleep(500);
		WScontactus.click();
		driver.navigate().back();
		Thread.sleep(500);
		WSbecomASeller.click();
		driver.navigate().back();
		Thread.sleep(500);
		WSsellerfaq.click();
		driver.navigate().back();
		Thread.sleep(500);
		WShotdealsstore.click();
		driver.navigate().back();
		Thread.sleep(500);
		WSsitemap.click();
		driver.navigate().back();
		Thread.sleep(500);
		WSlivetv.click();
		driver.navigate().back();
		Thread.sleep(500);
		WSapparelsaccessories.click();
		driver.navigate().back();
		Thread.sleep(500);
		WSmobilephones.click();
		driver.navigate().back();
		Thread.sleep(500);
		WScomputersperipherals.click();
		driver.navigate().back();
		Thread.sleep(500);
		WShomekitchenappliances.click();
		driver.navigate().back();
		Thread.sleep(500);
		WShomedecor.click();
		driver.navigate().back();
		Thread.sleep(500);
		WSjewellerywatches.click();
		driver.navigate().back();
		Thread.sleep(500);
		WSautomobiles.click();
		driver.navigate().back();
		Thread.sleep(500);
		WSconsumerelectronics.click();
		driver.navigate().back();
		Thread.sleep(500);
		WStoysnursery.click();
		driver.navigate().back();
		Thread.sleep(500);
		WShealthbeauty.click();
		driver.navigate().back();
		Thread.sleep(500);
		WSsportsfitness.click();
		driver.navigate().back();
		Thread.sleep(500);
		WScategoriesBOTTOM.click();
		driver.navigate().back();
		
	}
	
}
