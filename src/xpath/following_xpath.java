package xpath;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class following_xpath {
	
	public static void main(String[] args) {

		// Xpath - contains= end-with
		
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\drivers\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
	
		driver.get("http://demo.guru99.com/V4/");
		//driver.findElementByXPath("//*[@name='uid']//following::input[1]").sendKeys("password");
		driver.findElementByXPath("//*[@name='uid']//following::input[2]").click();
		
	


		
		
		

		
		
		
		
		
	}

}
