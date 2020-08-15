package com.wordpress.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * 
 * @author rahul Class will store all the locators and methods of login page
 *
 *
 *
 *
 */

public class LoginPage {

	WebDriver driver;
	
		By username = By.id("user_login");
		By password = By.xpath("//input[@id='user_pass']");
		By loginButton = By.name("pwd");

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void loginToWordPress(String userid, String pass) {
		driver.findElement(username).sendKeys("uid");
		driver.findElement(password).sendKeys("pass");
		
	}

	public void typeUserName(String uid) {
		driver.findElement(username).sendKeys("uid");
	}

	public void typePassword(String pass) {
		driver.findElement(password).sendKeys("pass");

	}

	public void clickOnLoginButton() {
		driver.findElement(loginButton).click();
	}
}
