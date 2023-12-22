package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Fbcreatepage {
	WebDriver driver;
	By fbcreate=By.xpath("//*[@id=\"reg_pages_msg\"]/a");
	By fbstart=By.xpath("//*[@id=\"content\"]/div/div[2]/div/div[2]/table/tbody/tr/td[1]/div/div[1]/div[2]/button/div/div");
	
	
	public Fbcreatepage(WebDriver driver) {
		this.driver=driver;
	}
	public void click() {
		driver.findElement(fbcreate).click();
		driver.findElement(fbstart).click();
	}

}
