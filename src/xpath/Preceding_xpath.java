package xpath;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Preceding_xpath {
	
	public static void main(String[] args) {

		
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\drivers\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
	
		driver.get("http://demo.guru99.com/V4/");
		
		driver.findElementByXPath("//*[@type='submit']//preceding::input[1]").sendKeys("Password");
		driver.findElementByXPath("//*[@type='submit']//preceding::input[2]").sendKeys("username");

		
	


		
		
		

		
		
		
		
		
	}

}
