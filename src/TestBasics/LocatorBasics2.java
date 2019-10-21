package TestBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorBasics2 {
	
	public static void main(String args[]) {
		
		// Driver initialization
		
		WebDriver driver = new ChromeDriver();
		
		// Start of the the application 
		
		driver.get("https://reg.ebay.com/reg/PartialReg?ru=https%3A%2F%2Fwww.ebay.com%2F");
		
		driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys("sasikumar");
		driver.findElement(By.id("lastname")).sendKeys("semmalai");
		driver.findElement(By.name("email")).sendKeys("semmalaisasi@gmail.com");
		driver.findElement(By.cssSelector("#PASSWORD")).sendKeys("Welcome@12345");
		driver.findElement(By.cssSelector("#ppaFormSbtBtn")).click();
		
		driver.findElement(By.id("gh-logo")).click();
		
		//driver.findElement(By.linkText("Sign in")).click();
		
		//driver.findElement(By.partialLinkText("business")).click();
		
		//driver close
		
		driver.close();
	}

}
