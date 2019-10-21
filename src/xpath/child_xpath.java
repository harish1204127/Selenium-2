package xpath;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class child_xpath {
	
	public static void main(String[] args) {

		
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\drivers\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
	
		driver.get("https://www.guru99.com/");
		driver.findElementByXPath("//*[@id='java_technologies']/child::li[1]").click();
		
	


		
		
		

		
		
		
		
		
	}

}
