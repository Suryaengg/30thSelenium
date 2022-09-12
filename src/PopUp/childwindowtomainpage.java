package PopUp;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class childwindowtomainpage 
{

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\30 apr\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://secure.indeed.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[contains(text(),'Google')]")).click();
		Set<String> All = driver.getWindowHandles();
		ArrayList<String> al = new ArrayList<String>(All);
		//String child = al.get(1);
		driver.switchTo().window(al.get(1));
		
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("7208181821");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.switchTo().window(al.get(0));
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//span[text()='Continue with Facebook']")).click();
	}
}
