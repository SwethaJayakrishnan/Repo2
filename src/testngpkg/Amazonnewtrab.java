package testngpkg;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Amazonnewtrab {
 ChromeDriver driver;
 @BeforeTest
 public void setUp() {
	 driver=new ChromeDriver();
	 driver.get("https://www.amazon.in/");
 }
 @Test
 public void test() {
	 driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("moblie phones");
	 driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
	String titleph= driver.getTitle();
	if(titleph.equals("Amazon.in : mobile phones")) {
		System.out.println("Title is same");
	}else {
		System.out.println("Title is different");
	}
	String parenttab=driver.getWindowHandle();
	driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[4]/div/div/div/div/span/div/div/div/div[2]/div/div/div[1]/h2/a/span")).click();
	Set <String> allwindows=driver.getWindowHandles();
	for(String handle : allwindows) {
		if(!handle.equalsIgnoreCase(parenttab)) {
			driver.switchTo().window(handle);
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
			WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"attach-sidesheet-view-cart-button\"]/span/input")));
			
			driver.findElement(By.xpath("//*[@id=\"attach-sidesheet-view-cart-button\"]/span/input")).click();
			
		}
	}
 }
}
