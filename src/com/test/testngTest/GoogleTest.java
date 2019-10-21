package com.test.testngTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.google.com");
	}
	
	
	@Test
	public void googleTitleTest() {
		String title = driver.getTitle();
		System.out.println("title------>"+title);
	}
	
	@Test
	public void googleLogoTest() {
		boolean b = driver.findElement(By.xpath("//img[@id='hplogo']")).isDisplayed();
		System.out.println("b------>"+b);
	}
	
	@Test
	public void mailLinkTest() {
		boolean linkText = driver.findElement(By.linkText("Gmail")).isDisplayed();
		System.out.println("linkText------->"+linkText);
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
