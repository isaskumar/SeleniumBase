package TestBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamiceTable17 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();		
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://classic.crmpro.com/index.html");
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("semmalais");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Welcome@12345");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		driver.switchTo().frame("mainpanel");
		Thread.sleep(2000);
		
			driver.findElement(By.xpath("//a[contains(text(), 'Contacts')]")).click();
			
			//*[@id="vContactsForm"]/table/tbody/tr[4]
			
			String beforeXpath = "//*[@id='vContactsForm']/table/tbody/tr[";
			String afterXpath = "]/td[2]/a";
			
			for(int i=4;i<=7;i++) {
				String name = driver.findElement(By.xpath(beforeXpath+i+afterXpath)).getText();
				System.out.print(name);
			}
			
			//Use parent sibling 
		
	}

}
