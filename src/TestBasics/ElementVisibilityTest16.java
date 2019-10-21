package TestBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementVisibilityTest16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();		
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://classic.crmpro.com/register/");
		
		//isDisplayed() method for the all elements
		boolean b1 = driver.findElement(By.xpath("//button[@id='submitButton']")).isDisplayed();
		System.out.println(b1); //true
		
		boolean b4 = driver.findElement(By.name("agreeTerms")).isSelected();
		System.out.println(b4);
		
		//select I aggree checkbox
		
		driver.findElement(By.name("agreeTerms")).click();
		
		//isEnabled
		boolean b2 = driver.findElement(By.xpath("//button[@id='submitButton']")).isEnabled();
		System.out.println(b2); //false
		
		//isSelected
		
		boolean b5 = driver.findElement(By.name("agreeTerms")).isSelected();
		System.out.println(b5);
		
		

	}

}
