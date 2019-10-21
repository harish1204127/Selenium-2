package xpath;

import org.openqa.selenium.chrome.ChromeDriver;


public class Contains_xpath {
	
	public static void main(String[] args) {

		// Xpath - contains= end-with
		
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\drivers\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElementByXPath("//input[contains(@id,'gin1')]").sendKeys("endswith");
		
		/*
		driver.get("http://demo.guru99.com/V4/");
		driver.findElementByXPath("//*[contains(text(),'here')]").click();
*/
		//driver.findElementByXPath("//*[contains(@href,'guru99.com')]").click();

		
		
		

		
		
		
		
		
	}

}
