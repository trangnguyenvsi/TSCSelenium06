package com.vsii.tsc.TSCSelenium06.DiuTTM.Test;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;
import com.vsii.tsc.TSCSelenium06.DiuTTM.PageFactory.Search;

public class Test_Search extends TestBase
{     
    WebDriver driver;
        @Test(priority=0)
        public void Searchwithoutinputdata(){
            TestBase.test = TestBase.extent.startTest("Contac Success", "Contac Success");
            TestBase.test.assignCategory("Category03");
            Search hp = new Search(driver);
            hp.search("");
//            String act= driver.findElement(By.xpath(".//*[@id='center_column']/p")).getText();
//            Assert.assertEquals(act, "Please enter a search keyword");
            if (TestBase.driver.findElement(By.xpath("//*[@id='center_column']/p")).getText().contains("Please enter a search keyword")){
                TestBase.test.log(LogStatus.PASS, TestBase.driver.findElement(By.xpath("//*[@id='center_column']/p")).getText() +  "contains"+ "Please enter a search keyword");
                }
                else {
                    TestBase.test.log(LogStatus.FAIL, TestBase.driver.findElement(By.xpath("//*[@id='center_column']/p")).getText()
                            + " doesn't contain " + "Please enter a search keyword");
                }
             TestBase.test.log(LogStatus.INFO, TestBase.test.addScreenCapture(com.vsii.tsc.TSCSelenium06.DiuTTM.DataProvider.ExtentManager.CaptureScreen(TestBase.driver, "C:/Users/diuttm/workspace/Demo_testReport/report/SearchFail")));   
        }
        @Test(priority=1)
        public void SearchTrue(){
            TestBase.test = TestBase.extent.startTest("Contac Success", "Contac Success");
            TestBase.test.assignCategory("Category03");
            Search hp = new Search(driver);
            hp.search("blouse");
            String act= driver.findElement(By.xpath(".//*[@id='center_column']/ul/li/div/div[2]/h5/a")).getText();
            Assert.assertEquals(act, "Blouse");
            if (TestBase.driver.findElement(By.xpath("//*[@id='center_column']/p")).getText().contains("Blouse")){
                TestBase.test.log(LogStatus.PASS, TestBase.driver.findElement(By.xpath("//*[@id='center_column']/p")).getText() +  "contains"+ "Blouse");
                }
                else {
                    TestBase.test.log(LogStatus.FAIL, TestBase.driver.findElement(By.xpath("//*[@id='center_column']/p")).getText()
                            + " doesn't contain " + "Blouse");
                }
             TestBase.test.log(LogStatus.INFO, TestBase.test.addScreenCapture(com.vsii.tsc.TSCSelenium06.DiuTTM.DataProvider.ExtentManager.CaptureScreen(TestBase.driver, "C:/Users/diuttm/workspace/Demo_testReport/report/SearchTrue")));   
        
        }
}
