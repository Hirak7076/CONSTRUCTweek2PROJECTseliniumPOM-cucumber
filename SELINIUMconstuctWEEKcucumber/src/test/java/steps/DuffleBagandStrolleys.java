package steps;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DuffleBagandStrolleys {

	WebDriver driver;
	Actions act;
	WebDriverWait wait;
	SoftAssert sA = new SoftAssert();
	ExtentReports reports;
	ExtentTest test;
	public static void capture(WebDriver driver, int n) throws IOException {

		TakesScreenshot SS = (TakesScreenshot) driver;
		File imagesFile = SS.getScreenshotAs(OutputType.FILE);
		File imgFile = new File("C:\\Users\\User\\Desktop\\CWcucumberALLpagesSSs\\c\\" + n + ".png");
		FileUtils.copyFile(imagesFile, imgFile);
		
	}
	
	
	@Given("opening the browser then the URL and clicking the dufflebag and strolleys option inside categories")
	public void opening_the_browser_then_the_url_and_clicking_the_dufflebag_and_strolleys_option_inside_categories() throws IOException {
		
		driver = new ChromeDriver();
		act = new Actions(driver);
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.naaptol.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement categories = driver.findElement(By.className("cate_head"));
		WebElement FootwearANDBags = driver.findElement(By.xpath("(//span[@class='catIconMenu footwear'])[1]"));
		WebElement DuffleBagandStrolleys = driver.findElement(By.xpath("(//a[@href='/shop-online/footwear-travel-bags/travel-utility-bags/duffle-bags.html'])[1]"));
		
		act.moveToElement(categories).build().perform();
		act.moveToElement(FootwearANDBags).build().perform();
		act.moveToElement(DuffleBagandStrolleys).build().perform();
		DuffleBagandStrolleys.click();
		capture(driver, 1);
		
	}

	@Given("testing all the header options of dufflebag and strolleys")
	public void testing_all_the_header_options_of_dufflebag_and_strolleys() throws IOException {
		
		driver.findElement(By.xpath("(//img[@title=\"Online Shopping in India\"])[2]")).click();
		driver.navigate().back();
		Select select = new Select(driver.findElement(By.id("localization_dropdown")));
		select.selectByVisibleText("हिन्दी");
		select.selectByVisibleText("English");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("login-panel-link"))).click();
		driver.findElement(By.cssSelector("[title=\"Close\"]")).click();
		driver.findElement(By.id("registration-panel-link")).click();
		driver.findElement(By.cssSelector("[title=\"Close\"]")).click();
		driver.findElement(By.xpath("(//a[@href=\"/mobile-apps.html\"])[1]")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("(//a[@href=\"/faces/jsp/becomeASeller/becomASeller.jsp\"])[1]")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("(//a[@href=\"/aboutus/career.html\"])[1]")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("(//a[@href='/'])[4]")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("(//a[@href='/shop-online/footwear-travel-bags.html'])[3]")).click();
		driver.navigate().back();
		capture(driver, 2);
		
	}

	@When("testing all the middle options of dufflebag and strolleys")
	public void testing_all_the_middle_options_of_dufflebag_and_strolleys() throws IOException {
		

		driver.findElement(By.id("isexoutStock")).click();
		driver.findElement(By.xpath("(//a[@class=\"button_1\"])[1]")).click();
		
		String Parent = driver.getWindowHandle();
		
		driver.findElement(By.cssSelector("[title=\"Scottish Club Set of 7 Family Travel Bags (7DB2K)\"]")).click();
		wait.until(ExpectedConditions.numberOfWindowsToBe(2));
		Set<String> allWindows = driver.getWindowHandles();
		for (String window : allWindows) {
		    if (!window.equals(Parent)) {
		        driver.switchTo().window(window);
		        break;
		    }
		}		
		String Display = driver.findElement(By.xpath("//a[@title=\"Buy online\"]/span")).getText();
		sA.assertEquals(Display, "Click here to Buy");
		sA.assertAll();
		driver.close();
		driver.switchTo().window(Parent);
		
		driver.findElement(By.xpath("(//a[@title=\"Scottish Club Set of 7 Family Travel Bags (7DB1C)\"])[1]")).click();
		wait.until(ExpectedConditions.numberOfWindowsToBe(2));
		Set<String> allWindows1 = driver.getWindowHandles();
		for (String window : allWindows1) {
		    if (!window.equals(Parent)) {
		        driver.switchTo().window(window);
		        break;
		    }
		}		
		String Display1 = driver.findElement(By.xpath("//a[@title=\"Buy online\"]/span")).getText();
		sA.assertEquals(Display1, "Click here to Buy");
		sA.assertAll();
		driver.close();
		driver.switchTo().window(Parent);
		
		driver.findElement(By.cssSelector("[title=\"Large Convertible Duffle Backpack Bag (2HB1)\"]")).click();
		wait.until(ExpectedConditions.numberOfWindowsToBe(2));
		Set<String> allWindows2 = driver.getWindowHandles();
		for (String window : allWindows2) {
		    if (!window.equals(Parent)) {
		        driver.switchTo().window(window);
		        break;
		    }
		}		
		String Display2 = driver.findElement(By.xpath("//a[@title=\"Buy online\"]/span")).getText();
		sA.assertEquals(Display2, "Click here to Buy");
		sA.assertAll();
		driver.close();
		driver.switchTo().window(Parent);
		
		driver.findElement(By.cssSelector("[title=\"6 Pcs Travel Suitcase Organiser (6TO-1)\"]")).click();
		wait.until(ExpectedConditions.numberOfWindowsToBe(2));
		Set<String> allWindows3 = driver.getWindowHandles();
		for (String window : allWindows3) {
		    if (!window.equals(Parent)) {
		        driver.switchTo().window(window);
		        break;
		    }
		}		
		String Display3 = driver.findElement(By.xpath("//a[@title=\"Buy online\"]/span")).getText();
		sA.assertEquals(Display3, "Click here to Buy");
		sA.assertAll();
		driver.close();
		driver.switchTo().window(Parent);
		
		driver.findElement(By.cssSelector("[title=\"Leatherrite Set of 5 Travel Bags Combo\"]")).click();
		wait.until(ExpectedConditions.numberOfWindowsToBe(2));
		Set<String> allWindows4 = driver.getWindowHandles();
		for (String window : allWindows4) {
		    if (!window.equals(Parent)) {
		        driver.switchTo().window(window);
		        break;
		    }
		}		
		String Display4 = driver.findElement(By.xpath("//a[@title=\"Buy online\"]/span")).getText();
		sA.assertEquals(Display4, "Click here to Buy");
		sA.assertAll();
		driver.close();
		driver.switchTo().window(Parent);
		
		driver.findElement(By.xpath("(//a[@title=\"Foldable Travel bag (FTB)\"])[1]")).click();
		wait.until(ExpectedConditions.numberOfWindowsToBe(2));
		Set<String> allWindows5 = driver.getWindowHandles();
		for (String window : allWindows5) {
		    if (!window.equals(Parent)) {
		        driver.switchTo().window(window);
		        break;
		    }
		}		
		String Display5 = driver.findElement(By.xpath("//a[@title=\"Buy online\"]/span")).getText();
		sA.assertEquals(Display5, "Click here to Buy");
		sA.assertAll();
		driver.close();
		driver.switchTo().window(Parent);
		capture(driver, 3);
		
	}

	@When("testing all the leftbar options of dufflebag and strolleys")
	public void testing_all_the_leftbar_options_of_dufflebag_and_strolleys() throws InterruptedException, IOException {
		
		driver.findElement(By.id("iscod")).click();
		driver.findElement(By.cssSelector("[onclick=\"productSearch.setPersonalisedFilter(false);\"]")).click();
		driver.findElement(By.id("iscod")).click();
		driver.findElement(By.id("isexoutStock")).click();
		driver.findElement(By.cssSelector("[onclick=\"productSearch.setPersonalisedFilter(false);\"]")).click();
		driver.findElement(By.id("isexoutStock")).click();
		driver.findElement(By.id("isfreeship")).click();
		driver.findElement(By.cssSelector("[onclick=\"productSearch.setPersonalisedFilter(false);\"]")).click();
		driver.findElement(By.id("isfreeship")).click();
		driver.findElement(By.cssSelector("[onclick=\"productSearch.setPersonalisedFilter(false);\"]")).click();
		Thread.sleep(800);
		driver.findElement(By.id("brandFilterBox38493")).click();
		Thread.sleep(800);
		driver.findElement(By.id("brandFilterBox8313")).click();
		Thread.sleep(800);
		driver.findElement(By.id("brandFilterBox36045")).click();
		Thread.sleep(800);
		driver.findElement(By.id("brandFilterBox39071")).click();
		Thread.sleep(800);
		driver.findElement(By.id("brandFilterBox38493")).click();
		Thread.sleep(800);
		driver.findElement(By.id("brandFilterBox8313")).click();
		Thread.sleep(800);
		driver.findElement(By.id("brandFilterBox36045")).click();
		Thread.sleep(800);
		driver.findElement(By.id("brandFilterBox39071")).click();
		Thread.sleep(800);
		driver.findElement(By.id("priceFilterBox5")).click();
		Thread.sleep(800);
		driver.findElement(By.id("priceFilterBox6")).click();
		Thread.sleep(800);
		driver.findElement(By.id("priceFilterBox8")).click();
		Thread.sleep(800);
		driver.findElement(By.id("priceFilterBox3")).click();
		Thread.sleep(800);
		driver.findElement(By.id("priceFilterBox7")).click();
		Thread.sleep(800);
		driver.findElement(By.id("priceFilterBox1")).click();
		Thread.sleep(800);
		driver.findElement(By.id("priceFilterBox2")).click();
		Thread.sleep(800);
		driver.findElement(By.id("priceFilterBox4")).click();
		Thread.sleep(800);
		driver.findElement(By.id("priceFilterBox5")).click();
		Thread.sleep(800);
		driver.findElement(By.id("priceFilterBox6")).click();
		Thread.sleep(800);
		driver.findElement(By.id("priceFilterBox8")).click();
		Thread.sleep(800);
		driver.findElement(By.id("priceFilterBox3")).click();
		Thread.sleep(800);
		driver.findElement(By.id("priceFilterBox7")).click();
		Thread.sleep(800);
		driver.findElement(By.id("priceFilterBox1")).click();
		Thread.sleep(800);
		driver.findElement(By.id("priceFilterBox2")).click();
		Thread.sleep(800);
		driver.findElement(By.id("priceFilterBox4")).click();
		Thread.sleep(800);
		driver.findElement(By.id("discountFilterBox4")).click();
		Thread.sleep(800);
		driver.findElement(By.id("discountFilterBox2")).click();
		Thread.sleep(800);
		driver.findElement(By.id("discountFilterBox3")).click();
		Thread.sleep(800);
		driver.findElement(By.id("discountFilterBox1")).click();
		Thread.sleep(800);
		driver.findElement(By.id("discountFilterBox4")).click();
		Thread.sleep(800);
		driver.findElement(By.id("discountFilterBox2")).click();
		Thread.sleep(800);
		driver.findElement(By.id("discountFilterBox3")).click();
		Thread.sleep(800);
		driver.findElement(By.id("discountFilterBox1")).click();
		Thread.sleep(800);
		driver.findElement(By.id("featureFilterBox0f1")).click();
		Thread.sleep(800);
		driver.findElement(By.id("featureFilterBox1f1")).click();
		Thread.sleep(800);
		driver.findElement(By.id("featureFilterBox0f1")).click();
		Thread.sleep(800);
		driver.findElement(By.id("featureFilterBox1f1")).click();
		Thread.sleep(500);
		driver.findElement(By.id("featureFilterBox0f2")).click();
		Thread.sleep(500);
		driver.findElement(By.id("featureFilterBox1f2")).click();
		Thread.sleep(500);
		driver.findElement(By.id("featureFilterBox2f2")).click();
		Thread.sleep(500);
		driver.findElement(By.id("featureFilterBox3f2")).click();
		Thread.sleep(500);
		driver.findElement(By.id("featureFilterBox0f2")).click();
		Thread.sleep(500);
		driver.findElement(By.id("featureFilterBox1f2")).click();
		Thread.sleep(500);
		driver.findElement(By.id("featureFilterBox2f2")).click();
		Thread.sleep(500);
		driver.findElement(By.id("featureFilterBox3f2")).click();
		
		Thread.sleep(300);
		driver.findElement(By.id("brandtoggle")).click();
		Thread.sleep(300);
		driver.findElement(By.id("brandtoggle")).click();
		Thread.sleep(300);
		driver.findElement(By.id("pricetoggle")).click();
		Thread.sleep(300);
		driver.findElement(By.id("pricetoggle")).click();
		Thread.sleep(300);
		driver.findElement(By.id("discounttoggle")).click();
		Thread.sleep(300);
		driver.findElement(By.id("discounttoggle")).click();
		Thread.sleep(300);
		driver.findElement(By.id("featuretoggle1")).click();
		Thread.sleep(300);
		driver.findElement(By.id("featuretoggle1")).click();
		Thread.sleep(300);
		driver.findElement(By.id("featuretoggle2")).click();
		Thread.sleep(300);
		driver.findElement(By.id("featuretoggle2")).click();
		
		driver.findElement(By.id("fromPriceRange")).sendKeys("100");
		driver.findElement(By.id("toPriceRange")).sendKeys("8000");
		driver.findElement(By.xpath("(//a[@class=\"button_1\"])[2]")).click();
		
		Select select2 = new Select(driver.findElement(By.id("sortByFilter")));
		select2.selectByVisibleText("Most Popular");
		select2.selectByVisibleText("New Arrivals");
		select2.selectByVisibleText("Highest Rated");
		select2.selectByVisibleText("Most Expensive");
		select2.selectByVisibleText("Cheapest");
		Thread.sleep(1000);
		select2.selectByVisibleText("Sort by:");
		capture(driver, 4);
		
	}

	@When("testing all the footer options of dufflebag and strolleys")
	public void testing_all_the_footer_options_of_dufflebag_and_strolleys() throws IOException {
		
		driver.findElement(By.cssSelector("[href=\"/aboutus/about-naaptol.html\"]")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("(//a[@href=\"/aboutus/career.html\"])[2]")).click();
		driver.navigate().back();
		driver.findElement(By.cssSelector("[href=\"/aboutus/pressroom.html\"]")).click();
		driver.navigate().back();
		driver.findElement(By.cssSelector("[href=\"/aboutus/investor-relation.html\"]")).click();
		driver.navigate().back();
		driver.findElement(By.cssSelector("[href=\"/help/faq.html\"]")).click();
		driver.navigate().back();
		driver.findElement(By.cssSelector("[href=\"/help/pre-purchase.html\"]")).click();
		driver.navigate().back();
		driver.findElement(By.cssSelector("[href=\"/help/shipping-options.html\"]")).click();
		driver.navigate().back();
		driver.findElement(By.cssSelector("[href=\"/help/payment-options.html\"]")).click();
		driver.navigate().back();
		driver.findElement(By.cssSelector("[href=\"https://www.naaptol.com/refund-n-return.html\"]")).click();
		driver.navigate().back();
		driver.findElement(By.cssSelector("[href=\"/help/unsubscribe.html\"]")).click();
		driver.navigate().back();
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[href=\"/customer-support/feedback.html\"]"))).click();
		//driver.findElement(By.cssSelector("[href=\"/customer-support/feedback.html\"]")).click();
		driver.navigate().back();
		driver.findElement(By.cssSelector("[href=\"/customer-support/contactus.html\"]")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("(//a[@href=\"/faces/jsp/becomeASeller/becomASeller.jsp\"])[2]")).click();
		driver.navigate().back();
		driver.findElement(By.cssSelector("[href=\"/customer-support/seller-faq.html\"]")).click();
		driver.navigate().back();
		driver.findElement(By.cssSelector("[href=\"/online-store/hot-deals-store/si-1435-p.html\"]")).click();
		driver.navigate().back();
		driver.findElement(By.cssSelector("[href=\"/app-deal-categories.html\"]")).click();
		driver.navigate().back();
		driver.findElement(By.cssSelector("[href=\"/sitemap.html\"]")).click();
		driver.navigate().back();
		driver.findElement(By.cssSelector("[href=\"/live-tv/schedule.html\"]")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("(//a[@href=\"/shop-online/apparels-accessories.html\"])[4]")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("(//a[@href=\"/shop-online/footwear-travel-bags.html\"])[5]")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("(//a[@href=\"/shop-online/mobile-phones.html\"])[4]")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("(//a[@href=\"/shop-online/computers-peripherals.html\"])[4]")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("(//a[@href=\"/shop-online/home-kitchen-appliances.html\"])[4]")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("(//a[@href=\"/shop-online/home-decor.html\"])[4]")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("(//a[@href=\"/shop-online/jewellery-watches.html\"])[4]")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("(//a[@href=\"/shop-online/automobiles.html\"])[4]")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("(//a[@href=\"/shop-online/consumer-electronics.html\"])[4]")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("(//a[@href=\"/shop-online/toys-nursery.html\"])[4]")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("(//a[@href=\"/shop-online/health-beauty.html\"])[4]")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("(//a[@href=\"/shop-online/sports-fitness.html\"])[4]")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("(//a[@href=\"/categories.html\"])[4]")).click();
		driver.navigate().back();
		capture(driver, 5);
		
	}

	@Then("closing the browser of dufflebag and strolleys")
	public void closing_the_browser_of_dufflebag_and_strolleys() {
		
		driver.close();
		
	}
	public void flush() {
		reports.flush();
		reports.endTest(test);
	}
	
}
