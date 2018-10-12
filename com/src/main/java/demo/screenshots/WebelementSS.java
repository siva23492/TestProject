package demo.screenshots;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.assertthat.selenium_shutterbug.core.Shutterbug;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebelementSS {
	
@Test	
public static void webelementscreenshot() {
	WebDriverManager.chromedriver().setup();
    WebDriver driver=new ChromeDriver();
    driver.get("http://demo.automationtesting.in/");
    
    Shutterbug.shootElement(driver, driver.findElement(By.id("logo"))).withName("logo").save("C:\\Users\\LILT-71\\git\\TestProject\\com\\test-output\\screen-shots");    
	
}

}
