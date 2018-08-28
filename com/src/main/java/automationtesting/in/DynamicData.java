package automationtesting.in;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DynamicData {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		 
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		  driver.manage().deleteAllCookies();
		  driver.manage().window().maximize();
		  driver.get("http://demo.automationtesting.in/Register.html");
		  WebElement ele=driver.findElement(By.xpath("//a[contains(text(),'More')]"));
		  Actions action=new Actions(driver);
		  action.moveToElement(ele).build().perform();
		  driver.findElement(By.xpath("//a[contains(text(),'Dynamic Data')]")).click();
		  driver.findElement(By.id("save")).click();
		 String s=driver.findElement(By.xpath("//div[@id='loading']")).getTagName();
		 System.out.println(s);
				 
		
		
	}

}
