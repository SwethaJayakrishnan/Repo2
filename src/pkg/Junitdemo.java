package pkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junitdemo {

	ChromeDriver driver;
	String baseurl="https://www.google.com";
	
	@Before
	public void setUp()
	{
		driver = new ChromeDriver();
		driver.get(baseurl);
		
	}
	@Test	
	public void test()
	{
		String exptitle="Google";
		String actualtitle=driver.getTitle();
		if(exptitle.equals(actualtitle)) {
			System.out.println("Pass");
		}else {
			System.out.println("Fail");
		}
	}

	
	@After
	public void tearDown()
	{
		driver.quit();
	}
}
