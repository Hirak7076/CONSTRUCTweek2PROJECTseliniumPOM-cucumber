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

public class SandelAndSLIPERS {

WebDriver driver;
WebDriverWait wait;
Actions act;
Select select;
JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
	
	public SandelAndSLIPERS(WebDriver driver) {
		
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(className = "cate_head")
	private WebElement SAScategories;
	
	@FindBy(xpath = "(//span[@class='catIconMenu footwear'])[1]")
	private WebElement SASFootwearANDBags;
	
	@FindBy(xpath = "(//a[@href='/shop-online/footwear-travel-bags/mens-footwear/sandals.html'])[1]")
	private WebElement SASSandelANDslippers;
	
	@FindBy(xpath = "(//img[@title=\"Online Shopping in India\"])[2]")
	private WebElement SASLogo;
	
	@FindBy(id = "localization_dropdown")
	private WebElement SASLanguageDROPdown;
	
	@FindBy(id = "login-panel-link")
	private WebElement SASlogin;
	
	@FindBy(css = "[title='Close']")
	private WebElement SASclose;
	
	@FindBy(id = "registration-panel-link")
	private WebElement SASregister;
	
	@FindBy(xpath = "(//a[@href=\"/mobile-apps.html\"])[1]")
	private WebElement SASdownloadAPP;
	
	@FindBy(xpath = "(//a[@href=\"/faces/jsp/becomeASeller/becomASeller.jsp\"])[1]")
	private WebElement SASbecomeSELLER;
	
	@FindBy(xpath = "(//a[@href=\"/aboutus/career.html\"])[1]")
	private WebElement SAScareertop;
	
	@FindBy(xpath = "(//a[@href='/'])[4]")
	private WebElement SAShome;
	
	@FindBy(xpath = "(//a[@href='/shop-online/footwear-travel-bags.html'])[3]")
	private WebElement SASfootwareTravelbags;
	
	@FindBy(xpath = "(//a[@class='button_1'])[1]")
	private WebElement SASsetButton;
	
	@FindBy(css = "[title=\"Zeal Height Increasing Shoe Insoles\"]")
	private WebElement SASItem;
	
	@FindBy(xpath = "//a[@title=\"Buy online\"]/span")
	private WebElement SASBuyonlineDISPLAY;
	
	@FindBy(xpath = "//li[@id=\"productPriceDisplay\"]/span")
	private WebElement SASnotAVAILABLEdisplay;
	
	@FindBy(id = "iscod")
	private WebElement SASCOD;
	
	@FindBy(id = "isexoutStock")
	private WebElement SASoutSTOCK;
	
	@FindBy(id = "isexoutStock")
	private WebElement SASfreespipping;
	
	@FindBy(css = "[onclick=\"productSearch.setPersonalisedFilter(false);\"]")
	private WebElement SASSetBUTTON;
	
	@FindBy(id = "fromPriceRange")
	private WebElement SASfromPRICE;
	
	@FindBy(id = "toPriceRange")
	private WebElement SAStoPRICE;
	
	@FindBy(xpath = "(//a[@class=\"button_1\"])[2]")
	private WebElement SASgoBUTTON;
	
	@FindBy(id = "brandFilterBox427")
	private WebElement SASbrand;
	
	@FindBy(id = "priceFilterBox1")
	private WebElement SASprice;	
	
	@FindBy(css = "[href=\"/aboutus/about-naaptol.html\"]")
	private WebElement SASabout;
	
	@FindBy(xpath = "(//a[@href=\"/aboutus/career.html\"])[2]")
	private WebElement SAScareerbottom;
	
	@FindBy(css = "[href=\"/aboutus/pressroom.html\"]")
	private WebElement SASpressroom;
	
	@FindBy(css = "[href=\"/aboutus/investor-relation.html\"]")
	private WebElement SASinvestorrelation;
	
	@FindBy(css = "[href=\"/help/faq.html\"]")
	private WebElement SASfaq;
	
	@FindBy(css = "[href=\"/help/pre-purchase.html\"]")
	private WebElement SASprepurchase;
	
	@FindBy(css = "[href=\"/help/shipping-options.html\"]")
	private WebElement SASshippingoptions;
	
	@FindBy(css = "[href=\"/help/payment-options.html\"]")
	private WebElement SASpaymentoptions;
	
	@FindBy(css = "[href=\"https://www.naaptol.com/refund-n-return.html\"]")
	private WebElement SASrefund;
	
	@FindBy(css = "[href=\"/help/unsubscribe.html\"]")
	private WebElement SASunsubscribe;
	
	@FindBy(css = "[href=\"/customer-support/feedback.html\"]")
	private WebElement SASfeedback;
	
	@FindBy(css = "[href=\"/customer-support/contactus.html\"]")
	private WebElement SAScontactus;
	
	@FindBy(xpath = "(//a[@href=\"/faces/jsp/becomeASeller/becomASeller.jsp\"])[2]")
	private WebElement SASbecomASeller;
	
	@FindBy(css = "[href=\"/customer-support/seller-faq.html\"]")
	private WebElement SASsellerfaq;
	
	@FindBy(css = "[href=\"/online-store/hot-deals-store/si-1435-p.html\"]")
	private WebElement SAShotdealsstore;
	
	@FindBy(css = "[href=\"/app-deal-categories.html\"]")
	private WebElement SASappdealcategories;
	
	@FindBy(css = "[href=\"/sitemap.html\"]")
	private WebElement SASsitemap;
	
	@FindBy(css = "[href=\"/live-tv/schedule.html\"]")
	private WebElement SASlivetv;
	
	@FindBy(xpath = "(//a[@href=\"/shop-online/apparels-accessories.html\"])[4]")
	private WebElement SASapparelsaccessories;
	
	@FindBy(xpath = "(//a[@href=\"/shop-online/footwear-travel-bags.html\"])[5]")
	private WebElement SASfootweartravelbags;
	
	@FindBy(xpath = "(//a[@href=\"/shop-online/mobile-phones.html\"])[4]")
	private WebElement SASmobilephones;
	
	@FindBy(xpath = "(//a[@href=\"/shop-online/computers-peripherals.html\"])[4]")
	private WebElement SAScomputersperipherals;
	
	@FindBy(xpath = "(//a[@href=\"/shop-online/home-kitchen-appliances.html\"])[4]")
	private WebElement SAShomekitchenappliances;
	
	@FindBy(xpath = "(//a[@href=\"/shop-online/home-decor.html\"])[4]")
	private WebElement SAShomedecor;
	
	@FindBy(xpath = "(//a[@href=\"/shop-online/jewellery-watches.html\"])[4]")
	private WebElement SASjewellerywatches;
	
	@FindBy(xpath = "(//a[@href=\"/shop-online/automobiles.html\"])[4]")
	private WebElement SASautomobiles;
	
	@FindBy(xpath = "(//a[@href=\"/shop-online/consumer-electronics.html\"])[4]")
	private WebElement SASconsumerelectronics;
	
	@FindBy(xpath = "(//a[@href=\"/shop-online/toys-nursery.html\"])[4]")
	private WebElement SAStoysnursery;
	
	@FindBy(xpath = "(//a[@href=\"/shop-online/health-beauty.html\"])[4]")
	private WebElement SAShealthbeauty;

	@FindBy(xpath = "(//a[@href=\"/shop-online/sports-fitness.html\"])[4]")
	private WebElement SASsportsfitness;
	
	@FindBy(xpath = "(//a[@href=\"/categories.html\"])[4]")
	private WebElement SAScategoriesBOTTOM;
	
	@FindBy(css = "[name=\"header_search_text\"]")
	private WebElement SASsearch;
	
	@FindBy(xpath = "(//div[@class=\"search\"])[2]")
	private WebElement SASsearchbutton;
	
	@FindBy(xpath = "//a[@title=\"Buy online\"]/span")
	private WebElement SASBUYonline;

	public WebElement getSAScategories() {
		return SAScategories;
	}

	public WebElement getSASFootwearANDBags() {
		return SASFootwearANDBags;
	}

	public WebElement getSASSandelANDslippers() {
		return SASSandelANDslippers;
	}

	public WebElement getSASLogo() {
		return SASLogo;
	}

	public WebElement getSASLanguageDROPdown() {
		return SASLanguageDROPdown;
	}

	public WebElement getSASlogin() {
		return SASlogin;
	}

	public WebElement getSASclose() {
		return SASclose;
	}

	public WebElement getSASregister() {
		return SASregister;
	}

	public WebElement getSASdownloadAPP() {
		return SASdownloadAPP;
	}

	public WebElement getSASbecomeSELLER() {
		return SASbecomeSELLER;
	}

	public WebElement getSAScareertop() {
		return SAScareertop;
	}

	public WebElement getSAShome() {
		return SAShome;
	}

	public WebElement getSASfootwareTravelbags() {
		return SASfootwareTravelbags;
	}

	public WebElement getSASsetButton() {
		return SASsetButton;
	}

	public WebElement getSASItem() {
		return SASItem;
	}

	public WebElement getSASBuyonlineDISPLAY() {
		return SASBuyonlineDISPLAY;
	}

	public WebElement getSASnotAVAILABLEdisplay() {
		return SASnotAVAILABLEdisplay;
	}

	public WebElement getSASCOD() {
		return SASCOD;
	}

	public WebElement getSASoutSTOCK() {
		return SASoutSTOCK;
	}

	public WebElement getSASfreespipping() {
		return SASfreespipping;
	}

	public WebElement getSASSetBUTTON() {
		return SASSetBUTTON;
	}

	public WebElement getSASfromPRICE() {
		return SASfromPRICE;
	}

	public WebElement getSAStoPRICE() {
		return SAStoPRICE;
	}

	public WebElement getSASgoBUTTON() {
		return SASgoBUTTON;
	}

	public WebElement getSASbrand() {
		return SASbrand;
	}

	public WebElement getSASprice() {
		return SASprice;
	}

	public WebElement getSASabout() {
		return SASabout;
	}

	public WebElement getSAScareerbottom() {
		return SAScareerbottom;
	}

	public WebElement getSASpressroom() {
		return SASpressroom;
	}

	public WebElement getSASinvestorrelation() {
		return SASinvestorrelation;
	}

	public WebElement getSASfaq() {
		return SASfaq;
	}

	public WebElement getSASprepurchase() {
		return SASprepurchase;
	}

	public WebElement getSASshippingoptions() {
		return SASshippingoptions;
	}

	public WebElement getSASpaymentoptions() {
		return SASpaymentoptions;
	}

	public WebElement getSASrefund() {
		return SASrefund;
	}

	public WebElement getSASunsubscribe() {
		return SASunsubscribe;
	}

	public WebElement getSASfeedback() {
		return SASfeedback;
	}

	public WebElement getSAScontactus() {
		return SAScontactus;
	}

	public WebElement getSASbecomASeller() {
		return SASbecomASeller;
	}

	public WebElement getSASsellerfaq() {
		return SASsellerfaq;
	}

	public WebElement getSAShotdealsstore() {
		return SAShotdealsstore;
	}

	public WebElement getSASappdealcategories() {
		return SASappdealcategories;
	}

	public WebElement getSASsitemap() {
		return SASsitemap;
	}

	public WebElement getSASlivetv() {
		return SASlivetv;
	}

	public WebElement getSASapparelsaccessories() {
		return SASapparelsaccessories;
	}

	public WebElement getSASfootweartravelbags() {
		return SASfootweartravelbags;
	}

	public WebElement getSASmobilephones() {
		return SASmobilephones;
	}

	public WebElement getSAScomputersperipherals() {
		return SAScomputersperipherals;
	}

	public WebElement getSAShomekitchenappliances() {
		return SAShomekitchenappliances;
	}

	public WebElement getSAShomedecor() {
		return SAShomedecor;
	}

	public WebElement getSASjewellerywatches() {
		return SASjewellerywatches;
	}

	public WebElement getSASautomobiles() {
		return SASautomobiles;
	}

	public WebElement getSASconsumerelectronics() {
		return SASconsumerelectronics;
	}

	public WebElement getSAStoysnursery() {
		return SAStoysnursery;
	}

	public WebElement getSAShealthbeauty() {
		return SAShealthbeauty;
	}

	public WebElement getSASsportsfitness() {
		return SASsportsfitness;
	}

	public WebElement getSAScategoriesBOTTOM() {
		return SAScategoriesBOTTOM;
	}

	public WebElement getSASsearch() {
		return SASsearch;
	}

	public WebElement getSASsearchbutton() {
		return SASsearchbutton;
	}
	
	public WebElement getSASBUYonline() {
		return SASBUYonline;
	}

	public void SASheader(String PLanguage) throws InterruptedException {
		
		act = new Actions(driver);
		act.moveToElement(SAScategories).build().perform();
		act.moveToElement(SASFootwearANDBags).build().perform();
		act.moveToElement(SASSandelANDslippers).build().perform();
		SASSandelANDslippers.click();
		SASLogo.click();
		driver.navigate().back();
		select = new Select(SASLanguageDROPdown);
		select.selectByVisibleText(PLanguage);
		Thread.sleep(800);
		SASlogin.click();
		Thread.sleep(800);
		SASclose.click();
		SASregister.click();
		Thread.sleep(800);
		SASclose.click();
		SASdownloadAPP.click();
		driver.navigate().back();
		SASbecomASeller.click();
		driver.navigate().back();
		SAScareertop.click();
		driver.navigate().back();
		SAShome.click();
		driver.navigate().back();
		SASfootwareTravelbags.click();
		driver.navigate().back();
		
		SASoutSTOCK.click();
		SASSetBUTTON.click();
		
	}
	
//	public void SASmiddle(String PNotDISPLAY) {
//		
//		SoftAssert sA = new SoftAssert();
//		String Parent = driver.getWindowHandle();
//		wait.until(ExpectedConditions.visibilityOfElementLocated((By) SASItem)).click();
//		wait.until(ExpectedConditions.numberOfWindowsToBe(2));
//		Set<String> allWindows = driver.getWindowHandles();
//		for (String window : allWindows) {
//		    if (!window.equals(Parent)) {
//		        driver.switchTo().window(window);
//		        break;
//		    }
//		}		
//		String Display = SASnotAVAILABLEdisplay.getText();
//		sA.assertEquals(Display, PNotDISPLAY);
//		sA.assertAll();
//		driver.close();
//		driver.switchTo().window(Parent);
//		
//	}
	
	public void SASLeftbar(String PFromPrice, String PToPrice) throws InterruptedException {
		
		SASCOD.click();
		Thread.sleep(800);
		SASSetBUTTON.click();
		Thread.sleep(800);
		SASCOD.click();
		Thread.sleep(800);
		SASoutSTOCK.click();
		Thread.sleep(800);
		SASSetBUTTON.click();
		Thread.sleep(800);
		SASoutSTOCK.click();
		Thread.sleep(800);
		SASfreespipping.click();
		Thread.sleep(800);
		SASSetBUTTON.click();
		Thread.sleep(800);
		SASfreespipping.click();
		Thread.sleep(800);
		SASSetBUTTON.click();
		Thread.sleep(800);
		
		SASbrand.click();
		Thread.sleep(800);
		SASprice.click();
		Thread.sleep(800);
		SASbrand.click();
		Thread.sleep(800);
		SASprice.click();
		
		SASfromPRICE.sendKeys(PFromPrice);
		SAStoPRICE.sendKeys(PToPrice);
		SASgoBUTTON.click();
		
	}
	
	public void SASfooter(String PSandalsAndSlippersURL) throws InterruptedException {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to(PSandalsAndSlippersURL);
		SASabout.click();
		driver.navigate().back();
		Thread.sleep(500);
		SAScareerbottom.click();
		driver.navigate().back();
		Thread.sleep(500);
		SASpressroom.click();
		driver.navigate().back();
		Thread.sleep(500);
		SASinvestorrelation.click();
		driver.navigate().back();
		Thread.sleep(500);
		SASfaq.click();
		driver.navigate().back();
		Thread.sleep(500);
		SASprepurchase.click();
		driver.navigate().back();
		Thread.sleep(500);
		SASshippingoptions.click();
		driver.navigate().back();
		Thread.sleep(500);
		SASrefund.click();
		driver.navigate().back();
		Thread.sleep(500);
		SASunsubscribe.click();
		driver.navigate().back();
		Thread.sleep(500);
		SASfeedback.click();
		driver.navigate().back();
		Thread.sleep(500);
		SAScontactus.click();
		driver.navigate().back();
		Thread.sleep(500);
		SASbecomASeller.click();
		driver.navigate().back();
		Thread.sleep(500);
		SASsellerfaq.click();
		driver.navigate().back();
		Thread.sleep(500);
		SAShotdealsstore.click();
		driver.navigate().back();
		Thread.sleep(500);
		SASsitemap.click();
		driver.navigate().back();
		Thread.sleep(500);
		SASlivetv.click();
		driver.navigate().back();
		Thread.sleep(500);
		SASapparelsaccessories.click();
		driver.navigate().back();
		Thread.sleep(500);
		SASmobilephones.click();
		driver.navigate().back();
		Thread.sleep(500);
		SAScomputersperipherals.click();
		driver.navigate().back();
		Thread.sleep(500);
		SAShomekitchenappliances.click();
		driver.navigate().back();
		Thread.sleep(500);
		SAShomedecor.click();
		driver.navigate().back();
		Thread.sleep(500);
		SASjewellerywatches.click();
		driver.navigate().back();
		Thread.sleep(500);
		SASautomobiles.click();
		driver.navigate().back();
		Thread.sleep(500);
		SASconsumerelectronics.click();
		driver.navigate().back();
		Thread.sleep(500);
		SAStoysnursery.click();
		driver.navigate().back();
		Thread.sleep(500);
		SAShealthbeauty.click();
		driver.navigate().back();
		Thread.sleep(500);
		SASsportsfitness.click();
		driver.navigate().back();
		Thread.sleep(500);
		SAScategoriesBOTTOM.click();
		driver.navigate().back();
		
	}
	
}
