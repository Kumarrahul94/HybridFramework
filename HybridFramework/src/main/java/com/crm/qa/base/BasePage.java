package com.crm.qa.base;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.crm.qa.util.BrowserFactory1;

import Utility.BrowserFactory;
import freemarker.log.Logger;

public class BasePage {
	
	public WebDriver driver;

	
	
	@BeforeSuite
	public void setUpSuite() {
		//Extent Report

	}
	
	@BeforeClass
	public void setup() {	
		driver = BrowserFactory.startBrowser("Chrome", "http://demosite.center/wordpress/wp-login.php");
	}
	
	@AfterClass
	public void tearDown() 
	{
		BrowserFactory.quitBrowser(driver);
		
	}
}

