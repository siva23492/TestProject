package automationtesting.in;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Windows {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
	     WebDriver driver;
	     driver=new ChromeDriver();
	     driver.get("http://demo.automationtesting.in");
	     driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		 driver.manage().deleteAllCookies();
		 driver.manage().window().maximize();
		 driver.findElement(By.xpath("//button[@id='btn2']")).click();
		 Actions action=new Actions(driver) ;
		 action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'SwitchTo')]"))).build().perform();
	     driver.findElement(By.xpath("//a[contains(@href,'Windows.html')]")).click();
	     driver.findElement(By.xpath("//a//button[contains(text(),'click') ]")).click();
	    
	  
	    System.out.println("Parent window title is"+driver.getTitle());
	     
	     
	   
	     Set<String> windowID=driver.getWindowHandles();
	     Iterator<String> i=windowID.iterator();
	     String mainwindow=i.next();
	     String childwindow=i.next();
	     driver.switchTo().window(childwindow);

	     System.out.println("child window title is"+driver.getTitle());
	     
	 
	     driver.switchTo().window(mainwindow);
	     System.out.println("the parent window title is "+driver.getTitle());
	     
	     driver.switchTo().window(childwindow);
	     System.out.println("thechild window title is "+driver.getTitle());
	   
	     String data=driver.findElement(By.xpath("//p[@class='text-justify']")).getText();
	     System.out.println(data); 

	}
	
	    /*  public static void switchwindows(int index) {
	    	  WebDriver driver=null;
	    	 String windowid=null;
	    	 Set<String> windowids=driver.getWindowHandles();
	    	 Iterator<String> iter=windowids.iterator();
	    	 for(int i=0;i<index;i++) {
	    		 windowid=iter.next();
	    		 
	    	 }
	    	 driver.switchTo().window(windowid);
	    	 
	    	 
	     }*/
	
	     
	     
	     
	 	
	
}


