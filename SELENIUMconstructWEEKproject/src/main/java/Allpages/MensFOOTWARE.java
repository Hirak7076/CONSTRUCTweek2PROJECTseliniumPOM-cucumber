package Allpages;

import java.time.Duration;
import java.util.List;
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

public class MensFOOTWARE {

	WebDriver driver;
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));;
	Actions act;
	Select select;
	JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
	public MensFOOTWARE(WebDriver driver) {
		
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(className = "cate_head")
	private WebElement MFcategories;
	
	@FindBy(xpath = "(//span[@class='catIconMenu footwear'])[1]")
	private WebElement MFFootwearANDBags;
	
	@FindBy(xpath = "(//a[@href='/shop-online/footwear-travel-bags/mens-footwear.html'])[1]")
	private WebElement MFMensFootwear;
	
	@FindBy(xpath = "(//img[@title=\"Online Shopping in India\"])[2]")
	private WebElement MFLogo;
	
	@FindBy(id = "localization_dropdown")
	private WebElement MFLanguageDROPdown;
	
	@FindBy(id = "login-panel-link")
	private WebElement MFlogin;
	
	@FindBy(css = "[title='Close']")
	private WebElement MFclose;
	
	@FindBy(id = "registration-panel-link")
	private WebElement MFregister;
	
	@FindBy(xpath = "(//a[@href=\"/mobile-apps.html\"])[1]")
	private WebElement MFdownloadAPP;
	
	@FindBy(xpath = "(//a[@href=\"/faces/jsp/becomeASeller/becomASeller.jsp\"])[1]")
	private WebElement MFbecomeSELLER;
	
	@FindBy(xpath = "(//a[@href=\"/aboutus/career.html\"])[1]")
	private WebElement MFcareertop;
	
	@FindBy(xpath = "(//a[@href='/'])[4]")
	private WebElement MFhome;
	
	@FindBy(xpath = "(//a[@href='/shop-online/footwear-travel-bags.html'])[3]")
	private WebElement MFfootwareTravelbags;
	
	@FindBy(css = "[title='Rain Footwear']")
	private WebElement MFRainFootwear;
	
	@FindBy(css = "[title='Mens Sandals And Combo']")
	private WebElement MFMensSandalsAndCombo;
	
	@FindBy(css = "[title='Mens Shoes and Combo']")
	private WebElement MFMensShoesandCombo;
	
	@FindBy(css = "[title='Footwear Combos']")
	private WebElement MFFootwearCombos;
	
	@FindBy(css = "[title='Boots']")
	private WebElement MFBoots;
	
	@FindBy(css = "[title='Sports Shoes']")
	private WebElement MFSportsShoes;
	
	@FindBy(css = "[title='Formal Shoes']")
	private WebElement MFFormalShoes;
	
	@FindBy(css = "[title='Sandals & Slippers']")
	private WebElement MFSandalsANDSlippers;
	
	@FindBy(xpath = "//a[@title='Branded']")
	private WebElement MFBranded;
	
	@FindBy(xpath = "//a[@title='Liberty']")
	private WebElement MFLiberty;
	
	@FindBy(xpath = "//a[@title='RDX']")
	private WebElement MFRDX;
	
	@FindBy(xpath = "//a[@title='Birde']")
	private WebElement MFBirde;
	
	@FindBy(xpath = "//a[@title='Bacca Bucci']")
	private WebElement MFBaccaBucci;
	
	@FindBy(xpath = "//a[@title='Zeal']")
	private WebElement MFZeal;
	
	@FindBy(xpath = "//a[@title='Moora']")
	private WebElement MFMoora;
	
	@FindBy(xpath = "//a[@title='Globalite']")
	private WebElement MFGlobalite;
	
	@FindBy(xpath = "//a[@title='Jokatoo']")
	private WebElement MFJokatoo;
	
	@FindBy(xpath = "//a[@title='Snatch']")
	private WebElement MFSnatch;
	
	@FindBy(xpath = "//a[@title='Fittos']")
	private WebElement MFFittos;
	
	@FindBy(xpath = "//a[@title='Trase']")
	private WebElement MFTrase;
	
	@FindBy(xpath = "//a[@title='Yellow Tree']")
	private WebElement MFYellowTree;
	
	@FindBy(xpath = "//a[@title='SFR']")
	private WebElement MFSFR;
	
	@FindBy(xpath = "//a[@title='Bristol']")
	private WebElement MFBristol;
	
	@FindBy(xpath = "//a[@title='AR Gold']")
	private WebElement MFARGold;
	
	@FindBy(xpath = "//a[@title='Vintex']")
	private WebElement MFVintex;
	
	@FindBy(xpath = "//a[@title='Fasco']")
	private WebElement MFFasco;
	
	@FindBy(xpath = "//a[@title='FW16']")
	private WebElement MFFW16;
	
	@FindBy(xpath = "//a[@title='Aairwalk']")
	private WebElement MFAairwalk;
	
	@FindBy(xpath = "//a[@title='ARV']")
	private WebElement MFARV;
	
	@FindBy(xpath = "//a[@title='Jenja']")
	private WebElement MFJenja;
	
	@FindBy(xpath = "//a[@title='ET']")
	private WebElement MFET;
	
	@FindBy(xpath = "//a[@title='Qualida']")
	private WebElement MFQualida;
	
	@FindBy(xpath = "//a[@title='HDX']")
	private WebElement MFHDX;
	
	@FindBy(xpath = "//a[@title='Saiyan']")
	private WebElement MFSaiyan;
	
	@FindBy(xpath = "//a[@title='Funnel']")
	private WebElement MFFunnel;
	
	@FindBy(css = "[alt='Mens-Footwear-Sports-Shoes-']")
	private WebElement MFtopIMAGE;
	
	@FindBy(id = "isexoutStock")
	private WebElement MFoutOFstock;
	
	@FindBy(xpath = "(//a[@class='button_1'])[1]")
	private WebElement MFsetButton;
	
	@FindBy(id = "productItem1")
	private WebElement MF1stproduct;
	
	@FindBy(xpath = "(//span[text()='Quick View'])[1]")
	private WebElement MFQuickView;
	
	@FindBy(xpath = "//span[@title=\"Sports Shoes + Free Leatherite Watch + Aluminium Wallet + Sunglasses - Pick Any 1 (SW41)\"]")
	private WebElement MFVideoButtonItem1;
	
	@FindBy(xpath = "(//a[@id=\"cart-panel-link\"])[2]")
	private WebElement MFcart;
	
	@FindBy(xpath = "(//a[@title=\"Sports Shoes + Free Leatherite Watch + Aluminium Wallet + Sunglasses - Pick Any 1 (SW41)\"])[2]")
	private WebElement MFItem1;
	
	@FindBy(xpath = "//a[@title=\"Buy online\"]/span")
	private WebElement MFBUYonline;
	
	@FindBy(xpath = "(//a[@title=\"Leatherite Sandals Pick Any 1 + Free Sports Watch + Sunglasses + Aluminium Wallet (SW59)\"])[2]")
	private WebElement MFItem2;
	
	@FindBy(xpath = "(//a[@title=\"Jenja Men's Leatherite Sandal (J2) - Pick Any 1\"])[2]")
	private WebElement MFItem3;
	
	@FindBy(xpath = "(//a[@title=\"Pack of 2 Men's Leatherite Sandals + Free "
			+ "Sports Watch And Sunglasses (SW55)\"])[2]")
	private WebElement MFItem4;
	
	@FindBy(xpath = "(//a[@title=\"Pack of 2 Men's Summer Sandals + Free Stylish Watch & Sunglasses (SW82)\"])[6]")
	private WebElement MFItem5;
	
	@FindBy(xpath = "(//a[@title=\"Leatherite Sandals + Free Leatherite Watch + Sunglasses + Aluminium Wallet - Pick Any 1 (SW52)\"])[2]")
	private WebElement MFItem6;
	
	@FindBy(xpath = "(//a[@title=\"Pick Any 1 Sports Shoes With Heel Pads + Free Stylish Watch & Sunglasses (SSC1)\"])[6]")
	private WebElement MFItem7;
	
	@FindBy(xpath = "(//a[@title=\"Pack of 2 Men's Sandals + Free Watch Sunglasses & Wallet (SW81)\"])[6]")
	private WebElement MFItem8;
	
	@FindBy(xpath = "(//a[@title=\"Stylish Open Leatherite Sandals - Pick Any 1 Free Sports Watch + Sunglasses + Aluminium Wallet (SW66)\"])[2]")
	private WebElement MFItem9;
	
	@FindBy(xpath = "(//a[@title=\"Stylish Leatherite Sandals Pick Any 1 Free Sports Watch + Sunglasses (SW63)\"])[2]")
	private WebElement MFItem10;
	
	@FindBy(xpath = "(//a[@title=\"Pick Any 1 Stylish Leatherite Sandals + Free Watch And Sunglasses (SW76)\"])[2]")
	private WebElement MFItem11;
	
	@FindBy(xpath = "(//a[@title=\"Pack of 3 Men's Sandals (MS2)\"])[2]")
	private WebElement MFItem12;
	
	@FindBy(css = "[id='nowTrendingContent_pagination']")
	private WebElement MFnowTrending;
	
	@FindBy(css = "[href=\"/aboutus/about-naaptol.html\"]")
	private WebElement MFabout;
	
	@FindBy(xpath = "(//a[@href=\"/aboutus/career.html\"])[2]")
	private WebElement MFcareerbottom;
	
	@FindBy(css = "[href=\"/aboutus/pressroom.html\"]")
	private WebElement MFpressroom;
	
	@FindBy(css = "[href=\"/aboutus/investor-relation.html\"]")
	private WebElement MFinvestorrelation;
	
	@FindBy(css = "[href=\"/help/faq.html\"]")
	private WebElement MFfaq;
	
	@FindBy(css = "[href=\"/help/pre-purchase.html\"]")
	private WebElement MFprepurchase;
	
	@FindBy(css = "[href=\"/help/shipping-options.html\"]")
	private WebElement MFshippingoptions;
	
	@FindBy(css = "[href=\"/help/payment-options.html\"]")
	private WebElement MFpaymentoptions;
	
	@FindBy(css = "[href=\"https://www.naaptol.com/refund-n-return.html\"]")
	private WebElement MFrefund;
	
	@FindBy(css = "[href=\"/help/unsubscribe.html\"]")
	private WebElement MFunsubscribe;
	
	@FindBy(css = "[href=\"/customer-support/feedback.html\"]")
	private WebElement MFfeedback;
	
	@FindBy(css = "[href=\"/customer-support/contactus.html\"]")
	private WebElement MFcontactus;
	
	@FindBy(xpath = "(//a[@href=\"/faces/jsp/becomeASeller/becomASeller.jsp\"])[2]")
	private WebElement MFbecomASeller;
	
	@FindBy(css = "[href=\"/customer-support/seller-faq.html\"]")
	private WebElement MFsellerfaq;
	
	@FindBy(css = "[href=\"/online-store/hot-deals-store/si-1435-p.html\"]")
	private WebElement MFhotdealsstore;
	
	@FindBy(css = "[href=\"/app-deal-categories.html\"]")
	private WebElement MFappdealcategories;
	
	@FindBy(css = "[href=\"/sitemap.html\"]")
	private WebElement MFsitemap;
	
	@FindBy(css = "[href=\"/live-tv/schedule.html\"]")
	private WebElement MFlivetv;
	
	@FindBy(xpath = "(//a[@href=\"/shop-online/apparels-accessories.html\"])[4]")
	private WebElement MFapparelsaccessories;
	
	@FindBy(xpath = "(//a[@href=\"/shop-online/footwear-travel-bags.html\"])[5]")
	private WebElement MFfootweartravelbags;
	
	@FindBy(xpath = "(//a[@href=\"/shop-online/mobile-phones.html\"])[4]")
	private WebElement MFmobilephones;
	
	@FindBy(xpath = "(//a[@href=\"/shop-online/computers-peripherals.html\"])[4]")
	private WebElement MFcomputersperipherals;
	
	@FindBy(xpath = "(//a[@href=\"/shop-online/home-kitchen-appliances.html\"])[4]")
	private WebElement MFhomekitchenappliances;
	
	@FindBy(xpath = "(//a[@href=\"/shop-online/home-decor.html\"])[4]")
	private WebElement MFhomedecor;
	
	@FindBy(xpath = "(//a[@href=\"/shop-online/jewellery-watches.html\"])[4]")
	private WebElement MFjewellerywatches;
	
	@FindBy(xpath = "(//a[@href=\"/shop-online/automobiles.html\"])[4]")
	private WebElement MFautomobiles;
	
	@FindBy(xpath = "(//a[@href=\"/shop-online/consumer-electronics.html\"])[4]")
	private WebElement MFconsumerelectronics;
	
	@FindBy(xpath = "(//a[@href=\"/shop-online/toys-nursery.html\"])[4]")
	private WebElement MFtoysnursery;
	
	@FindBy(xpath = "(//a[@href=\"/shop-online/health-beauty.html\"])[4]")
	private WebElement MFhealthbeauty;

	@FindBy(xpath = "(//a[@href=\"/shop-online/sports-fitness.html\"])[4]")
	private WebElement MFsportsfitness;
	
	@FindBy(xpath = "(//a[@href=\"/categories.html\"])[4]")
	private WebElement MFcategoriesBOTTOM;
	
	@FindBy(css = "[name=\"header_search_text\"]")
	private WebElement MFsearch;
	
	@FindBy(xpath = "(//div[@class=\"search\"])[2]")
	private WebElement MFsearchbutton;

	public WebElement getMFcategories() {
		return MFcategories;
	}

	public WebElement getMFFootwearANDBags() {
		return MFFootwearANDBags;
	}

	public WebElement getMFMensFootwear() {
		return MFMensFootwear;
	}

	public WebElement getMFLogo() {
		return MFLogo;
	}

	public WebElement getMFLanguageDROPdown() {
		return MFLanguageDROPdown;
	}

	public WebElement getMFlogin() {
		return MFlogin;
	}

	public WebElement getMFclose() {
		return MFclose;
	}

	public WebElement getMFregister() {
		return MFregister;
	}

	public WebElement getMFdownloadAPP() {
		return MFdownloadAPP;
	}

	public WebElement getMFbecomeSELLER() {
		return MFbecomeSELLER;
	}

	public WebElement getMFcareertop() {
		return MFcareertop;
	}

	public WebElement getMFhome() {
		return MFhome;
	}

	public WebElement getMFfootwareTravelbags() {
		return MFfootwareTravelbags;
	}

	public WebElement getMFRainFootwear() {
		return MFRainFootwear;
	}

	public WebElement getMFMensSandalsAndCombo() {
		return MFMensSandalsAndCombo;
	}

	public WebElement getMFMensShoesandCombo() {
		return MFMensShoesandCombo;
	}

	public WebElement getMFFootwearCombos() {
		return MFFootwearCombos;
	}

	public WebElement getMFBoots() {
		return MFBoots;
	}

	public WebElement getMFSportsShoes() {
		return MFSportsShoes;
	}

	public WebElement getMFFormalShoes() {
		return MFFormalShoes;
	}

	public WebElement getMFSandalsANDSlippers() {
		return MFSandalsANDSlippers;
	}

	public WebElement getMFBranded() {
		return MFBranded;
	}

	public WebElement getMFLiberty() {
		return MFLiberty;
	}

	public WebElement getMFRDX() {
		return MFRDX;
	}

	public WebElement getMFBirde() {
		return MFBirde;
	}

	public WebElement getMFBaccaBucci() {
		return MFBaccaBucci;
	}

	public WebElement getMFZeal() {
		return MFZeal;
	}

	public WebElement getMFMoora() {
		return MFMoora;
	}

	public WebElement getMFGlobalite() {
		return MFGlobalite;
	}

	public WebElement getMFJokatoo() {
		return MFJokatoo;
	}

	public WebElement getMFSnatch() {
		return MFSnatch;
	}

	public WebElement getMFFittos() {
		return MFFittos;
	}

	public WebElement getMFTrase() {
		return MFTrase;
	}

	public WebElement getMFYellowTree() {
		return MFYellowTree;
	}

	public WebElement getMFSFR() {
		return MFSFR;
	}

	public WebElement getMFBristol() {
		return MFBristol;
	}

	public WebElement getMFARGold() {
		return MFARGold;
	}

	public WebElement getMFVintex() {
		return MFVintex;
	}

	public WebElement getMFFasco() {
		return MFFasco;
	}

	public WebElement getMFFW16() {
		return MFFW16;
	}

	public WebElement getMFAairwalk() {
		return MFAairwalk;
	}

	public WebElement getMFARV() {
		return MFARV;
	}

	public WebElement getMFJenja() {
		return MFJenja;
	}

	public WebElement getMFET() {
		return MFET;
	}

	public WebElement getMFQualida() {
		return MFQualida;
	}

	public WebElement getMFHDX() {
		return MFHDX;
	}

	public WebElement getMFSaiyan() {
		return MFSaiyan;
	}

	public WebElement getMFFunnel() {
		return MFFunnel;
	}

	public WebElement getMFtopIMAGE() {
		return MFtopIMAGE;
	}

	public WebElement getMFoutOFstock() {
		return MFoutOFstock;
	}

	public WebElement getMFsetButton() {
		return MFsetButton;
	}

	public WebElement getMF1stproduct() {
		return MF1stproduct;
	}

	public WebElement getMFQuickView() {
		return MFQuickView;
	}

	public WebElement getMFVideoButtonItem1() {
		return MFVideoButtonItem1;
	}

	public WebElement getMFcart() {
		return MFcart;
	}

	public WebElement getMFItem1() {
		return MFItem1;
	}

	public WebElement getMFBUYonline() {
		return MFBUYonline;
	}

	public WebElement getMFItem2() {
		return MFItem2;
	}

	public WebElement getMFItem3() {
		return MFItem3;
	}

	public WebElement getMFItem4() {
		return MFItem4;
	}

	public WebElement getMFItem5() {
		return MFItem5;
	}

	public WebElement getMFItem6() {
		return MFItem6;
	}

	public WebElement getMFItem7() {
		return MFItem7;
	}

	public WebElement getMFItem8() {
		return MFItem8;
	}

	public WebElement getMFItem9() {
		return MFItem9;
	}

	public WebElement getMFItem10() {
		return MFItem10;
	}

	public WebElement getMFItem11() {
		return MFItem11;
	}

	public WebElement getMFItem12() {
		return MFItem12;
	}

	public WebElement getMFnowTrending() {
		return MFnowTrending;
	}

	public WebElement getMFabout() {
		return MFabout;
	}

	public WebElement getMFcareerbottom() {
		return MFcareerbottom;
	}

	public WebElement getMFpressroom() {
		return MFpressroom;
	}

	public WebElement getMFinvestorrelation() {
		return MFinvestorrelation;
	}

	public WebElement getMFfaq() {
		return MFfaq;
	}

	public WebElement getMFprepurchase() {
		return MFprepurchase;
	}

	public WebElement getMFshippingoptions() {
		return MFshippingoptions;
	}

	public WebElement getMFpaymentoptions() {
		return MFpaymentoptions;
	}

	public WebElement getMFrefund() {
		return MFrefund;
	}

	public WebElement getMFunsubscribe() {
		return MFunsubscribe;
	}

	public WebElement getMFfeedback() {
		return MFfeedback;
	}

	public WebElement getMFcontactus() {
		return MFcontactus;
	}

	public WebElement getMFbecomASeller() {
		return MFbecomASeller;
	}

	public WebElement getMFsellerfaq() {
		return MFsellerfaq;
	}

	public WebElement getMFhotdealsstore() {
		return MFhotdealsstore;
	}

	public WebElement getMFappdealcategories() {
		return MFappdealcategories;
	}

	public WebElement getMFsitemap() {
		return MFsitemap;
	}

	public WebElement getMFlivetv() {
		return MFlivetv;
	}

	public WebElement getMFapparelsaccessories() {
		return MFapparelsaccessories;
	}

	public WebElement getMFfootweartravelbags() {
		return MFfootweartravelbags;
	}

	public WebElement getMFmobilephones() {
		return MFmobilephones;
	}

	public WebElement getMFcomputersperipherals() {
		return MFcomputersperipherals;
	}

	public WebElement getMFhomekitchenappliances() {
		return MFhomekitchenappliances;
	}

	public WebElement getMFhomedecor() {
		return MFhomedecor;
	}

	public WebElement getMFjewellerywatches() {
		return MFjewellerywatches;
	}

	public WebElement getMFautomobiles() {
		return MFautomobiles;
	}

	public WebElement getMFconsumerelectronics() {
		return MFconsumerelectronics;
	}

	public WebElement getMFtoysnursery() {
		return MFtoysnursery;
	}

	public WebElement getMFhealthbeauty() {
		return MFhealthbeauty;
	}

	public WebElement getMFsportsfitness() {
		return MFsportsfitness;
	}

	public WebElement getMFcategoriesBOTTOM() {
		return MFcategoriesBOTTOM;
	}

	public WebElement getMFsearch() {
		return MFsearch;
	}

	public WebElement getMFsearchbutton() {
		return MFsearchbutton;
	}
	
	public void MFheader(String PLanguage) throws InterruptedException {
		
		act = new Actions(driver);
		act.moveToElement(MFcategories).build().perform();
		act.moveToElement(MFFootwearANDBags).build().perform();
		act.moveToElement(MFMensFootwear).build().perform();
		MFMensFootwear.click();
		MFLogo.click();
		driver.navigate().back();
		select = new Select(MFLanguageDROPdown);
		
		select.selectByVisibleText(PLanguage);
		Thread.sleep(800);
		MFlogin.click();
		Thread.sleep(800);
		MFclose.click();
		MFregister.click();
		Thread.sleep(800);
		MFclose.click();
		MFdownloadAPP.click();
		driver.navigate().back();
		MFbecomASeller.click();
		driver.navigate().back();
		MFcareertop.click();
		driver.navigate().back();
		MFhome.click();
		driver.navigate().back();
		MFfootwareTravelbags.click();
		driver.navigate().back();
		
	}
	
//	public void MFMiddle(String PMensFootwearURL, String PBuyDISPLAY, String PMensFootwearSearch) throws InterruptedException {
//		
//		SoftAssert sA = new SoftAssert();
//		MFtopIMAGE.click();
//		act.moveToElement(MF1stproduct).build().perform();
//		MFQuickView.click();
//		MFclose.click();
//		driver.navigate().to(PMensFootwearURL);
//		MFVideoButtonItem1.click();
//		MFclose.click();
//		driver.navigate().to(PMensFootwearURL);
//		MFcart.click();
//		MFclose.click();
//		String Parent = driver.getWindowHandle();
//		MFItem1.click();
//		wait.until(ExpectedConditions.numberOfWindowsToBe(2));
//		Set<String> allWindows = driver.getWindowHandles();
//		for (String window : allWindows) {
//			System.out.println("Hello");
//		    if (!window.equals(Parent)) {
//		        driver.switchTo().window(window);
//		        break;
//		    }
//		}
//		String Display = MFBUYonline.getText();
//		sA.assertEquals(Display, PBuyDISPLAY);
//		sA.assertAll();
//		
//		driver.switchTo().window(Parent);
//		
//		
//		MFItem2.click();
//		wait.until(ExpectedConditions.numberOfWindowsToBe(2));
//		Set<String> allWindows1 = driver.getWindowHandles();
//		for (String window : allWindows1) {
//		    if (!window.equals(Parent)) {
//		        driver.switchTo().window(window);
//		        break;
//		    }
//		}
//		String Display1 = MFBUYonline.getText();
//		sA.assertEquals(Display1, PBuyDISPLAY);
//		sA.assertAll();
//		driver.close();
//		driver.switchTo().window(Parent);
//		
//		MFItem3.click();
//		wait.until(ExpectedConditions.numberOfWindowsToBe(2));
//		Set<String> allWindows2 = driver.getWindowHandles();
//		for (String window : allWindows2) {
//		    if (!window.equals(Parent)) {
//		        driver.switchTo().window(window);
//		        break;
//		    }
//		}
//		String Display2 = MFBUYonline.getText();
//		sA.assertEquals(Display2, PBuyDISPLAY);
//		sA.assertAll();
//		driver.close();
//		driver.switchTo().window(Parent);
//		
//		MFItem4.click();
//		wait.until(ExpectedConditions.numberOfWindowsToBe(2));
//		Set<String> allWindows3 = driver.getWindowHandles();
//		for (String window : allWindows3) {
//		    if (!window.equals(Parent)) {
//		        driver.switchTo().window(window);
//		        break;
//		    }
//		}
//		String Display3 = MFBUYonline.getText();
//		sA.assertEquals(Display3, PBuyDISPLAY);
//		sA.assertAll();
//		driver.close();
//		driver.switchTo().window(Parent);
//		
//		MFItem5.click();
//		wait.until(ExpectedConditions.numberOfWindowsToBe(2));
//		Set<String> allWindows4 = driver.getWindowHandles();
//		for (String window : allWindows4) {
//		    if (!window.equals(Parent)) {
//		        driver.switchTo().window(window);
//		        break;
//		    }
//		}
//		String Display4 = MFBUYonline.getText();
//		sA.assertEquals(Display4, PBuyDISPLAY);
//		sA.assertAll();
//		driver.close();
//		driver.switchTo().window(Parent);
//		
//		MFItem6.click();
//		wait.until(ExpectedConditions.numberOfWindowsToBe(2));
//		Set<String> allWindows5 = driver.getWindowHandles();
//		for (String window : allWindows5) {
//		    if (!window.equals(Parent)) {
//		        driver.switchTo().window(window);
//		        break;
//		    }
//		}
//		String Display5 = MFBUYonline.getText();
//		sA.assertEquals(Display5, PBuyDISPLAY);
//		sA.assertAll();
//		driver.close();
//		driver.switchTo().window(Parent);
//		
//		MFItem7.click();
//		wait.until(ExpectedConditions.numberOfWindowsToBe(2));
//		Set<String> allWindows6 = driver.getWindowHandles();
//		for (String window : allWindows6) {
//		    if (!window.equals(Parent)) {
//		        driver.switchTo().window(window);
//		        break;
//		    }
//		}
//		String Display6 = MFBUYonline.getText();
//		sA.assertEquals(Display6, PBuyDISPLAY);
//		sA.assertAll();
//		driver.close();
//		driver.switchTo().window(Parent);
//		
//		MFItem8.click();
//		wait.until(ExpectedConditions.numberOfWindowsToBe(2));
//		Set<String> allWindows7 = driver.getWindowHandles();
//		for (String window : allWindows7) {
//		    if (!window.equals(Parent)) {
//		        driver.switchTo().window(window);
//		        break;
//		    }
//		}
//		String Display7 = MFBUYonline.getText();
//		sA.assertEquals(Display7, PBuyDISPLAY);
//		sA.assertAll();
//		driver.close();
//		driver.switchTo().window(Parent);
//		
//		MFItem9.click();
//		wait.until(ExpectedConditions.numberOfWindowsToBe(2));
//		Set<String> allWindows8 = driver.getWindowHandles();
//		for (String window : allWindows8) {
//		    if (!window.equals(Parent)) {
//		        driver.switchTo().window(window);
//		        break;
//		    }
//		}
//		String Display8 = MFBUYonline.getText();
//		sA.assertEquals(Display8, PBuyDISPLAY);
//		sA.assertAll();
//		driver.close();
//		driver.switchTo().window(Parent);
//		
//		MFItem10.click();
//		wait.until(ExpectedConditions.numberOfWindowsToBe(2));
//		Set<String> allWindows9 = driver.getWindowHandles();
//		for (String window : allWindows9) {
//		    if (!window.equals(Parent)) {
//		        driver.switchTo().window(window);
//		        break;
//		    }
//		}
//		String Display9 = MFBUYonline.getText();
//		sA.assertEquals(Display9, PBuyDISPLAY);
//		sA.assertAll();
//		driver.close();
//		driver.switchTo().window(Parent);
//		
//		MFItem11.click();
//		wait.until(ExpectedConditions.numberOfWindowsToBe(2));
//		Set<String> allWindows10 = driver.getWindowHandles();
//		for (String window : allWindows10) {
//		    if (!window.equals(Parent)) {
//		        driver.switchTo().window(window);
//		        break;
//		    }
//		}
//		String Display10 = MFBUYonline.getText();
//		sA.assertEquals(Display10, PBuyDISPLAY);
//		sA.assertAll();
//		driver.close();
//		driver.switchTo().window(Parent);
//		
//		MFItem12.click();
//		wait.until(ExpectedConditions.numberOfWindowsToBe(2));
//		Set<String> allWindows11 = driver.getWindowHandles();
//		for (String window : allWindows11) {
//		    if (!window.equals(Parent)) {
//		        driver.switchTo().window(window);
//		        break;
//		    }
//		}
//		String Display11 = MFBUYonline.getText();
//		sA.assertEquals(Display11, PBuyDISPLAY);
//		sA.assertAll();
//		driver.close();
//		driver.switchTo().window(Parent);
//		
//		jsExecutor.executeScript("window.scrollBy(0,3000)");
//		Thread.sleep(1000);
//		jsExecutor.executeScript("document.getElementById('nowTrendingContent_pagination').click();");
//		List<WebElement> elements = driver.findElements(By.cssSelector("[id='nowTrendingContent_pagination']"));
//		assert elements.size() == 0;
//		
//		driver.navigate().to(PMensFootwearURL);	
//		MFsearch.sendKeys(PMensFootwearSearch);
//		MFsearchbutton.click();
//		
//	}
	
	public void MFleftBAR() {
		
		MFRainFootwear.click();
		driver.navigate().back();
		MFMensSandalsAndCombo.click();
		driver.navigate().back();
		MFMensShoesandCombo.click();
		driver.navigate().back();
		MFFootwearCombos.click();
		driver.navigate().back();
		MFBoots.click();
		driver.navigate().back();
		MFSportsShoes.click();
		driver.navigate().back();
		MFSandalsANDSlippers.click();
		driver.navigate().back();
		MFBranded.click();
		driver.navigate().back();
		MFLiberty.click();
		driver.navigate().back();
		MFRDX.click();
		driver.navigate().back();
		MFBirde.click();
		driver.navigate().back();
		MFGlobalite.click();
		driver.navigate().back();
		MFZeal.click();
		driver.navigate().back();
		MFMoora.click();
		driver.navigate().back();
		MFBaccaBucci.click();
		driver.navigate().back();
		MFJokatoo.click();
		driver.navigate().back();
		MFFittos.click();
		driver.navigate().back();
		MFSnatch.click();
		driver.navigate().back();
		MFYellowTree.click();
		driver.navigate().back();
		MFBristol.click();
		driver.navigate().back();
		MFARGold.click();
		driver.navigate().back();
		MFTrase.click();
		driver.navigate().back();
		MFAairwalk.click();
		driver.navigate().back();
		MFVintex.click();
		driver.navigate().back();
		MFFasco.click();
		driver.navigate().back();
		MFSFR.click();
		driver.navigate().back();
		MFJenja.click();
		driver.navigate().back();
		MFFW16.click();
		driver.navigate().back();
		MFET.click();
		driver.navigate().back();
		MFQualida.click();
		driver.navigate().back();
		MFHDX.click();
		driver.navigate().back();
		MFSaiyan.click();
		driver.navigate().back();
		MFFunnel.click();
		driver.navigate().back();
		
	}
	
	
	
	public void MFfooter(String MensFootwearURL) throws InterruptedException {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.navigate().to(MensFootwearURL);
		MFabout.click();
		driver.navigate().back();
		Thread.sleep(500);
		MFcareerbottom.click();
		driver.navigate().back();
		Thread.sleep(500);
		MFpressroom.click();
		driver.navigate().back();
		Thread.sleep(500);
		MFinvestorrelation.click();
		driver.navigate().back();
		Thread.sleep(500);
		MFfaq.click();
		driver.navigate().back();
		Thread.sleep(500);
		MFprepurchase.click();
		driver.navigate().back();
		Thread.sleep(500);
		MFshippingoptions.click();
		driver.navigate().back();
		Thread.sleep(500);
		MFrefund.click();
		driver.navigate().back();
		Thread.sleep(500);
		MFunsubscribe.click();
		driver.navigate().back();
		Thread.sleep(500);
		MFfeedback.click();
		driver.navigate().back();
		Thread.sleep(500);
		MFcontactus.click();
		driver.navigate().back();
		Thread.sleep(500);
		MFbecomASeller.click();
		driver.navigate().back();
		Thread.sleep(500);
		MFsellerfaq.click();
		driver.navigate().back();
		Thread.sleep(500);
		MFhotdealsstore.click();
		driver.navigate().back();
		Thread.sleep(500);
		MFsitemap.click();
		driver.navigate().back();
		Thread.sleep(500);
		MFlivetv.click();
		driver.navigate().back();
		Thread.sleep(500);
		MFapparelsaccessories.click();
		driver.navigate().back();
		Thread.sleep(500);
		MFmobilephones.click();
		driver.navigate().back();
		Thread.sleep(500);
		MFcomputersperipherals.click();
		driver.navigate().back();
		Thread.sleep(500);
		MFhomekitchenappliances.click();
		driver.navigate().back();
		Thread.sleep(500);
		MFhomedecor.click();
		driver.navigate().back();
		Thread.sleep(500);
		MFjewellerywatches.click();
		driver.navigate().back();
		Thread.sleep(500);
		MFautomobiles.click();
		driver.navigate().back();
		Thread.sleep(500);
		MFconsumerelectronics.click();
		driver.navigate().back();
		Thread.sleep(500);
		MFtoysnursery.click();
		driver.navigate().back();
		Thread.sleep(500);
		MFhealthbeauty.click();
		driver.navigate().back();
		Thread.sleep(500);
		MFsportsfitness.click();
		driver.navigate().back();
		Thread.sleep(500);
		MFcategoriesBOTTOM.click();
		driver.navigate().back();
		
		
	}
	
}
