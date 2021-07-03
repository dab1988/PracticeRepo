package JavaClasses;
import java.io.FileInputStream;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import TestNG.screenShotLibrary;
import extentUtility.webDriverEventListner;

public class XAP_Gmail 
{	
	String url="https://mail.google.com/mail/u/0/#inbox";
	String getPlaceholder="//*[@id=\"view_container\"]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[1]/div/div[1]/div/div[1]/div";
	String uname="//*[@id=\"identifierId\"]";
	String nextButton="//*[@id=\"identifierNext\"]/div/button/span";
	String TIuname="//*[@id=\"username\"]";
	String continueButton="//*[@id=\"root\"]/div/div[2]/div[1]/div[3]/form/div/div[3]/div/button";
	String TIpassword="//*[@id=\"password\"]";
	String ContinnueButton="//*[@id=\"root\"]/div/div[2]/div[1]/div[3]/form/div/div[3]/div/button";
	String TooltipPath="//a[@id='lZwQje']//parent::div[contains(@class,'zo')]";
	public static WebDriver driver=null;
	SoftAssert soft= new SoftAssert();
	public static List<WebElement> list=null;
	public static WebDriverWait wait=null;
	public WebElement web=null;
	FileInputStream fis=null;
	Properties pro=null;
	public static EventFiringWebDriver eventDriver=null;
	
	@BeforeTest
	public void setUp() throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dabeer.haider\\eclipse-workspace\\Java_Programming\\chromedriver.exe");
		fis= new FileInputStream("C:\\Users\\dabeer.haider\\eclipse-workspace\\Java_Programming\\config.properties");
		pro= new Properties();
		pro.load(fis);
		
		 driver= new ChromeDriver();
		 eventDriver = new EventFiringWebDriver(driver);
		
		webDriverEventListner listner= new webDriverEventListner();
		eventDriver.register(listner);
		eventDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		eventDriver.manage().window().maximize();
		eventDriver.get(pro.getProperty("url"));
		eventDriver.findElement(By.xpath(uname)).sendKeys("dabeer.haider@telusinternational.com");
		eventDriver.findElement(By.xpath(nextButton)).click();
		Thread.sleep(1000);
		eventDriver.findElement(By.xpath(TIuname)).sendKeys(pro.getProperty("uname"));
		eventDriver.findElement(By.xpath(continueButton)).click();
		Thread.sleep(1000);
		eventDriver.findElement(By.xpath(TIpassword)).sendKeys(pro.getProperty("password"));
		eventDriver.findElement(By.xpath(ContinnueButton)).click();
		Thread.sleep(1000);
		eventDriver.findElement(By.xpath("//*[@id=\"view_container\"]/div/div/div[2]/div/div[2]/div/div[1]/div/div/button/span")).click();
	}
	
	@Test  (enabled=false)
	public void getSupportTooletips()
	{
		
		String Actualtooltip="Support";
		wait = new WebDriverWait(driver, 5);
		web=eventDriver.findElement(By.xpath(TooltipPath));
		wait.until(ExpectedConditions.visibilityOf(web));
		String ExpectedTooltip=web.getAttribute("data-tooltip");
		
		if(ExpectedTooltip.equalsIgnoreCase(ExpectedTooltip));
		{
		System.out.println("Test Cases Executed-->"+ExpectedTooltip);
		}
		Assert.assertEquals(Actualtooltip, ExpectedTooltip);
		
	}
	
	@Test
	public void printList()
	{
		web.click();
	    String winId= eventDriver.getWindowHandle();

		screenShotLibrary.captureScreenShot1(driver);
		try 
		{
			list= driver.findElements(By.xpath("//div[@id='M842Cd']//div"));
			System.out.println(list.size());
			
			for(WebElement web: list)
			{
				String value=web.getText();
				
				if(value.equals("Training"))
				{
					web.click();
					Set<String> winIdChild= driver.getWindowHandles();
					Iterator<String> itr= winIdChild.iterator();
					
					while(itr.hasNext())
					{
						String id= itr.next();
						
						if(!winId.equalsIgnoreCase(id))
						{
							eventDriver.switchTo().window(id);
							System.out.println(eventDriver.getTitle());
							//eventDriver.close();
							break;
						}
					}
					
					break;
				}
			}
			driver.switchTo().window(winId);
			System.out.println(eventDriver.getTitle());
		} 
		catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@AfterMethod
	public void getFailedTestCase(ITestResult result)
	{
		
		if(result.getStatus()==ITestResult.FAILURE)
		{
			screenShotLibrary.captureScreenShot(driver, result);
		}
		
		
	}

	
	@AfterClass
	public void kill()
	{
		//eventDriver.close();
	}
}