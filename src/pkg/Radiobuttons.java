package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobuttons {
	ChromeDriver driver;
	
	@Before
	public void setUp() {
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
	@Test
	public void test() {
		boolean radio=driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[24]/td[3]/input[1]")).isSelected();
		if(radio) {
			System.out.println("Selected");
		}else {
			System.out.println("Not Selected");
		}
	}

}
