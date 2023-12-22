package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.Fbloginpage;

public class Fblogintest {
WebDriver driver;
@BeforeTest
public void setUp() {
	driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
}
@Test
public void test() {
	Fbloginpage ob=new Fbloginpage(driver);
	ob.setvalues("abcfjjh12@gmail.com", "agtadft123fg");
	ob.login();
	
}
}
