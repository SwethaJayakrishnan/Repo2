package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Drag_drop {
ChromeDriver driver;
@BeforeTest
public void setUp() {
	driver=new ChromeDriver();
	driver.get("https://demo.guru99.com/test/drag_drop.html");
}
@Test
public void test() {
	WebElement amt=driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
	WebElement dest=driver.findElement(By.xpath("//*[@id=\"amt7\"]/li"));
	WebElement bank=driver.findElement(By.xpath("//*[@id=\"credit2\"]/a"));
	WebElement acc=driver.findElement(By.xpath("//*[@id=\"bank\"]/li"));
	WebElement sal=driver.findElement(By.xpath("//*[@id=\"credit1\"]/a"));
	WebElement  actt =driver.findElement(By.xpath("//*[@id=\"loan\"]/li"));
	WebElement owe=driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
	WebElement ammt=driver.findElement(By.xpath("//*[@id=\"amt8\"]/li"));
	Actions act=new Actions(driver);
	act.dragAndDrop(bank, acc).perform();
	act.dragAndDrop(amt, dest).perform();
	act.dragAndDrop(sal, actt).perform();
	act.dragAndDrop(owe, ammt).perform();
	String perf=driver.findElement(By.xpath("//*[@id=\"equal\"]/a")).getText();
	if(perf.equals("Perfect")) {
		System.out.println("Text is same");
	}else {
		System.out.println("Text is different");
	}
	
	
}
}
