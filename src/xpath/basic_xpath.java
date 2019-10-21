package xpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class basic_xpath {


	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "F:\\Selenium\\drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.guru99.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		/*
Xpath=//input[@type='text']				
Xpath=	//label[@id='message23']
Xpath=	//input[@value='RESET']
Xpath=//*[@class='barone']
Xpath=//a[@href='http://demo.guru99.com/']
Xpath= //img[@src='//cdn.guru99.com/images/home/java.png']
*/
		
		System.out.println(driver.getTitle());
	
		
	}



}
