package pkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class Firstscript {

	public static void main(String[] args) {

		ChromeDriver driver=new ChromeDriver();//to launch browser
		driver.get("https://www.google.com");//to open a site
		String expectedtitle="Google";
		String actualtitle=driver.getTitle();
		System.out.println("Title is"+actualtitle);
		if(expectedtitle.equals(actualtitle)) {
			System.out.println("Pass");
		}else {
			System.out.println("Fail");
		}
		driver.quit();
	}

}
