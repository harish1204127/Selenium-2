package id;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class by_id {
	
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\drivers\\chromedriver\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.id("login1")).sendKeys("username");
		driver.findElement(By.id("password")).sendKeys("username");

		

		
		
		
		
		

		
		
		
		
		
	}

}
