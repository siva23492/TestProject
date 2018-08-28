package automationtesting.in;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AccordationDemo {

	public static void main(String[] args) {
		//div[@id='collapse1']//div[@class='panel-body']
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		  driver.manage().deleteAllCookies();
		  driver.manage().window().maximize();
		  driver.navigate().to("http://demo.automationtesting.in/Accordion.html");
	      String ele=driver.findElement(By.xpath("//div[@id='collapse1']//div[@class='panel-body']")).getText();
		  System.out.println("\n"+ele);
		  
		//a//b[contains(text(),'Collapsible Group 1 - Readability')]
		  
		  driver.findElement(By.xpath("//a//b[contains(text(),'Collapsible Group 1 - Readability')]")).click();
		  driver.findElement(By.xpath("//a//b[contains(text(),'Collapsible Group 2 - Single Line Coding')]")).click();
		  String ele2=driver.findElement(By.xpath("//div[@id='collapse2']//div[@class='panel-body']")).getText();
	      System.out.println("\n"+ele2);
		  
	}

}
