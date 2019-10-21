package TestBasics;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
	    driver.get("https://www.ebay.com/");

	        List <WebElement> linkslist= driver.findElements(By.tagName("a"));

	        System.out.println(linkslist.size());
	        for(int i=0;i<linkslist.size();i++){

	            String text = linkslist.get(i).getText();
	            System.out.println(text);
	        }
	        for(WebElement links:linkslist){
	            System.out.println(links.getAttribute("href"));
	        }
	        driver.close();
	    }

	}


