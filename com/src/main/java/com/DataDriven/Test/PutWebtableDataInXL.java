package com.DataDriven.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.excel.utility.Xls_Reader;

public class PutWebtableDataInXL {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/html_tables.asp");

		String beforexpath_company = " //*[@id='customers']/tbody/tr[";
		String afterxpath_company = "]/td[1]";

		String beforexpath_contact = "//*[@id=\'customers\']/tbody/tr[";
		String afterxpath_contact = "]/td[2]";
		
		String beforexpath_country="//*[@id=\'customers\']/tbody/tr[";
	    String afterxpath_country="]/td[3]";		

		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='customers']//tr"));
		System.out.println("total no of rows are" + (rows.size()-1));
		int rowCount = rows.size();
		Xls_Reader reader=new Xls_Reader("D:\\SELENIUM\\com\\src\\main\\java\\com\\test\\data\\RegistrationformData.xlsx");
		if(!reader.isSheetExist("testdata")) {
			reader.addSheet("testdata");
			reader.addColumn("testdata", "CompanyName");
			reader.addColumn("testdata", "ContactName");
			reader.addColumn("testdata", "CountryName");
		}
		
		for (int i = 2; i <=rowCount; i++) {
			String actualxpath_company = beforexpath_company + i + afterxpath_company;
			String comapanyname = driver.findElement(By.xpath(actualxpath_company)).getText();
			System.out.println(comapanyname);
            reader.setCellData("testdata", "CompanyName", i, comapanyname);
                      
            String actualxpath_contacts = beforexpath_contact + i + afterxpath_contact;
			String contacts = driver.findElement(By.xpath(actualxpath_contacts)).getText();
			System.out.println(contacts);
			reader.setCellData("testdata", "ContactName", i, contacts);
   
			String actualxpath_country=beforexpath_country+i+afterxpath_country;
			String country=driver.findElement(By.xpath(actualxpath_country)).getText();
		    System.out.println(country);
		    reader.setCellData("testdata", "CountryName", i, country);
		}

	}

}
