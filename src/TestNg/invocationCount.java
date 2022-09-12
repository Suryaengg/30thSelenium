package TestNg;

import org.testng.annotations.Test;

public class invocationCount 
{

	@Test(invocationCount=3)
	public void userid1()
	{
	
		System.out.println("running userid1 TC");
	}
}
