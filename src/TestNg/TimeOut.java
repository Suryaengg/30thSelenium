package TestNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TimeOut 
{

	@Test(timeOut=7000)
	public void TC1() throws InterruptedException 
	{
		Thread.sleep(5000);
	Reporter.log("running TC1",true);	
	}
	
}
