package com.wordpress.TestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.crm.qa.base.BasePage;
import com.wordpress.Pages.LoginPageFindBy;

public class VerifyFindByLoginPage extends BasePage{

	@Test
	public void checkValidateUser() {
		
		LoginPageFindBy login = PageFactory.initElements(driver, LoginPageFindBy.class);
		login.login_wordpress("admin","demo123");
	}	
	
}
