package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomePage 
{

	@FindBy(xpath="//input[@id='userid']") private WebElement UserId;
	
	public KiteHomePage (WebDriver driver) 
	{
			PageFactory.initElements(driver, this);
		}
	
	public void userid() 
	{
		String actuser = UserId.getText();
		String expuser = "KXW990";
		
		if (actuser.equals(expuser)) 
		{
			System.out.println("pass");
		} 
		else
		{
			System.out.println("fail");
		}
	}
}
