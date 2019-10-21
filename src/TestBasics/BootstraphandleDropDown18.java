package TestBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootstraphandleDropDown18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();		
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://getbootstrap.com/docs/4.0/components/dropdowns/");
		
		driver.findElement(By.id("dropdownMenuButton")).click();
		
		List<WebElement> li = driver.findElements(By.xpath("//div[contains(@class, 'dropdown-menu show')]/a"));
		System.out.println(li.size());
		
	}

}
