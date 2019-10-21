package TestBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation11 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
		
	driver.get("https://www.google.it/");
	
	driver.navigate().to("https://www.amazon.it/");
	
	driver.navigate().back();
	
	Thread.sleep(2000);

	driver.navigate().forward();
	
	driver.navigate().refresh();
	
	}

}
