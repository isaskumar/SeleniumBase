package TestBasics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadPropFile14 {
	
	static WebDriver driver;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		 Properties prop = new Properties();
		 
		 FileInputStream ip = new FileInputStream("C:/Users/ssemmalai/eclipse-workspace/SeleniumBasics/src/TestBasics/config.properties");
		 
		 prop.load(ip);
		 
		 System.out.println(prop.getProperty("name"));
		 System.out.println(prop.getProperty("age"));
		 
		 String Url = prop.getProperty("URL");
		 
		 System.out.println(prop.getProperty("Url"));
		 
		 String browser = prop.getProperty("browser");
		 
		 System.out.println(prop.getProperty("browser"));
		 
		 if(browser.equals("chrome")) {
			 driver = new ChromeDriver();
		 } else {
			 System.out.println("browser not found");
		 }
		 
		 driver.get(Url);
		 
		 driver.findElement(By.xpath(prop.getProperty("firstname_xpath"))).sendKeys(prop.getProperty("FirtName"));
		 driver.findElement(By.xpath(prop.getProperty("lastname_xpath"))).sendKeys(prop.getProperty("LastName"));
	}
	

}
