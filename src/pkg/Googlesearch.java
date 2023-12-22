package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Googlesearch {

	ChromeDriver driver;
	String baseurl="https://www.google.com";
	
	@Before
	public void setUp() {
	driver =new ChromeDriver();
	driver.get(baseurl);
	}
	@Test
	public void stest() {
	 WebElement searchbutton = driver.findElement(By.name("q"));
			 searchbutton.sendKeys("burger");
	         searchbutton.submit();
	         
			 
			 
			 //.sendKeys("pizza",Keys.ENTER);

}
	
}
