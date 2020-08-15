package com.crm.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver ldriver) {
		this.driver = ldriver;
	}

	@FindBy(id = "txtUsername")
	WebElement uname;
	@FindBy(id = "txtPassword")
	WebElement pass;
	@FindBy(id = "btnLogin")
	WebElement login;

	public void loginToCRM(String usernameApplication, String passwordApplication) {
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		uname.sendKeys("admin");
		pass.sendKeys("admin123");
		login.click();
	}

}
