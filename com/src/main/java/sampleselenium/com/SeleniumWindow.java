package sampleselenium.com;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.By.ByTagName;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumWindow {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
//		driver.get("http://google.com/");
//		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL+"t");
//		driver.get("http://facebook.com");
//		By.cssSelector("body");
//		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL+"w");
//		Thread.sleep(1000);
//        DateFormat df=new SimpleDateFormat("yyyy_MMM_dd hh_mm_ss");
//        Date d=new Date();
//        String time=df.format(d);
//        driver.get("http://google.com/");
//        System.out.println(time);
		
		driver.get("http:gcreddy.com");
		List<WebElement> allelements=driver.findElements(By.tagName("a"));
		for (WebElement webElement : allelements) {
			System.out.println(webElement.getText());
			
		}
		
		
	}

}
