package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.Amazonsearchpage;

public class Amazoncart {
	WebDriver driver;
	
	@BeforeTest
	public void setUp() {
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
	}
	@Test
	public void test() {
		Amazonsearchpage ob=new Amazonsearchpage(driver);
		ob.asearch();
		ob.setvalues("mobile phones");
		ob.acclick();
		ob.title();
		ob.acart();
		ob.cart();
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
