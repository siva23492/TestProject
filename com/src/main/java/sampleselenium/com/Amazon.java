package sampleselenium.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class Amazon {
	WebDriver driver;

	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.navigate().to("https://www.amazon.in/");

	}

	@Test(priority = 1)
	public void searchboxAmazonTest() {
		driver.findElement(By.xpath(".//*[@id='twotabsearchtextbox']")).sendKeys("redmi note5");
		driver.findElement(By.xpath("//input[@type='submit' and @value='Go']")).click();
	}

	@Test(priority = 2)
	public void verifyLandingPageTest() {
		boolean b = driver.findElement(By.xpath("//*[@id=\"nav-your-amazon\"]")).isDisplayed();
		Assert.assertTrue(b);
	}

	@Test(priority = 3)
	public void loginTest() throws InterruptedException {

		// *[@id="nav-flyout-ya-signin"]/a/span
		// *[@id="ap_email"]
		// *[@id="continue"]
		// *[@id="ap_password"]
		// *[@id="signInSubmit"]
		WebElement ele = driver.findElement(By.xpath("//*[@id=\"nav-link-yourAccount\"]/span[2]/span"));

		Actions action = new Actions(driver);
		action.moveToElement(ele).build().perform();
		driver.findElement(By.xpath("//*[@id=\"nav-flyout-ya-signin\"]/a/span")).click();
		driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys("ramkrish23492@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"ap_password\"]")).sendKeys("");
		driver.findElement(By.xpath("//*[@id=\"signInSubmit\"]")).click();
		Thread.sleep(4000);

	}

	@Test(priority = 4)
	public void logoutTest() {
		WebElement ele = driver.findElement(By.xpath("//*[@id=\"nav-link-yourAccount\"]/span[2]/span"));

		Actions action = new Actions(driver);
		action.moveToElement(ele).build().perform();

		driver.findElement(By.xpath("//*[@id=\"nav-item-signout-sa\"]/span")).click();

	}

	public void tearDown() {
		driver.close();
	}

}
