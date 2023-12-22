package testngpkg;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Groupingpgm {
	@BeforeTest
	public void setUp() {
		System.out.println("Browser opened");
	}
	@BeforeMethod
	public void beforemethod() {
		System.out.println("URL loading");
	
	}
	@Test(groups ="smoke")
	public void test1() {
		System.out.println("test1");
	}
	@Test(groups= {"smoke","sanity"})
	public void test2() {
		System.out.println("test 2");
		
	}
	@Test(groups= {"smoke","regression"})
	public void test3() {
		System.out.println("test 2");
		
	}
	@Test(groups= {"sanity","regression"})
	public void test4() {
		System.out.println("test 2");
		
	}
	@Test(groups="sanity")
	public void test5() {
		System.out.println("test 2");
		
	}
	@Test(groups="regression")
	public void test6() {
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
