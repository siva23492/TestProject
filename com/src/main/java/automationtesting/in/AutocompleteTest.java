package automationtesting.in;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.codec.language.bm.Lang;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutocompleteTest {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		  driver.manage().deleteAllCookies();
		  driver.manage().window().maximize();
		  driver.get("http://demo.automationtesting.in/AutoComplete.html");
		
		
//	    driver.findElement(By.xpath("//div[@id='msdd']")).click();
//	    List<WebElement> lang= driver.findElements(By.xpath("//div//ul//li//a[@class='ui-corner-all']"));
//	    System.out.println(lang.size());
//	    for(int i=0;i<lang.size();i++) {
//	 	   System.out.println(lang.get(i).getText());
//	 	  if(lang.get(i).getText().equals("German")) {
//	 		  lang.get(i).click();
//	 		 break;
//	 	  }
//	 	
//	        lang.get(i).click();
		  
		
		  driver.findElement(By.xpath("//div[starts-with(@class,'ui-')]")).click();
		  driver.findElement(By.xpath("//input[@id='searchbox']")).sendKeys("au");
		List<WebElement> element=driver.findElements(By.xpath("//li//a[contains(@tabindex,-1)]"));
		  System.out.println(element.size());
		  for(int i=0;i<element.size();i++) {
			  System.out.println(element.get(i).getText());
			  if(element.get(i).getText().equals("au")) {
				
				  element.get(i).click();
				  break;
								
			  }
			  element.get(i).click();  
			  
		  }
		  Thread.sleep(2000);
	 	    
	 	   
	    }
		
	}


