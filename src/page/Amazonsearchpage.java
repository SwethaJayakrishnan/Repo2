package page;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Amazonsearchpage {
	WebDriver driver;

	By asearch=By.xpath("//*[@id=\"twotabsearchtextbox\"]");
	By acsearch=By.xpath("//*[@id=\"nav-search-submit-button\"]");
	By phdetails=By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/span/div/div/div/div[2]/div/div/div[1]/h2/a/span");
	By addcart=By.xpath("//*[@id=\"add-to-cart-button\"]");
	By cart=By.xpath("//*[@id=\"attach-sidesheet-view-cart-button\"]/span/input");
	
	public Amazonsearchpage(WebDriver driver) {
		this.driver=driver;
		
	}
	public void asearch() {
		driver.findElement(asearch).click();
	}
	
	public void setvalues(String searchdetails) {
		driver.findElement(asearch).sendKeys(searchdetails);
		
	}
	public void acclick() {
		driver.findElement(acsearch).click();
		
	}
    public void title() {
    String act=	driver.getTitle();
    	String expected="amazon.in:mobile phones" ;
    	if(act.equals(expected)) {
    		System.out.println("Title is same");
    	}else {
    		System.out.println("Title is different");
    	}
    	
    	
    	
    }
    public void acart() {
    	String parenttab=driver.getWindowHandle();
    	driver.findElement(phdetails).click();
    	Set <String> allwindows=driver.getWindowHandles();
    	for(String handle : allwindows) {
    		if(!handle.equalsIgnoreCase(parenttab)) {
    			driver.switchTo().window(handle);
    			driver.manage().window().maximize() ;	
    			driver.findElement(addcart).click();
    	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(cart));
		}
    		}
    }
    public void cart() {
    	driver.findElement(cart).click();
    }
}
