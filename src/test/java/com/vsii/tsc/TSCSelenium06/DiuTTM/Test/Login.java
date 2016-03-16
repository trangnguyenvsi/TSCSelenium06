package com.vsii.tsc.TSCSelenium06.DiuTTM.Test;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
import com.vsii.tsc.TSCSelenium06.DiuTTM.PageFactory.Login_Page;

public class Login extends TestBase {
	TestBase testBase=new TestBase();
	Login_Page lg = new Login_Page();


	@Test(priority=0,dataProvider = "LoginSucc")
	public void LoginSuccess(String email, String passwd) {
	    TestBase.test = TestBase.extent.startTest("LoginSuccess", "Verify Login Success");
        TestBase.test.assignCategory("Category01");
		driver.get(urlBase + "index.php?controller=authentication");
		lg.Login_Page(driver);
		lg.Login(email,passwd);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
		if (TestBase.driver.findElement(By.xpath(".//*[@id='center_column']/p")).getText().contains("Welcome to your account. Here you can manage all of your personal information and orders")){
            TestBase.test.log(LogStatus.PASS, TestBase.driver.findElement(By.xpath(".//*[@id='center_column']/p")).getText() +  "contains"+ "Welcome to your account. Here you can manage all of your personal information and orders");
            }
            else {
                TestBase.test.log(LogStatus.FAIL, TestBase.driver.findElement(By.xpath(".//*[@id='center_column']/p")).getText()
                        + " doesn't contain " + "Welcome to your account. Here you can manage all of your personal information and orders");
            }
		 TestBase.test.log(LogStatus.INFO, TestBase.test.addScreenCapture(com.vsii.tsc.TSCSelenium06.DiuTTM.DataProvider.ExtentManager.CaptureScreen(TestBase.driver, "C:/Users/diuttm/workspace/Demo_testReport/report/LoginSuccess")));	
		lg.clickLogout();
	}

	@Test(priority=1,dataProvider = "LoginFail")
	public void LoginFail(String email, String passwd) {
	    TestBase.test = TestBase.extent.startTest("LoginFail", "Verify Login Fail");
        TestBase.test.assignCategory("Category01");
		driver.get(urlBase + "index.php?controller=authentication");
		lg.Login_Page(driver);
		lg.Login(email, passwd);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	if (TestBase.driver.getCurrentUrl().contains("http://automationpractice.com/index.php?controller=authentication")){
            TestBase.test.log(LogStatus.PASS, TestBase.driver.getCurrentUrl() +  "is "+ "http://automationpractice.com/index.php?controller=authentication");
            }
            else {
                TestBase.test.log(LogStatus.FAIL, TestBase.driver.getCurrentUrl()
                        + " isn't " + "http://automationpractice.com/index.php?controller=authentication");
            }
         TestBase.test.log(LogStatus.INFO, TestBase.test.addScreenCapture(com.vsii.tsc.TSCSelenium06.DiuTTM.DataProvider.ExtentManager.CaptureScreen(TestBase.driver, "C:/Users/diuttm/workspace/Demo_testReport/report/LoginSuccess")));   
	}
}
