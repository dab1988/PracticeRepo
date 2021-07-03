package TestNG;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import extentUtility.retryFailedTestCases;

public class retryFailedTestCase 
{
	public static WebDriver driver= null;
		
	@BeforeClass
	public void initializeDriver()
	{
		String url="https://rpp.tsl.telus.com/team/my_dashboard.cfm?id=212631";
		driver=WebDriverClass.initializaion();
		//driver.get(url);
	}
	//(retryAnalyzer  = JavaClasses.retryFailedTestCases.class)
	@Test 
	public void failed()
	{
		Reporter.log("Test Case Status", true);		
		
		//int a=Reporter.getCurrentTestResult().getStatus();
		String title= driver.getTitle();
		Assert.assertEquals(title, "GMail");
	}	
	
	@Test
	public void findCount() throws Exception
	{
			
		driver.findElement(By.id("username")).sendKeys("x212631");
		driver.findElement(By.id("password")).sendKeys("Telus@1999");
		driver.findElement(By.xpath("//*[@id=\"login\"]/div/button")).click();
		//Thread.sleep(3000);
		List<WebElement> element= driver.findElements(By.xpath("//*[@id=\"cssmenu\"]/ul[1]/li"));
			
		int i=0;
		
		for(WebElement el : element)
		{
			System.out.println(el.findElement(By.tagName("a")).getAttribute("href"));
			System.out.println(element.get(i).findElement(By.tagName("a")).getAttribute("href") +"  "+ element.get(i).getText());
			i++;
		}
		
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


