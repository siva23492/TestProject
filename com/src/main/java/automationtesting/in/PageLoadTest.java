package automationtesting.in;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageLoadTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		  driver.manage().deleteAllCookies();
		  driver.manage().window().maximize();
		  driver.get("https://www.gmail.com");
		  driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).clear();
		  driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("k.s.r.krishna370@gmail.com");
		  driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/content/span")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).clear();
		  driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys("sfdfsdf");
		  driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/content/span")).click();
		  
		  JavascriptExecutor js=(JavascriptExecutor)driver;
		  // 1st Method();
		  /*boolean status=js.executeScript("return document.readyState").toString().equals("complete");
		  if(status) {
			  System.out.println("page is loaded successfully");
			  
		  }
		  else
		  {
			  System.out.println("page is not loaded successfully");
		  }*/
		  
		  //2nd Method();
		  
		  for(int i=0;i<30;i++) {
			  try {
				  Thread.sleep(1000);
			  }
			  catch (Exception e) {
				  e.printStackTrace();
			
			}
			  if(js.executeScript("return document.readyState").toString().equals("complete")) {
				  System.out.println("page is loaded successfully");
				  break;
			  }
			  else {
				  System.out.println("waiting for page");
			  }
			  
			  
		  }
	}
	

}
