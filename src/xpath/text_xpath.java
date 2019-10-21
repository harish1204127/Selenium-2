package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class text_xpath {


	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "F:\\Selenium\\drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://bbc.com");
		driver.findElement(By.xpath("//a[text()='Home']")).click();
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//a[text()='Sport']")).click();
		System.out.println(driver.getTitle());
		
		
	}



}
