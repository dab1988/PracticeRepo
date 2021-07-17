package java_classed;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class handleCalendar
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.drive", "C:\\Users\\dabeer.haider\\eclipse-workspace\\Java_Programming\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.goibibo.com/");
		
	    By xpath= By.xpath("//input[@id=\"departureCalendar\"]");
	    
	    driver.findElement(xpath).click();
	    
	    By date= By.xpath("//div[text()=\"July 2021\"]");
	    
	    String dateValue=driver.findElement(By.xpath("//div[@class=\"DayPicker-Caption\"]")).getText();
	    
	    System.out.println(dateValue);
	    
	    String monthVal= dateValue.split(" ")[0].trim();
	    
	    String yearVal= dateValue.split(" ")[1].trim();
	    
	    String expectedMotnh="June";
	    String  expectedDay="16";
	    String expectedYear="2022";
	   		
	
		
		while(!(monthVal.equals(expectedMotnh) && yearVal.equals(expectedYear)))
		{
			
			driver.findElement(By.xpath("//span[contains(@class,\"NavButton--next\")]")).click();
			
					
			//driver.findElement(By.xpath("//div[contains(@id,\"fare_20210729\")]")).click();	
					
			dateValue=driver.findElement(By.xpath("//div[@class=\"DayPicker-Caption\"]")).getText();
			
			monthVal=dateValue.split(" ")[0].trim();
			yearVal=dateValue.split(" ")[1].trim();
			
			if(monthVal.equals(expectedMotnh) && yearVal.equals(expectedYear))
			{
				break;
			}
			
		}
		
		System.out.println("Loop Exit");
		new WebDriverWait(driver,10)
		.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//div[text()=\"16\"]")))).click();;
		
		//driver.close();
		
	}
}
