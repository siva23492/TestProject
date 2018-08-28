package sampleselenium.com;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;


public class SikuliTest {
	WebDriver driver;
	public static void main(String[] args) throws InterruptedException, FindFailed, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com/watch?v=KYzUYHOKeZI");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		Screen s=new Screen();
	    Pattern p=new Pattern("YT_Play.png");
		s.wait(p,2000);
		s.click();
		s.click();
		s.click();
		 Pattern p1=new Pattern("YT_Volume.png");
			s.wait(p1,2000);
			s.click();
			s.click();
			s.click();
			 Pattern p2=new Pattern("YT_Settings.png");
				s.wait(p2,2000);
				s.click();
				s.click();
				s.click();
			
		
	
File src=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(src,new File("D:/SELENIUM/com/yt.png"));
Thread.sleep(1000);
driver.quit();

}
}
