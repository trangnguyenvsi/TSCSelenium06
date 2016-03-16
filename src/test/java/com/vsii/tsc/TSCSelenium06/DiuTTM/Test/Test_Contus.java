package com.vsii.tsc.TSCSelenium06.DiuTTM.Test;

import java.awt.AWTException;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;
import com.vsii.tsc.TSCSelenium06.DiuTTM.PageFactory.ContactUs;

public class Test_Contus  extends TestBase
{
    WebDriver driver;
    ContactUs ct;
    @BeforeMethod
    public void OpenPage(){
        TestBase.driver.get(urlBase);
        TestBase.driver.findElement(By.id("contact-link")).click();
        
    }
 // @Test(priority=1)
    public void UploadSucc() throws AWTException{    
      TestBase.test = TestBase.extent.startTest("Contac Success", "Contac Success");
      TestBase.test.assignCategory("Category02");
      ct = new ContactUs(TestBase.driver);
        ct.sendEmail("Customer service", "minhdiu.92@gmail.com","123", "Thank you so much");
     
        if (TestBase.driver.findElement(By.xpath("//*[@id='center_column']/p")).getText().contains("Your message has been successfully sent to our team.")){
            TestBase.test.log(LogStatus.PASS, TestBase.driver.findElement(By.xpath("//*[@id='center_column']/p")).getText() +  "contains"+ "Your message has been successfully sent to our team.");
            }
            else {
                TestBase.test.log(LogStatus.FAIL, TestBase.driver.findElement(By.xpath("//*[@id='center_column']/p")).getText()
                        + " doesn't contain " + "Your message has been successfully sent to our team.");
            }
         TestBase.test.log(LogStatus.INFO, TestBase.test.addScreenCapture(com.vsii.tsc.TSCSelenium06.DiuTTM.DataProvider.ExtentManager.CaptureScreen(TestBase.driver, "C:/Users/diuttm/workspace/Demo_testReport/report/ContactSuccess")));   

    }
   @Test(priority=0)
    public void UploadFail() throws AWTException{ 
       TestBase.test = TestBase.extent.startTest("Contac Fail", "Contac Fail");
       TestBase.test.assignCategory("Category02");
       ct = new ContactUs(TestBase.driver);
        ct.sendEmail("Customer service","","","");                   
        if (TestBase.driver.findElement(By.xpath(".//*[@id='center_column']/div/p")).getText().contains("There is 1 error")){
            TestBase.test.log(LogStatus.PASS, TestBase.driver.findElement(By.xpath("//*[@id='center_column']/div/p")).getText() +  "contains"+ "There is 1 error");
            }
            else {
                TestBase.test.log(LogStatus.FAIL, TestBase.driver.findElement(By.xpath(".//*[@id='center_column']/div/p")).getText()
                        + " doesn't contain " + "There is 1 error");
            }
         TestBase.test.log(LogStatus.INFO, TestBase.test.addScreenCapture(com.vsii.tsc.TSCSelenium06.DiuTTM.DataProvider.ExtentManager.CaptureScreen(TestBase.driver, "C:/Users/diuttm/workspace/Demo_testReport/report/ContactFail")));   

    }
    
   @AfterMethod
   public void tearDown() {
       TestBase.extent.endTest(TestBase.test);
       TestBase.extent.flush();
}}
