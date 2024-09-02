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

public class FormalSHOES {

WebDriver driver;
WebDriverWait wait;
Actions act;
Select select;
JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
	
	public FormalSHOES(WebDriver driver) {
		
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(className = "cate_head")
	private WebElement FScategories;
	
	@FindBy(xpath = "(//span[@class='catIconMenu footwear'])[1]")
	private WebElement FSFootwearANDBags;
	
	@FindBy(xpath = "(//a[@href=\"/shop-online/footwear-travel-bags/mens-footwear/formal-shoes.html\"])[1]")
	private WebElement FSformalshoes;
	
	@FindBy(xpath = "(//img[@title=\"Online Shopping in India\"])[2]")
	private WebElement FSLogo;
	
	@FindBy(id = "localization_dropdown")
	private WebElement FSLanguageDROPdown;
	
	@FindBy(id = "login-panel-link")
	private WebElement FSlogin;
	
	@FindBy(css = "[title='Close']")
	private WebElement FSclose;
	
	@FindBy(id = "registration-panel-link")
	private WebElement FSregister;
	
	@FindBy(xpath = "(//a[@href=\"/mobile-apps.html\"])[1]")
	private WebElement FSdownloadAPP;
	
	@FindBy(xpath = "(//a[@href=\"/faces/jsp/becomeASeller/becomASeller.jsp\"])[1]")
	private WebElement FSbecomeSELLER;
	
	@FindBy(xpath = "(//a[@href=\"/aboutus/career.html\"])[1]")
	private WebElement FScareertop;
	
	@FindBy(xpath = "(//a[@href='/'])[4]")
	private WebElement FShome;
	
	@FindBy(xpath = "(//a[@href='/shop-online/footwear-travel-bags.html'])[3]")
	private WebElement FSfootwareTravelbags;
	
	@FindBy(xpath = "(//a[@class='button_1'])[1]")
	private WebElement FSsetButton;
	
	@FindBy(css = "[title='FW16 Formal Shoes + Casual Shoes']")
	private WebElement FSItem;
	
	@FindBy(id = "iscod")
	private WebElement FSCOD;
	
	@FindBy(id = "isexoutStock")
	private WebElement FSoutSTOCK;
	
	@FindBy(id = "isexoutStock")
	private WebElement FSfreespipping;
	
	@FindBy(css = "[onclick=\"productSearch.setPersonalisedFilter(false);\"]")
	private WebElement FSSetBUTTON;
	
	@FindBy(id = "brandFilterBox38776")
	private WebElement FSbrand;
	
	@FindBy(id = "priceFilterBox1")
	private WebElement FSprice;
	
	@FindBy(id = "fromPriceRange")
	private WebElement FSfromPRICE;
	
	@FindBy(id = "toPriceRange")
	private WebElement FStoPRICE;
	
	@FindBy(xpath = "(//a[@class=\"button_1\"])[2]")
	private WebElement FSgoBUTTON;
	
	@FindBy(css = "[href=\"/aboutus/about-naaptol.html\"]")
	private WebElement FSabout;
	
	@FindBy(xpath = "(//a[@href=\"/aboutus/career.html\"])[2]")
	private WebElement FScareerbottom;
	
	@FindBy(css = "[href=\"/aboutus/pressroom.html\"]")
	private WebElement FSpressroom;
	
	@FindBy(css = "[href=\"/aboutus/investor-relation.html\"]")
	private WebElement FSinvestorrelation;
	
	@FindBy(css = "[href=\"/help/faq.html\"]")
	private WebElement FSfaq;
	
	@FindBy(css = "[href=\"/help/pre-purchase.html\"]")
	private WebElement FSprepurchase;
	
	@FindBy(css = "[href=\"/help/shipping-options.html\"]")
	private WebElement FSshippingoptions;
	
	@FindBy(css = "[href=\"/help/payment-options.html\"]")
	private WebElement FSpaymentoptions;
	
	@FindBy(css = "[href=\"https://www.naaptol.com/refund-n-return.html\"]")
	private WebElement FSrefund;
	
	@FindBy(css = "[href=\"/help/unsubscribe.html\"]")
	private WebElement FSunsubscribe;
	
	@FindBy(css = "[href=\"/customer-support/feedback.html\"]")
	private WebElement FSfeedback;
	
	@FindBy(css = "[href=\"/customer-support/contactus.html\"]")
	private WebElement FScontactus;
	
	@FindBy(xpath = "(//a[@href=\"/faces/jsp/becomeASeller/becomASeller.jsp\"])[2]")
	private WebElement FSbecomASeller;
	
	@FindBy(css = "[href=\"/customer-support/seller-faq.html\"]")
	private WebElement FSsellerfaq;
	
	@FindBy(css = "[href=\"/online-store/hot-deals-store/si-1435-p.html\"]")
	private WebElement FShotdealsstore;
	
	@FindBy(css = "[href=\"/app-deal-categories.html\"]")
	private WebElement FSappdealcategories;
	
	@FindBy(css = "[href=\"/sitemap.html\"]")
	private WebElement FSsitemap;
	
	@FindBy(css = "[href=\"/live-tv/schedule.html\"]")
	private WebElement FSlivetv;
	
	@FindBy(xpath = "(//a[@href=\"/shop-online/apparels-accessories.html\"])[4]")
	private WebElement FSapparelsaccessories;
	
	@FindBy(xpath = "(//a[@href=\"/shop-online/footwear-travel-bags.html\"])[5]")
	private WebElement FSfootweartravelbags;
	
	@FindBy(xpath = "(//a[@href=\"/shop-online/mobile-phones.html\"])[4]")
	private WebElement FSmobilephones;
	
	@FindBy(xpath = "(//a[@href=\"/shop-online/computers-peripherals.html\"])[4]")
	private WebElement FScomputersperipherals;
	
	@FindBy(xpath = "(//a[@href=\"/shop-online/home-kitchen-appliances.html\"])[4]")
	private WebElement FShomekitchenappliances;
	
	@FindBy(xpath = "(//a[@href=\"/shop-online/home-decor.html\"])[4]")
	private WebElement FShomedecor;
	
	@FindBy(xpath = "(//a[@href=\"/shop-online/jewellery-watches.html\"])[4]")
	private WebElement FSjewellerywatches;
	
	@FindBy(xpath = "(//a[@href=\"/shop-online/automobiles.html\"])[4]")
	private WebElement FSautomobiles;
	
	@FindBy(xpath = "(//a[@href=\"/shop-online/consumer-electronics.html\"])[4]")
	private WebElement FSconsumerelectronics;
	
	@FindBy(xpath = "(//a[@href=\"/shop-online/toys-nursery.html\"])[4]")
	private WebElement FStoysnursery;
	
	@FindBy(xpath = "(//a[@href=\"/shop-online/health-beauty.html\"])[4]")
	private WebElement FShealthbeauty;

	@FindBy(xpath = "(//a[@href=\"/shop-online/sports-fitness.html\"])[4]")
	private WebElement FSsportsfitness;
	
	@FindBy(xpath = "(//a[@href=\"/categories.html\"])[4]")
	private WebElement FScategoriesBOTTOM;
	
	@FindBy(css = "[name=\"header_search_text\"]")
	private WebElement FSsearch;
	
	@FindBy(xpath = "(//div[@class=\"search\"])[2]")
	private WebElement FSsearchbutton;
	
	@FindBy(xpath = "//li[@id=\"productPriceDisplay\"]/span")
	private WebElement FSnotAVAILABLEdisplay;

	public WebElement getFScategories() {
		return FScategories;
	}

	public WebElement getFSFootwearANDBags() {
		return FSFootwearANDBags;
	}

	public WebElement getFSformalshoes() {
		return FSformalshoes;
	}

	public WebElement getFSLogo() {
		return FSLogo;
	}

	public WebElement getFSLanguageDROPdown() {
		return FSLanguageDROPdown;
	}

	public WebElement getFSlogin() {
		return FSlogin;
	}

	public WebElement getFSclose() {
		return FSclose;
	}

	public WebElement getFSregister() {
		return FSregister;
	}

	public WebElement getFSdownloadAPP() {
		return FSdownloadAPP;
	}

	public WebElement getFSbecomeSELLER() {
		return FSbecomeSELLER;
	}

	public WebElement getFScareertop() {
		return FScareertop;
	}

	public WebElement getFShome() {
		return FShome;
	}

	public WebElement getFSfootwareTravelbags() {
		return FSfootwareTravelbags;
	}

	public WebElement getFSsetButton() {
		return FSsetButton;
	}

	public WebElement getFSItem() {
		return FSItem;
	}

	public WebElement getFSCOD() {
		return FSCOD;
	}

	public WebElement getFSoutSTOCK() {
		return FSoutSTOCK;
	}

	public WebElement getFSfreespipping() {
		return FSfreespipping;
	}

	public WebElement getFSSetBUTTON() {
		return FSSetBUTTON;
	}

	public WebElement getFSbrand() {
		return FSbrand;
	}

	public WebElement getFSprice() {
		return FSprice;
	}

	public WebElement getFSfromPRICE() {
		return FSfromPRICE;
	}

	public WebElement getFStoPRICE() {
		return FStoPRICE;
	}

	public WebElement getFSgoBUTTON() {
		return FSgoBUTTON;
	}

	public WebElement getFSabout() {
		return FSabout;
	}

	public WebElement getFScareerbottom() {
		return FScareerbottom;
	}

	public WebElement getFSpressroom() {
		return FSpressroom;
	}

	public WebElement getFSinvestorrelation() {
		return FSinvestorrelation;
	}

	public WebElement getFSfaq() {
		return FSfaq;
	}

	public WebElement getFSprepurchase() {
		return FSprepurchase;
	}

	public WebElement getFSshippingoptions() {
		return FSshippingoptions;
	}

	public WebElement getFSpaymentoptions() {
		return FSpaymentoptions;
	}

	public WebElement getFSrefund() {
		return FSrefund;
	}

	public WebElement getFSunsubscribe() {
		return FSunsubscribe;
	}

	public WebElement getFSfeedback() {
		return FSfeedback;
	}

	public WebElement getFScontactus() {
		return FScontactus;
	}

	public WebElement getFSbecomASeller() {
		return FSbecomASeller;
	}

	public WebElement getFSsellerfaq() {
		return FSsellerfaq;
	}

	public WebElement getFShotdealsstore() {
		return FShotdealsstore;
	}

	public WebElement getFSappdealcategories() {
		return FSappdealcategories;
	}

	public WebElement getFSsitemap() {
		return FSsitemap;
	}

	public WebElement getFSlivetv() {
		return FSlivetv;
	}

	public WebElement getFSapparelsaccessories() {
		return FSapparelsaccessories;
	}

	public WebElement getFSfootweartravelbags() {
		return FSfootweartravelbags;
	}

	public WebElement getFSmobilephones() {
		return FSmobilephones;
	}

	public WebElement getFScomputersperipherals() {
		return FScomputersperipherals;
	}

	public WebElement getFShomekitchenappliances() {
		return FShomekitchenappliances;
	}

	public WebElement getFShomedecor() {
		return FShomedecor;
	}

	public WebElement getFSjewellerywatches() {
		return FSjewellerywatches;
	}

	public WebElement getFSautomobiles() {
		return FSautomobiles;
	}

	public WebElement getFSconsumerelectronics() {
		return FSconsumerelectronics;
	}

	public WebElement getFStoysnursery() {
		return FStoysnursery;
	}

	public WebElement getFShealthbeauty() {
		return FShealthbeauty;
	}

	public WebElement getFSsportsfitness() {
		return FSsportsfitness;
	}

	public WebElement getFScategoriesBOTTOM() {
		return FScategoriesBOTTOM;
	}

	public WebElement getFSsearch() {
		return FSsearch;
	}

	public WebElement getFSsearchbutton() {
		return FSsearchbutton;
	}
	
	public WebElement getFSnotAVAILABLEdisplay() {
		return FSnotAVAILABLEdisplay;
	}

	public void FSheader(String PLanguage) throws InterruptedException {
		
		act = new Actions(driver);
		act.moveToElement(FScategories).build().perform();
		act.moveToElement(FSFootwearANDBags).build().perform();
		act.moveToElement(FSformalshoes).build().perform();
		FSformalshoes.click();
		FSLogo.click();
		driver.navigate().back();
		select = new Select(FSLanguageDROPdown);
		select.selectByVisibleText(PLanguage);
		Thread.sleep(800);
		FSlogin.click();
		Thread.sleep(800);
		FSclose.click();
		FSregister.click();
		Thread.sleep(800);
		FSclose.click();
		FSdownloadAPP.click();
		driver.navigate().back();
		FSbecomASeller.click();
		driver.navigate().back();
		FScareertop.click();
		driver.navigate().back();
		FShome.click();
		driver.navigate().back();
		FSfootwareTravelbags.click();
		driver.navigate().back();
		
		FSoutSTOCK.click();
		FSSetBUTTON.click();
		
	}
	
//	public void FSmiddle(String PNotDISPLAY) {
//		
//		FSoutSTOCK.click();
//		FSSetBUTTON.click();
//		
//		SoftAssert sA = new SoftAssert();
//		String Parent = driver.getWindowHandle();
//		FSItem.click();
//		wait.until(ExpectedConditions.numberOfWindowsToBe(2));
//		Set<String> allWindows = driver.getWindowHandles();
//		for (String window : allWindows) {
//			if (!window.equals(Parent)) {
//		        driver.switchTo().window(window);
//		        break;
//		    }
//		}
//		String Display = FSnotAVAILABLEdisplay.getText();
//		sA.assertEquals(Display, PNotDISPLAY);
//		sA.assertAll();
//		driver.close();
//		driver.switchTo().window(Parent);
//		
//	}
	
	public void FSLeftbar(String PFromPrice, String PToPrice) throws InterruptedException {
		
		FSCOD.click();
		Thread.sleep(800);
		FSSetBUTTON.click();
		Thread.sleep(800);
		FSCOD.click();
		Thread.sleep(800);
		FSoutSTOCK.click();
		Thread.sleep(800);
		FSSetBUTTON.click();
		Thread.sleep(800);
		FSoutSTOCK.click();
		Thread.sleep(800);
		FSfreespipping.click();
		Thread.sleep(800);
		FSSetBUTTON.click();
		Thread.sleep(800);
		FSfreespipping.click();
		Thread.sleep(800);
		FSSetBUTTON.click();
		Thread.sleep(800);
		
		FSbrand.click();
		Thread.sleep(800);
		FSbrand.click();
		Thread.sleep(800);
		FSprice.click();
		Thread.sleep(800);
		FSprice.click();
		Thread.sleep(800);
		FSfromPRICE.sendKeys(PFromPrice);
		FStoPRICE.sendKeys(PToPrice);
		FSgoBUTTON.click();
		
	}
	
	public void FSfooter(String PFormalShoesURL) throws InterruptedException {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to(PFormalShoesURL);
		FSabout.click();
		driver.navigate().back();
		Thread.sleep(500);
		FScareerbottom.click();
		driver.navigate().back();
		Thread.sleep(500);
		FSpressroom.click();
		driver.navigate().back();
		Thread.sleep(500);
		FSinvestorrelation.click();
		driver.navigate().back();
		Thread.sleep(500);
		FSfaq.click();
		driver.navigate().back();
		Thread.sleep(500);
		FSprepurchase.click();
		driver.navigate().back();
		Thread.sleep(500);
		FSshippingoptions.click();
		driver.navigate().back();
		Thread.sleep(500);
		FSrefund.click();
		driver.navigate().back();
		Thread.sleep(500);
		FSunsubscribe.click();
		driver.navigate().back();
		Thread.sleep(500);
		FSfeedback.click();
		driver.navigate().back();
		Thread.sleep(500);
		FScontactus.click();
		driver.navigate().back();
		Thread.sleep(500);
		FSbecomASeller.click();
		driver.navigate().back();
		Thread.sleep(500);
		FSsellerfaq.click();
		driver.navigate().back();
		Thread.sleep(500);
		FShotdealsstore.click();
		driver.navigate().back();
		Thread.sleep(500);
		FSsitemap.click();
		driver.navigate().back();
		Thread.sleep(500);
		FSlivetv.click();
		driver.navigate().back();
		Thread.sleep(500);
		FSapparelsaccessories.click();
		driver.navigate().back();
		Thread.sleep(500);
		FSmobilephones.click();
		driver.navigate().back();
		Thread.sleep(500);
		FScomputersperipherals.click();
		driver.navigate().back();
		Thread.sleep(500);
		FShomekitchenappliances.click();
		driver.navigate().back();
		Thread.sleep(500);
		FShomedecor.click();
		driver.navigate().back();
		Thread.sleep(500);
		FSjewellerywatches.click();
		driver.navigate().back();
		Thread.sleep(500);
		FSautomobiles.click();
		driver.navigate().back();
		Thread.sleep(500);
		FSconsumerelectronics.click();
		driver.navigate().back();
		Thread.sleep(500);
		FStoysnursery.click();
		driver.navigate().back();
		Thread.sleep(500);
		FShealthbeauty.click();
		driver.navigate().back();
		Thread.sleep(500);
		FSsportsfitness.click();
		driver.navigate().back();
		Thread.sleep(500);
		FScategoriesBOTTOM.click();
		driver.navigate().back();
		
	}
	
}
