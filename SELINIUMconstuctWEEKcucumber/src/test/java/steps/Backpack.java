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

public class Backpack {

	WebDriver driver;
	Actions act;
	WebDriverWait wait;
	SoftAssert sA = new SoftAssert();
	ExtentReports reports;
	ExtentTest test;
	public static void capture(WebDriver driver, int n) throws IOException {

		TakesScreenshot SS = (TakesScreenshot) driver;
		File imagesFile = SS.getScreenshotAs(OutputType.FILE);
		File imgFile = new File("C:\\Users\\User\\Desktop\\CWcucumberALLpagesSSs\\a\\ConstructWEEK" + n + ".png");
		FileUtils.copyFile(imagesFile, imgFile);
		
	}
	
	public ExtentTest reportCONFIG() {

		// creating the object of ExtentReports class and starting the test

		reports = new ExtentReports(
				"C:\\Users\\User\\Desktop\\cucumberREPORT\\backpack.html");
		test = reports.startTest("ConstructWeek-NaaptolBackpack");
		return test;
	}
	
	@Given("opening the browser then the URL and clicking the backpacks option inside categories")
	public void opening_the_browser_then_the_url_and_clicking_the_backpacks_option_inside_categories() throws IOException {
		test = reportCONFIG();
		driver = new ChromeDriver();
		act = new Actions(driver);
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.naaptol.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement categories = driver.findElement(By.className("cate_head"));
		WebElement FootwearANDBags = driver.findElement(By.xpath("(//span[@class='catIconMenu footwear'])[1]"));
		WebElement Backpack = driver.findElement(By.xpath("(//a[@href='/shop-online/footwear-travel-bags/travel-utility-bags/backpacks.html'])[1]"));
		
		act.moveToElement(categories).build().perform();
		act.moveToElement(FootwearANDBags).build().perform();
		act.moveToElement(Backpack).build().perform();
		Backpack.click();
		capture(driver, 1);
		
	}

	@Given("testing all the header options of backpacks")
	public void testing_all_the_header_options_of_backpacks() throws IOException {
		
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

	@When("testing all the middle options of backpacks")
	public void testing_all_the_middle_options_of_backpacks() throws InterruptedException, IOException {
		
		String Parent = driver.getWindowHandle();
		
		driver.findElement(By.xpath("(//a[@title=\"Scottish Club Backpack with Reflective Strip + Free Bag Protector\"])[2]")).click();
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
		
		driver.findElement(By.xpath("(//a[@title=\"Scottish Club Large Size Travel Backpack (LB2)\"])[2]")).click();
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
		
		driver.findElement(By.xpath("(//a[@title=\"3 Compartment Sling Bag with Free Sunglasses\"])[2]")).click();
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
		
		driver.findElement(By.xpath("(//a[@title=\"School Backpack Bag for 2 to 6 Years Kids + Free Water Bottle\"])[2]")).click();
		wait.until(ExpectedConditions.numberOfWindowsToBe(2));
		Set<String> allWindows3 = driver.getWindowHandles();
		for (String window : allWindows3) {
		    if (!window.equals(Parent)) {
		        driver.switchTo().window(window);
		        break;
		    }
		}		
		capture(driver, 3);
		String Display3 = driver.findElement(By.xpath("//li[@class=\"price\"]/span")).getText();
		sA.assertEquals(Display3, "Currently Not Available");
		sA.assertAll();
		driver.close();
		driver.switchTo().window(Parent);
		
		driver.findElement(By.xpath("(//a[@title=\"Leatherite Backpack\"])[2]")).click();
		wait.until(ExpectedConditions.numberOfWindowsToBe(2));
		Set<String> allWindows4 = driver.getWindowHandles();
		for (String window : allWindows4) {
		    if (!window.equals(Parent)) {
		        driver.switchTo().window(window);
		        break;
		    }
		}		
		String Display4 = driver.findElement(By.xpath("//li[@class=\"price\"]/span")).getText();
		sA.assertEquals(Display4, "Currently Not Available");
		sA.assertAll();
		driver.close();
		driver.switchTo().window(Parent);
		
		driver.findElement(By.xpath("(//a[@title=\"Scottish Club Backpack with Multiple Storage + Free Sunglasses\"])[2]")).click();
		wait.until(ExpectedConditions.numberOfWindowsToBe(2));
		Set<String> allWindows5 = driver.getWindowHandles();
		for (String window : allWindows5) {
		    if (!window.equals(Parent)) {
		        driver.switchTo().window(window);
		        break;
		    }
		}		
		String Display5 = driver.findElement(By.xpath("//li[@class=\"price\"]/span")).getText();
		sA.assertEquals(Display5, "Currently Not Available");
		sA.assertAll();
		driver.close();
		driver.switchTo().window(Parent);
		
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

	@When("testing all the leftbar options of backpacks")
	public void testing_all_the_leftbar_options_of_backpacks() throws InterruptedException, IOException {
		
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
		Thread.sleep(500);
		driver.findElement(By.id("brandFilterBox38493")).click();
		Thread.sleep(500);
		driver.findElement(By.id("brandFilterBox38493")).click();
		Thread.sleep(500);
		driver.findElement(By.id("priceFilterBox1")).click();
		Thread.sleep(500);
		driver.findElement(By.id("priceFilterBox1")).click();
		Thread.sleep(500);
		driver.findElement(By.id("discountFilterBox2")).click();
		Thread.sleep(500);
		driver.findElement(By.id("discountFilterBox2")).click();
		Thread.sleep(500);
		driver.findElement(By.id("discountFilterBox1")).click();
		Thread.sleep(500);
		driver.findElement(By.id("discountFilterBox1")).click();
		Thread.sleep(500);
		driver.findElement(By.id("featureFilterBox0f2")).click();
		Thread.sleep(500);
		driver.findElement(By.id("featureFilterBox0f2")).click();
		Thread.sleep(500);
		driver.findElement(By.id("brandtoggle")).click();
		driver.findElement(By.id("brandtoggle")).click();
		driver.findElement(By.id("pricetoggle")).click();
		driver.findElement(By.id("pricetoggle")).click();
		driver.findElement(By.id("discounttoggle")).click();
		driver.findElement(By.id("discounttoggle")).click();
		driver.findElement(By.id("featuretoggle1")).click();
		driver.findElement(By.id("featuretoggle1")).click();
		
		driver.findElement(By.id("fromPriceRange")).sendKeys("100");
		driver.findElement(By.id("toPriceRange")).sendKeys("4000");
		driver.findElement(By.xpath("(//a[@class=\"button_1\"])[2]")).click();
		capture(driver, 5);
		
	}

	@When("testing all the footer options of backpacks")
	public void testing_all_the_footer_options_of_backpacks() throws IOException {
		
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
		driver.findElement(By.cssSelector("[href=\"/customer-support/feedback.html\"]")).click();
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
		driver.findElement(By.id("cart-panel-link")).click();
		driver.findElement(By.xpath("//a[@title=\"Close\"]")).click();
		
		capture(driver, 6);
	}

	@Then("closing the browser of backpacks")
	public void closing_the_browser_of_backpacks() {
		
		driver.close();
		
	}
	public void flush() {
		reports.flush();
		reports.endTest(test);
	}

}
