package sampleselenium.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class GcreddyProject {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.gcrit.com/build3/create_account.php");
		driver.manage().window().maximize();
		WebElement radio1=driver.findElement(By.xpath(".//*[@id='bodyContent']/form/div/div[2]/table/tbody/tr[1]/td[2]/input[1]"));
	    radio1.click();
	    if(radio1.isSelected()) {
	    	System.out.println("radio1 is Toggled on");
	    }
	    else {
	    	System.out.println("radio1 is Toggled off");
	    }
	    radio1.click();
        if(!radio1.isSelected()) {
        	System.out.println("radio1 is now toggle off");
        	
        }
        Thread.sleep(1000);
        driver.findElement(By.xpath(".//*[@id='bodyContent']/form/div/div[2]/table/tbody/tr[2]/td[2]/input")).sendKeys("Siva");
        driver.findElement(By.xpath(".//*[@id='bodyContent']/form/div/div[2]/table/tbody/tr[3]/td[2]/input")).sendKeys("Kommuri");
        driver.findElement(By.xpath(".//*[@id='dob']")).sendKeys("04/23/1992");
        driver.findElement(By.xpath(".//*[@id='bodyContent']/form/div/div[2]/table/tbody/tr[5]/td[2]/input")).sendKeys("k.s.r.krishna370@gmail.com");
        driver.findElement(By.xpath(".//*[@id='bodyContent']/form/div/div[3]/table/tbody/tr/td[2]/input")).sendKeys("LeadIT");
        driver.findElement(By.xpath(".//*[@id='bodyContent']/form/div/div[4]/table/tbody/tr[1]/td[2]/input")).sendKeys("KKRsquare");
        driver.findElement(By.xpath(".//*[@id='bodyContent']/form/div/div[4]/table/tbody/tr[3]/td[2]/input")).sendKeys("500081");
        driver.findElement(By.xpath(".//*[@id='bodyContent']/form/div/div[4]/table/tbody/tr[4]/td[2]/input")).sendKeys("Hyderabad");
        driver.findElement(By.xpath(".//*[@id='bodyContent']/form/div/div[4]/table/tbody/tr[5]/td[2]/input")).sendKeys("Telengana");
   
        Select country=new Select(driver.findElement(By.xpath(".//*[@id='bodyContent']/form/div/div[4]/table/tbody/tr[6]/td[2]/select")));
        country.selectByVisibleText("India");
        country.selectByIndex(99);
    
        driver.findElement(By.xpath(".//*[@id='bodyContent']/form/div/div[5]/table/tbody/tr[1]/td[2]/input")).sendKeys("9533111370");
    
        driver.findElement(By.xpath(".//*[@id='bodyContent']/form/div/div[5]/table/tbody/tr[3]/td[2]/input")).click();
        driver.findElement(By.xpath(".//*[@id='bodyContent']/form/div/div[6]/table/tbody/tr[1]/td[2]/input")).sendKeys("siva@12345");
        driver.findElement(By.xpath(".//*[@id='bodyContent']/form/div/div[6]/table/tbody/tr[2]/td[2]/input")).sendKeys("siva@12345");
        
        Thread.sleep(100);
        driver.findElement(By.xpath(".//*[@id='tdb4']")).click();
        Thread.sleep(100);
        driver.get("http://www.gcrit.com/build3/login.php");
        driver.findElement(By.xpath(".//*[@id='bodyContent']/div[2]/div/form/table/tbody/tr[1]/td[2]/input")).sendKeys("k.s.r.krishna370@gmail.com");
        driver.findElement(By.xpath(".//*[@id='bodyContent']/div[2]/div/form/table/tbody/tr[2]/td[2]/input")).sendKeys("siva@12345");
        driver.findElement(By.xpath(".//*[@id='tdb5']")).click();
        Thread.sleep(100);
        //driver.get("http://www.gcrit.com/build3/index.php");
        driver.findElement(By.xpath(".//*[@id='bodyContent']/div/div[2]/table/tbody/tr[1]/td[1]/a[1]/img")).click();
        driver.findElement(By.xpath(".//*[@id='tdb5']")).click();
        driver.findElement(By.xpath(".//*[@id='tdb6']/span[2]")).click();
        driver.findElement(By.xpath(".//*[@id='tdb4']/span")).click();
        Thread.sleep(5000);
        driver.close();
        
	}

}
