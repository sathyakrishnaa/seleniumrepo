package com.testng.Annotations;

import org.testng.annotations.*;

public class Test1 {

	
	@BeforeClass
	public void openbrowser()
	{
		System.out.println("open browser");
	}
	
	@AfterClass
	public void closebrowser()
	{
		System.out.println("close brower");
	}
	
	@BeforeMethod
	public void login()
	{
		System.out.println(" login");
	}
	
	@AfterMethod
	public void logout()
	{
		System.out.println("Logout");
	}
	
	@Test(priority=1)
	public void registration()
	{
		System.out.println(" this is reg method");
	}
	
	@Test(priority=2)
	public void booking()
	{
		System.out.println(" this is booking functionality");
		
	}
	
	
}
