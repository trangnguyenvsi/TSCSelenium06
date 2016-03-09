package com.vsii.tsc.TSCSelenium06.lannt.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.vsii.tsc.TSCSelenium06.lannt.PageFactory.Login;

public class LoginTest {
	
	Login objLogin;
	WebDriver driver;
    @BeforeClass
        
        public void setup(){
     
            driver = new FirefoxDriver();
            
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
     
            driver.get("http://automationpractice.com/index.php?controller=my-account");
     }
	
    
//    @Test(priority=0) 
    public void testLoginSucc(){
    	objLogin = new Login(driver); 
    	objLogin.login("nguyenlan90.gt@gmail.com", "123456");
    	driver.findElement(By.xpath(".//*[@id='header']/div[2]/div/div/nav/div[2]/a"));
    	Assert.assertEquals(driver.findElement(By.xpath(".//*[@id='header']/div[2]/div/div/nav/div[2]/a")).getText(),"Sign out");
    }	
    @Test(priority=1) 
    public void testLoginFail(){
    	objLogin = new Login(driver); 
    	objLogin.login("nguyenlan90.gt@gmail.com", "");
    	driver.findElement(By.xpath(".//*[@id='header']/div[2]/div/div/nav/div[2]/a"));
    	Assert.assertEquals(driver.findElement(By.xpath(".//*[@id='header']/div[2]/div/div/nav/div[2]/a")).getText(),"Contact us");
    
    }
    
    
    @AfterTest
    public void tearDown() throws Exception {
   		driver.quit();    
       
}
}
