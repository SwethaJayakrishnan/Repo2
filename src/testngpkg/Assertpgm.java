package testngpkg;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Assertpgm {
 ChromeDriver driver;
 @BeforeTest
 public void setUp() {
	 driver =new ChromeDriver();
	 driver.get("https://www.google.com");
 }
 @Test
 public void test() {
	 String actualtitle=driver.getTitle();
	 System.out.println(actualtitle);
	 String exptitle="google";
	 if(exptitle.equals(actualtitle)) {
		 System.out.println("Title is same");
	 }else {
		 System.out.println("Title is different");
	 }
	
	 System.out.println("Text verified");
	 Assert.assertEquals(exptitle,actualtitle);
	 System.out.println("Title verified");
 }
}
