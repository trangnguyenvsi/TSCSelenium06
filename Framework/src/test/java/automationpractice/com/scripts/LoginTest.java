package automationpractice.com.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import automationpractice.com.utility.ExtentManager;
import automationpractice.com.utility.Utility;
import junit.framework.Assert;
import automationpractice.com.testbases.Testbase;

public class LoginTest extends Testbase {

	ExtentReports extent;
	 ExtentTest test;
	 
	 @BeforeClass
	 public void M1(){
	  extent = ExtentManager.Instance();	  
	 }
	 
	@Test(dataProvider = "authenticate")
	public void LoginFail(String username, String passw, String err) throws InterruptedException
	{
		test = extent.startTest("ContactPage", "Verify Send button");
		
		objLogin.clearInfo();
		test.log(LogStatus.INFO, "site clear + site open");
		objLogin.InputInfo(username, passw);
		test.log(LogStatus.INFO, "input user + pass");
		objLogin.clickLoginBtn();
		Thread.sleep(3000);
		WebElement err1 = driver.findElement(By.xpath("//*[@id='center_column']/div[1]/p"));
		Assert.assertEquals(err1.getText(), "There is 1 error");
		WebElement err2 = driver.findElement(By.xpath("//*[@id='center_column']/div[1]/ol/li"));
		Assert.assertEquals(err2.getText(), err);
		test.log(LogStatus.PASS, "Result");
		test.log(LogStatus.INFO, "image" );
		test.addScreenCapture(ExtentManager.CaptureScreen(driver, "./send"));
		Assert.assertEquals(objLogin.getAlertText(), "There is 1 error");
//		System.out.println("cua no T_T");
		Assert.assertEquals(objLogin.getErrorContent(), err);
//		System.out.println("cua no T_T222");
		//http://learn-automation.com/advance-selenium-reporting-with-screenshots-part-2/
	}
	@DataProvider
	public Object[][] authenticate() throws Exception
	{
		Utility utili = new Utility();	
		Object[][] testObjArr = utili.getExcelData("D:\\Working\\Survey site\\TestData1.xlsx", "Login", "LoginFail");
		return (testObjArr);
	}	
			
	 @AfterClass
	 public void tear()
	 {
	  extent.endTest(test);
	  extent.flush();
	  extent.close();
	  driver.quit();
	 }
}
