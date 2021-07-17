package TestNG;

import java.util.TreeMap;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JavaScriptExecutor
{

	
	@Test (enabled=false)
	public void test() throws Exception
	{
     WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		String name="dab";
		
		driver.get("http://demo.guru99.com/V4/ ");

	
		
		//String text = js.executeScript("return document.getElementById('loginSubmit').value").toString();
		
		 WebElement element = driver.findElement(By.name("uid"));   //This is your locator
		 JavascriptExecutor jse = (JavascriptExecutor)driver;
		 jse.executeScript("arguments[0].value=' "+name+" ';", element);
		
	}
	
	
	@Test
	public void add()
	{
		int i=0;
		
		try
		{
		int b= 5/i;
		}
		
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		finally
		{
			System.out.println("dabe");	
		}
		
	}
	
	@Test
	public void Treemap()
	{
		
		TreeMap map=new TreeMap();
		
		map.put(null, 1);
		
	}
	
}
