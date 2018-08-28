package automationtesting.in;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerDemo2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		 
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		  driver.manage().deleteAllCookies();
		  driver.manage().window().maximize();
		  driver.get("http://demo.automationtesting.in/Datepicker.html");
		  driver.findElement(By.xpath("//img[@class='imgdp']")).click();
//		//a[@class='ui-state-default ui-state-active']
//		  driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
//		//a[contains(text(),'16')]
//		  driver.findElement(By.xpath("//a[contains(text(),'16')]")).click();
		  
//		  WebElement date1=driver.findElement(By.xpath("//td[contains(@class,' ui-datepicker-current-day')]"));
//		  String date="03";
//		  String month="05";
//		  String year="2005";
//		  selectDateByJS(date1, driver, date, month, year);
//		  
//		  
//		
//	}
//	public static void selectDateByJS(WebElement element,WebDriver driver,String date,String month,String year) {
//		
//		JavascriptExecutor js=((JavascriptExecutor)driver);
//		js.executeScript("arguments[0].setAttribute('data-event','"+date+"');", element);
//		js.executeScript("arguments[0].setAttribute('data-month','"+month+"');", element);
//		js.executeScript("arguments[0].setAttribute('data-year','"+year+"');", element);
//		
//	
//		  
//		  
//		  }
		  
		  String title=driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
		 List <WebElement> ele=driver.findElements(By.xpath("//div[@class='ui-datepicker-title']"));
		 System.out.println(ele.size());
		  
		  System.out.println(title);
		  for(int i=0;i<ele.size();i++) {
			  System.out.println(ele.get(i));
			  if(title.equals("July 2018")) {
			  if(ele.get(i).getText().equals(2));
			  ele.get(i).click();
			 
				  
				  
				  
			  }
			  
		  }
		  
}
}
		  
	
