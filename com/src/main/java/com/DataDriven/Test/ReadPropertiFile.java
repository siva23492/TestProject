package com.DataDriven.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class ReadPropertiFile {

	public static void main(String[] args) throws IOException {
		
	WebDriver driver = null;
	Properties prop=new Properties();
	FileInputStream fis=new FileInputStream("D:\\SELENIUM\\com\\src\\main\\java\\com\\test\\data\\config.properties");
	prop.load(fis);
	System.out.println(prop.getProperty("browser"));
	String browserName=prop.getProperty("browser");
	
	if(browserName.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		 driver = new ChromeDriver();
		
	}
	else if(browserName.equals("FF")) {
		driver=new FirefoxDriver();
	}
	else if(browserName.equals("IE")) {
		driver=new InternetExplorerDriver();
		
	}
	else {
		System.out.println("no browser selected");
	}
	
	driver.get(prop.getProperty("url"));
	driver.findElement(By.className(prop.getProperty("freecrm_logoimage_classname"))).isDisplayed();
	
	driver.findElement(By.name(prop.getProperty("username_name"))).sendKeys(prop.getProperty("username"));
	driver.findElement(By.name(prop.getProperty("password_name"))).sendKeys(prop.getProperty("password"));
	driver.findElement(By.xpath(prop.getProperty("loginBtnXpath"))).click();
	}

}
