package Framework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example_withDDF 
{

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException 
	{
		
FileInputStream file = new FileInputStream("C:\\30 apr\\30thApr.xlsx");
		
		Sheet sh = WorkbookFactory.create(file).getSheet("DDF");
		
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\30 apr\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://kite.zerodha.com/");
		
		String userid = sh.getRow(0).getCell(0).getStringCellValue();
		driver.findElement(By.xpath("//input[@id='userid']")).sendKeys(userid);
		
		String password = sh.getRow(0).getCell(1).getStringCellValue();
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
		
		driver.findElement(By.xpath("//button[text()='Login ']")).click();
		
		String pin = sh.getRow(0).getCell(2).getStringCellValue();
		driver.findElement(By.xpath("//input[@id='pin']")).sendKeys(pin);
		
		driver.findElement(By.xpath("//button[text()='Continue ']")).click();
		//getuserid
		String actid = driver.findElement(By.xpath("//span[@class='user-id']")).getText();
		String expid = sh.getRow(0).getCell(3).getStringCellValue();
		
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
