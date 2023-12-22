package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazonsearchxpath {
	ChromeDriver driver;
	String baseurl="https://www.amazon.in";
	
	@Before
	public void setUp() throws InterruptedException {
		driver= new ChromeDriver();
		driver.get(baseurl);
		driver.manage().window().maximize();
		Thread.sleep(10000);
	}
	@Test
	public void atest() {
		driver.findElement(By.xpath("//*[@id='nav-search-bar-form']/div[2]/div[1]/input")).sendKeys("phones");
		driver.findElement(By.xpath("//*[@id='nav-search-bar-form']/div[3]/div[1]/span/input")).click();
		driver.findElement(By.xpath("//*[@id='nav-xshop']/a[5]")).click();
		driver.findElement(By.xpath("//*[@id='nav-tools']/a[4]/div[1]/span[1]")).click();
		driver.navigate().back();
		driver.navigate().refresh();
		driver.findElement(By.xpath("//*[@id='nav-main']/div[1]/a/i")).click();
	}
}
