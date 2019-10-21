package com.test.testngTest;

import org.testng.annotations.Test;

public class TestNgFeature {

	
	
	
	@Test
	public void loginTest() {
		System.out.println("login test case");
	}
	
	@Test(dependsOnMethods="loginTest")
	public void HomePageTest() {
		System.out.println("home page test case");
	}
	
	@Test(dependsOnMethods="loginTest")
	public void SearchPagetest() {
		System.out.println("search page test");
	}
}
