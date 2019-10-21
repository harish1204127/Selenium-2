package name;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class by_name {
	
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\drivers\\chromedriver\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.name("proceed")).click();
		

		

		
		
		
		
		

		
		
		
		
		
	}

}
