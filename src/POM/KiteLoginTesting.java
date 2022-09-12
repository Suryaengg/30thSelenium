package POM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KiteLoginTesting 
{

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\30 apr\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://kite.zerodha.com/");
		
		KiteLogin1Page login1=new KiteLogin1Page(driver);
		login1.enterUN();
		login1.enterPWD();
		login1.clickloginbtn();
		
		KiteLogin2Page login2=new KiteLogin2Page(driver);
		login2.enterpin();
		login2.cntbtn();
		
		KiteHomePage home=new KiteHomePage(driver);
		home.userid();
		
		Thread.sleep(2000);
		driver.close();
	}

	
	
}
