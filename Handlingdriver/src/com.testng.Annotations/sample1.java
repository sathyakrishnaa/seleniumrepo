package com.testng.Annotations;

import org.testng.annotations.*;

public class sample1 {

	@BeforeSuite
	public void m11() {
		System.out.println("This is m11 from sample1");
	}

	@BeforeClass
	public void method5() {
		System.out.println("This is m5 from sample1 class");
	}

	@BeforeMethod
	public void method1() {
		System.out.println("This is m1 from sample1 class");
	}

	@Test
	public void method2() {
		System.out.println(" This is m2 from sample1 class");
	}

	@Test
	public void method3() {
		System.out.println(" This is m3 from sample1 class");
	}

	@AfterMethod
	public void method4() {
		System.out.println("This is m4 from sample1 class");
	}

	@AfterClass
	public void method6() {
		System.out.println("This is m6 from sampl1");
	}

}
