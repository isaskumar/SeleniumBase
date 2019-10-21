package TestBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling7 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://ui.cogmento.com/");
		
		driver.findElement(By.name("email")).sendKeys("semmalaisasi@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Welcome@12345");
		
		driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
		
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//i[@class='users icon']")).click();
		
		driver.quit();
	
	}

}
