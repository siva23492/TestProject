package automationtesting.in;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		//*[@id='angular'].//*[@id='droparea']
		WebDriver driver=new FirefoxDriver();
//		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
//		 WebDriver driver=new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		  driver.manage().deleteAllCookies();
		  driver.manage().window().maximize();
		  driver.get("http://demo.automationtesting.in/Register.html");
		 
		  WebElement ele=driver.findElement(By.xpath(" //*[@id='header']/nav/div/div[2]/ul/li[6]/a"));
		  
		  Actions action=new Actions(driver);
		  action.moveToElement(ele).build().perform();
		  WebElement ele1=driver.findElement(By.xpath("//*[@id='header']/nav/div/div[2]/ul/li[6]/ul/li[1]/a"));
		  action.moveToElement(ele1).build().perform();	
		  driver.findElement(By.xpath("//*[@id='header']/nav/div/div[2]/ul/li[6]/ul/li[1]/ul/li[1]/a")).click();
		  WebElement dragarea=driver.findElement(By.xpath("//*[@id='angular']"));
		//  WebElement dragarea1=driver.findElement(By.xpath(".//*[@id='mongo']"));
		  
		  WebElement droparea=driver.findElement(By.xpath("//*[@id='droparea']"));
		  action.dragAndDrop(dragarea, droparea).perform();
		  
//		  Thread.sleep(2000);
//		  driver.get(".//*[@id='header']/nav/div/div[2]/ul/li[6]/ul/li[1]/ul/li[2]/a");
//		  action.dragAndDrop(dragarea1, droparea).perform();

				
			
		

	}

}
