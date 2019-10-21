package TestBasics;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.List;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class BrokenLinks {

	public static void main(String[] args) throws InterruptedException, MalformedURLException, IOException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();		
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("http://www.makesushi.com/404-2/");
		
		/*driver.get("https://classic.crmpro.com/index.html");
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("semmalais");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Welcome@12345");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		driver.switchTo().frame("mainpanel");
		Thread.sleep(2000);*/
		
		List<WebElement> li = driver.findElements(By.tagName("a"));
		li.addAll(driver.findElements(By.tagName("img")));
		
		
		System.out.println("siz of full links and images"+ li.size());
		
		List<WebElement> activeLinks = new ArrayList<WebElement>();
		
		
		for(int i =0; i<li.size(); i++) {
			System.out.println(li.get(i).getAttribute("href"));
			if(li.get(i).getAttribute("href")!=null && (!li.get(i).getAttribute("href").contains("javascript"))) {
				activeLinks.add(li.get(i));
			}
		}
		
		System.out.println("siz of active links and images"+ activeLinks.size());
		
		for(int j=0;j<activeLinks.size();j++) {
			HttpURLConnection connection = (HttpURLConnection) new URL(activeLinks.get(j).getAttribute("href")).openConnection();
			connection.connect();
			String response = connection.getResponseMessage();
			connection.disconnect();
			
			System.out.println(activeLinks.get(j).getAttribute("href")+ "-------->" + response);
		}

		driver.close();
	}
	

}
