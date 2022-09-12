package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example2incometaxlogin_xpath_by_attribute 
{

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\30 apr\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://eportal.incometax.gov.in/iec/foservices/#/login/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@name='panAdhaarUserId']")).sendKeys("AOGPA1978R");
		driver.findElement(By.xpath("//button[@class='large-button-primary width marTop16']")).click();
		
		driver.findElement(By.xpath("//div[@class='mat-checkbox-inner-container']")).click();
		
		driver.findElement(By.xpath("//input[@name='loginPasswordField']")).sendKeys("Suresh@1990");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[@class='marR4']")).click();
}
	
}
