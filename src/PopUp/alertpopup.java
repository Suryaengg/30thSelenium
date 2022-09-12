package PopUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertpopup 
{

	public static void main(String[] args)
	{
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\30 apr\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("11");
		
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		
		//String text = driver.switchTo().alert().getText();
		//System.out.println(text);
		
		driver.switchTo().alert().accept();
		
		//driver.switchTo().alert().accept();
		
		//driver.switchTo().alert().dismiss();
	}
}
