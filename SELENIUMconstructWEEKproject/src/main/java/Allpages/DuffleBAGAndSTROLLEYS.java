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

public class DuffleBAGAndSTROLLEYS {

WebDriver driver;
WebDriverWait wait;
Actions act;
Select select;
JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
	
	public DuffleBAGAndSTROLLEYS(WebDriver driver) {
		
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(className = "cate_head")
	private WebElement DBScategories;
	
	@FindBy(xpath = "(//span[@class='catIconMenu footwear'])[1]")
	private WebElement DBSFootwearANDBags;
	
	@FindBy(xpath = "(//a[@href='/shop-online/footwear-travel-bags/travel-utility-bags/duffle-bags.html'])[1]")
	private WebElement DBSdufflebags;
	
	@FindBy(xpath = "(//img[@title=\"Online Shopping in India\"])[2]")
	private WebElement DBSLogo;
	
	@FindBy(id = "localization_dropdown")
	private WebElement DBSLanguageDROPdown;
	
	@FindBy(id = "login-panel-link")
	private WebElement DBSlogin;
	
	@FindBy(css = "[title='Close']")
	private WebElement DBSclose;
	
	@FindBy(id = "registration-panel-link")
	private WebElement DBSregister;
	
	@FindBy(xpath = "(//a[@href=\"/mobile-apps.html\"])[1]")
	private WebElement DBSdownloadAPP;
	
	@FindBy(xpath = "(//a[@href=\"/faces/jsp/becomeASeller/becomASeller.jsp\"])[1]")
	private WebElement DBSbecomeSELLER;
	
	@FindBy(xpath = "(//a[@href=\"/aboutus/career.html\"])[1]")
	private WebElement DBScareertop;
	
	@FindBy(xpath = "(//a[@href='/'])[4]")
	private WebElement DBShome;
	
	@FindBy(xpath = "(//a[@href='/shop-online/footwear-travel-bags.html'])[3]")
	private WebElement DBSfootwareTravelbags;
	
	@FindBy(xpath = "(//a[@class='button_1'])[1]")
	private WebElement DBSsetButton;
	
	@FindBy(css = "[title=\"Scottish Club Set of 7 Family Travel Bags (7DB2K)\"]")
	private WebElement DBSItem1;
	
	@FindBy(xpath = "(//a[@title=\"Scottish Club Set of 7 Family Travel Bags (7DB1C)\"])[1]")
	private WebElement DBSItem2;
	
	@FindBy(css = "[title=\"Large Convertible Duffle Backpack Bag (2HB1)\"]")
	private WebElement DBSItem3;
	
	@FindBy(css = "[title=\"6 Pcs Travel Suitcase Organiser (6TO-1)\"]")
	private WebElement DBSItem4;
	
	@FindBy(css = "[title=\"Leatherrite Set of 5 Travel Bags Combo\"]")
	private WebElement DBSItem5;
	
	@FindBy(css = "[title=\"Foldable Travel bag (FTB)\"]")
	private WebElement DBSItem6;
	
	@FindBy(id = "iscod")
	private WebElement DBSCOD;
	
	@FindBy(id = "isexoutStock")
	private WebElement DBSoutSTOCK;
	
	@FindBy(id = "isexoutStock")
	private WebElement DBSfreespipping;
	
	@FindBy(css = "[onclick=\"productSearch.setPersonalisedFilter(false);\"]")
	private WebElement DBSSetBUTTON;
	
	@FindBy(id = "brandFilterBox38493")
	private WebElement DBSbrand1;
	
	@FindBy(id = "brandFilterBox8313")
	private WebElement DBSbrand2;
	
	@FindBy(id = "brandFilterBox36045")
	private WebElement DBSbrand3;
	
	@FindBy(id = "brandFilterBox39071")
	private WebElement DBSbrand4;
	
	@FindBy(id = "priceFilterBox1")
	private WebElement DBSprice1;
	
	@FindBy(id = "priceFilterBox2")
	private WebElement DBSprice2;
	
	@FindBy(id = "priceFilterBox3")
	private WebElement DBSprice3;
	
	@FindBy(id = "priceFilterBox4")
	private WebElement DBSprice4;
	
	@FindBy(id = "priceFilterBox5")
	private WebElement DBSprice5;
	
	@FindBy(id = "priceFilterBox6")
	private WebElement DBSprice6;
	
	@FindBy(id = "priceFilterBox7")
	private WebElement DBSprice7;
	
	@FindBy(id = "priceFilterBox8")
	private WebElement DBSprice8;
	
	@FindBy(id = "discountFilterBox1")
	private WebElement DBSdiscount1;
	
	@FindBy(id = "discountFilterBox2")
	private WebElement DBSdiscount2;
	
	@FindBy(id = "discountFilterBox3")
	private WebElement DBSdiscount3;
	
	@FindBy(id = "discountFilterBox4")
	private WebElement DBSdiscount4;
	
	@FindBy(id = "featureFilterBox0f1")
	private WebElement DBSfilter1;
	
	@FindBy(id = "featureFilterBox1f1")
	private WebElement DBSfilter2;
	
	@FindBy(id = "featureFilterBox0f2")
	private WebElement DBStype1;
	
	@FindBy(id = "featureFilterBox1f2")
	private WebElement DBStype2;
	
	@FindBy(id = "featureFilterBox2f2")
	private WebElement DBStype3;
	
	@FindBy(id = "featureFilterBox3f2")
	private WebElement DBStype4;
	
	@FindBy(id = "brandtoggle")
	private WebElement DBSbrandTOGGLE;
	
	@FindBy(id = "pricetoggle")
	private WebElement DBSpriceTOGGLE;
	
	@FindBy(id = "discounttoggle")
	private WebElement DBSdiscountTOGGLE;
	
	@FindBy(id = "featuretoggle1")
	private WebElement DBSfilterTOGGLE;
	
	@FindBy(id = "featuretoggle2")
	private WebElement DBStypeTOGGLE;
	
	@FindBy(id = "fromPriceRange")
	private WebElement DBSfromPRICE;
	
	@FindBy(id = "toPriceRange")
	private WebElement DBStoPRICE;
	
	@FindBy(xpath = "(//a[@class=\"button_1\"])[2]")
	private WebElement DBSgoBUTTON;
	
	@FindBy(id = "sortByFilter")
	private WebElement DBSsortBY;	
	
	@FindBy(css = "[href=\"/aboutus/about-naaptol.html\"]")
	private WebElement DBSabout;
	
	@FindBy(xpath = "(//a[@href=\"/aboutus/career.html\"])[2]")
	private WebElement DBScareerbottom;
	
	@FindBy(css = "[href=\"/aboutus/pressroom.html\"]")
	private WebElement DBSpressroom;
	
	@FindBy(css = "[href=\"/aboutus/investor-relation.html\"]")
	private WebElement DBSinvestorrelation;
	
	@FindBy(css = "[href=\"/help/faq.html\"]")
	private WebElement DBSfaq;
	
	@FindBy(css = "[href=\"/help/pre-purchase.html\"]")
	private WebElement DBSprepurchase;
	
	@FindBy(css = "[href=\"/help/shipping-options.html\"]")
	private WebElement DBSshippingoptions;
	
	@FindBy(css = "[href=\"/help/payment-options.html\"]")
	private WebElement DBSpaymentoptions;
	
	@FindBy(css = "[href=\"https://www.naaptol.com/refund-n-return.html\"]")
	private WebElement DBSrefund;
	
	@FindBy(css = "[href=\"/help/unsubscribe.html\"]")
	private WebElement DBSunsubscribe;
	
	@FindBy(css = "[href=\"/customer-support/feedback.html\"]")
	private WebElement DBSfeedback;
	
	@FindBy(css = "[href=\"/customer-support/contactus.html\"]")
	private WebElement DBScontactus;
	
	@FindBy(xpath = "(//a[@href=\"/faces/jsp/becomeASeller/becomASeller.jsp\"])[2]")
	private WebElement DBSbecomASeller;
	
	@FindBy(css = "[href=\"/customer-support/seller-faq.html\"]")
	private WebElement DBSsellerfaq;
	
	@FindBy(css = "[href=\"/online-store/hot-deals-store/si-1435-p.html\"]")
	private WebElement DBShotdealsstore;
	
	@FindBy(css = "[href=\"/app-deal-categories.html\"]")
	private WebElement DBSappdealcategories;
	
	@FindBy(css = "[href=\"/sitemap.html\"]")
	private WebElement DBSsitemap;
	
	@FindBy(css = "[href=\"/live-tv/schedule.html\"]")
	private WebElement DBSlivetv;
	
	@FindBy(xpath = "(//a[@href=\"/shop-online/apparels-accessories.html\"])[4]")
	private WebElement DBSapparelsaccessories;
	
	@FindBy(xpath = "(//a[@href=\"/shop-online/footwear-travel-bags.html\"])[5]")
	private WebElement DBSfootweartravelbags;
	
	@FindBy(xpath = "(//a[@href=\"/shop-online/mobile-phones.html\"])[4]")
	private WebElement DBSmobilephones;
	
	@FindBy(xpath = "(//a[@href=\"/shop-online/computers-peripherals.html\"])[4]")
	private WebElement DBScomputersperipherals;
	
	@FindBy(xpath = "(//a[@href=\"/shop-online/home-kitchen-appliances.html\"])[4]")
	private WebElement DBShomekitchenappliances;
	
	@FindBy(xpath = "(//a[@href=\"/shop-online/home-decor.html\"])[4]")
	private WebElement DBShomedecor;
	
	@FindBy(xpath = "(//a[@href=\"/shop-online/jewellery-watches.html\"])[4]")
	private WebElement DBSjewellerywatches;
	
	@FindBy(xpath = "(//a[@href=\"/shop-online/automobiles.html\"])[4]")
	private WebElement DBSautomobiles;
	
	@FindBy(xpath = "(//a[@href=\"/shop-online/consumer-electronics.html\"])[4]")
	private WebElement DBSconsumerelectronics;
	
	@FindBy(xpath = "(//a[@href=\"/shop-online/toys-nursery.html\"])[4]")
	private WebElement DBStoysnursery;
	
	@FindBy(xpath = "(//a[@href=\"/shop-online/health-beauty.html\"])[4]")
	private WebElement DBShealthbeauty;

	@FindBy(xpath = "(//a[@href=\"/shop-online/sports-fitness.html\"])[4]")
	private WebElement DBSsportsfitness;
	
	@FindBy(xpath = "(//a[@href=\"/categories.html\"])[4]")
	private WebElement DBScategoriesBOTTOM;
	
	@FindBy(css = "[name=\"header_search_text\"]")
	private WebElement DBSsearch;
	
	@FindBy(xpath = "(//div[@class=\"search\"])[2]")
	private WebElement DBSsearchbutton;
	
	@FindBy(xpath = "//a[@title=\"Buy online\"]/span")
	private WebElement DBSBUYonline;
	
	@FindBy(xpath = "//li[@id=\"productPriceDisplay\"]/span")
	private WebElement DBSnotAVAILABLEdisplay;

	public WebElement getDBScategories() {
		return DBScategories;
	}

	public WebElement getDBSFootwearANDBags() {
		return DBSFootwearANDBags;
	}

	public WebElement getDBSdufflebags() {
		return DBSdufflebags;
	}

	public WebElement getDBSLogo() {
		return DBSLogo;
	}

	public WebElement getDBSLanguageDROPdown() {
		return DBSLanguageDROPdown;
	}

	public WebElement getDBSlogin() {
		return DBSlogin;
	}

	public WebElement getDBSclose() {
		return DBSclose;
	}

	public WebElement getDBSregister() {
		return DBSregister;
	}

	public WebElement getDBSdownloadAPP() {
		return DBSdownloadAPP;
	}

	public WebElement getDBSbecomeSELLER() {
		return DBSbecomeSELLER;
	}

	public WebElement getDBScareertop() {
		return DBScareertop;
	}

	public WebElement getDBShome() {
		return DBShome;
	}

	public WebElement getDBSfootwareTravelbags() {
		return DBSfootwareTravelbags;
	}

	public WebElement getDBSsetButton() {
		return DBSsetButton;
	}

	public WebElement getDBSItem1() {
		return DBSItem1;
	}

	public WebElement getDBSItem2() {
		return DBSItem2;
	}

	public WebElement getDBSItem3() {
		return DBSItem3;
	}

	public WebElement getDBSItem4() {
		return DBSItem4;
	}

	public WebElement getDBSItem5() {
		return DBSItem5;
	}

	public WebElement getDBSItem6() {
		return DBSItem6;
	}

	public WebElement getDBSCOD() {
		return DBSCOD;
	}

	public WebElement getDBSoutSTOCK() {
		return DBSoutSTOCK;
	}

	public WebElement getDBSfreespipping() {
		return DBSfreespipping;
	}

	public WebElement getDBSSetBUTTON() {
		return DBSSetBUTTON;
	}

	public WebElement getDBSbrand1() {
		return DBSbrand1;
	}

	public WebElement getDBSbrand2() {
		return DBSbrand2;
	}

	public WebElement getDBSbrand3() {
		return DBSbrand3;
	}

	public WebElement getDBSbrand4() {
		return DBSbrand4;
	}

	public WebElement getDBSprice1() {
		return DBSprice1;
	}

	public WebElement getDBSprice2() {
		return DBSprice2;
	}

	public WebElement getDBSprice3() {
		return DBSprice3;
	}

	public WebElement getDBSprice4() {
		return DBSprice4;
	}

	public WebElement getDBSprice5() {
		return DBSprice5;
	}

	public WebElement getDBSprice6() {
		return DBSprice6;
	}

	public WebElement getDBSprice7() {
		return DBSprice7;
	}

	public WebElement getDBSprice8() {
		return DBSprice8;
	}

	public WebElement getDBSdiscount1() {
		return DBSdiscount1;
	}

	public WebElement getDBSdiscount2() {
		return DBSdiscount2;
	}

	public WebElement getDBSdiscount3() {
		return DBSdiscount3;
	}

	public WebElement getDBSdiscount4() {
		return DBSdiscount4;
	}

	public WebElement getDBSfilter1() {
		return DBSfilter1;
	}

	public WebElement getDBSfilter2() {
		return DBSfilter2;
	}

	public WebElement getDBStype1() {
		return DBStype1;
	}

	public WebElement getDBStype2() {
		return DBStype2;
	}

	public WebElement getDBStype3() {
		return DBStype3;
	}

	public WebElement getDBStype4() {
		return DBStype4;
	}

	public WebElement getDBSbrandTOGGLE() {
		return DBSbrandTOGGLE;
	}

	public WebElement getDBSpriceTOGGLE() {
		return DBSpriceTOGGLE;
	}

	public WebElement getDBSdiscountTOGGLE() {
		return DBSdiscountTOGGLE;
	}

	public WebElement getDBSfilterTOGGLE() {
		return DBSfilterTOGGLE;
	}

	public WebElement getDBStypeTOGGLE() {
		return DBStypeTOGGLE;
	}

	public WebElement getDBSfromPRICE() {
		return DBSfromPRICE;
	}

	public WebElement getDBStoPRICE() {
		return DBStoPRICE;
	}

	public WebElement getDBSgoBUTTON() {
		return DBSgoBUTTON;
	}

	public WebElement getDBSsortBY() {
		return DBSsortBY;
	}

	public WebElement getDBSabout() {
		return DBSabout;
	}

	public WebElement getDBScareerbottom() {
		return DBScareerbottom;
	}

	public WebElement getDBSpressroom() {
		return DBSpressroom;
	}

	public WebElement getDBSinvestorrelation() {
		return DBSinvestorrelation;
	}

	public WebElement getDBSfaq() {
		return DBSfaq;
	}

	public WebElement getDBSprepurchase() {
		return DBSprepurchase;
	}

	public WebElement getDBSshippingoptions() {
		return DBSshippingoptions;
	}

	public WebElement getDBSpaymentoptions() {
		return DBSpaymentoptions;
	}

	public WebElement getDBSrefund() {
		return DBSrefund;
	}

	public WebElement getDBSunsubscribe() {
		return DBSunsubscribe;
	}

	public WebElement getDBSfeedback() {
		return DBSfeedback;
	}

	public WebElement getDBScontactus() {
		return DBScontactus;
	}

	public WebElement getDBSbecomASeller() {
		return DBSbecomASeller;
	}

	public WebElement getDBSsellerfaq() {
		return DBSsellerfaq;
	}

	public WebElement getDBShotdealsstore() {
		return DBShotdealsstore;
	}

	public WebElement getDBSappdealcategories() {
		return DBSappdealcategories;
	}

	public WebElement getDBSsitemap() {
		return DBSsitemap;
	}

	public WebElement getDBSlivetv() {
		return DBSlivetv;
	}

	public WebElement getDBSapparelsaccessories() {
		return DBSapparelsaccessories;
	}

	public WebElement getDBSfootweartravelbags() {
		return DBSfootweartravelbags;
	}

	public WebElement getDBSmobilephones() {
		return DBSmobilephones;
	}

	public WebElement getDBScomputersperipherals() {
		return DBScomputersperipherals;
	}

	public WebElement getDBShomekitchenappliances() {
		return DBShomekitchenappliances;
	}

	public WebElement getDBShomedecor() {
		return DBShomedecor;
	}

	public WebElement getDBSjewellerywatches() {
		return DBSjewellerywatches;
	}

	public WebElement getDBSautomobiles() {
		return DBSautomobiles;
	}

	public WebElement getDBSconsumerelectronics() {
		return DBSconsumerelectronics;
	}

	public WebElement getDBStoysnursery() {
		return DBStoysnursery;
	}

	public WebElement getDBShealthbeauty() {
		return DBShealthbeauty;
	}

	public WebElement getDBSsportsfitness() {
		return DBSsportsfitness;
	}

	public WebElement getDBScategoriesBOTTOM() {
		return DBScategoriesBOTTOM;
	}

	public WebElement getDBSsearch() {
		return DBSsearch;
	}

	public WebElement getDBSsearchbutton() {
		return DBSsearchbutton;
	}
	
	public WebElement getDBSBUYonline() {
		return DBSBUYonline;
	}

	public WebElement getDBSnotAVAILABLEdisplay() {
		return DBSnotAVAILABLEdisplay;
	}

	public void DBSheader(String PLanguage) throws InterruptedException {
		
		act = new Actions(driver);
		act.moveToElement(DBScategories).build().perform();
		act.moveToElement(DBSFootwearANDBags).build().perform();
		act.moveToElement(DBSdufflebags).build().perform();
		DBSdufflebags.click();
		DBSLogo.click();
		driver.navigate().back();
		select = new Select(DBSLanguageDROPdown);
		select.selectByVisibleText(PLanguage);
		Thread.sleep(1000);
		DBSlogin.click();
		Thread.sleep(1000);
		DBSclose.click();
		DBSregister.click();
		Thread.sleep(1000);
		DBSclose.click();
		DBSdownloadAPP.click();
		driver.navigate().back();
		DBSbecomASeller.click();
		driver.navigate().back();
		DBScareertop.click();
		driver.navigate().back();
		DBShome.click();
		driver.navigate().back();
		DBSfootwareTravelbags.click();
		driver.navigate().back();
		
		DBSoutSTOCK.click();
		DBSSetBUTTON.click();
		
	}
	
//	public void DBSmiddle(String PNotDISPLAY, String PDuffleBagAndStrolleysSearch, String Psort1, String Psort2, String Psort3, String Psort4, String Psort5, String Psort6) {
//		
//		DBSoutSTOCK.click();
//		DBSSetBUTTON.click();
//		
//		SoftAssert sA = new SoftAssert();
//		String Parent = driver.getWindowHandle();
//		DBSItem1.click();
//		wait.until(ExpectedConditions.numberOfWindowsToBe(2));
//		Set<String> allWindows = driver.getWindowHandles();
//		for (String window : allWindows) {
//			if (!window.equals(Parent)) {
//		        driver.switchTo().window(window);
//		        break;
//		    }
//		}
//		String Display = DBSBUYonline.getText();
//		sA.assertEquals(Display, PNotDISPLAY);
//		sA.assertAll();
//		driver.close();
//		driver.switchTo().window(Parent);
//		
//		DBSItem2.click();
//		wait.until(ExpectedConditions.numberOfWindowsToBe(2));
//		Set<String> allWindows1 = driver.getWindowHandles();
//		for (String window : allWindows1) {
//		    if (!window.equals(Parent)) {
//		        driver.switchTo().window(window);
//		        break;
//		    }
//		}
//		String Display1 = DBSBUYonline.getText();
//		sA.assertEquals(Display1, PNotDISPLAY);
//		sA.assertAll();
//		driver.close();
//		driver.switchTo().window(Parent);
//		
//		DBSItem3.click();
//		wait.until(ExpectedConditions.numberOfWindowsToBe(2));
//		Set<String> allWindows2 = driver.getWindowHandles();
//		for (String window : allWindows2) {
//		    if (!window.equals(Parent)) {
//		        driver.switchTo().window(window);
//		        break;
//		    }
//		}
//		String Display2 = DBSBUYonline.getText();
//		sA.assertEquals(Display2, PNotDISPLAY);
//		sA.assertAll();
//		driver.close();
//		driver.switchTo().window(Parent);
//		
//		DBSItem4.click();
//		wait.until(ExpectedConditions.numberOfWindowsToBe(2));
//		Set<String> allWindows3 = driver.getWindowHandles();
//		for (String window : allWindows3) {
//		    if (!window.equals(Parent)) {
//		        driver.switchTo().window(window);
//		        break;
//		    }
//		}
//		String Display3 = DBSBUYonline.getText();
//		sA.assertEquals(Display3, PNotDISPLAY);
//		sA.assertAll();
//		driver.close();
//		driver.switchTo().window(Parent);
//		
//		DBSItem5.click();
//		wait.until(ExpectedConditions.numberOfWindowsToBe(2));
//		Set<String> allWindows4 = driver.getWindowHandles();
//		for (String window : allWindows4) {
//		    if (!window.equals(Parent)) {
//		        driver.switchTo().window(window);
//		        break;
//		    }
//		}
//		String Display4 = DBSBUYonline.getText();
//		sA.assertEquals(Display4, PNotDISPLAY);
//		sA.assertAll();
//		driver.close();
//		driver.switchTo().window(Parent);
//		
//		DBSItem6.click();
//		wait.until(ExpectedConditions.numberOfWindowsToBe(2));
//		Set<String> allWindows5 = driver.getWindowHandles();
//		for (String window : allWindows5) {
//		    if (!window.equals(Parent)) {
//		        driver.switchTo().window(window);
//		        break;
//		    }
//		}
//		String Display5 = DBSBUYonline.getText();
//		sA.assertEquals(Display5, PNotDISPLAY);
//		sA.assertAll();
//		driver.close();
//		driver.switchTo().window(Parent);
//		
//		select = new Select(DBSsortBY);
//		select.selectByVisibleText(Psort1);
//		select.selectByVisibleText(Psort2);
//		select.selectByVisibleText(Psort3);
//		select.selectByVisibleText(Psort4);
//		select.selectByVisibleText(Psort5);
//		select.selectByVisibleText(Psort6);
//		
//		DBSsearch.sendKeys(PDuffleBagAndStrolleysSearch);
//		DBSsearchbutton.click();
//		
//	}
	
	public void DBSLeftbar(String PFromPrice, String PToPrice) throws InterruptedException {
		
		DBSCOD.click();
		DBSSetBUTTON.click();
		DBSCOD.click();
		DBSoutSTOCK.click();
		DBSSetBUTTON.click();
		DBSoutSTOCK.click();
		DBSfreespipping.click();
		DBSSetBUTTON.click();
		DBSfreespipping.click();
		DBSSetBUTTON.click();
		
		
		DBSprice1.click();
		Thread.sleep(1000);
		DBSprice2.click();
		Thread.sleep(1000);
		DBSprice3.click();
		Thread.sleep(1000);
		DBSprice4.click();
		Thread.sleep(1000);
		DBSprice5.click();
		Thread.sleep(1000);
		DBSprice6.click();
		Thread.sleep(1000);
		DBSprice7.click();
		Thread.sleep(1000);
		DBSprice1.click();
		Thread.sleep(1000);
		DBSprice2.click();
		Thread.sleep(1000);
		DBSprice3.click();
		Thread.sleep(1000);
		DBSprice4.click();
		Thread.sleep(1000);
		DBSprice5.click();
		Thread.sleep(1000);
		DBSprice6.click();
		Thread.sleep(1000);
		DBSprice7.click();
		Thread.sleep(1000);
		
		DBSdiscount1.click();
		Thread.sleep(1000);
		DBSdiscount2.click();
		Thread.sleep(1000);
		DBSdiscount3.click();
		Thread.sleep(1000);
		DBSdiscount4.click();
		Thread.sleep(1000);
		DBSdiscount1.click();
		Thread.sleep(1000);
		DBSdiscount2.click();
		Thread.sleep(1000);
		DBSdiscount3.click();
		Thread.sleep(1000);
		DBSdiscount4.click();
		Thread.sleep(1000);
		
		DBSfilter1.click();
		Thread.sleep(1000);
		DBSfilter2.click();
		Thread.sleep(1000);
		DBSfilter1.click();
		Thread.sleep(1000);
		DBSfilter2.click();
		Thread.sleep(1000);
		
		DBStype1.click();
		Thread.sleep(1000);
		DBStype2.click();
		Thread.sleep(1000);
		DBStype3.click();
		Thread.sleep(1000);
		DBStype4.click();
		Thread.sleep(1000);
		DBStype1.click();
		Thread.sleep(1000);
		DBStype2.click();
		Thread.sleep(1000);
		DBStype3.click();
		Thread.sleep(1000);
		DBStype4.click();
		Thread.sleep(1000);
		
		DBSbrandTOGGLE.click();
		DBSbrandTOGGLE.click();
		DBSpriceTOGGLE.click();
		DBSpriceTOGGLE.click();
		DBSdiscountTOGGLE.click();
		DBSdiscountTOGGLE.click();
		DBSfilterTOGGLE.click();
		DBSfilterTOGGLE.click();
		DBStypeTOGGLE.click();
		DBStypeTOGGLE.click();
		
		DBSfromPRICE.sendKeys(PFromPrice);
		DBStoPRICE.sendKeys(PToPrice);
		DBSgoBUTTON.click();
		
	}
	
	public void DBSfooter(String PDuffleBagAndStrolleysURL) throws InterruptedException {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to(PDuffleBagAndStrolleysURL);
		DBSabout.click();
		driver.navigate().back();
		Thread.sleep(500);
		DBScareerbottom.click();
		driver.navigate().back();
		Thread.sleep(500);
		DBSpressroom.click();
		driver.navigate().back();
		Thread.sleep(500);
		DBSinvestorrelation.click();
		driver.navigate().back();
		Thread.sleep(500);
		DBSfaq.click();
		driver.navigate().back();
		Thread.sleep(500);
		DBSprepurchase.click();
		driver.navigate().back();
		Thread.sleep(500);
		DBSshippingoptions.click();
		driver.navigate().back();
		Thread.sleep(500);
		DBSrefund.click();
		driver.navigate().back();
		Thread.sleep(500);
		DBSunsubscribe.click();
		driver.navigate().back();
		Thread.sleep(500);
		DBSfeedback.click();
		driver.navigate().back();
		Thread.sleep(500);
		DBScontactus.click();
		driver.navigate().back();
		Thread.sleep(500);
		DBSbecomASeller.click();
		driver.navigate().back();
		Thread.sleep(500);
		DBSsellerfaq.click();
		driver.navigate().back();
		Thread.sleep(500);
		DBShotdealsstore.click();
		driver.navigate().back();
		Thread.sleep(500);
		DBSsitemap.click();
		driver.navigate().back();
		Thread.sleep(500);
		DBSlivetv.click();
		driver.navigate().back();
		Thread.sleep(500);
		DBSapparelsaccessories.click();
		driver.navigate().back();
		Thread.sleep(500);
		DBSmobilephones.click();
		driver.navigate().back();
		Thread.sleep(500);
		DBScomputersperipherals.click();
		driver.navigate().back();
		Thread.sleep(500);
		DBShomekitchenappliances.click();
		driver.navigate().back();
		Thread.sleep(500);
		DBShomedecor.click();
		driver.navigate().back();
		Thread.sleep(500);
		DBSjewellerywatches.click();
		driver.navigate().back();
		Thread.sleep(500);
		DBSautomobiles.click();
		driver.navigate().back();
		Thread.sleep(500);
		DBSconsumerelectronics.click();
		driver.navigate().back();
		Thread.sleep(500);
		DBStoysnursery.click();
		driver.navigate().back();
		Thread.sleep(500);
		DBShealthbeauty.click();
		driver.navigate().back();
		Thread.sleep(500);
		DBSsportsfitness.click();
		driver.navigate().back();
		Thread.sleep(500);
		DBScategoriesBOTTOM.click();
		driver.navigate().back();
		
	}
	
}
