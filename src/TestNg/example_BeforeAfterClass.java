package TestNg;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class example_BeforeAfterClass 
{


	@BeforeClass
	public void Openbrowser() 
	{
		
		System.out.println("open browser");
	}
	
	
	@BeforeMethod
	public void loginapp() 
	{
		
		System.out.println("loginapp");
	}
	
	
	@Test
	public void userid1()
	{
	
		System.out.println("running userid1 TC");
	}
	
	
	@Test
	public void userid2() 
	{
	
		System.out.println("running userid2 TC");
	}
	
	
	
	@AfterMethod
	public void logout() 
	{
		
		System.out.println("logoutapp");
	}
	
	@AfterClass
	public void Closebrowser() 
	{
		
		System.out.println("Closebrowser");
	}
}


