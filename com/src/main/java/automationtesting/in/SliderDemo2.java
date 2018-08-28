package automationtesting.in;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SliderDemo2 {
    @Test
	public void calculateLoanEMI() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		  driver.manage().deleteAllCookies();
		  driver.manage().window().maximize();
		  driver.get("https://emicalculator.net/");
		  
		  Actions action=new Actions(driver);
		  WebElement loanamountslider=driver.findElement(By.cssSelector("#loanamountslider >span"));
		  WebElement  interestslider=driver.findElement(By.cssSelector("#loaninterestslider >span"));
		  WebElement loantermslider=driver.findElement(By.cssSelector("#loantermslider >span"));
	      
		  action.dragAndDropBy(loanamountslider, 83, 0).build().perform();
		  Thread.sleep(2000);
		  action.dragAndDropBy(interestslider, 88, 0).build().perform();
		  Thread.sleep(2000);
		  action.dragAndDropBy(loantermslider, -111,0).build().perform();
		  Thread.sleep(2000);
		  //#emiamount > p> span
		 WebElement loanemitext= driver.findElement(By.cssSelector("#emiamount > p> span"));
		 String loanemi=loanemitext.getText();
		 Assert.assertEquals("92,439", loanemi);
		 Thread.sleep(3000);
		 driver.close();
		  
		  
	
	}

}
