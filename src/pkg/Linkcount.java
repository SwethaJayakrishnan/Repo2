package pkg;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linkcount {
	
	ChromeDriver driver;
	String baseurl="https://www.facebook.com";
	
	@Before
	public void setUp() {
		
	driver= new ChromeDriver();
	driver.get(baseurl);
	
	}
	@Test
	public void ltest() {
		List<WebElement> linkdetails=driver.findElements(By.tagName("a"));
		System.out.println("Total number of links="+linkdetails.size());
		for(WebElement element:linkdetails) {
			String link=element.getAttribute("href");
			String linktext=element.getText();
			System.out.println(link+"------"+linktext);
		}
		
	}

}
