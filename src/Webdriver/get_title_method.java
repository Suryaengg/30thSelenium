package Webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class get_title_method 
{

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\30 apr\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		String title =driver.getTitle();
		System.out.println(title);
	}
}