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
	public ExtentReports report;
	public ExtentTest logger;
	
	
	@BeforeSuite
	public void setUpSuite() {
		//Extent Report
		ExtentSparkReporter extent = new ExtentSparkReporter(new File(System.getProperty("user.dir")+ "/Reports/CRM.html"));
		report = new ExtentReports();
		report.attachReporter(extent);
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

