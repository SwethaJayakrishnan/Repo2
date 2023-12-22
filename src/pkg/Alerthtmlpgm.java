package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerthtmlpgm {

	ChromeDriver driver;
	String baseurl="file:///C:/Users/sweth/OneDrive/Documents/Custom%20Office%20Templates/OneDrive/Desktop/JAVA/alert_example.html";
	
	@Before
	public void setUp() {
		driver=new ChromeDriver();
		driver.get(baseurl);
		
	}
	@Test
	public void test() {
		driver.findElement(By.xpath("//html/body/input[2]")).sendKeys("Swetha");
		driver.findElement(By.xpath("//html/body/input[3]")).sendKeys("Jk");
		driver.findElement(By.xpath("//html/body/input[1]")).click();
		Alert a = driver.switchTo().alert();
		String alerttext= a.getText();
		System.out.println(alerttext);
		if(alerttext.equals("Hello Iam an alert box")) {
			System.out.println("Pass");
		}else {
			System.out.println("Fail");
		}
		a.accept();
		//a.dismiss() for cancelling the alert
		driver.findElement(By.xpath("//html/body/input[4]")).click();
	}
	
}
