package JavaClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import TestNG.WebDriverClass;
import TestNG.screenShotLibrary;

public class Telus_Outllok  extends WebDriverClass
{

	
	String url="https://mail.telus.com/owa/#path=/mail";
//	static WebDriver driver1;
	@BeforeTest
	public void setUpTest()
	{
		WebDriverClass.initializaion1(url);
	}
	
	
	@Test
	public void login()
	{
		//WebDriverClass.initializaion().get(url);
		driver.findElement(By.id("username")).sendKeys("x212631");
		driver.findElement(By.id("password")).sendKeys("Telus@2000");
		driver.findElement(By.className("signinTxt")).click();
	}
	
	@AfterMethod
	public void getFailedTestCase(ITestResult result)
	{
		
		if(result.getStatus()==ITestResult.FAILURE)
		{
			screenShotLibrary.captureScreenShot(driver, result);
		}
		
		
	}
}
