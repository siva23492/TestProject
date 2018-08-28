package sampleselenium.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.get("http://amazon.in");
		driver.findElement(By.xpath(".//*[@id='twotabsearchtextbox']")).sendKeys("redmi note5");
	    driver.findElement(By.xpath(".//*[@id='nav-search']/form/div[2]/div/input")).click();
	    driver.findElement(By.xpath(".//*[@id='result_0']/div/div[2]/div/div[2]/div[1]/div[1]/a/h2")).click();
	    driver.findElement(By.id("buy-now-button")).click();
	    Thread.sleep(1000);
	}
	

}
