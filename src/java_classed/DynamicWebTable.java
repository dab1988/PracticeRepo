package java_classed;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebTable {

	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub

		
		String url="https://www.cricbuzz.com/live-cricket-scorecard/36526/sl-vs-ind-1st-odi-india-tour-of-sri-lanka-2021";
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dabeer.haider\\eclipse-workspace\\Java_Programming\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get(url);
		
		Thread.sleep(2000);
		
		 WebElement element =driver.findElement(By.xpath("//a[contains(text(),'News') and @class='text-white']"));
         JavascriptExecutor js = (JavascriptExecutor) driver;
         js.executeScript("arguments[0].onmouseover()", element);
		
		//js.executeScript("window.scrollBy(0,100)");
		
		
		
		//js.executeScript("arguments[0].focus()", ));
		
		/*
		 * List<WebElement> list= driver.findElements(By.xpath(
		 * "//body/div[1]/div[2]/div[4]/div[2]/div[2]/div[1]/div"));
		 * 
		 * System.out.println(list.size());
		 * 
		 * List<WebElement> list1= driver.findElements(By.xpath(
		 * "//body/div[1]/div[2]/div[4]/div[2]/div[2]/div[1]/div[3]/div"));
		 * 
		 * System.out.println(list1.size());
		 * 
		 * for(int i=2; i<list.size(); i++) { for(int j=1; j<list1.size(); j++) {
		 * System.out.print(driver.findElement(By.xpath(
		 * "//body/div[1]/div[2]/div[4]/div[2]/div[2]/div[1]/div["+i+"]/div["+j+"]")).
		 * getText()+" "); } System.out.println(); }
		 */
	 //
	}

}
