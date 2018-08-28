package automationtesting.in;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Alert {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
	     driver.get("http://demo.automationtesting.in");
	     driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		 driver.manage().deleteAllCookies();
		 driver.manage().window().maximize();
		 driver.findElement(By.xpath("//button[@id='btn2']")).click();
		 Actions action=new Actions(driver) ;
		 action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'SwitchTo')]"))).build().perform();
		 driver.findElement(By.xpath("//a[contains(text(),'Alerts')]")).click();
		 driver.findElement(By.xpath("//button[contains(@class,'btn btn-danger')]")).click();
		 driver.switchTo().alert().accept();
		  
			
			
		
		  
		  
	    

	}

}
