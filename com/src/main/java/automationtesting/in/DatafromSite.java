package automationtesting.in;

import java.io.FileNotFoundException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.excel.utility.Xls_Reader;

public class DatafromSite {
	static WebDriver driver;

	public static void main(String[] args) throws FileNotFoundException {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get("https://javaconceptoftheday.com/collection-framework-collection-interface/");
		
		List<WebElement> list=driver.findElements(By.tagName("p"));
		
		System.out.println(list.size());
		Iterator<WebElement> i=list.iterator();
		String filename="out.txt";
		PrintWriter output=new PrintWriter(filename);
		while(i.hasNext()) {
		String value =i.next().getText();
		output.println("\n"+value);
		
		System.out.println("\n"+value);
	
		}
		output.close();
		}
					

}
