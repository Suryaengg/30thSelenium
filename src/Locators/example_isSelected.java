package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example_isSelected 
{

	public static void main(String[] args) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\30 apr\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		
		boolean select = driver.findElement(By.xpath("(//input[@class='_8esa'])[1]")).isSelected();
		System.out.println("select");
		
		if (select==true) 
		{
			System.out.println("element is selected");
		} 
		else 
		{
            System.out.println("element is not selected");
		}
	}
}
