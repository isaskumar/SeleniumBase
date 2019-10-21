package TestBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		
		String title = driver.getTitle();
		System.out.println("Title of the google is-------->>>>>>"+title);
		
		if(title.equals("Google")) {
			System.out.println("Correct title");
		} else {
			System.out.println("wrong title");
		}
		System.out.println(driver.getCurrentUrl());
		driver.quit();
	}

}
