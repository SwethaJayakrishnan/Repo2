package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebookpgm {
	ChromeDriver driver;
	String baseurl="https://www.facebook.com";
	
	@Before
	public void setUp() {
		driver = new ChromeDriver();
		driver.get(baseurl);
	}
	@Test
	public void fbtest() {
		driver.findElement(By.id("email")).sendKeys("sajuhwg1@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Swetha@123");
		driver.findElement(By.name("login")).click();
	}
	

}
