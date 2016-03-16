package com.vsii.tsc.TSCSelenium06.DiuTTM.Test;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.vsii.tsc.TSCSelenium06.DiuTTM.PageFactory.ContactUs;

public class Test_Contus  extends TestBase
{
    WebDriver driver;
    ContactUs ct;
    @BeforeMethod
    public void OpenPage(){
        TestBase.driver.get(urlBase +"index.php?controller=contact");  
        
    }
  @Test(priority=1)
    public void UploadSucc() throws AWTException{    
      ct = new ContactUs(TestBase.driver);
        ct.sendEmail("Customer service", "minhdiu.92@gmail.com","123", "Thank you so much");
        String act= driver.findElement(By.xpath("//*[@id='center_column']/p")).getText();
        Assert.assertEquals(act,"Your message has been successfully sent to our team.");
    }
   @Test(priority=0)
    public void UploadFail() throws AWTException{ 
       ct = new ContactUs(TestBase.driver);
        ct.sendEmail("Customer service","","","");               
        String act= driver.findElement(By.xpath("//*[@id='center_column']/div/p")).getText();
        Assert.assertEquals(act,"There is 1 error");     
    }
    
    
}
