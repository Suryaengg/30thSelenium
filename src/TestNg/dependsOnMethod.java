package TestNg;

import org.testng.annotations.Test;

public class dependsOnMethod 
{

	@Test
	public void login1()
	{
	
		System.out.println("running login1");
	}
	
	@Test
	public void login2()
	{
	
		System.out.println("running login2");
	}
	
	@Test(dependsOnMethods={"login1","login2"})
	public void logout()
	{
	
		System.out.println("running logout");
	}
}
