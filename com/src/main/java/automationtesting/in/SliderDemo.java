package automationtesting.in;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		//WebDriver driver=new FirefoxDriver();
		 
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		  driver.manage().deleteAllCookies();
		  driver.manage().window().maximize();
		  driver.get("http://demo.automationtesting.in/Slider.html");
		  WebElement ele=driver.findElement(By.xpath("//a[@class='ui-slider-handle ui-state-default ui-corner-all']"));
		  Actions action=new Actions(driver);
//		  action.clickAndHold((WebElement) By.xpath("//*[@id='slider']/a")).build().perform();
//		  action.release((WebElement) By.xpath("//a[@class='ui-slider-handle ui-state-default ui-corner-all' and @style='left: 46%;']")).build().perform();;
		  //method-1
		//  action.moveToElement(ele).dragAndDropBy(ele, 100,0).build().perform();
		  //method-2
		  action.clickAndHold(ele).moveByOffset(534, 301).release().perform();
		  
	}

}
