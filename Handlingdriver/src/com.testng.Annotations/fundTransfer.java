package com.testng.Annotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.*;

public class fundTransfer {

	@BeforeClass
	public void login() {
		System.out.println(" This is login method");

	}

	@Test
	public void fundtransfer() {

		System.out.println(" This is Fund transfer");
	}

	@AfterClass
	public void logout() {
		System.out.println();
	}
}
