/**
 * 
 */
package com.wordpress.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.wordpress.Pages.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author rahul
 * parameterize via Login Page:POM
 *
 */
public class VerifyWordPressLogin2 {

	@Test
	public void verifyValidLogin() {

		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://demosite.center/wordpress/wp-login.php");

		LoginPage login = new LoginPage(driver);
		login.loginToWordPress("admin", "pass"); //---- Use Method to reduce the steps
		
		
		
//		login.typeUserName("admin");
//		login.typePassword("demo123");
//		login.clickOnLoginButton();

		driver.quit();
	}

}
