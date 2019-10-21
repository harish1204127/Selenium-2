package class_locator;

import org.openqa.selenium.chrome.ChromeDriver;


public class by_class {
	
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\drivers\\chromedriver\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.rediff.com/");
		driver.findElementByClassName("signin").click();
		
	}

}
