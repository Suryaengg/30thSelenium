package AnnotationTestNg;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class example_annotation 
{

	@BeforeMethod
	public void LogintoApp() 
	{
		System.out.println("Login to app");
	}
	
	@Test
	public void VerifyUser1() 
	{
		System.out.println("--running verify user1 TC--");
	}
	
	@Test
	public void VerifyUser2() 
	{
		System.out.println("--running verify user2 TC--");
	}
	
	@Test
	public void VerifyUser3() 
	{
		System.out.println("--running verify user3 TC--");
	}
	
	@AfterMethod
	public void LogoutApp() 
	{
		System.out.println("Logoutapp");
	}
}
