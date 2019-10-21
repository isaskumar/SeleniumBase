package TestBasics;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindowPoPUp13 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.popuptest.com/goodpopups.html");
		
		driver.findElement(By.xpath("//a[@class='black']")).click();
		
		Thread.sleep(2000);
		
		Set<String> handler = driver.getWindowHandles();
		
		Iterator<String> li = handler.iterator();
		
		String parentId = li.next();
		
		System.out.println("Parent window id"+parentId);
		
		String childID = li.next();
		
		System.out.println("Child window id"+childID);
		
		driver.switchTo().window(childID);
		
		System.out.println(driver.getTitle());
		
		Thread.sleep(2000);
		
		driver.close();
		
		driver.switchTo().window(parentId);
		
		System.out.println("Parent id-------->>>>>>"+driver.getTitle());
	

	}

}
