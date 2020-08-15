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
 * Without parameterize
 *
 */
public class VerifyWordPressLogin {

	@Test
	public void verifyValidLogin() {

		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://demosite.center/wordpress/wp-login.php");

		LoginPage login = new LoginPage(driver);
		login.typeUserName();
		login.typePassword();
		login.clickOnLoginButton();

		driver.quit();
	}

}
