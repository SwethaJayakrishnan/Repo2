package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Datepicker {
  ChromeDriver driver;
  @BeforeTest
  public void setUp() {
	  driver=new ChromeDriver();
	  driver.get("https://www.trivago.com/");
  }
  @Test
  public void test() {
	  driver.findElement(By.xpath(""))
  }
}
