package Webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class thread_sleep 
{

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\30 apr\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(2000);
		driver.close();
	}
}
