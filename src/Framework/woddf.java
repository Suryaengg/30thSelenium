package Framework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class woddf 
{

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\30 apr\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://kite.zerodha.com/");
		
		driver.findElement(By.xpath("//input[@id='userid']")).sendKeys("KXW990");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Safwan1802@");
		driver.findElement(By.xpath("//button[text()='Login ']")).click();
		driver.findElement(By.xpath("//input[@id='pin']")).sendKeys("180216");
		driver.findElement(By.xpath("//button[text()='Continue ']")).click();
		//getuserid
		String actid = driver.findElement(By.xpath("//span[@class='user-id']")).getText();
		String expid = "KXW990";
		
		if (actid.equals(expid)) 
		{
			System.out.println("pass");
		} 
		else
		{
			System.out.println("fail");
		}
		Thread.sleep(3000);
		driver.close();
		
	}
	
}
