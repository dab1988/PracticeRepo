import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleDropDown {

	public static void main(String[] args) throws Exception 
	{
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dabeer.haider\\eclipse-workspace\\Java_Programming\\chromedriver.exe");
		
		String url="https://www.hdfcbank.com/";

		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(url);
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//body/div[1]/div[1]/div[2]/div[13]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/a[1]")).click();
		
		List<WebElement> list= driver.findElements(By.xpath("//*[@class=\"dropdown1 dropdown-menu\"]//li"));
				
		System.out.println(list.size());
		
		for(int i=1; i<list.size(); i++)
		{
			
			WebElement val=driver.findElement(By.xpath("//*[@class=\"dropdown1 dropdown-menu\"]//li["+i+"]"));
			
			String value=val.getText();
			 
			if(value.equalsIgnoreCase("Cards"))
			{
				
				val.click();
				break;
				
			}
			
		}
		
		driver.findElement(By.xpath("//a[text()='Select Product']")).click();
		List<WebElement> list1=driver.findElements(By.xpath("//ul[@class=\"dropdown2 dropdown-menu\"]//li"));
		
		
		for(int i=1; i<list1.size(); i++)
		{
		WebElement val1=driver.findElement(By.xpath("//*[@class=\"dropdown2 dropdown-menu\"]//li["+i+"]"));
		
		if(val1.getText().equalsIgnoreCase("Forex Cards"))
		{
			val1.click();
		}
		
		}
		
		
		//driver.close();
	}
}