package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathby_index 
{

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\30 apr\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Shital");
		
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("Agawane");
		
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("9594325350");
		
		driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("lovesuresh");
	}
}
