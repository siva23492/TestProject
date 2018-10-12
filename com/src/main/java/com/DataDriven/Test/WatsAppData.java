package com.DataDriven.Test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WatsAppData {

static WebDriver driver;
@Test
public void watsappAutomate() {//System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
	  WebDriverManager.chromedriver().setup();
	  driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	  
	  driver.manage().deleteAllCookies();
	  driver .manage().window().maximize();
	  
	 driver.get("https://web.whatsapp.com/");
	 driver.findElement(By.xpath("//span[@data-icon='menu']")).click();
	 driver.findElement(By.xpath("//div[contains(text(),'New group')]")).click();
	 driver.findElement(By.xpath("//input[@placeholder='Type contact name']")).sendKeys("bagavan");
	 driver.findElement(By.xpath("//input[@placeholder='Type contact name']")).sendKeys(Keys.ENTER);
	 driver.findElement(By.xpath("//span[@data-icon='forward-light']")).click();
	 driver.findElement(By.xpath("//div[contains(@class,'_2S1VP copyable-text selectable-text')]")).sendKeys("testgroup");
	 driver.findElement(By.xpath("//span[@data-icon='checkmark-light']")).click();
	  
}
}


	

