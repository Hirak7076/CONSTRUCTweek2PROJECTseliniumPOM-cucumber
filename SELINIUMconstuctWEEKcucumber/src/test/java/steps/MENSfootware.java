package steps;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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

public class MENSfootware {
	
	WebDriver driver;
	Actions act;
	WebDriverWait wait;
	SoftAssert sA = new SoftAssert();
	JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
	ExtentReports reports;
	ExtentTest test;
	public static void capture(WebDriver driver, int n) throws IOException {

		TakesScreenshot SS = (TakesScreenshot) driver;
		File imagesFile = SS.getScreenshotAs(OutputType.FILE);
		File imgFile = new File("C:\\Users\\User\\Desktop\\CWcucumberALLpagesSSs\\g\\" + n + ".png");
		FileUtils.copyFile(imagesFile, imgFile);
		
	}
	
	@Given("opening the browser then the URL and clicking the mens footware option in side categories")
	public void opening_the_browser_then_the_url_and_clicking_the_mens_footware_option_in_side_categories() throws IOException {
		
		driver = new ChromeDriver();
		act = new Actions(driver);
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.naaptol.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		
		WebElement categories = driver.findElement(By.className("cate_head"));
		WebElement FootwearANDBags = driver.findElement(By.xpath("(//span[@class='catIconMenu footwear'])[1]"));
		WebElement MensFootwear = driver.findElement(By.xpath("(//a[@href='/shop-online/footwear-travel-bags/mens-footwear.html'])[1]"));
		
		act.moveToElement(categories).build().perform();
		act.moveToElement(FootwearANDBags).build().perform();
		act.moveToElement(MensFootwear).build().perform();
		MensFootwear.click();
		capture(driver, 1);
		
	}

	@Given("testing all the header options")
	public void testing_all_the_header_options() throws IOException {
		
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

	@When("testing all the middle options")
	public void testing_all_the_middle_options() throws InterruptedException, IOException {
		
		driver.findElement(By.cssSelector("[alt='Mens-Footwear-Sports-Shoes-']")).click();
		driver.findElement(By.id("isexoutStock")).click();
		driver.findElement(By.xpath("(//a[@class='button_1'])[1]")).click();
		act.moveToElement(driver.findElement(By.id("productItem1"))).build().perform();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[text()='Quick View'])[1]"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[title='Close']"))).click();
		driver.navigate().to("https://www.naaptol.com/shop-online/footwear-travel-bags/mens-footwear.html");
		driver.findElement(By.xpath("//span[@title=\"Sports Shoes + Free Leatherite Watch + Aluminium Wallet + Sunglasses - Pick Any 1 (SW41)\"]")).click();
		driver.findElement(By.xpath("//a[@title=\"Close\"]")).click();
		driver.navigate().to("https://www.naaptol.com/shop-online/footwear-travel-bags/mens-footwear.html");
		driver.findElement(By.xpath("(//a[@id=\"cart-panel-link\"])[2]")).click();
		driver.findElement(By.cssSelector("[title=\"Close\"]")).click();
//		driver.navigate().back();
//		driver.navigate().back();
//		driver.navigate().back();
		String Parent = driver.getWindowHandle();
		driver.findElement(By.xpath("(//a[@title=\"Sports Shoes + Free Leatherite Watch + Aluminium Wallet + Sunglasses - Pick Any 1 (SW41)\"])[2]")).click();
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
		driver.findElement(By.xpath("(//a[@title=\"Leatherite Sandals Pick Any 1 + Free Sports Watch + Sunglasses + Aluminium Wallet (SW59)\"])[2]")).click();
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
		driver.findElement(By.xpath("(//a[@title=\"Jenja Men's Leatherite Sandal (J2) - Pick Any 1\"])[2]")).click();
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
		driver.findElement(By.xpath("(//a[@title=\"Pack of 2 Men's Leatherite Sandals + Free Sports Watch And Sunglasses (SW55)\"])[2]")).click();
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
		driver.findElement(By.xpath("(//a[@title=\"Pack of 2 Men's Summer Sandals + Free Stylish Watch & Sunglasses (SW82)\"])[6]")).click();
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
		driver.findElement(By.xpath("(//a[@title=\"Leatherite Sandals + Free Leatherite Watch + Sunglasses + Aluminium Wallet - Pick Any 1 (SW52)\"])[2]")).click();
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
		driver.findElement(By.xpath("(//a[@title=\"Pick Any 1 Sports Shoes With Heel Pads + Free Stylish Watch & Sunglasses (SSC1)\"])[6]")).click();
		wait.until(ExpectedConditions.numberOfWindowsToBe(2));
		Set<String> allWindows6 = driver.getWindowHandles();
		for (String window : allWindows6) {
		    if (!window.equals(Parent)) {
		        driver.switchTo().window(window);
		        break;
		    }
		}		
		String Display6 = driver.findElement(By.xpath("//a[@title=\"Buy online\"]/span")).getText();
		sA.assertEquals(Display6, "Click here to Buy");
		sA.assertAll();
		driver.close();
		driver.switchTo().window(Parent);
		driver.findElement(By.xpath("(//a[@title=\"Pack of 2 Men's Sandals + Free Watch Sunglasses & Wallet (SW81)\"])[6]")).click();
		wait.until(ExpectedConditions.numberOfWindowsToBe(2));
		Set<String> allWindows7 = driver.getWindowHandles();
		for (String window : allWindows7) {
		    if (!window.equals(Parent)) {
		        driver.switchTo().window(window);
		        break;
		    }
		}		
		String Display7 = driver.findElement(By.xpath("//a[@title=\"Buy online\"]/span")).getText();
		sA.assertEquals(Display7, "Click here to Buy");
		sA.assertAll();
		driver.close();
		driver.switchTo().window(Parent);
		driver.findElement(By.xpath("(//a[@title=\"Stylish Open Leatherite Sandals - Pick Any 1 Free Sports Watch + Sunglasses + Aluminium Wallet (SW66)\"])[2]")).click();
		wait.until(ExpectedConditions.numberOfWindowsToBe(2));
		Set<String> allWindows8 = driver.getWindowHandles();
		for (String window : allWindows8) {
		    if (!window.equals(Parent)) {
		        driver.switchTo().window(window);
		        break;
		    }
		}		
		String Display8 = driver.findElement(By.xpath("//a[@title=\"Buy online\"]/span")).getText();
		sA.assertEquals(Display8, "Click here to Buy");
		sA.assertAll();
		driver.close();
		driver.switchTo().window(Parent);
		driver.findElement(By.xpath("(//a[@title=\"Stylish Leatherite Sandals Pick Any 1 Free Sports Watch + Sunglasses (SW63)\"])[2]")).click();
		wait.until(ExpectedConditions.numberOfWindowsToBe(2));
		Set<String> allWindows9 = driver.getWindowHandles();
		for (String window : allWindows9) {
		    if (!window.equals(Parent)) {
		        driver.switchTo().window(window);
		        break;
		    }
		}		
		String Display9 = driver.findElement(By.xpath("//a[@title=\"Buy online\"]/span")).getText();
		sA.assertEquals(Display9, "Click here to Buy");
		sA.assertAll();
		driver.close();
		driver.switchTo().window(Parent);
		driver.findElement(By.xpath("(//a[@title=\"Pick Any 1 Stylish Leatherite Sandals + Free Watch And Sunglasses (SW76)\"])[2]")).click();
		wait.until(ExpectedConditions.numberOfWindowsToBe(2));
		Set<String> allWindows10 = driver.getWindowHandles();
		for (String window : allWindows10) {
		    if (!window.equals(Parent)) {
		        driver.switchTo().window(window);
		        break;
		    }
		}		
		String Display10 = driver.findElement(By.xpath("//a[@title=\"Buy online\"]/span")).getText();
		sA.assertEquals(Display10, "Click here to Buy");
		sA.assertAll();
		driver.close();
		driver.switchTo().window(Parent);
		driver.findElement(By.xpath("(//a[@title=\"Pack of 3 Men's Sandals (MS2)\"])[2]")).click();
		wait.until(ExpectedConditions.numberOfWindowsToBe(2));
		Set<String> allWindows11 = driver.getWindowHandles();
		for (String window : allWindows11) {
		    if (!window.equals(Parent)) {
		        driver.switchTo().window(window);
		        break;
		    }
		}		
		String Display11 = driver.findElement(By.xpath("//a[@title=\"Buy online\"]/span")).getText();
		sA.assertEquals(Display11, "Click here to Buy");
		sA.assertAll();
		driver.close();
		driver.switchTo().window(Parent);
		capture(driver, 3);
		
		
	}

	@When("testing all the leftbar options")
	public void testing_all_the_leftbar_options() throws IOException {
		
		driver.navigate().to("https://www.naaptol.com/shop-online/footwear-travel-bags/mens-footwear.html");
		driver.findElement(By.cssSelector("[title='Rain Footwear']")).click();
		driver.navigate().back();
		driver.findElement(By.cssSelector("[title='Mens Sandals And Combo']")).click();
		driver.navigate().back();
		driver.findElement(By.cssSelector("[title='Mens Shoes and Combo']")).click();
		driver.navigate().back();
		driver.findElement(By.cssSelector("[title='Footwear Combos']")).click();
		driver.navigate().back();
		driver.findElement(By.cssSelector("[title='Boots']")).click();
		driver.navigate().back();
		driver.findElement(By.cssSelector("[title='Sports Shoes']")).click();
		driver.navigate().back();
		driver.findElement(By.cssSelector("[title='Formal Shoes']")).click();
		driver.navigate().back();
		driver.findElement(By.cssSelector("[title='Sandals & Slippers']")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("//a[@title='Branded']")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("//a[@title='Liberty']")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("//a[@title='RDX']")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("//a[@title='Birde']")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("//a[@title='Bacca Bucci']")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("//a[@title='Zeal']")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("//a[@title='Moora']")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("//a[@title='Globalite']")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("//a[@title='Jokatoo']")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("//a[@title='Snatch']")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("//a[@title='Fittos']")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("//a[@title='Trase']")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("//a[@title='Yellow Tree']")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("//a[@title='SFR']")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("//a[@title='Bristol']")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("//a[@title='AR Gold']")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("//a[@title='Vintex']")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("//a[@title='Fasco']")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("//a[@title='FW16']")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("//a[@title='Aairwalk']")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("//a[@title='ARV']")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("//a[@title='Jenja']")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("//a[@title='ET']")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("//a[@title='Qualida']")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("//a[@title='HDX']")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("//a[@title='Saiyan']")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("//a[@title='Funnel']")).click();
		driver.navigate().back();
		capture(driver, 4);
		
	}

	@When("testing all the footer options")
	public void testing_all_the_footer_options() throws IOException {
		
		driver.navigate().to("https://www.naaptol.com/shop-online/footwear-travel-bags/mens-footwear.html");
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
		
		driver.findElement(By.cssSelector("[name=\"header_search_text\"]")).sendKeys("Pack of 3 Men's Sandals (MS2)");
		driver.findElement(By.xpath("(//div[@class=\"search\"])[2]")).click();
		capture(driver, 5);
		
	}

	@Then("closing the browser")
	public void closing_the_browser() {
		
		driver.close();
		
	}
	public void flush() {
		reports.flush();
		reports.endTest(test);
	}

}








