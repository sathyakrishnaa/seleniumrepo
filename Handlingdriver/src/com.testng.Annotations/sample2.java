package com.testng.Annotations;

import org.testng.annotations.*;

public class sample2 {

	@BeforeClass
	public void m9() {
		System.out.println("This is m9 from class2");
	}

	@BeforeTest
	public void m1() {
		System.out.println("This is m1 from sample2 class");
	}

	@BeforeMethod
	public void m7() {
		System.out.println(" This is m7 from class2");
	}

	@Test
	public void m2() {
		System.out.println(" This is m2 from sample2 class");
	}

	@AfterMethod
	public void m8() {
		System.out.println(" This is m8 from class2");
	}

	@AfterTest
	public void m3() {
		System.out.println("This is m3 from sample2 class");
	}

	@AfterClass
	public void m10() {
		System.out.println("This is m10 from class2");
	}

	@AfterSuite
	public void m12() {
		System.out.println("This is m12 from sample2");
	}

}
