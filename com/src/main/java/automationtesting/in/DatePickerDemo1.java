package automationtesting.in;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerDemo1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		  driver.manage().deleteAllCookies();
		  driver.manage().window().maximize();
		  driver.get("http://demo.automationtesting.in/Datepicker.html");
		  driver.findElement(By.id("datepicker2")).sendKeys("02/02/1992");
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//a[contains(@title,'Close the datepicker')]")).click();
	}

}
