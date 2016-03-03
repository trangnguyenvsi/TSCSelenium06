package com.vsii.tsc.TSCSelenium06;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class TC01 {


	@BeforeClass
	public void M1() {
		TestBase.driver.get("http://www.qavalidation.com/");
		
	}

	@Test
	public void OpenAUT_01() {
		System.out.println("OpenAUT_01 is running");
		TestBase.test = TestBase.extent.startTest("OpenUT_01", "Verify HomePage");
		TestBase.test.assignCategory("Category01");
			
			if (TestBase.driver.getTitle().contains("QA & Validation")){
				TestBase.test.log(LogStatus.PASS, TestBase.driver.getTitle() + " contain "
						+ "QA & Validation");
			}
			else {
				TestBase.test.log(LogStatus.FAIL, TestBase.driver.getTitle()
						+ " doesn't contain " + "QA & Validation");
			}
			TestBase.test.log(LogStatus.INFO, TestBase.test.addScreenCapture(ExtentManager
					.CaptureScreen(TestBase.driver, "D:/MyJobs/RemarkMedia/Projects/Lecture_18/report/OpenAUT_01")));
		
	}

	@Test
	public void OpenAUT_02() {
		System.out.println("OpenAUT_02 is running");
		
		TestBase.test = TestBase.extent.startTest("OpenUT_02", "Verify HomePage");
		TestBase.test.assignCategory("Category01");
			
			if (TestBase.driver.getTitle().contains("QA & Validation")){
				TestBase.test.log(LogStatus.PASS, TestBase.driver.getTitle() + " contain "
						+ "QA & Validation");
			}
			else {
				TestBase.test.log(LogStatus.FAIL, TestBase.driver.getTitle()
						+ " doesn't contain " + "QA & Validation");
			}
			TestBase.test.log(LogStatus.INFO, TestBase.test.addScreenCapture(ExtentManager
					.CaptureScreen(TestBase.driver, "D:/MyJobs/RemarkMedia/Projects/Lecture_18/report/OpenAUT_02")));
		
	}

	@AfterMethod
	public void tear() {
		TestBase.extent.endTest(TestBase.test);
		TestBase.extent.flush();
		
	}
}