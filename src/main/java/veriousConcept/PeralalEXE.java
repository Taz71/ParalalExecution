package veriousConcept;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class PeralalEXE {
	WebDriver driver;
	 
	 @Test
	 public void edgeTest() {
	  System.out.println("The thread ID for Edge is " + Thread.currentThread().getId());
	  System.setProperty("webdriver.edge.driver", "drivers\\msedgedriver.exe");
	  driver = new EdgeDriver();
	  driver.get("https://www.yahoo.com/");
	 
	  String title = driver.getTitle();
	  
	 }

	 @Test
	 public void chromeTest() {
	  System.out.println("The thread ID for Chrome is " + Thread.currentThread().getId());
	  System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://www.yahoo.com/");
	  
	  String title = driver.getTitle();
	   
	 }


}
