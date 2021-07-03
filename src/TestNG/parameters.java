package TestNG;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.*;

public class parameters 
{
	
	@Test
	@Parameters({"browser","browser1"})
	public void add(String browser, String browser1)
	{
		System.out.println(browser+"  "+ browser1);
	}
	
	
	@Test (dataProvider="data")
	void readDataProvider(String uname, String pass)
	{
		System.out.println(uname +"   "+ pass);
	}
	
	
	@DataProvider (name="data")
	Object[][] getData()
	{
		Object [] [] obj= new Object[2][2];
		
		obj[0][0]="dabeer";
		obj[0][1]="pass";
		obj[1][0]="haider";
		obj[1][1]="Password";
		return obj;		
	}
	
	
	@Test (groups="dontuse")
	void dependsGroup0()
	{
	System.out.println("Group Case 0");	
	}
	
	@Test (dependsOnMethods="dependsGroup2")
	void dependsGroup1()
	{
		Reporter.log("dependsGroup1  Test Case Executed");
		System.out.println("Group Case 1");		
	}
	
	
	@Test 
	void dependsGroup2()
	{
		System.out.println("Group Case 2");	
		//Assert.assertTrue(false);
	}
	
		
}
