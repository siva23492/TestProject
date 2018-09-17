package automationtesting.in;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesDemo {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Frames.html");
		/*
		 * int total_frames=driver.findElements(By.tagName("iframe")).size();
		 * System.out.println("total frames in a page is "+total_frames);
		 * driver.switchTo().frame("SingleFrame");
		 * driver.findElement(By.xpath("html/body/section/div/div/div/input")).sendKeys(
		 * "siva");
		 * 
		 * driver.switchTo().defaultContent();
		 * 
		 * 
		 * driver.findElement(By.
		 * xpath("//a[contains(text(),'Iframe with in an Iframe')]")).click();
		 * driver.switchTo().frame(1); driver.switchTo().frame(0);
		 * 
		 * driver.findElement(By.xpath("html/body/section/div/div/div/input")).sendKeys(
		 * "sivaramakrishna"); Thread.sleep(2000);
		 */

		switchToFrame(0);
		driver.findElement(By.xpath("html/body/section/div/div/div/input")).sendKeys("siva");
		switchToDefaultContent();

		driver.findElement(By.xpath("//a[contains(text(),'Iframe with in an Iframe')]")).click();

		switchToFrame(1);
		switchToFrame(0);

		driver.findElement(By.xpath("html/body/section/div/div/div/input")).sendKeys("sivaramakrishna");
		Thread.sleep(2000);
	}

	public static void switchToFrame(int index) {

		driver.switchTo().frame(index);
	}

	public static void switchToDefaultContent() {
		driver.switchTo().defaultContent();
	}

}
