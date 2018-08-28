package com.DataDriven.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.excel.utility.Xls_Reader;

public class DataDrivenTest {

	public static void main(String ar[]) {

		Xls_Reader reader = new Xls_Reader(
				"D:\\SELENIUM\\com\\src\\main\\java\\com\\test\\data\\RegistrationformData.xlsx");
		String firstName = reader.getCellData("regdata", "firstname", 2);
		System.out.println(firstName);

		String lastName = reader.getCellData("regdata", "lastname", 2);
		System.out.println(lastName);

		String address = reader.getCellData("regdata", "address", 2);
		System.out.println(address);

		String email = reader.getCellData("regdata", "email", 2);
		System.out.println(email);

		String phone = reader.getCellData("regdata", "phone", 2);
		System.out.println(phone);

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Register.html#");

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

		// Select select=new Select(driver.findElement(By.xpath("//div[@id='msdd']")));
		//
		// select.selectByVisibleText(languages);
		//
		// Select select1=new
		// Select(driver.findElement(By.xpath("//select[@id='Skills']")));
		//
		// select1.selectByValue(skills);

	}
}
