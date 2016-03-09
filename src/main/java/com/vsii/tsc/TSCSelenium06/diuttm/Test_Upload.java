package com.vsii.tsc.TSCSelenium06.diuttm;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Test_Upload
{
    WebDriver driver;
 TestBase tb= new TestBase();
//    @BeforeClass
//    
//    public void setup(){
// 
//        driver = new FirefoxDriver();
//        
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
// 
//        driver.get("http://automationpractice.com/index.php");
// }
  @Test(priority=0)
    public void UploadSucc() throws AWTException{
       ContactUs ct = new ContactUs(driver);
       Homepage hp = new Homepage(driver);
      hp.clickCtusBtn();
        ct.sendEmail("Customer service", "minhdiu.92@gmail.com","123", "Thank you so much");               
        String act= driver.findElement(By.xpath("//*[@id='center_column']/p")).getText();
        Assert.assertEquals(act,"Your message has been successfully sent to our team.");
    }
   @Test(priority=1)
    public void UploadFail() throws AWTException{
       Homepage hp = new Homepage(driver);
       ContactUs ct = new ContactUs(driver);
       hp.clickCtusBtn(); 
        ct.sendEmail("Customer service","","","");               
        String act= driver.findElement(By.xpath("//*[@id='center_column']/div/p")).getText();
        Assert.assertEquals(act,"There is 1 error");     
    }
    
    
}
