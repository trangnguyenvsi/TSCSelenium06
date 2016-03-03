package com.vsii.tsc.TSCSelenium06;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class TestBase {
	static ExtentReports extent;
	static ExtentTest test;
	static WebDriver driver;

	@BeforeSuite
	public void M1() {
		extent = ExtentManager.Instance();
		driver = new FirefoxDriver();
	}
	
	@AfterSuite
	public void tear() {
		TestBase.extent.close();
		driver.quit();
	}
}
