package Scrollup;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrollup_down_flipkart 
{

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\30 apr\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(2000);
		
		//((JavascriptExecutor)driver).executeScript("window.scrollBy(0,2000)");
		//Thread.sleep(3000);
		
		//((JavascriptExecutor)driver).executeScript("window.scrollBy(0,-1000)");
		//Thread.sleep(3000);
		
		((JavascriptExecutor)driver).executeScript("window.scrollBy(300,0)");
		Thread.sleep(3000);
		
		//((JavascriptExecutor)driver).executeScript("window.scrollBy(-300,0)");
		//Thread.sleep(3000);
		
	}
}
