package css;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class css_id {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\drivers\\chromedriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		// by id
		//driver.findElement(By.cssSelector("#login1")).sendKeys("hello");
		// by custom css
		//driver.findElement(By.cssSelector("input[id=login1]")).sendKeys("hello");
		// by custom css
		//driver.findElement(By.cssSelector("input[id=login1][name=login]")).sendKeys("hello");
		// by custom css
		//driver.findElement(By.cssSelector("div[class=login-form]>div:nth-child(2)>input")).sendKeys("hello");
		//driver.findElement(By.cssSelector(".login-form>:nth-child(2)>input")).sendKeys("hello");

		//driver.findElement(By.cssSelector(" .login-form>:nth-child(2)>#login1")).sendKeys("hello");
		
		//driver.findElement(By.cssSelector("input[id^='log']")).sendKeys("startswith");
			//	driver.findElement(By.cssSelector("input[id$='gin1']")).sendKeys("endswith");
				//driver.findElement(By.cssSelector("input[id*='ogin']")).sendKeys("contains");


	}

}
