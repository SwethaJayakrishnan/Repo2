package testngpkg;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Windowhandler {
	ChromeDriver driver;
	@BeforeTest
	public void setUp() {
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/popup.php");
	}
    @Test
    public void test() {
    	driver.findElement(By.xpath("/html/body/p/a")).click();
    	String parentwindow=driver.getWindowHandle();  //current window
    	Set <String> allwindows = driver.getWindowHandles(); //all windows
    	for(String handle : allwindows) {
    		if(!handle.equalsIgnoreCase(parentwindow)) {
           driver.switchTo().window(handle);
           driver.findElement(By.xpath("/html/body/form/table/tbody/tr[5]/td[2]/input")).sendKeys("abc@gmail.com");   
        
           driver.close();
           
           
    		}
    		driver.switchTo().window(parentwindow);
    	}
    }
}
