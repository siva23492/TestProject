package demo.screenshots;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.assertthat.selenium_shutterbug.core.Shutterbug;
import com.assertthat.selenium_shutterbug.utils.web.ScrollStrategy;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FullPageSS {
	
	@Test
	public static void fullpadescreenshot() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://automationtesting.in/");
	    Shutterbug.shootPage(driver, ScrollStrategy.BOTH_DIRECTIONS,500,true).withName("expected").save("C:\\Users\\LILT-71\\git\\TestProject\\com\\test-output\\screen-shots");
		Thread.sleep(3000);
		driver.quit();
	}

}
