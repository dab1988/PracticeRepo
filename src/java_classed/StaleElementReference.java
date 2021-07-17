package java_classed;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class StaleElementReference {

	public static void main(String[] args) throws AWTException, Exception
	{
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dabeer.haider\\eclipse-workspace\\Java_Programming\\chromedriver.exe");
		
		
		//SearchContext sr=new ChromeDriver();
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
		WebElement el= driver.findElement(By.xpath("//a[text()=\"Sign in\"]"));
		
		
		//el.click();
		
		/*
		 * Actions action = new Actions(driver);
		 * 
		 * action.contextClick(el).build().perform();
		 * 
		 * action.sendKeys(Keys.ARROW_DOWN).build().perform();
		 * action.sendKeys(Keys.ARROW_DOWN).build().perform();
		 * action.sendKeys(Keys.ARROW_DOWN).build().perform();
		 * 
		 * action.sendKeys(Keys.ENTER).build().perform();
		 */	
		/*
		 * Robot rb= new Robot();
		 * 
		 * rb.keyPress(KeyEvent.VK_DOWN); rb.keyRelease((KeyEvent.VK_DOWN));
		 */
		
		//driver.navigate().back();
		
		driver.navigate().refresh();
		
		Thread.sleep(2000);
		
		driver.close();
		
		el.click(); //This will throw nosuchsession exception
		
	}

}
