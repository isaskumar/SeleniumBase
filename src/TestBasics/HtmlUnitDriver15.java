package TestBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HtmlUnitDriver15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//WebDriver driver = new ChromeDriver();
		
		WebDriver driver = new HtmlUnitDriver();
		
		//html unit driver not avalilable in selenium 3.x version
		
		//Advantages of HtmlUnitDriver:

		//Test execution using HtmlUnitDriver is very fast. Since it is the fastest implementation of Selenium WebDriver.
		//Being headless and fast, it is an ideal choice for web scrapping.
		//Its browser - htmlUnit is Java based. Hence, it is platform independent.
		//It also supports JavaScript execution through in-built Rhino javascript engine.
		
		//Limitations of HtmlUnitDriver:

		//Being non-GUI makes it difficult to create scripts and debug issues while scripting.
		//The Rhino javascript engine of HtmlUnitDriver makes it unsuitable to emulate other popular browser's javascript behaviour.
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://ui.cogmento.com/");
		
		System.out.println("Before login title-----"+driver.getTitle());
		
		driver.findElement(By.name("email")).sendKeys("semmalaisasi@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Welcome@12345");
		
		driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
		
		System.out.println("After login title-----"+driver.getTitle());
		
		driver.close();

	}

}
