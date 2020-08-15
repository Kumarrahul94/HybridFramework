package Steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

	
	public static void main(String[] args) {

		WebDriver driver = null;
		
		String  projectPath = System.getProperty("user.dir");
		System.out.println("Project Path is:" + projectPath);
		
		System.setProperty("webdriver.chrome.driver",projectPath+"/src/test/resources/drivers/chromedriver/chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		driver.navigate().to("https://orangehrm-demo-6x.orangehrmlive.com/auth/login");
		driver.close();
		driver.quit();
	}

}
