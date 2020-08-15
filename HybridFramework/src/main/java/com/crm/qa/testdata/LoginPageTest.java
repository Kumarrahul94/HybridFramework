package com.crm.qa.testdata;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.crm.qa.base.BasePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.BrowserFactory1;

public class LoginPageTest extends BasePage {
	
	@Test
	public void loginApp()
	{
	LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
	loginPage.loginToCRM("admin", "admin123");
	}


}
