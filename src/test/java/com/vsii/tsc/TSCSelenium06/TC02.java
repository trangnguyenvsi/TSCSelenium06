package com.vsii.tsc.TSCSelenium06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

public class TC02 {

	@Test
	public void M3() {
		System.out.println("TC02 is running");
		try {
			TestBase.test = TestBase.extent.startTest("ContactPage", "Verify Send button");
			TestBase.test.assignCategory("Category02");
			
			TestBase.driver.get("http://www.qavalidation.com/");

			Assert.assertTrue(TestBase.driver.getTitle().contains("QA & Validation"));
			TestBase.test.log(LogStatus.INFO, "site opened");

			TestBase.driver.findElement(By.xpath("//*[@id='PageList1']/div/ul/li[5]/a")).click();
			Thread.sleep(2000);
			WebElement Send = TestBase.driver.findElement(By
					.xpath("//*[@id='ContactForm1_contact-form-submit']"));
			if (Send.isDisplayed()) {
				TestBase.test.log(LogStatus.PASS, Send.getAttribute("Value")
						+ " button Found");
				
			} else {
				TestBase.test.log(LogStatus.FAIL, Send.getAttribute("Value")
						+ " button NOT Found");
			}
			TestBase.test.log(LogStatus.INFO, TestBase.test.addScreenCapture(ExtentManager
					.CaptureScreen(TestBase.driver, "D:/MyJobs/RemarkMedia/Projects/Lecture_18/report/TC02")));

		} catch (Exception e) {
			TestBase.test.log(LogStatus.ERROR, e.getMessage());
		}
	}

	@AfterMethod
	public void tear() {
		TestBase.extent.endTest(TestBase.test);
		TestBase.extent.flush();
	
	}

}