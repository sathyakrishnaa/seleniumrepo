package com.testng.Annotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class balanceEnquiry {

	@BeforeClass
	public void login() {
		System.out.println(" This is login method");

	}

	@Test
	public void balancecheck() {

		System.out.println(" This is balanceEnquiry");
	}

	@AfterClass
	public void logout() {
		System.out.println();
	}

}
