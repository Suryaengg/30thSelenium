package TestNg;

import org.testng.annotations.Test;

public class enabled 
{

	@Test
	public void TC1()
	{
	
		System.out.println("running TC1");
	}
	
	@Test
	public void TC2()
	{
	
		System.out.println("running TC2");
	}
	
	@Test(enabled=false)
	public void TC3()
	{
	
		System.out.println("running TC3");
	}
}
