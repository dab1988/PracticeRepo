package TestNG;

import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class FullPageScreenShot 
{

	@Test (enabled=false)
	public void fullScreenShot() throws Exception
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dabeer.haider\\eclipse-workspace\\Java_Programming\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://intranet.xavient.com/XAP/");
		
		driver.findElement(By.xpath("//input[@name=\"txtLoginName\"]")).sendKeys("dabeer.haider");
		
		driver.findElement(By.xpath("//input[@name=\"txtPassword\"]")).sendKeys("Telus@2023");
		
		driver.findElement(By.xpath("//input[@name=\"btnLogin\"]")).click();
		
		new WebDriverWait(driver, 30).until(
			      driver1 -> ((JavascriptExecutor) driver).executeScript("return document.readyState").equals("complete"));
		//Thread.sleep(2000);
		
		Screenshot s=new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1100)).takeScreenshot(driver);
        ImageIO.write(s.getImage(),"PNG",new File("C:\\Users\\dabeer.haider\\eclipse-workspace\\"
        		+ "Java_Programming\\ScreenShots\\XAP\\a.png"));
	}

	
	@Test (priority=1)
	public void hdfc() throws Exception
	{
	
		
		
	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\dabeer.haider\\eclipse-workspace\\Java_Programming\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.hdfcbank.com/");
		
		Thread.sleep(2000);
		
	
		//String xpath="";
	    //driver.findElement(By.xpath("//ul[@class=\"dropdown1 dropdown-menu\"]//li")).click();
		Thread.sleep(1000);
		List<WebElement> list= driver.findElements(By.xpath("//ul[@class=\"dropdown1 dropdown-menu\"]//li"));
		
		System.out.println(list.size());
		
		for(int i=0; i<list.size(); i++)
		{
			
			System.out.println(list.get(i).getText().trim());
			
		}
	
		driver.close();
	}
		
}


