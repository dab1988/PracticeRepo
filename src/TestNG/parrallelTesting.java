package TestNG;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners (TestNGListener.class)
public class parrallelTesting 
{
	static WebDriver driver=null;
	String url="https://www.google.com/";
	@BeforeClass()
	public void initialize()
	{
		Reporter.log("Chrome Driver Initialized", true);
		 driver= WebDriverClass.initializaion();
	}
	

	@Test (priority=0)
	void display()
	{
		String text="Gmail";
		System.out.println(Thread.currentThread().getId());
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dabeer.haider\\eclipse-workspace\\Java_Programming\\chromedriver.exe");
		driver.get(url);
		boolean display= driver.findElement(By.linkText("Gmail")).isEnabled();
		
		Assert.assertTrue(display);
		Assert.assertEquals(driver.findElement(By.linkText("Gmail")).getText(), "Gmail1");
		
	   //	ITestResult result=Reporter.getCurrentTestResult();
		//Reporter.
		//System.out.println("Current Test Case Status-->"+result.getTestName());
		
	}
	
	@Test (priority=1, dependsOnMethods="display")
	void show()
	{
		System.out.println(Thread.currentThread().getId());
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\dabeer.haider\\eclipse-workspace\\Java_Programming\\chromedriver.exe");
		// driver= new ChromeDriver();
		driver.get("https://www.amazon.com/");
		Assert.assertEquals(driver.getTitle(), "Amazn");
		
	}
	
	
	@Test (priority=2)
	void show1()
	{
		System.out.println(Thread.currentThread().getId());
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\dabeer.haider\\eclipse-workspace\\Java_Programming\\chromedriver.exe");
		// driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/");
	}
	
	
	@AfterClass
	void kill()
	{
		driver.close();
		//Reporter.log("Chrome Driver Closed", true);
	}
	@AfterMethod
	public void getStatus(ITestResult tr)
	{
		if(tr.getStatus()==ITestResult.FAILURE)
		{
			screenShotLibrary.captureScreenShot(driver, tr);
		}
	
	}
}
