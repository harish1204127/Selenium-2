package xpath;

import org.openqa.selenium.chrome.ChromeDriver;


public class copy_xpath {
	
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\drivers\\chromedriver\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		//FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		//driver.findElementByXPath("//*[@id='login1']").sendKeys("username");
		//driver.findElementByXPath("//*[@id='password']").sendKeys("password");
		
		//driver.findElementByXPath("//[@id='login1']").sendKeys("username");
		//driver.findElementByXPath("//input[@id='login1']").sendKeys("username");
		//driver.findElementByXPath("//div[@class='login-form']/div[2]/input[@id='login1']").sendKeys("username");
		//driver.findElementByXPath("//div[@class='login-form']/div[2]/input").sendKeys("username2");

	
		
		//driver.findElementByXPath("//input[starts-with(@id,'log')]").sendKeys("startswith");
		driver.findElementByXPath("//input[contains(@id,'gin1')]").sendKeys("endswith");


		
		
		
		

		
		
		
		
		
	}

}
