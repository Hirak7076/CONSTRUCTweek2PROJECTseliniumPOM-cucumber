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

public class SportsSHOES {

WebDriver driver;
WebDriverWait wait;
Actions act;
Select select;
JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
	
	public SportsSHOES(WebDriver driver) {
		
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(className = "cate_head")
	private WebElement SScategories;
	
	@FindBy(xpath = "(//span[@class='catIconMenu footwear'])[1]")
	private WebElement SSFootwearANDBags;
	
	@FindBy(xpath = "(//a[@href='/shop-online/footwear-travel-bags/mens-footwear/sports-shoes.html'])[1]")
	private WebElement SSSportsSHOES;
	
	@FindBy(xpath = "(//img[@title=\"Online Shopping in India\"])[2]")
	private WebElement SSLogo;
	
	@FindBy(id = "localization_dropdown")
	private WebElement SSLanguageDROPdown;
	
	@FindBy(id = "login-panel-link")
	private WebElement SSlogin;
	
	@FindBy(css = "[title='Close']")
	private WebElement SSclose;
	
	@FindBy(id = "registration-panel-link")
	private WebElement SSregister;
	
	@FindBy(xpath = "(//a[@href=\"/mobile-apps.html\"])[1]")
	private WebElement SSdownloadAPP;
	
	@FindBy(xpath = "(//a[@href=\"/faces/jsp/becomeASeller/becomASeller.jsp\"])[1]")
	private WebElement SSbecomeSELLER;
	
	@FindBy(xpath = "(//a[@href=\"/aboutus/career.html\"])[1]")
	private WebElement SScareertop;
	
	@FindBy(xpath = "(//a[@href='/'])[4]")
	private WebElement SShome;
	
	@FindBy(xpath = "(//a[@href='/shop-online/footwear-travel-bags.html'])[3]")
	private WebElement SSfootwareTravelbags;
	
	@FindBy(xpath = "//a[@title=\"Buy online\"]/span")
	private WebElement SSBuyonlineDISPLAY;
	
	@FindBy(xpath = "//li[@id=\"productPriceDisplay\"]/span")
	private WebElement SSnotAVAILABLEdisplay;
	
	@FindBy(css = "[title=\"Liberty Sports Shoes + Floaters + Multipurpose Bag\"]")
	private WebElement SSItem1;
	
	@FindBy(css = "[title=\"Bacca Bucci Ankle Length Sports Shoes\"]")
	private WebElement SSItem2;
	
	@FindBy(css = "[title=\"FW16 Complete Footwear Combo\"]")
	private WebElement SSItem3;
	
	@FindBy(css = "[title=\"Aairwalk Complete Footwear Combo\"]")
	private WebElement SSItem4;
	
	@FindBy(css = "[title=\"Bacca Bucci 3 Guna Jyada Shoes (Nano Tech Comfort Shoes)\"]")
	private WebElement SSItem5;
	
	@FindBy(id = "brandFilterBox38776")
	private WebElement SSbrand1;
	
	@FindBy(id = "brandFilterBox37356")
	private WebElement SSbrand2;
	
	@FindBy(id = "brandFilterBox583")
	private WebElement SSbrand3;
	
	@FindBy(id = "brandFilterBox38875")
	private WebElement SSbrand4;
	
	@FindBy(id = "brandFilterBox8313")
	private WebElement SSbrand5;
	
	@FindBy(id = "brandFilterBox38697")
	private WebElement SSbrand6;
	
	@FindBy(id = "brandFilterBox4654")
	private WebElement SSbrand7;
	
	@FindBy(id = "priceFilterBox1")
	private WebElement SSprice1;
	
	@FindBy(id = "priceFilterBox2")
	private WebElement SSprice2;
	
	@FindBy(id = "priceFilterBox3")
	private WebElement SSprice3;
	
	@FindBy(id = "priceFilterBox4")
	private WebElement SSprice4;
	
	@FindBy(id = "discountFilterBox1")
	private WebElement SSdiscount1;
	
	@FindBy(id = "discountFilterBox2")
	private WebElement SSdiscount2;
	
	@FindBy(id = "featureFilterBox0f1")
	private WebElement SSmaterial1;
	
	@FindBy(id = "featureFilterBox1f1")
	private WebElement SSmaterial2;
	
	@FindBy(id = "featureFilterBox2f1")
	private WebElement SSmaterial3;
	
	@FindBy(id = "featureFilterBox0f2")
	private WebElement SStype;
	
	@FindBy(id = "sortByFilter")
	private WebElement SSsortBY;	
	
	@FindBy(id = "fromPriceRange")
	private WebElement SSfromPRICE;
	
	@FindBy(id = "toPriceRange")
	private WebElement SStoPRICE;
	
	@FindBy(xpath = "(//a[@class=\"button_1\"])[2]")
	private WebElement SSgoBUTTON;
	
	@FindBy(id = "iscod")
	private WebElement SSCOD;
	
	@FindBy(id = "isexoutStock")
	private WebElement SSoutSTOCK;
	
	@FindBy(id = "isexoutStock")
	private WebElement SSfreespipping;
	
	@FindBy(css = "[onclick=\"productSearch.setPersonalisedFilter(false);\"]")
	private WebElement SSSetBUTTON;
	
	@FindBy(css = "[href=\"/aboutus/about-naaptol.html\"]")
	private WebElement SSabout;
	
	@FindBy(xpath = "(//a[@href=\"/aboutus/career.html\"])[2]")
	private WebElement SScareerbottom;
	
	@FindBy(css = "[href=\"/aboutus/pressroom.html\"]")
	private WebElement SSpressroom;
	
	@FindBy(css = "[href=\"/aboutus/investor-relation.html\"]")
	private WebElement SSinvestorrelation;
	
	@FindBy(css = "[href=\"/help/faq.html\"]")
	private WebElement SSfaq;
	
	@FindBy(css = "[href=\"/help/pre-purchase.html\"]")
	private WebElement SSprepurchase;
	
	@FindBy(css = "[href=\"/help/shipping-options.html\"]")
	private WebElement SSshippingoptions;
	
	@FindBy(css = "[href=\"/help/payment-options.html\"]")
	private WebElement SSpaymentoptions;
	
	@FindBy(css = "[href=\"https://www.naaptol.com/refund-n-return.html\"]")
	private WebElement SSrefund;
	
	@FindBy(css = "[href=\"/help/unsubscribe.html\"]")
	private WebElement SSunsubscribe;
	
	@FindBy(css = "[href=\"/customer-support/feedback.html\"]")
	private WebElement SSfeedback;
	
	@FindBy(css = "[href=\"/customer-support/contactus.html\"]")
	private WebElement SScontactus;
	
	@FindBy(xpath = "(//a[@href=\"/faces/jsp/becomeASeller/becomASeller.jsp\"])[2]")
	private WebElement SSbecomASeller;
	
	@FindBy(css = "[href=\"/customer-support/seller-faq.html\"]")
	private WebElement SSsellerfaq;
	
	@FindBy(css = "[href=\"/online-store/hot-deals-store/si-1435-p.html\"]")
	private WebElement SShotdealsstore;
	
	@FindBy(css = "[href=\"/app-deal-categories.html\"]")
	private WebElement SSappdealcategories;
	
	@FindBy(css = "[href=\"/sitemap.html\"]")
	private WebElement SSsitemap;
	
	@FindBy(css = "[href=\"/live-tv/schedule.html\"]")
	private WebElement SSlivetv;
	
	@FindBy(xpath = "(//a[@href=\"/shop-online/apparels-accessories.html\"])[4]")
	private WebElement SSapparelsaccessories;
	
	@FindBy(xpath = "(//a[@href=\"/shop-online/footwear-travel-bags.html\"])[5]")
	private WebElement SSfootweartravelbags;
	
	@FindBy(xpath = "(//a[@href=\"/shop-online/mobile-phones.html\"])[4]")
	private WebElement SSmobilephones;
	
	@FindBy(xpath = "(//a[@href=\"/shop-online/computers-peripherals.html\"])[4]")
	private WebElement SScomputersperipherals;
	
	@FindBy(xpath = "(//a[@href=\"/shop-online/home-kitchen-appliances.html\"])[4]")
	private WebElement SShomekitchenappliances;
	
	@FindBy(xpath = "(//a[@href=\"/shop-online/home-decor.html\"])[4]")
	private WebElement SShomedecor;
	
	@FindBy(xpath = "(//a[@href=\"/shop-online/jewellery-watches.html\"])[4]")
	private WebElement SSjewellerywatches;
	
	@FindBy(xpath = "(//a[@href=\"/shop-online/automobiles.html\"])[4]")
	private WebElement SSautomobiles;
	
	@FindBy(xpath = "(//a[@href=\"/shop-online/consumer-electronics.html\"])[4]")
	private WebElement SSconsumerelectronics;
	
	@FindBy(xpath = "(//a[@href=\"/shop-online/toys-nursery.html\"])[4]")
	private WebElement SStoysnursery;
	
	@FindBy(xpath = "(//a[@href=\"/shop-online/health-beauty.html\"])[4]")
	private WebElement SShealthbeauty;

	@FindBy(xpath = "(//a[@href=\"/shop-online/sports-fitness.html\"])[4]")
	private WebElement SSsportsfitness;
	
	@FindBy(xpath = "(//a[@href=\"/categories.html\"])[4]")
	private WebElement SScategoriesBOTTOM;
	
	@FindBy(css = "[name=\"header_search_text\"]")
	private WebElement SSsearch;
	
	@FindBy(xpath = "(//div[@class=\"search\"])[2]")
	private WebElement SSsearchbutton;
	
	@FindBy(xpath = "//a[@title=\"Buy online\"]/span")
	private WebElement SSBUYonline;

	public WebElement getSScategories() {
		return SScategories;
	}

	public WebElement getSSFootwearANDBags() {
		return SSFootwearANDBags;
	}

	public WebElement getSSSportsSHOES() {
		return SSSportsSHOES;
	}

	public WebElement getSSLogo() {
		return SSLogo;
	}

	public WebElement getSSLanguageDROPdown() {
		return SSLanguageDROPdown;
	}

	public WebElement getSSlogin() {
		return SSlogin;
	}

	public WebElement getSSclose() {
		return SSclose;
	}

	public WebElement getSSregister() {
		return SSregister;
	}

	public WebElement getSSdownloadAPP() {
		return SSdownloadAPP;
	}

	public WebElement getSSbecomeSELLER() {
		return SSbecomeSELLER;
	}

	public WebElement getSScareertop() {
		return SScareertop;
	}

	public WebElement getSShome() {
		return SShome;
	}

	public WebElement getSSfootwareTravelbags() {
		return SSfootwareTravelbags;
	}

	public WebElement getSSBuyonlineDISPLAY() {
		return SSBuyonlineDISPLAY;
	}

	public WebElement getSSnotAVAILABLEdisplay() {
		return SSnotAVAILABLEdisplay;
	}

	public WebElement getSSItem1() {
		return SSItem1;
	}

	public WebElement getSSItem2() {
		return SSItem2;
	}

	public WebElement getSSItem3() {
		return SSItem3;
	}

	public WebElement getSSItem4() {
		return SSItem4;
	}

	public WebElement getSSItem5() {
		return SSItem5;
	}

	public WebElement getSSbrand1() {
		return SSbrand1;
	}

	public WebElement getSSbrand2() {
		return SSbrand2;
	}

	public WebElement getSSbrand3() {
		return SSbrand3;
	}

	public WebElement getSSbrand4() {
		return SSbrand4;
	}

	public WebElement getSSbrand5() {
		return SSbrand5;
	}

	public WebElement getSSbrand6() {
		return SSbrand6;
	}

	public WebElement getSSbrand7() {
		return SSbrand7;
	}

	public WebElement getSSprice1() {
		return SSprice1;
	}

	public WebElement getSSprice2() {
		return SSprice2;
	}

	public WebElement getSSprice3() {
		return SSprice3;
	}

	public WebElement getSSprice4() {
		return SSprice4;
	}

	public WebElement getSSdiscount1() {
		return SSdiscount1;
	}

	public WebElement getSSdiscount2() {
		return SSdiscount2;
	}

	public WebElement getSSmaterial1() {
		return SSmaterial1;
	}

	public WebElement getSSmaterial2() {
		return SSmaterial2;
	}

	public WebElement getSSmaterial3() {
		return SSmaterial3;
	}

	public WebElement getSStype() {
		return SStype;
	}

	public WebElement getSSsortBY() {
		return SSsortBY;
	}

	public WebElement getSSfromPRICE() {
		return SSfromPRICE;
	}

	public WebElement getSStoPRICE() {
		return SStoPRICE;
	}

	public WebElement getSSgoBUTTON() {
		return SSgoBUTTON;
	}

	public WebElement getSSCOD() {
		return SSCOD;
	}

	public WebElement getSSoutSTOCK() {
		return SSoutSTOCK;
	}

	public WebElement getSSfreespipping() {
		return SSfreespipping;
	}

	public WebElement getSSSetBUTTON() {
		return SSSetBUTTON;
	}

	public WebElement getSSabout() {
		return SSabout;
	}

	public WebElement getSScareerbottom() {
		return SScareerbottom;
	}

	public WebElement getSSpressroom() {
		return SSpressroom;
	}

	public WebElement getSSinvestorrelation() {
		return SSinvestorrelation;
	}

	public WebElement getSSfaq() {
		return SSfaq;
	}

	public WebElement getSSprepurchase() {
		return SSprepurchase;
	}

	public WebElement getSSshippingoptions() {
		return SSshippingoptions;
	}

	public WebElement getSSpaymentoptions() {
		return SSpaymentoptions;
	}

	public WebElement getSSrefund() {
		return SSrefund;
	}

	public WebElement getSSunsubscribe() {
		return SSunsubscribe;
	}

	public WebElement getSSfeedback() {
		return SSfeedback;
	}

	public WebElement getSScontactus() {
		return SScontactus;
	}

	public WebElement getSSbecomASeller() {
		return SSbecomASeller;
	}

	public WebElement getSSsellerfaq() {
		return SSsellerfaq;
	}

	public WebElement getSShotdealsstore() {
		return SShotdealsstore;
	}

	public WebElement getSSappdealcategories() {
		return SSappdealcategories;
	}

	public WebElement getSSsitemap() {
		return SSsitemap;
	}

	public WebElement getSSlivetv() {
		return SSlivetv;
	}

	public WebElement getSSapparelsaccessories() {
		return SSapparelsaccessories;
	}

	public WebElement getSSfootweartravelbags() {
		return SSfootweartravelbags;
	}

	public WebElement getSSmobilephones() {
		return SSmobilephones;
	}

	public WebElement getSScomputersperipherals() {
		return SScomputersperipherals;
	}

	public WebElement getSShomekitchenappliances() {
		return SShomekitchenappliances;
	}

	public WebElement getSShomedecor() {
		return SShomedecor;
	}

	public WebElement getSSjewellerywatches() {
		return SSjewellerywatches;
	}

	public WebElement getSSautomobiles() {
		return SSautomobiles;
	}

	public WebElement getSSconsumerelectronics() {
		return SSconsumerelectronics;
	}

	public WebElement getSStoysnursery() {
		return SStoysnursery;
	}

	public WebElement getSShealthbeauty() {
		return SShealthbeauty;
	}

	public WebElement getSSsportsfitness() {
		return SSsportsfitness;
	}

	public WebElement getSScategoriesBOTTOM() {
		return SScategoriesBOTTOM;
	}

	public WebElement getSSsearch() {
		return SSsearch;
	}

	public WebElement getSSsearchbutton() {
		return SSsearchbutton;
	}
	
	public WebElement getSSBUYonline() {
		return SSBUYonline;
	}

	public void SSheader(String PLanguage) throws InterruptedException {
		
		act = new Actions(driver);
		act.moveToElement(SScategories).build().perform();
		act.moveToElement(SSFootwearANDBags).build().perform();
		act.moveToElement(SSSportsSHOES).build().perform();
		SSSportsSHOES.click();
		SSLogo.click();
		driver.navigate().back();
		select = new Select(SSLanguageDROPdown);
		select.selectByVisibleText(PLanguage);
		Thread.sleep(800);
		SSlogin.click();
		Thread.sleep(800);
		SSclose.click();
		SSregister.click();
		Thread.sleep(800);
		SSclose.click();
		SSdownloadAPP.click();
		driver.navigate().back();
		SSbecomASeller.click();
		driver.navigate().back();
		Thread.sleep(800);
		SScareertop.click();
		driver.navigate().back();
		SShome.click();
		driver.navigate().back();
		SSfootwareTravelbags.click();
		driver.navigate().back();
		
		
		
	}
	
//	public void SSmiddle(String PSportsShoesSearch, String PNotDISPLAY, String PBuyDISPLAY, String Psort1, String Psort2, String Psort3, String Psort4, String Psort5, String Psort6) {
//		
//		SSoutSTOCK.click();
//		SSSetBUTTON.click();
//		
//		SoftAssert sA = new SoftAssert();
//		String Parent = driver.getWindowHandle();
//		SSItem1.click();
//		wait.until(ExpectedConditions.numberOfWindowsToBe(2));
//		Set<String> allWindows = driver.getWindowHandles();
//		for (String window : allWindows) {
//			if (!window.equals(Parent)) {
//		        driver.switchTo().window(window);
//		        break;
//		    }
//		}
//		String Display = SSBUYonline.getText();
//		sA.assertEquals(Display, PBuyDISPLAY);
//		sA.assertAll();
//		driver.close();
//		driver.switchTo().window(Parent);
//		
//		SSItem2.click();
//		wait.until(ExpectedConditions.numberOfWindowsToBe(2));
//		Set<String> allWindows1 = driver.getWindowHandles();
//		for (String window : allWindows1) {
//		    if (!window.equals(Parent)) {
//		        driver.switchTo().window(window);
//		        break;
//		    }
//		}
//		String Display1 = SSBUYonline.getText();
//		sA.assertEquals(Display1, PNotDISPLAY);
//		sA.assertAll();
//		driver.close();
//		driver.switchTo().window(Parent);
//		
//		SSItem3.click();
//		wait.until(ExpectedConditions.numberOfWindowsToBe(2));
//		Set<String> allWindows2 = driver.getWindowHandles();
//		for (String window : allWindows2) {
//		    if (!window.equals(Parent)) {
//		        driver.switchTo().window(window);
//		        break;
//		    }
//		}
//		String Display2 = SSBUYonline.getText();
//		sA.assertEquals(Display2, PNotDISPLAY);
//		sA.assertAll();
//		driver.close();
//		driver.switchTo().window(Parent);
//		
//		SSItem4.click();
//		wait.until(ExpectedConditions.numberOfWindowsToBe(2));
//		Set<String> allWindows3 = driver.getWindowHandles();
//		for (String window : allWindows3) {
//		    if (!window.equals(Parent)) {
//		        driver.switchTo().window(window);
//		        break;
//		    }
//		}
//		String Display3 = SSBUYonline.getText();
//		sA.assertEquals(Display3, PNotDISPLAY);
//		sA.assertAll();
//		driver.close();
//		driver.switchTo().window(Parent);
//		
//		SSItem5.click();
//		wait.until(ExpectedConditions.numberOfWindowsToBe(2));
//		Set<String> allWindows4 = driver.getWindowHandles();
//		for (String window : allWindows4) {
//		    if (!window.equals(Parent)) {
//		        driver.switchTo().window(window);
//		        break;
//		    }
//		}
//		String Display4 = SSBUYonline.getText();
//		sA.assertEquals(Display4, PNotDISPLAY);
//		sA.assertAll();
//		driver.close();
//		driver.switchTo().window(Parent);
//		
//		select = new Select(SSsortBY);
//		select.selectByVisibleText(Psort1);
//		select.selectByVisibleText(Psort2);
//		select.selectByVisibleText(Psort3);
//		select.selectByVisibleText(Psort4);
//		select.selectByVisibleText(Psort5);
//		select.selectByVisibleText(Psort6);
//		
//		SSsearch.sendKeys(PSportsShoesSearch);
//		SSsearch.click();
//		
//	}
	
	public void SSLeftbar(String PFromPrice, String PToPrice) throws InterruptedException {
		
		SSCOD.click();
		SSSetBUTTON.click();
		SSCOD.click();
		SSoutSTOCK.click();
		SSSetBUTTON.click();
		SSoutSTOCK.click();
		SSfreespipping.click();
		SSSetBUTTON.click();
		SSfreespipping.click();
		SSSetBUTTON.click();
		Thread.sleep(800);
		SSbrand1.click();
		Thread.sleep(800);
		SSbrand2.click();
		Thread.sleep(800);
		SSbrand3.click();
		Thread.sleep(800);
		SSbrand4.click();
		Thread.sleep(800);
		SSbrand5.click();
		Thread.sleep(800);
		SSbrand6.click();
		Thread.sleep(800);
		SSbrand7.click();
		Thread.sleep(800);
		SSbrand1.click();
		Thread.sleep(800);
		SSbrand2.click();
		Thread.sleep(800);
		SSbrand3.click();
		Thread.sleep(800);
		SSbrand4.click();
		Thread.sleep(800);
		SSbrand5.click();
		Thread.sleep(800);
		SSbrand6.click();
		Thread.sleep(800);
		SSbrand7.click();
		Thread.sleep(800);
		
		SSprice1.click();
		Thread.sleep(800);
		SSprice2.click();
		Thread.sleep(800);
		SSprice3.click();
		Thread.sleep(800);
		SSprice4.click();
		Thread.sleep(800);
		SSprice1.click();
		Thread.sleep(800);
		SSprice2.click();
		Thread.sleep(800);
		SSprice3.click();
		Thread.sleep(800);
		SSprice4.click();
		Thread.sleep(800);
		
		SSmaterial1.click();
		Thread.sleep(800);
		SSmaterial2.click();
		Thread.sleep(800);
		SSmaterial3.click();
		Thread.sleep(800);
		SSmaterial1.click();
		Thread.sleep(800);
		SSmaterial2.click();
		Thread.sleep(800);
		SSmaterial3.click();
		Thread.sleep(800);
		
		SStype.click();
		Thread.sleep(800);
		SStype.click();
		Thread.sleep(800);
		SSfromPRICE.sendKeys(PFromPrice);
		SStoPRICE.sendKeys(PToPrice);
		SSgoBUTTON.click();
		
	}
	
	public void SSfooter(String PSportsShoesURL) throws InterruptedException {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to(PSportsShoesURL);
		SSabout.click();
		driver.navigate().back();
		Thread.sleep(500);
		SScareerbottom.click();
		driver.navigate().back();
		Thread.sleep(500);
		SSpressroom.click();
		driver.navigate().back();
		Thread.sleep(500);
		SSinvestorrelation.click();
		driver.navigate().back();
		Thread.sleep(500);
		SSfaq.click();
		driver.navigate().back();
		Thread.sleep(500);
		SSprepurchase.click();
		driver.navigate().back();
		Thread.sleep(500);
		SSshippingoptions.click();
		driver.navigate().back();
		Thread.sleep(500);
		SSrefund.click();
		driver.navigate().back();
		Thread.sleep(500);
		SSunsubscribe.click();
		driver.navigate().back();
		Thread.sleep(500);
		SSfeedback.click();
		driver.navigate().back();
		Thread.sleep(500);
		SScontactus.click();
		driver.navigate().back();
		Thread.sleep(500);
		SSbecomASeller.click();
		driver.navigate().back();
		Thread.sleep(500);
		SSsellerfaq.click();
		driver.navigate().back();
		Thread.sleep(500);
		SShotdealsstore.click();
		driver.navigate().back();
		Thread.sleep(500);
		SSsitemap.click();
		driver.navigate().back();
		Thread.sleep(500);
		SSlivetv.click();
		driver.navigate().back();
		Thread.sleep(500);
		SSapparelsaccessories.click();
		driver.navigate().back();
		Thread.sleep(500);
		SSmobilephones.click();
		driver.navigate().back();
		Thread.sleep(500);
		SScomputersperipherals.click();
		driver.navigate().back();
		Thread.sleep(500);
		SShomekitchenappliances.click();
		driver.navigate().back();
		Thread.sleep(500);
		SShomedecor.click();
		driver.navigate().back();
		Thread.sleep(500);
		SSjewellerywatches.click();
		driver.navigate().back();
		Thread.sleep(500);
		SSautomobiles.click();
		driver.navigate().back();
		Thread.sleep(500);
		SSconsumerelectronics.click();
		driver.navigate().back();
		Thread.sleep(500);
		SStoysnursery.click();
		driver.navigate().back();
		Thread.sleep(500);
		SShealthbeauty.click();
		driver.navigate().back();
		Thread.sleep(500);
		SSsportsfitness.click();
		driver.navigate().back();
		Thread.sleep(500);
		SScategoriesBOTTOM.click();
		driver.navigate().back();
		
	}
	
}
