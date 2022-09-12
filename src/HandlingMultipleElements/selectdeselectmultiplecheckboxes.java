package HandlingMultipleElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class selectdeselectmultiplecheckboxes 
{

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\30 apr\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/LENOVO/Documents/color.html");
		
		List<WebElement> all = driver.findElements(By.xpath("//input[@name='color']"));
		
		for (WebElement s1 : all) 
		{
			s1.click();
			Thread.sleep(1000);
		}
		
		for (int i = all.size()-1; i >=0; i--) 
		{
			
			all.get(i).click();
			Thread.sleep(1000);
		}
	}
	
}
