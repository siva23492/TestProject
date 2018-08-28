package com.test.parameter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest {
	WebDriver driver;

	@Test
	@Parameters({"browser","URL","emailId","password" })
	public void yahooLoginTest(String browser,String URL, String emailId, String password) throws InterruptedException {
		if(browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
			driver = new ChromeDriver();	
		}
		else if(browser.equals("FF")){
			System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckoriver.exe");
			driver = new FirefoxDriver();
		}
		else {
			System.out.println("Browser is not selected please select your browser!!!");
		}
						
	

		driver.get(URL);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"login-username\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"login-username\"]")).sendKeys(emailId);

		driver.findElement(By.xpath("//*[@id=\"login-signin\"]")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id=\"login-passwd\"]")).sendKeys(password);

		driver.findElement(By.xpath("//*[@id=\"login-signin\"]")).click();
		Thread.sleep(3000);
		driver.close();

	}
}
