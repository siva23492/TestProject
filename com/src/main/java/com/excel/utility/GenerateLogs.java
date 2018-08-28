package com.excel.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GenerateLogs {
public static void main(String a[]) {
WebDriver driver = null;
org.apache.log4j.Logger logger=org.apache.log4j.Logger.getLogger(GenerateLogs.class);

System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
driver = new ChromeDriver();
driver.get("http://freecrm.com");
logger.info("browser launced");
driver.close();
logger.info("browser successfully closed");

	
}
}
