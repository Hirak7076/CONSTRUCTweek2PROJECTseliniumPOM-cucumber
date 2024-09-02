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

public class WomensFATIONbags {

WebDriver driver;
WebDriverWait wait;
Actions act;
Select select;
JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
	
	public WomensFATIONbags(WebDriver driver) {
		
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(className = "cate_head")
	private WebElement WFBcategories;
	
	@FindBy(xpath = "(//span[@class='catIconMenu footwear'])[1]")
	private WebElement WFBFootwearANDBags;
	
	@FindBy(xpath = "(//a[@href='/shop-online/footwear-travel-bags/bags.html'])[1]")
	private WebElement WFBfootwareTRAVELbags;
	
	@FindBy(xpath = "(//img[@title=\"Online Shopping in India\"])[2]")
	private WebElement WFBLogo;
	
	@FindBy(id = "localization_dropdown")
	private WebElement WFBLanguageDROPdown;
	
	@FindBy(id = "login-panel-link")
	private WebElement WFBlogin;
	
	@FindBy(css = "[title='Close']")
	private WebElement WFBclose;
	
	@FindBy(id = "registration-panel-link")
	private WebElement WFBregister;
	
	@FindBy(xpath = "(//a[@href=\"/mobile-apps.html\"])[1]")
	private WebElement WFBdownloadAPP;
	
	@FindBy(xpath = "(//a[@href=\"/faces/jsp/becomeASeller/becomASeller.jsp\"])[1]")
	private WebElement WFBbecomeSELLER;
	
	@FindBy(xpath = "(//a[@href=\"/aboutus/career.html\"])[1]")
	private WebElement WFBcareertop;
	
	@FindBy(xpath = "(//a[@href='/'])[4]")
	private WebElement WFBhome;
	
	@FindBy(xpath = "(//a[@href='/shop-online/footwear-travel-bags.html'])[3]")
	private WebElement WFBfootwareTravelbags;
	
	@FindBy(css = "[title='Close']")
	private WebElement WFBHandbagAndClutches;
	
	@FindBy(xpath = "//a[@title='Branded']")
	private WebElement WFBBranded;
	
	@FindBy(xpath = "//a[@title=\"Mammon\"]")
	private WebElement WFBMammon;
	
	@FindBy(xpath = "//a[@title=\"Scottish Club\"]")
	private WebElement WFBScottishClub;
	
	@FindBy(css = "[alt=\"Women-Fashion-Bags\"]")
	private WebElement WFBtopIMAGE;
	
	@FindBy(id = "productItem1")
	private WebElement WFBItemQV;
	
	@FindBy(xpath = "(//span[text()='Quick View'])[1]")
	private WebElement WFBQuickView;
	
	@FindBy(xpath = "(//a[@title=\"Women Makeup Travel Organizer\"])[2]")
	private WebElement WFBItem;
	
	@FindBy(xpath = "//a[@title=\"Buy online\"]/span")
	private WebElement WFBBuyonlineDISPLAY;	
	
	@FindBy(css = "[href=\"/aboutus/about-naaptol.html\"]")
	private WebElement WFBabout;
	
	@FindBy(xpath = "(//a[@href=\"/aboutus/career.html\"])[2]")
	private WebElement WFBcareerbottom;
	
	@FindBy(css = "[href=\"/aboutus/pressroom.html\"]")
	private WebElement WFBpressroom;
	
	@FindBy(css = "[href=\"/aboutus/investor-relation.html\"]")
	private WebElement WFBinvestorrelation;
	
	@FindBy(css = "[href=\"/help/faq.html\"]")
	private WebElement WFBfaq;
	
	@FindBy(css = "[href=\"/help/pre-purchase.html\"]")
	private WebElement WFBprepurchase;
	
	@FindBy(css = "[href=\"/help/shipping-options.html\"]")
	private WebElement WFBshippingoptions;
	
	@FindBy(css = "[href=\"/help/payment-options.html\"]")
	private WebElement WFBpaymentoptions;
	
	@FindBy(css = "[href=\"https://www.naaptol.com/refund-n-return.html\"]")
	private WebElement WFBrefund;
	
	@FindBy(css = "[href=\"/help/unsubscribe.html\"]")
	private WebElement WFBunsubscribe;
	
	@FindBy(css = "[href=\"/customer-support/feedback.html\"]")
	private WebElement WFBfeedback;
	
	@FindBy(css = "[href=\"/customer-support/contactus.html\"]")
	private WebElement WFBcontactus;
	
	@FindBy(xpath = "(//a[@href=\"/faces/jsp/becomeASeller/becomASeller.jsp\"])[2]")
	private WebElement WFBbecomASeller;
	
	@FindBy(css = "[href=\"/customer-support/seller-faq.html\"]")
	private WebElement WFBsellerfaq;
	
	@FindBy(css = "[href=\"/online-store/hot-deals-store/si-1435-p.html\"]")
	private WebElement WFBhotdealsstore;
	
	@FindBy(css = "[href=\"/app-deal-categories.html\"]")
	private WebElement WFBappdealcategories;
	
	@FindBy(css = "[href=\"/sitemap.html\"]")
	private WebElement WFBsitemap;
	
	@FindBy(css = "[href=\"/live-tv/schedule.html\"]")
	private WebElement WFBlivetv;
	
	@FindBy(xpath = "(//a[@href=\"/shop-online/apparels-accessories.html\"])[4]")
	private WebElement WFBapparelsaccessories;
	
	@FindBy(xpath = "(//a[@href=\"/shop-online/footwear-travel-bags.html\"])[5]")
	private WebElement WFBfootweartravelbags;
	
	@FindBy(xpath = "(//a[@href=\"/shop-online/mobile-phones.html\"])[4]")
	private WebElement WFBmobilephones;
	
	@FindBy(xpath = "(//a[@href=\"/shop-online/computers-peripherals.html\"])[4]")
	private WebElement WFBcomputersperipherals;
	
	@FindBy(xpath = "(//a[@href=\"/shop-online/home-kitchen-appliances.html\"])[4]")
	private WebElement WFBhomekitchenappliances;
	
	@FindBy(xpath = "(//a[@href=\"/shop-online/home-decor.html\"])[4]")
	private WebElement WFBhomedecor;
	
	@FindBy(xpath = "(//a[@href=\"/shop-online/jewellery-watches.html\"])[4]")
	private WebElement WFBjewellerywatches;
	
	@FindBy(xpath = "(//a[@href=\"/shop-online/automobiles.html\"])[4]")
	private WebElement WFBautomobiles;
	
	@FindBy(xpath = "(//a[@href=\"/shop-online/consumer-electronics.html\"])[4]")
	private WebElement WFBconsumerelectronics;
	
	@FindBy(xpath = "(//a[@href=\"/shop-online/toys-nursery.html\"])[4]")
	private WebElement WFBtoysnursery;
	
	@FindBy(xpath = "(//a[@href=\"/shop-online/health-beauty.html\"])[4]")
	private WebElement WFBhealthbeauty;

	@FindBy(xpath = "(//a[@href=\"/shop-online/sports-fitness.html\"])[4]")
	private WebElement WFBsportsfitness;
	
	@FindBy(xpath = "(//a[@href=\"/categories.html\"])[4]")
	private WebElement WFBcategoriesBOTTOM;
	
	@FindBy(css = "[name=\"header_search_text\"]")
	private WebElement WFBsearch;
	
	@FindBy(xpath = "(//div[@class=\"search\"])[2]")
	private WebElement WFBsearchbutton;
	
	@FindBy(xpath = "//a[@title=\"Buy online\"]/span")
	private WebElement WFBBUYonline;
	
	@FindBy(xpath = "//li[@id=\"productPriceDisplay\"]/span")
	private WebElement WFBnotAVAILABLEdisplay;

	public WebElement getWFBcategories() {
		return WFBcategories;
	}

	public WebElement getWFBFootwearANDBags() {
		return WFBFootwearANDBags;
	}

	public WebElement getWFBfootwareTRAVELbags() {
		return WFBfootwareTRAVELbags;
	}

	public WebElement getWFBLogo() {
		return WFBLogo;
	}

	public WebElement getWFBLanguageDROPdown() {
		return WFBLanguageDROPdown;
	}

	public WebElement getWFBlogin() {
		return WFBlogin;
	}

	public WebElement getWFBclose() {
		return WFBclose;
	}

	public WebElement getWFBregister() {
		return WFBregister;
	}

	public WebElement getWFBdownloadAPP() {
		return WFBdownloadAPP;
	}

	public WebElement getWFBbecomeSELLER() {
		return WFBbecomeSELLER;
	}

	public WebElement getWFBcareertop() {
		return WFBcareertop;
	}

	public WebElement getWFBhome() {
		return WFBhome;
	}

	public WebElement getWFBfootwareTravelbags() {
		return WFBfootwareTravelbags;
	}

	public WebElement getWFBHandbagAndClutches() {
		return WFBHandbagAndClutches;
	}

	public WebElement getWFBBranded() {
		return WFBBranded;
	}

	public WebElement getWFBMammon() {
		return WFBMammon;
	}

	public WebElement getWFBScottishClub() {
		return WFBScottishClub;
	}

	public WebElement getWFBtopIMAGE() {
		return WFBtopIMAGE;
	}

	public WebElement getWFBItemQV() {
		return WFBItemQV;
	}

	public WebElement getWFBQuickView() {
		return WFBQuickView;
	}

	public WebElement getWFBItem() {
		return WFBItem;
	}

	public WebElement getWFBBuyonlineDISPLAY() {
		return WFBBuyonlineDISPLAY;
	}

	public WebElement getWFBabout() {
		return WFBabout;
	}

	public WebElement getWFBcareerbottom() {
		return WFBcareerbottom;
	}

	public WebElement getWFBpressroom() {
		return WFBpressroom;
	}

	public WebElement getWFBinvestorrelation() {
		return WFBinvestorrelation;
	}

	public WebElement getWFBfaq() {
		return WFBfaq;
	}

	public WebElement getWFBprepurchase() {
		return WFBprepurchase;
	}

	public WebElement getWFBshippingoptions() {
		return WFBshippingoptions;
	}

	public WebElement getWFBpaymentoptions() {
		return WFBpaymentoptions;
	}

	public WebElement getWFBrefund() {
		return WFBrefund;
	}

	public WebElement getWFBunsubscribe() {
		return WFBunsubscribe;
	}

	public WebElement getWFBfeedback() {
		return WFBfeedback;
	}

	public WebElement getWFBcontactus() {
		return WFBcontactus;
	}

	public WebElement getWFBbecomASeller() {
		return WFBbecomASeller;
	}

	public WebElement getWFBsellerfaq() {
		return WFBsellerfaq;
	}

	public WebElement getWFBhotdealsstore() {
		return WFBhotdealsstore;
	}

	public WebElement getWFBappdealcategories() {
		return WFBappdealcategories;
	}

	public WebElement getWFBsitemap() {
		return WFBsitemap;
	}

	public WebElement getWFBlivetv() {
		return WFBlivetv;
	}

	public WebElement getWFBapparelsaccessories() {
		return WFBapparelsaccessories;
	}

	public WebElement getWFBfootweartravelbags() {
		return WFBfootweartravelbags;
	}

	public WebElement getWFBmobilephones() {
		return WFBmobilephones;
	}

	public WebElement getWFBcomputersperipherals() {
		return WFBcomputersperipherals;
	}

	public WebElement getWFBhomekitchenappliances() {
		return WFBhomekitchenappliances;
	}

	public WebElement getWFBhomedecor() {
		return WFBhomedecor;
	}

	public WebElement getWFBjewellerywatches() {
		return WFBjewellerywatches;
	}

	public WebElement getWFBautomobiles() {
		return WFBautomobiles;
	}

	public WebElement getWFBconsumerelectronics() {
		return WFBconsumerelectronics;
	}

	public WebElement getWFBtoysnursery() {
		return WFBtoysnursery;
	}

	public WebElement getWFBhealthbeauty() {
		return WFBhealthbeauty;
	}

	public WebElement getWFBsportsfitness() {
		return WFBsportsfitness;
	}

	public WebElement getWFBcategoriesBOTTOM() {
		return WFBcategoriesBOTTOM;
	}

	public WebElement getWFBsearch() {
		return WFBsearch;
	}

	public WebElement getWFBsearchbutton() {
		return WFBsearchbutton;
	}
	
	public WebElement getWFBBUYonline() {
		return WFBBUYonline;
	}

	public WebElement getWFBnotAVAILABLEdisplay() {
		return WFBnotAVAILABLEdisplay;
	}

	public void WFBheader(String PLanguage) throws InterruptedException {
		
		act = new Actions(driver);
		act.moveToElement(WFBcategories).build().perform();
		act.moveToElement(WFBFootwearANDBags).build().perform();
		act.moveToElement(WFBfootwareTRAVELbags).build().perform();
		WFBfootwareTRAVELbags.click();
		WFBLogo.click();
		driver.navigate().back();
		select = new Select(WFBLanguageDROPdown);
		select.selectByVisibleText(PLanguage);
		Thread.sleep(1000);
		WFBlogin.click();
		Thread.sleep(1000);
		WFBclose.click();
		WFBregister.click();
		Thread.sleep(1000);
		WFBclose.click();
		WFBdownloadAPP.click();
		driver.navigate().back();
		WFBbecomASeller.click();
		driver.navigate().back();
		Thread.sleep(1000);
		WFBcareertop.click();
		driver.navigate().back();
		WFBhome.click();
		driver.navigate().back();
		WFBfootwareTravelbags.click();
		driver.navigate().back();
		
	}
	
//	public void WFBmiddle(String PNotDISPLAY, String PWomenFashionBagsURL) {
//		
//		WFBtopIMAGE.click();
//		act.moveToElement(WFBItemQV).build().perform();
//		wait.until(ExpectedConditions.visibilityOfElementLocated((By) WFBQuickView)).click();
//		wait.until(ExpectedConditions.visibilityOfElementLocated((By) WFBclose)).click();
//		driver.navigate().to(PWomenFashionBagsURL);
//		SoftAssert sA = new SoftAssert();
//		String Parent = driver.getWindowHandle();
//		WFBItem.click();
//		wait.until(ExpectedConditions.numberOfWindowsToBe(2));
//		Set<String> allWindows = driver.getWindowHandles();
//		for (String window : allWindows) {
//		    if (!window.equals(Parent)) {
//		        driver.switchTo().window(window);
//		        break;
//		    }
//		}
//		String Display = WFBnotAVAILABLEdisplay.getText();
//		sA.assertEquals(Display, PNotDISPLAY);
//		sA.assertAll();
//		driver.close();
//		driver.switchTo().window(Parent);
//		
//	}
	
	public void WFBLeftbar() throws InterruptedException {
		
		Thread.sleep(800);
		WFBHandbagAndClutches.click();
		driver.navigate().back();
		WFBBranded.click();
		driver.navigate().back();
		WFBScottishClub.click();
		driver.navigate().back();
		
	}
	
	public void WFBfooter(String PWomenFashionBagsURL) throws InterruptedException {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to(PWomenFashionBagsURL);
		Thread.sleep(500);
		WFBabout.click();
		driver.navigate().back();
		Thread.sleep(500);
		WFBcareerbottom.click();
		driver.navigate().back();
		Thread.sleep(500);
		WFBpressroom.click();
		driver.navigate().back();
		Thread.sleep(500);
		WFBinvestorrelation.click();
		driver.navigate().back();
		Thread.sleep(500);
		WFBfaq.click();
		driver.navigate().back();
		Thread.sleep(500);
		WFBprepurchase.click();
		driver.navigate().back();
		Thread.sleep(500);
		WFBshippingoptions.click();
		driver.navigate().back();
		Thread.sleep(500);
		WFBrefund.click();
		driver.navigate().back();
		Thread.sleep(500);
		WFBunsubscribe.click();
		driver.navigate().back();
		Thread.sleep(500);
		WFBfeedback.click();
		driver.navigate().back();
		Thread.sleep(500);
		WFBcontactus.click();
		driver.navigate().back();
		Thread.sleep(500);
		WFBbecomASeller.click();
		driver.navigate().back();
		Thread.sleep(500);
		WFBsellerfaq.click();
		driver.navigate().back();
		Thread.sleep(500);
		WFBhotdealsstore.click();
		driver.navigate().back();
		Thread.sleep(500);
		WFBsitemap.click();
		driver.navigate().back();
		Thread.sleep(500);
		WFBlivetv.click();
		driver.navigate().back();
		Thread.sleep(500);
		WFBapparelsaccessories.click();
		driver.navigate().back();
		Thread.sleep(500);
		WFBmobilephones.click();
		driver.navigate().back();
		Thread.sleep(500);
		WFBcomputersperipherals.click();
		driver.navigate().back();
		Thread.sleep(500);
		WFBhomekitchenappliances.click();
		driver.navigate().back();
		Thread.sleep(500);
		WFBhomedecor.click();
		driver.navigate().back();
		Thread.sleep(500);
		WFBjewellerywatches.click();
		driver.navigate().back();
		Thread.sleep(500);
		WFBautomobiles.click();
		driver.navigate().back();
		Thread.sleep(500);
		WFBconsumerelectronics.click();
		driver.navigate().back();
		Thread.sleep(500);
		WFBtoysnursery.click();
		driver.navigate().back();
		Thread.sleep(500);
		WFBhealthbeauty.click();
		driver.navigate().back();
		Thread.sleep(500);
		WFBsportsfitness.click();
		driver.navigate().back();
		Thread.sleep(500);
		WFBcategoriesBOTTOM.click();
		driver.navigate().back();
		
	}
	
}
