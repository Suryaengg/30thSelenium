package PopUp;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class childbrowserpopup 
{

	
	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\30 apr\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://secure.indeed.com/");
		//Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//span[text()='Continue with Facebook']")).click();
		
		Set<String> allids = driver.getWindowHandles();
		
		ArrayList<String> al= new ArrayList<String>(allids);
		
		String childwin = al.get(1);
		
		driver.switchTo().window("childwin");
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("12345");
		Thread.sleep(2000);
		driver.manage().window().maximize();
	}
}
