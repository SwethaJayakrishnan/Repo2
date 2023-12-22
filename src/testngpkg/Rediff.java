package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Rediff {
ChromeDriver driver;

@BeforeTest
public void setUp() {
	driver=new ChromeDriver();
	driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
}
@Test
public void test() {
	boolean image=driver.findElement(By.xpath("//*[@id='wrapper']/table[1]/tbody/tr[1]/td[1]/img")).isDisplayed();
	if(image) {
		System.out.println("Displayed");
	}
	else {
		System.out.println("Not displayed");
	}
	
}
}
