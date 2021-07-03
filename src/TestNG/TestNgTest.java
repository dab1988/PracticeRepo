package TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestNgTest
{

	
	@BeforeMethod
	public void BeforeTest()
	{
		System.out.println("Before Test");
	}
	
	
	@AfterMethod
	public void AfterTest()
	{
		System.out.println("After Test");
	}
	
}
