package TestBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown3 {
	
	public static void main(String args[]) {
		
		// Driver initialization
		
		WebDriver driver = new ChromeDriver();
		
		// Start of the the application 
		
		driver.get("https://www.ebay.com/");
		
		Select select = new Select(driver.findElement(By.id("gh-cat")));
		select.selectByVisibleText("Art");
		
		
		//driver close
		
		driver.close();
	}

}
