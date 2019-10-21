package com.test.testngTest;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgBasics {
	//Pre conditions
	@BeforeSuite
	public void setUp() {
		System.out.println("System property for chrome");
	}

	@BeforeClass
	public void launchBrowser() {
		System.out.println("Launch the browser");
	}
	
	@BeforeTest
	public void login() {
		System.out.println("Login to the application");
	}
	
	@BeforeMethod
	public void enterURL() {
		System.out.println("Enter the URL");
	}

	//test
	@Test(priority=2,groups="Title")
	public void googleTitle() {
		System.out.println("get the ttle ");
	}
	
	@Test(priority=4)
	public void searchTest() {
		System.out.println("search the text ");
	}
	
	@Test(priority=3, groups="Logo")
	public void logotest() {
		System.out.println("logo test ");
	}
	
	
	@Test(priority=1)
	public void test1() {
		System.out.println("sample test1 ");
	}
	
	
	
	//post conditions
	@AfterMethod
	public void logout() {
		System.out.println("logout from the application");
	}
	
	
	@AfterTest
	public void deleteAllCookies() {
		System.out.println("delete all the cookies");
	}
	
	@AfterClass
	public void closeBrowser() {
		System.out.println("Close the browser");
	}
	
	@AfterSuite
	public void generateTestReport() {
		System.out.println("generate test report");
	}
	
	
}
