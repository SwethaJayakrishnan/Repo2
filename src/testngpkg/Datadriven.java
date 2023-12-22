package testngpkg;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Datadriven {
  WebDriver driver;
  
  @BeforeTest
  public void setUp() {
	  driver= new ChromeDriver();
	  driver.get("https://www.facebook.com");
	 
  }
  @Test
  public void test() throws Exception {
	  FileInputStream f=new FileInputStream("C:\\Users\\sweth\\OneDrive\\Documents\\Custom Office Templates\\OneDrive\\Datadriven.xlsx");
	  XSSFWorkbook wb=new XSSFWorkbook(f);
	  XSSFSheet sh=wb.getSheet("Sheet1");
	  int count=sh.getLastRowNum();
	  for(int i=1;i<=count;i++) {
		  String un=sh.getRow(i).getCell(0).getStringCellValue();
		  String pswd=sh.getRow(i).getCell(1).getStringCellValue();
		  System.out.println("username="+un+"\n"+"password="+pswd);
		  driver.findElement(By.name("email")).sendKeys(un);
		  driver.findElement(By.name("pass")).sendKeys(pswd);
		  driver.findElement(By.name("login")).click();
		  
		  
		  
	  }
  }
}
