package com.wordpress.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.crm.qa.base.BasePage;
import com.wordpress.Pages.LoginPageFindBy;

import Utility.BrowserFactory;

public class VerifyFindByLoginPage extends BasePage{

	@Test
	public void checkValidateUser() {
		
		System.out.println("Performing git action");
		logger = report.createTest("Login to CRM");
		LoginPageFindBy login = PageFactory.initElements(driver, LoginPageFindBy.class);
		
		logger.info("Starting Application");
		login.login_wordpress("admin","demo123");
		
		logger.pass("Logged In Successully");
		
		System.out.println("Test Case Ended");
	}	
	
}
