package com.wordpress.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.crm.qa.base.BasePage;

public class LoginPageFindBy extends BasePage{
	
	WebDriver driver;
	
	public LoginPageFindBy(WebDriver ldriver) {
		this.driver=ldriver;
	}
	
	
	@FindBy(id="user_login") 
	@CacheLookup
	WebElement username;
	
	@FindBy(how=How.ID,using="user_pass")
	@CacheLookup
	WebElement password;

	@FindBy(how=How.XPATH,using=" //input[@id='wp-submit']")
	@CacheLookup
	WebElement submit_button;
	
	@FindBy(how=How.LINK_TEXT,using="Lost your password?")
	@CacheLookup
	WebElement forgot_password;
	
	public void login_wordpress(String uid, String pass ) {
		username.sendKeys("uid");
		password.sendKeys("pass");
		submit_button.click();
		System.out.println("****Login Successfull****");
	}
}