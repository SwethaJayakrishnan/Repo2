package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fbloginpage {
	WebDriver driver;
	
	//By fbemail=By.name("email");
	//By fbpass=By.name("pass");
	//By fblogin=By.name("login");
	@FindBy(name="email")
	WebElement emailfield;
	
	@FindBy(name="pass")
	WebElement passwordfield;
	
	@FindBy(name="login")
	WebElement loginbutton;
	
	
	public Fbloginpage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public void setvalues(String email,String password){
		//driver.findElement(fbemail).sendKeys(email);
		//driver.findElement(fbpass).sendKeys(password);
		emailfield.sendKeys(email);
		passwordfield.sendKeys(password);
	}
	public void login() {
		//driver.findElement(fblogin).click();
		loginbutton.click();
	}

}
