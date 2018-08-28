package automationtesting.in;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DownloadFile {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		  driver.manage().deleteAllCookies();
		  driver.manage().window().maximize();
		  driver.get("http://demo.automationtesting.in/FileDownload.html");
		  driver.findElement(By.xpath("//textarea[@id='textbox']")).sendKeys("hi this siva rama krishna");
          driver.findElement(By.xpath("//button[@id='createTxt']")).click();
          driver.findElement(By.xpath("//a[@id='link-to-download']")).click();
        //textarea[@id='pdfbox'] //button[@id='createPdf'] //a[@id='pdf-link-to-download']
          Thread.sleep(2000);
          driver.findElement(By.xpath("//textarea[@id='pdfbox']")).sendKeys("hi this siva rama krishna");
          driver.findElement(By.xpath("//button[@id='createPdf']")).click();
          driver.findElement(By.xpath("//a[@id='pdf-link-to-download']")).click();
          
          
	}

}
