package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Guru99uploadusingsendkeys {
ChromeDriver driver;
@BeforeTest
public void setUp() {
	driver=new ChromeDriver();
	driver.get("https://demo.guru99.com/test/upload/");
}
@Test
public void test() {
	driver.findElement(By.xpath("//*[@id=\"uploadfile_0\"]")).sendKeys("C:\\Users\\sweth\\OneDrive\\Documents\\Calculator TS.docx");
	driver.findElement(By.xpath("//*[@id=\"terms\"]")).click();
	driver.findElement(By.xpath("//*[@id=\"submitbutton\"]")).click();
}
}
