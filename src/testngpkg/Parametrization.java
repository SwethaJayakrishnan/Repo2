package testngpkg;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parametrization {
	@Parameters("a")
	@Test
	public void test(String a)
	{
		System.out.println("value = "+a);	}

}
