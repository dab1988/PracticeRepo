package TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNgTest
{

	
	@BeforeMethod
	public void BeforeTest()
	{
		System.out.println("Before Test");
	}
	
	
	@Test
	public void add()
	{
		
	}
	
	@AfterMethod
	public void AfterTest()
	{
		System.out.println("After Test");
	}
	
}
