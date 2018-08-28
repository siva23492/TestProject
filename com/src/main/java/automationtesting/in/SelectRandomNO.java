package automationtesting.in;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectRandomNO {
	

		private static WebDriver driver;
		public static void main(String[] args) throws InterruptedException {
			
			driver = new FirefoxDriver();
			
			driver.manage().window().maximize();
			driver.get("http://testingpool.com/wp-content/uploads/2015/08/DemoApplication.html");
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			Random random = new Random();
			int index = random.nextInt(5);  // It will give a range between 0 to 4
			System.out.println("Index is "+index);
			WebElement listBox = driver.findElement(By.xpath("//select[@name='number']")); //Weblist for number
			Select list = new Select(listBox);
			list.selectByIndex(index);
		}
	}


