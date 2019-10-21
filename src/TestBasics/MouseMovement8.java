package TestBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovement8 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://book.spicejet.com/");
		
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.linkText("MENU"))).build().perform();
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Travel Info")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.linkText("FAQ")).click();
		
		driver.close();

	}

}
