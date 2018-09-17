package automationtesting.in;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.Select;

public class ScrollWithInWebElement {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.get("http://demo.automationtesting.in/WebTable.html");
		WebElement ele = driver
				.findElement(By.xpath("/html/body/section/div[1]/div/div[3]/div[2]/div[1]/div[2]/select"));
		Select s = new Select(ele);
		s.selectByVisibleText("30");
		Thread.sleep(7000);
		EventFiringWebDriver edriver = new EventFiringWebDriver(driver);
		edriver.executeScript(
				"document.querySelector('div[role=\"rowgroup\"][class*=\"ui-grid-view\"]').scrollTop=500");

	}

}
