package xpath;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Ancestor_xpath {
	
	public static void main(String[] args) {

		
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\drivers\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
	
		driver.get("https://www.guru99.com/");
		
		String x= driver.findElementByXPath("//*[text()='Enterprise Testing']//ancestor::div[4]").getText();
		System.out.println("=="+x);
		List<WebElement> li= driver.findElementsByXPath("//*[text()='Enterprise Testing']//ancestor::div");
		System.out.println(li.size());
		for(int i=0;i<li.size()-1;i++)
		{
			System.out.println(li.size()+"=="+li.get(i).getText());
		}
		
	


		
		
		

		
		
		
		
		
	}

}
