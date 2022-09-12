package Autosugestion;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handling_Autosugession 
{

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\30 apr\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.google.co.in/");
		//Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("redmi");
		//Thread.sleep(2000);
		
		List<WebElement> all = driver.findElements(By.xpath("(//ul[@class='G43f7e'][1]/li)"));
		
		for (WebElement s1 : all) 
		{
			String acttext = s1.getText();
			String exptext="redmi 9";
			if (acttext.equals(exptext)) 
			{
				s1.click();
				break;
			}
		}
	}
}
