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

public class BOOTS {

WebDriver driver;
WebDriverWait wait;
Actions act;
Select select;
JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
	
	public BOOTS(WebDriver driver) {
		
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(className = "cate_head")
	private WebElement Bcategories;
	
	@FindBy(xpath = "(//span[@class='catIconMenu footwear'])[1]")
	private WebElement BFootwearANDBags;
	
	@FindBy(xpath = "(//a[@href='/shop-online/footwear-travel-bags/mens-footwear/boots.html'])[1]")
	private WebElement Bboots;
	
	@FindBy(xpath = "(//img[@title=\"Online Shopping in India\"])[2]")
	private WebElement BLogo;
	
	@FindBy(id = "localization_dropdown")
	private WebElement BLanguageDROPdown;
	
	@FindBy(id = "login-panel-link")
	private WebElement Blogin;
	
	@FindBy(css = "[title='Close']")
	private WebElement Bclose;
	
	@FindBy(id = "registration-panel-link")
	private WebElement Bregister;
	
	@FindBy(xpath = "(//a[@href=\"/mobile-apps.html\"])[1]")
	private WebElement BdownloadAPP;
	
	@FindBy(xpath = "(//a[@href=\"/faces/jsp/becomeASeller/becomASeller.jsp\"])[1]")
	private WebElement BbecomeSELLER;
	
	@FindBy(xpath = "(//a[@href=\"/aboutus/career.html\"])[1]")
	private WebElement Bcareertop;
	
	@FindBy(xpath = "(//a[@href='/'])[4]")
	private WebElement Bhome;
	
	@FindBy(xpath = "(//a[@href='/shop-online/footwear-travel-bags.html'])[3]")
	private WebElement BfootwareTravelbags;
	
	@FindBy(xpath = "(//a[@class='button_1'])[1]")
	private WebElement BsetButton;
	
	@FindBy(css = "[title=\"FW16 Commando Boots + Aviators\"]")
	private WebElement BItem1;
	
	@FindBy(css = "[title=\"Designer High Ankle Boots - Brown\"]")
	private WebElement BItem2;
	
	@FindBy(css = "[title=\"Bacca Bucci Boots + Aviators Combo\"]")
	private WebElement BItem3;
	
	@FindBy(css = "[title=\"FW16 Ankle Length Shoes C\"]")
	private WebElement BItem4;
	
	@FindBy(css = "[title=\"FW16 Boots + Aviators Combo\"]")
	private WebElement BItem5;
	
	@FindBy(id = "iscod")
	private WebElement BCOD;
	
	@FindBy(id = "isexoutStock")
	private WebElement BoutSTOCK;
	
	@FindBy(id = "isexoutStock")
	private WebElement Bfreespipping;
	
	@FindBy(css = "[onclick=\"productSearch.setPersonalisedFilter(false);\"]")
	private WebElement BSetBUTTON;
	
	@FindBy(id = "brandFilterBox38776")
	private WebElement BFW16;
	
	@FindBy(id = "brandFilterBox37356")
	private WebElement BbaccaBucci;
	
	@FindBy(id = "priceFilterBox1")
	private WebElement Bprice;
	
	@FindBy(id = "colorFilterBoxA52A2A")
	private WebElement Bcolor;
	
	@FindBy(id = "featureFilterBox0f1")
	private WebElement Bmaterial;
	
	@FindBy(id = "brandtoggle")
	private WebElement BbrandTOGGLE;
	
	@FindBy(id = "pricetoggle")
	private WebElement BpriceTOGGLE;
	
	@FindBy(id = "colortoggle")
	private WebElement BcolorTOGGLE;
	
	@FindBy(id = "featuretoggle1")
	private WebElement BmaterialTOGGLE;
	
	@FindBy(id = "fromPriceRange")
	private WebElement BfromPRICE;
	
	@FindBy(id = "toPriceRange")
	private WebElement BtoPRICE;
	
	@FindBy(xpath = "(//a[@class=\"button_1\"])[2]")
	private WebElement BgoBUTTON;
	
	@FindBy(id = "sortByFilter")
	private WebElement BsortBY;	
	
	@FindBy(css = "[href=\"/aboutus/about-naaptol.html\"]")
	private WebElement Babout;
	
	@FindBy(xpath = "(//a[@href=\"/aboutus/career.html\"])[2]")
	private WebElement Bcareerbottom;
	
	@FindBy(css = "[href=\"/aboutus/pressroom.html\"]")
	private WebElement Bpressroom;
	
	@FindBy(css = "[href=\"/aboutus/investor-relation.html\"]")
	private WebElement Binvestorrelation;
	
	@FindBy(css = "[href=\"/help/faq.html\"]")
	private WebElement Bfaq;
	
	@FindBy(css = "[href=\"/help/pre-purchase.html\"]")
	private WebElement Bprepurchase;
	
	@FindBy(css = "[href=\"/help/shipping-options.html\"]")
	private WebElement Bshippingoptions;
	
	@FindBy(css = "[href=\"/help/payment-options.html\"]")
	private WebElement Bpaymentoptions;
	
	@FindBy(css = "[href=\"https://www.naaptol.com/refund-n-return.html\"]")
	private WebElement Brefund;
	
	@FindBy(css = "[href=\"/help/unsubscribe.html\"]")
	private WebElement Bunsubscribe;
	
	@FindBy(css = "[href=\"/customer-support/feedback.html\"]")
	private WebElement Bfeedback;
	
	@FindBy(css = "[href=\"/customer-support/contactus.html\"]")
	private WebElement Bcontactus;
	
	@FindBy(xpath = "(//a[@href=\"/faces/jsp/becomeASeller/becomASeller.jsp\"])[2]")
	private WebElement BbecomASeller;
	
	@FindBy(css = "[href=\"/customer-support/seller-faq.html\"]")
	private WebElement Bsellerfaq;
	
	@FindBy(css = "[href=\"/online-store/hot-deals-store/si-1435-p.html\"]")
	private WebElement Bhotdealsstore;
	
	@FindBy(css = "[href=\"/app-deal-categories.html\"]")
	private WebElement Bappdealcategories;
	
	@FindBy(css = "[href=\"/sitemap.html\"]")
	private WebElement Bsitemap;
	
	@FindBy(css = "[href=\"/live-tv/schedule.html\"]")
	private WebElement Blivetv;
	
	@FindBy(xpath = "(//a[@href=\"/shop-online/apparels-accessories.html\"])[4]")
	private WebElement Bapparelsaccessories;
	
	@FindBy(xpath = "(//a[@href=\"/shop-online/footwear-travel-bags.html\"])[5]")
	private WebElement Bfootweartravelbags;
	
	@FindBy(xpath = "(//a[@href=\"/shop-online/mobile-phones.html\"])[4]")
	private WebElement Bmobilephones;
	
	@FindBy(xpath = "(//a[@href=\"/shop-online/computers-peripherals.html\"])[4]")
	private WebElement Bcomputersperipherals;
	
	@FindBy(xpath = "(//a[@href=\"/shop-online/home-kitchen-appliances.html\"])[4]")
	private WebElement Bhomekitchenappliances;
	
	@FindBy(xpath = "(//a[@href=\"/shop-online/home-decor.html\"])[4]")
	private WebElement Bhomedecor;
	
	@FindBy(xpath = "(//a[@href=\"/shop-online/jewellery-watches.html\"])[4]")
	private WebElement Bjewellerywatches;
	
	@FindBy(xpath = "(//a[@href=\"/shop-online/automobiles.html\"])[4]")
	private WebElement Bautomobiles;
	
	@FindBy(xpath = "(//a[@href=\"/shop-online/consumer-electronics.html\"])[4]")
	private WebElement Bconsumerelectronics;
	
	@FindBy(xpath = "(//a[@href=\"/shop-online/toys-nursery.html\"])[4]")
	private WebElement Btoysnursery;
	
	@FindBy(xpath = "(//a[@href=\"/shop-online/health-beauty.html\"])[4]")
	private WebElement Bhealthbeauty;

	@FindBy(xpath = "(//a[@href=\"/shop-online/sports-fitness.html\"])[4]")
	private WebElement Bsportsfitness;
	
	@FindBy(xpath = "(//a[@href=\"/categories.html\"])[4]")
	private WebElement BcategoriesBOTTOM;
	
	@FindBy(css = "[name=\"header_search_text\"]")
	private WebElement Bsearch;
	
	@FindBy(xpath = "(//div[@class=\"search\"])[2]")
	private WebElement Bsearchbutton;
	
	@FindBy(xpath = "//a[@title=\"Buy online\"]/span")
	private WebElement BBUYonline;
	
	@FindBy(xpath = "//li[@id=\"productPriceDisplay\"]/span")
	private WebElement BnotAVAILABLEdisplay;

	public WebElement getBcategories() {
		return Bcategories;
	}

	public WebElement getBFootwearANDBags() {
		return BFootwearANDBags;
	}

	public WebElement getBboots() {
		return Bboots;
	}

	public WebElement getBLogo() {
		return BLogo;
	}

	public WebElement getBLanguageDROPdown() {
		return BLanguageDROPdown;
	}

	public WebElement getBlogin() {
		return Blogin;
	}

	public WebElement getBclose() {
		return Bclose;
	}

	public WebElement getBregister() {
		return Bregister;
	}

	public WebElement getBdownloadAPP() {
		return BdownloadAPP;
	}

	public WebElement getBbecomeSELLER() {
		return BbecomeSELLER;
	}

	public WebElement getBcareertop() {
		return Bcareertop;
	}

	public WebElement getBhome() {
		return Bhome;
	}

	public WebElement getBfootwareTravelbags() {
		return BfootwareTravelbags;
	}

	public WebElement getBsetButton() {
		return BsetButton;
	}

	public WebElement getBItem1() {
		return BItem1;
	}

	public WebElement getBItem2() {
		return BItem2;
	}

	public WebElement getBItem3() {
		return BItem3;
	}

	public WebElement getBItem4() {
		return BItem4;
	}

	public WebElement getBItem5() {
		return BItem5;
	}

	public WebElement getBCOD() {
		return BCOD;
	}

	public WebElement getBoutSTOCK() {
		return BoutSTOCK;
	}

	public WebElement getBfreespipping() {
		return Bfreespipping;
	}

	public WebElement getBSetBUTTON() {
		return BSetBUTTON;
	}

	public WebElement getBFW16() {
		return BFW16;
	}

	public WebElement getBbaccaBucci() {
		return BbaccaBucci;
	}

	public WebElement getBprice() {
		return Bprice;
	}

	public WebElement getBcolor() {
		return Bcolor;
	}

	public WebElement getBmaterial() {
		return Bmaterial;
	}

	public WebElement getBbrandTOGGLE() {
		return BbrandTOGGLE;
	}

	public WebElement getBpriceTOGGLE() {
		return BpriceTOGGLE;
	}

	public WebElement getBcolorTOGGLE() {
		return BcolorTOGGLE;
	}

	public WebElement getBmaterialTOGGLE() {
		return BmaterialTOGGLE;
	}

	public WebElement getBfromPRICE() {
		return BfromPRICE;
	}

	public WebElement getBtoPRICE() {
		return BtoPRICE;
	}

	public WebElement getBgoBUTTON() {
		return BgoBUTTON;
	}

	public WebElement getBsortBY() {
		return BsortBY;
	}

	public WebElement getBabout() {
		return Babout;
	}

	public WebElement getBcareerbottom() {
		return Bcareerbottom;
	}

	public WebElement getBpressroom() {
		return Bpressroom;
	}

	public WebElement getBinvestorrelation() {
		return Binvestorrelation;
	}

	public WebElement getBfaq() {
		return Bfaq;
	}

	public WebElement getBprepurchase() {
		return Bprepurchase;
	}

	public WebElement getBshippingoptions() {
		return Bshippingoptions;
	}

	public WebElement getBpaymentoptions() {
		return Bpaymentoptions;
	}

	public WebElement getBrefund() {
		return Brefund;
	}

	public WebElement getBunsubscribe() {
		return Bunsubscribe;
	}

	public WebElement getBfeedback() {
		return Bfeedback;
	}

	public WebElement getBcontactus() {
		return Bcontactus;
	}

	public WebElement getBbecomASeller() {
		return BbecomASeller;
	}

	public WebElement getBsellerfaq() {
		return Bsellerfaq;
	}

	public WebElement getBhotdealsstore() {
		return Bhotdealsstore;
	}

	public WebElement getBappdealcategories() {
		return Bappdealcategories;
	}

	public WebElement getBsitemap() {
		return Bsitemap;
	}

	public WebElement getBlivetv() {
		return Blivetv;
	}

	public WebElement getBapparelsaccessories() {
		return Bapparelsaccessories;
	}

	public WebElement getBfootweartravelbags() {
		return Bfootweartravelbags;
	}

	public WebElement getBmobilephones() {
		return Bmobilephones;
	}

	public WebElement getBcomputersperipherals() {
		return Bcomputersperipherals;
	}

	public WebElement getBhomekitchenappliances() {
		return Bhomekitchenappliances;
	}

	public WebElement getBhomedecor() {
		return Bhomedecor;
	}

	public WebElement getBjewellerywatches() {
		return Bjewellerywatches;
	}

	public WebElement getBautomobiles() {
		return Bautomobiles;
	}

	public WebElement getBconsumerelectronics() {
		return Bconsumerelectronics;
	}

	public WebElement getBtoysnursery() {
		return Btoysnursery;
	}

	public WebElement getBhealthbeauty() {
		return Bhealthbeauty;
	}

	public WebElement getBsportsfitness() {
		return Bsportsfitness;
	}

	public WebElement getBcategoriesBOTTOM() {
		return BcategoriesBOTTOM;
	}

	public WebElement getBsearch() {
		return Bsearch;
	}

	public WebElement getBsearchbutton() {
		return Bsearchbutton;
	}
	
	public WebElement getBBUYonline() {
		return BBUYonline;
	}
	
	public WebElement getBnotAVAILABLEdisplay() {
		return BnotAVAILABLEdisplay;
	}

	public void Bheader(String PLanguage) throws InterruptedException {
		
		act = new Actions(driver);
		act.moveToElement(Bcategories).build().perform();
		act.moveToElement(BFootwearANDBags).build().perform();
		act.moveToElement(Bboots).build().perform();
		Bboots.click();
		BLogo.click();
		driver.navigate().back();
		select = new Select(BLanguageDROPdown);
		select.selectByVisibleText(PLanguage);
		Thread.sleep(800);
		Blogin.click();
		Thread.sleep(800);
		Bclose.click();
		Bregister.click();
		Thread.sleep(800);
		Bclose.click();
		BdownloadAPP.click();
		driver.navigate().back();
		BbecomASeller.click();
		driver.navigate().back();
		Bcareertop.click();
		driver.navigate().back();
		Bhome.click();
		driver.navigate().back();
		BfootwareTravelbags.click();
		driver.navigate().back();
		
		BoutSTOCK.click();
		BSetBUTTON.click();
		
	}
	
//	public void Bmiddle(String PNotDISPLAY, String PBootsSearch, String Psort1, String Psort2, String Psort3, String Psort4, String Psort5, String Psort6) {
//		
//		SoftAssert sA = new SoftAssert();
//		String Parent = driver.getWindowHandle();
//		BItem1.click();
//		wait.until(ExpectedConditions.numberOfWindowsToBe(2));
//		Set<String> allWindows = driver.getWindowHandles();
//		for (String window : allWindows) {
//		    if (!window.equals(Parent)) {
//		        driver.switchTo().window(window);
//		        break;
//		    }
//		}
//		String Display = BnotAVAILABLEdisplay.getText();
//		sA.assertEquals(Display, PNotDISPLAY);
//		sA.assertAll();
//		driver.close();
//		driver.switchTo().window(Parent);
//		
//		BItem2.click();
//		wait.until(ExpectedConditions.numberOfWindowsToBe(2));
//		Set<String> allWindows1 = driver.getWindowHandles();
//		for (String window : allWindows1) {
//		    if (!window.equals(Parent)) {
//		        driver.switchTo().window(window);
//		        break;
//		    }
//		}
//		String Display1 = BnotAVAILABLEdisplay.getText();
//		sA.assertEquals(Display1, PNotDISPLAY);
//		sA.assertAll();
//		driver.close();
//		driver.switchTo().window(Parent);
//		
//		BItem3.click();
//		wait.until(ExpectedConditions.numberOfWindowsToBe(2));
//		Set<String> allWindows2 = driver.getWindowHandles();
//		for (String window : allWindows2) {
//		    if (!window.equals(Parent)) {
//		        driver.switchTo().window(window);
//		        break;
//		    }
//		}
//		String Display2 = BnotAVAILABLEdisplay.getText();
//		sA.assertEquals(Display2, PNotDISPLAY);
//		sA.assertAll();
//		driver.close();
//		driver.switchTo().window(Parent);
//		
//		BItem4.click();
//		wait.until(ExpectedConditions.numberOfWindowsToBe(2));
//		Set<String> allWindows3 = driver.getWindowHandles();
//		for (String window : allWindows3) {
//		    if (!window.equals(Parent)) {
//		        driver.switchTo().window(window);
//		        break;
//		    }
//		}
//		String Display3 = BnotAVAILABLEdisplay.getText();
//		sA.assertEquals(Display3, PNotDISPLAY);
//		sA.assertAll();
//		driver.close();
//		driver.switchTo().window(Parent);
//		
//		BItem5.click();
//		wait.until(ExpectedConditions.numberOfWindowsToBe(2));
//		Set<String> allWindows4 = driver.getWindowHandles();
//		for (String window : allWindows4) {
//		    if (!window.equals(Parent)) {
//		        driver.switchTo().window(window);
//		        break;
//		    }
//		}
//		String Display4 = BnotAVAILABLEdisplay.getText();
//		sA.assertEquals(Display4, PNotDISPLAY);
//		sA.assertAll();
//		driver.close();
//		driver.switchTo().window(Parent);
//		
//		select = new Select(BsortBY);
//		select.selectByVisibleText(Psort1);
//		select.selectByVisibleText(Psort2);
//		select.selectByVisibleText(Psort3);
//		select.selectByVisibleText(Psort4);
//		select.selectByVisibleText(Psort5);
//		select.selectByVisibleText(Psort6);
//		
//		Bsearch.sendKeys(PBootsSearch);
//		Bsearchbutton.click();
//		
//	}
	
	public void BLeftbar(String PFromPrice,String PToPrice) throws InterruptedException {
		
		BCOD.click();
		BSetBUTTON.click();
		BCOD.click();
		BoutSTOCK.click();
		BSetBUTTON.click();
		BoutSTOCK.click();
		Bfreespipping.click();
		BSetBUTTON.click();
		Bfreespipping.click();
		BSetBUTTON.click();
		Thread.sleep(800);
		BFW16.click();
		Thread.sleep(800);
		BbaccaBucci.click();
		Thread.sleep(800);
		BFW16.click();
		Thread.sleep(800);
		BbaccaBucci.click();
		Thread.sleep(800);
		Bprice.click();
		Thread.sleep(800);
		Bprice.click();
		Thread.sleep(800);
		Bcolor.click();
		Thread.sleep(800);
		Bcolor.click();
		Thread.sleep(800);
		Bmaterial.click();
		Thread.sleep(800);
		Bmaterial.click();
		Thread.sleep(800);
		
		BbrandTOGGLE.click();
		BpriceTOGGLE.click();
		BcolorTOGGLE.click();
		BmaterialTOGGLE.click();
		BbrandTOGGLE.click();
		BpriceTOGGLE.click();
		BcolorTOGGLE.click();
		BmaterialTOGGLE.click();
		
		
		BfromPRICE.sendKeys(PFromPrice);
		BtoPRICE.sendKeys(PToPrice);
		BgoBUTTON.click();
		
	}
	
	public void Bfooter(String PBootsURL) throws InterruptedException {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to(PBootsURL);
		Babout.click();
		driver.navigate().back();
		Thread.sleep(500);
		Bcareerbottom.click();
		driver.navigate().back();
		Thread.sleep(500);
		Bpressroom.click();
		driver.navigate().back();
		Thread.sleep(500);
		Binvestorrelation.click();
		driver.navigate().back();
		Thread.sleep(500);
		Bfaq.click();
		driver.navigate().back();
		Thread.sleep(500);
		Bprepurchase.click();
		driver.navigate().back();
		Thread.sleep(500);
		Bshippingoptions.click();
		driver.navigate().back();
		Thread.sleep(500);
		Brefund.click();
		driver.navigate().back();
		Thread.sleep(500);
		Bunsubscribe.click();
		driver.navigate().back();
		Thread.sleep(500);
		Bfeedback.click();
		driver.navigate().back();
		Thread.sleep(500);
		Bcontactus.click();
		driver.navigate().back();
		Thread.sleep(500);
		BbecomASeller.click();
		driver.navigate().back();
		Thread.sleep(500);
		Bsellerfaq.click();
		driver.navigate().back();
		Thread.sleep(500);
		Bhotdealsstore.click();
		driver.navigate().back();
		Thread.sleep(500);
		Bsitemap.click();
		driver.navigate().back();
		Thread.sleep(500);
		Blivetv.click();
		driver.navigate().back();
		Thread.sleep(500);
		Bapparelsaccessories.click();
		driver.navigate().back();
		Thread.sleep(500);
		Bmobilephones.click();
		driver.navigate().back();
		Thread.sleep(500);
		Bcomputersperipherals.click();
		driver.navigate().back();
		Thread.sleep(500);
		Bhomekitchenappliances.click();
		driver.navigate().back();
		Thread.sleep(500);
		Bhomedecor.click();
		driver.navigate().back();
		Thread.sleep(500);
		Bjewellerywatches.click();
		driver.navigate().back();
		Thread.sleep(500);
		Bautomobiles.click();
		driver.navigate().back();
		Thread.sleep(500);
		Bconsumerelectronics.click();
		driver.navigate().back();
		Thread.sleep(500);
		Btoysnursery.click();
		driver.navigate().back();
		Thread.sleep(500);
		Bhealthbeauty.click();
		driver.navigate().back();
		Thread.sleep(500);
		Bsportsfitness.click();
		driver.navigate().back();
		Thread.sleep(500);
		BcategoriesBOTTOM.click();
		driver.navigate().back();
		
	}
	
}
