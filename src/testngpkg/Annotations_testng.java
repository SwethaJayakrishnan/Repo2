package testngpkg;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations_testng {
	
	@BeforeTest
	public void setUp() {
		System.out.println("Browser opened");
	}
	@BeforeMethod
	public void beforemethod() {
		System.out.println("URL loading");
	
	}
	@Test(priority=1,invocationCount=3)//enabled=false
	public void test1() {
		System.out.println("test1");
	}
	@Test(priority=0)
	public void test2() {
		System.out.println("test 2");
		
	}
	@AfterMethod
	public void aftermethod() {
		System.out.println("After method");
	}
	@AfterTest
	public void aftertest() {
		System.out.println("Browser closed");
	}
    
}
