package automationtesting.in;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class AddAddressDemo {
	static WebDriver driver;

	@BeforeSuite
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get("http://a.testaddressbook.com");
	}

	@Test
	public void colorTest() throws InterruptedException {
		driver.findElement(By.id("sign-in")).click();
		driver.findElement(By.id("session_email")).sendKeys("abcd@gmail.com");
		driver.findElement(By.id("session_password")).sendKeys("selenium");
		driver.findElement(By.name("commit")).click();

		driver.findElement(By.xpath("//a[contains(@data-test,'addresses')]")).click();
		driver.findElement(By.xpath("//a[contains(@data-test,'create')]")).click();
		driver.findElement(By.id("address_first_name")).sendKeys("siva");
		driver.findElement(By.id("address_last_name")).sendKeys("k");
		driver.findElement(By.id("address_street_address")).sendKeys("yadgirinagar");
		driver.findElement(By.id("address_secondary_address")).sendKeys("yusafguda");
		driver.findElement(By.id("address_city")).sendKeys("hyd");
		driver.findElement(By.id("address_zip_code")).sendKeys("50003");
		WebElement ele = driver.findElement(By.id("address_state"));

		// WebElement ele=driver.findElement(By.xpath("//option[contains(@value,'')]"));
		Select sel = new Select(ele);

		System.out.println(ele.getText());

		sel.selectByVisibleText("Florida");
		/*
		 * driver.findElement(By.id("address_state")).click();; List<WebElement> lang=
		 * driver.findElements(By.xpath("//option[contains(@value,'')]"));
		 * System.out.println(lang.size()); for(int i=0;i<lang.size();i++) {
		 * System.out.println(lang.get(i).getText());
		 * if((lang.get(i).getText()).equals("Florida")) { lang.get(i).click(); break; }
		 */

		/*
		 * List<WebElement>
		 * cb=driver.findElements(By.xpath("//option[contains(@value,'')]")); for(int
		 * i=0;i<cb.size();i++) { WebElement we=cb.get(i); String
		 * value=we.getAttribute("value"); System.out.println("values are :"+value);
		 * if(value.equalsIgnoreCase("FL")) { we.click();
		 * 
		 * }
		 * 
		 * }
		 */

		Thread.sleep(2000);
		
		driver.findElement(By.id("address_birthday")).sendKeys("12/23/1992");

		String colourCode = "#00ff00";
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.getElementById('address_color').value=\'" + colourCode + "\'");
		driver.findElement(By.name("commit")).click();
		String color = driver.findElement(By.cssSelector("span[data-test='color']")).getCssValue("background-color");
		System.out.println("color code is " + color);
		String[] rgbvalue = color.replace("rgba", "").replace("(", "").replace(")", "").split(",");
		int rvalue = Integer.parseInt(rgbvalue[0].trim());
		int gvalue = Integer.parseInt(rgbvalue[1].trim());
		int bvalue = Integer.parseInt(rgbvalue[2].trim());

		String hexacolorcode = String.format("#%02x%02x%02x", rvalue, gvalue, bvalue);

		System.out.println("hexa color code is " + hexacolorcode);
		Assert.assertEquals(colourCode, hexacolorcode);
	}

	@AfterSuite
	public void tearDown() {
		driver.close();
	}
}
