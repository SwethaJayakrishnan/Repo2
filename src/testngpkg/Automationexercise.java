package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Automationexercise {

	ChromeDriver driver;
	@BeforeTest
	public void setUp() {
		driver=new ChromeDriver();
		driver.get("https://automationexercise.com/login");
	}
	@Test
	public void test() {
	
		driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[2]")).sendKeys("Satha");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[3]")).sendKeys("sathamklm@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/button")).click();
		WebElement radio1=driver.findElement(By.xpath("//*[@id=\"id_gender2\"]"));
		radio1.click();
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Satha@123");
		WebElement dayelement=driver.findElement(By.xpath("//*[@id=\"days\"]"));
		Select day=new Select(dayelement);
		day.selectByValue("2");
		WebElement monthelement=driver.findElement(By.xpath("//*[@id=\"months\"]"));
		Select month=new Select(monthelement);
		month.selectByValue("1");
		WebElement yearelement=driver.findElement(By.xpath("//*[@id=\"years\"]"));
		Select year=new Select(yearelement);
		year.selectByValue("2004");
		driver.findElement(By.xpath("//*[@id=\"first_name\"]")).sendKeys("Satha");
		driver.findElement(By.xpath("//*[@id=\"last_name\"]")).sendKeys("M");
		driver.findElement(By.xpath("//*[@id=\"company\"]")).sendKeys("ABC");
		driver.findElement(By.xpath("//*[@id=\"address1\"]")).sendKeys("SRS");
		driver.findElement(By.xpath("//*[@id=\"address2\"]")).sendKeys("AKH");
		WebElement country=driver.findElement(By.xpath("//*[@id=\"country\"]"));
		driver.findElement(By.xpath("//*[@id=\"country\"]/option[1]")).isSelected();
		driver.findElement(By.xpath("//*[@id=\"state\"]")).sendKeys("TamilNadu");
		driver.findElement(By.xpath("//*[@id=\"city\"]")).sendKeys("Chennai");
		driver.findElement(By.xpath("//*[@id=\"zipcode\"]")).sendKeys("680001");
		driver.findElement(By.xpath("//*[@id=\"mobile_number\"]")).sendKeys("9876543210");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/div[1]/form/button")).click();
		driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/div/a")).click();
		driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a")).click();
		driver.get("https://automationexercise.com/login");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/input[2]")).sendKeys("sathamklm@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/input[3]")).sendKeys("Satha@123");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/button")).click();
		String curl=driver.getCurrentUrl();
		String url="https://automationexercise.com/";
		if(url.equals(curl)) {
			System.out.println("Login valid");
		}else {
			System.out.println("Login failed");
		}
		
	}
}
