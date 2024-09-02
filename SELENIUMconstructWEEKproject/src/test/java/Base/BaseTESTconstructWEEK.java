package Base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Allpages.BOOTS;
import Allpages.BagPACK;
import Allpages.DuffleBAGAndSTROLLEYS;
import Allpages.FootwareCOMBOS;
import Allpages.FormalSHOES;
import Allpages.HandbagAndCLUTCHES;
import Allpages.MensFOOTWARE;
import Allpages.SandelAndSLIPERS;
import Allpages.SportsSHOES;
import Allpages.TravelAndUTILITYbag;
import Allpages.WomensFATIONbags;
import Allpages.WomensFOOTWARE;
import Allpages.WomensSANDELS;

public class BaseTESTconstructWEEK {

	protected WebDriver driver;
	String OriginURL;
	protected String MensFootwearURL;
	protected String FootwearCombosURL;
	protected String BootsURL;
	protected String SportsShoesURL;
	protected String FormalShoesURL;
	protected String SandalsAndSlippersURL;
	protected String WomensFootwearURL;
	protected String WomensSandalsURL;
	protected String WomenFashionBagsURL;
	protected String HandbagAndClutchesURL;
	protected String TravelAndUtilityBagsURL;
	protected String BackpackURL;
	protected String DuffleBagAndStrolleysURL;
	protected String FromPrice;
	protected String ToPrice;
	protected String Pincode;
	protected String MensFootwearSearch;
	protected String FootwearCombosSearch;
	protected String BootsSearch;
	protected String SportsShoesSearch;
	protected String FormalShoesSearch;
	protected String SandalsAndSlippersSearch;
	protected String WomensFootwearSearch;
	protected String WomensSandalsSearch;
	protected String WomenFashionBagsSearch;
	protected String HandbagAndClutchesSearch;
	protected String TravelAndUtilityBagsSearch;
	protected String BackpackSearch;
	protected String DuffleBagAndStrolleysSearch;
	protected String BRANDMensFootwearSearch;
	protected String BRANDFootwearCombosSearch;
	protected String BRANDBootsSearch;
	protected String BRANDSportsShoesSearch;
	protected String BRANDFormalShoesSearch;
	protected String BRANDSandalsAndSlippersSearch;
	protected String BRANDWomensFootwearSearch;
	protected String BRANDWomensSandalsSearch;
	protected String BRANDWomenFashionBagsSearch;
	protected String BRANDHandbagAndClutchesSearch;
	protected String BRANDTravelAndUtilityBagsSearch;
	protected String BRANDBackpackSearch;
	protected String BRANDDuffleBagAndStrolleysSearch;
	protected String Language;
	protected String NotDISPLAY;
	protected String BuyDISPLAY;
	protected String sort1;
	protected String sort2;
	protected String sort3;
	protected String sort4;
	protected String sort5;
	protected String sort6;
	protected MensFOOTWARE MF;
	protected FootwareCOMBOS FC;
	protected BOOTS B;
	protected SportsSHOES SS;
	protected FormalSHOES FS;
	protected SandelAndSLIPERS SAS;
	protected WomensFOOTWARE WF;
	protected WomensSANDELS WS;
	protected WomensFATIONbags WFB;
	protected HandbagAndCLUTCHES HC;
	protected TravelAndUTILITYbag TUB;
	protected BagPACK BP;
	protected DuffleBAGAndSTROLLEYS DBS;
	protected Actions act;
	protected WebDriverWait wait;
	protected SoftAssert sA;
	protected JavascriptExecutor jsExecutor;
	ExtentReports reports;
	protected ExtentTest test;
	
	public static void capture(WebDriver driver, int n) throws IOException {

		TakesScreenshot SS = (TakesScreenshot) driver;
		File imagesFile = SS.getScreenshotAs(OutputType.FILE);
		File imgFile = new File("C:\\Users\\User\\Desktop\\CONSTRUCTweekSSs\\ConstructWEEK" + n + ".png");
		FileUtils.copyFile(imagesFile, imgFile);
		
	}
	
	@BeforeClass
	public void reportCONFIG() {

		// creating the object of ExtentReports class and starting the test

		reports = new ExtentReports(
				"C:\\Users\\User\\Documents\\workspace-spring-tool-suite-4-4.23.1.RELEASE\\SELENIUMconstructWEEKproject\\report.html");
		test = reports.startTest("ConstructWeek-Naaptol");
	}
	
	@BeforeMethod
	public void setup() throws IOException {
		
		driver = new ChromeDriver();
		
		
		Properties properties = new Properties();
		FileInputStream file = new FileInputStream("C:\\Users\\User\\Documents\\workspace-spring-tool-suite-4-4.23.1.RELEASE\\SELENIUMconstructWEEKproject\\src\\test\\resources\\configure\\constuctWEEK.properties");
		properties.load(file);
		OriginURL = properties.getProperty("POriginURL");
		driver.get(OriginURL);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		if (driver == null) {
		    throw new IllegalStateException("WebDriver is not initialized. Please check the setup method.");
		}

		
		
		act = new Actions(driver);
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		sA = new SoftAssert();
		jsExecutor = (JavascriptExecutor) driver;
		
		MF = new MensFOOTWARE(driver);
		FC = new FootwareCOMBOS(driver);
		B = new BOOTS(driver);
		SS = new SportsSHOES(driver);
		FS = new FormalSHOES(driver);
		SAS = new SandelAndSLIPERS(driver);
		WF = new WomensFOOTWARE(driver);
		WS = new WomensSANDELS(driver);
		WFB = new WomensFATIONbags(driver);
		HC = new HandbagAndCLUTCHES(driver);
		TUB = new TravelAndUTILITYbag(driver);
		BP = new BagPACK(driver);
		DBS = new DuffleBAGAndSTROLLEYS(driver);
		
		
		MensFootwearURL = properties.getProperty("PMensFootwearURL");
		FootwearCombosURL = properties.getProperty("PFootwearCombosURL");
		BootsURL = properties.getProperty("PBootsURL");
		SportsShoesURL = properties.getProperty("PSportsShoesURL");
		FormalShoesURL = properties.getProperty("PFormalShoesURL");
		SandalsAndSlippersURL = properties.getProperty("PSandalsAndSlippersURL");
		WomensFootwearURL = properties.getProperty("PWomensFootwearURL");
		WomensSandalsURL = properties.getProperty("PWomensSandalsURL");
		WomenFashionBagsURL = properties.getProperty("PWomenFashionBagsURL");
		HandbagAndClutchesURL = properties.getProperty("PHandbagAndClutchesURL");
		TravelAndUtilityBagsURL = properties.getProperty("PTravelAndUtilityBagsURL");
		BackpackURL = properties.getProperty("PBackpackURL");
		DuffleBagAndStrolleysURL = properties.getProperty("PDuffleBagAndStrolleysURL");
		FromPrice = properties.getProperty("PFromPrice");
		ToPrice = properties.getProperty("PToPrice");
		Pincode = properties.getProperty("PPincode");
		MensFootwearSearch = properties.getProperty("PMensFootwearSearch");
		FootwearCombosSearch = properties.getProperty("PFootwearCombosSearch");
		BootsSearch = properties.getProperty("PBootsSearch");
		SportsShoesSearch = properties.getProperty("PSportsShoesSearch");
		FormalShoesSearch = properties.getProperty("PFormalShoesSearch");
		SandalsAndSlippersSearch = properties.getProperty("PSandalsAndSlippersSearch");
		WomensFootwearSearch = properties.getProperty("PWomensFootwearSearch");
		WomensSandalsSearch = properties.getProperty("PWomensSandalsSearch");
		WomenFashionBagsSearch = properties.getProperty("PWomenFashionBagsSearch");
		HandbagAndClutchesSearch = properties.getProperty("PHandbagAndClutchesSearch");
		TravelAndUtilityBagsSearch = properties.getProperty("PTravelAndUtilityBagsSearch");
		BackpackSearch = properties.getProperty("PBackpackSearch");
		DuffleBagAndStrolleysSearch = properties.getProperty("PDuffleBagAndStrolleysSearch");
		BRANDMensFootwearSearch = properties.getProperty("PBRANDMensFootwearSearch");
		BRANDFootwearCombosSearch = properties.getProperty("PBRANDFootwearCombosSearch");
		BRANDBootsSearch = properties.getProperty("PBRANDBootsSearch");
		BRANDSportsShoesSearch = properties.getProperty("PBRANDSportsShoesSearch");
		BRANDFormalShoesSearch = properties.getProperty("PBRANDFormalShoesSearch");
		BRANDSandalsAndSlippersSearch = properties.getProperty("PBRANDSandalsAndSlippersSearch");
		BRANDWomensFootwearSearch = properties.getProperty("PBRANDWomensFootwearSearch");
		BRANDWomensSandalsSearch = properties.getProperty("PBRANDWomensSandalsSearch");
		BRANDWomenFashionBagsSearch = properties.getProperty("PBRANDWomenFashionBagsSearch");
		BRANDHandbagAndClutchesSearch = properties.getProperty("PBRANDHandbagAndClutchesSearch");
		BRANDTravelAndUtilityBagsSearch = properties.getProperty("PBRANDTravelAndUtilityBagsSearch");
		BRANDBackpackSearch = properties.getProperty("PBRANDBackpackSearch");
		BRANDDuffleBagAndStrolleysSearch = properties.getProperty("PBRANDDuffleBagAndStrolleysSearch");
		
		sort1 = properties.getProperty("Psort1");
		sort2 = properties.getProperty("Psort2");
		sort3 = properties.getProperty("Psort3");
		sort4 = properties.getProperty("Psort4");
		sort5 = properties.getProperty("Psort5");
		sort6 = properties.getProperty("Psort6");
		
		Language = properties.getProperty("PLanguage");
		BuyDISPLAY = properties.getProperty("PBuyDISPLAY");
		NotDISPLAY = properties.getProperty("PNotDISPLAY");
		
		test.log(LogStatus.PASS, "Browser OPENED");
		
	}
	
	@AfterMethod
	public void teardown() {
		
		driver.close();
		test.log(LogStatus.PASS, "Browser CLOSED");
		
	}
	
	@AfterClass
	public void flush() {
		reports.flush();
		reports.endTest(test);
	}

	
}
