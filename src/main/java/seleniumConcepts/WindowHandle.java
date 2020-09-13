package seleniumConcepts;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {
	
WebDriver driver;
	
	@Test
	public void launchBrowser() {

		// Setting the Property
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		// Creating an object for chrome driver
		driver = new ChromeDriver();
		// Navigating to the website
		driver.get("https://www.yahoo.com/");
			
		// Maximizing the window
		//driver.manage().window().maximize();
		//Use Implicitly wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@id='ybar-sbq']")).sendKeys("xpath");
		driver.findElement(By.xpath("//input[@class='rapid-noclick-resp _yb_1em5b']")).click();
		
		
		driver.findElement(By.linkText("XPath Tutorial - W3Schools")).click();
		
		
		
		for(String i : driver.getWindowHandles()) {
			System.out.println(i);
			driver.switchTo().window(i);
			
		}
		
		driver.findElement(By.linkText("CSS")).click();

	}
	
	
	
	

}
