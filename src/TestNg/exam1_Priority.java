package TestNg;

import org.testng.annotations.Test;

public class exam1_Priority 
{

	@Test(priority=2)
	public void TC1()
	{
	
		System.out.println("running TC1");
	}
	
	@Test
	public void TC2()
	{
	
		System.out.println("running TC2");
	}
	
	@Test(priority=1)
	public void TC3()
	{
	
		System.out.println("running TC3");
	}
}
