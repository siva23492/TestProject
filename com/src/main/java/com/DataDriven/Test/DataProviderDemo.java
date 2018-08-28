package com.DataDriven.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.test.utility.TestUtil;

public class DataProviderDemo {
	WebDriver driver;
	
	@BeforeMethod
	public void setUP() {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Register.html#");

		
	}
	@DataProvider
	public Iterator<Object> getTestData() {
		ArrayList<Object>testData=TestUtil.getExcelData();
		return testData.iterator();
		
	}
	
	@Test(dataProvider="getTestData")
	public void readDataFoRegistration(String firstName,String lastName,String address,String email,String phone) {
		driver.findElement(By.xpath("//input[@type='text' and @placeholder='First Name']")).clear();
		driver.findElement(By.xpath("//input[@type='text' and @placeholder='First Name']")).sendKeys(firstName);
		

		driver.findElement(By.xpath("//input[@type='text' and @placeholder='Last Name']")).clear();
		
		driver.findElement(By.xpath("//input[@type='text' and @placeholder='Last Name']")).sendKeys(lastName);
		
		driver.findElement(By.xpath("//textarea[contains(@ng-model,'Adress')]")).clear();
		driver.findElement(By.xpath("//textarea[contains(@ng-model,'Adress')]")).sendKeys(address);
		

		driver.findElement(By.xpath("//input[contains(@type,'email')]")).clear();
		driver.findElement(By.xpath("//input[contains(@type,'email')]")).sendKeys(email);
		

		driver.findElement(By.xpath("//input[contains(@type,'tel')]")).clear();
		driver.findElement(By.xpath("//input[contains(@type,'tel')]")).sendKeys(phone);

		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.close();	
	}

}
