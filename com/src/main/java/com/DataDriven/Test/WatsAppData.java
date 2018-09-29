package com.DataDriven.Test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
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
	  
	  driver.get("http://demo.automationtesting.in/DynamicData.html");
      driver.findElement(By.id("save")).click();
      WebElement e=driver.findElement(By.xpath("//div[@id='loading']//img[contains(@src,'https://randomuser')]"));
      String ee=e.getText();
      System.out.println(ee);
	  
}
}


	

