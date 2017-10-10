package com.testng.Annotations;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test2 {

	@BeforeTest
	public void sample1()
	{
		System.out.println("sample1 method from Test2 class");
	}

	@AfterTest
	public void sample2() {
		System.out.println("sample2 method from test2 class");
	}
	
	@Test
	public void getdata()
	{
		System.out.println(" this is get data method from Test2 class");
	}
	
	@BeforeSuite
	public void openapp()
	{
		System.out.println("open app method from Test2");
	}
	
	@AfterSuite
	public void closeapp()
	{
		System.out.println("open app method from Test2");
	}
	
}
