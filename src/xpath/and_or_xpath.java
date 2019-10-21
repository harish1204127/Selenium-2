package xpath;

import org.openqa.selenium.chrome.ChromeDriver;


public class and_or_xpath {
	
	public static void main(String[] args) {

		// Xpath - contains= end-with
		
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\drivers\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
	
		driver.get("http://demo.guru99.com/V4/");
		driver.findElementByXPath("//input[@type='submit' and @name='btnLogin']").click();


		
		
		

		
		
		
		
		
	}

}
