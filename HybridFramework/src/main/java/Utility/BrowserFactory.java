package Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.crm.qa.base.BasePage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserFactory extends BasePage{
	
	static WebDriver driver;
	
	public static WebDriver startBrowser(String browserName, String url)
	{
		if(browserName.equalsIgnoreCase("Chrome")) {
			
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else {
			System.out.println("We don't use browser");
		}
		
		driver.manage().window().maximize();
		driver.get(url);
		return driver;
	}
	
	public static void quitBrowser(WebDriver driver) {
		driver.quit();
	}	
}
