package com.vsii.tsc.TSCSelenium06.lannt.Test;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.vsii.tsc.TSCSelenium06.lannt.PageFactory.Register;

public class RegisTest {
  
	WebDriver driver;
	Register objRegister;
    @BeforeClass
        
        public void setup(){
     
            driver = new FirefoxDriver();
            
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
     
            driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account#account-creation");
     }
	@Test
    public void testRegisPass(){
    	objRegister= new Register(driver); 
    	objRegister.register("Lan","Nguyen","","123456","Lan","Nguyen","HN","HN","Hawaii","00000","United States","0988929513","hihi@gmail.com");
    	driver.findElement(By.xpath(".//*[@id='header']/div[2]/div/div/nav/div[2]/a"));
    	Assert.assertEquals(driver.findElement(By.xpath(".//*[@id='header']/div[2]/div/div/nav/div[2]/a")).getText(),"Sign out");
	}
//	Test
	public void testRegisFail(){
    	objRegister= new Register(driver); 
    	objRegister.register("Lan","Nguyen","","123456","Lan","Nguyen","HN","HN","Hawaii","00000","United States","","hihi@gmail.com");
    	driver.findElement(By.xpath(".//*[@id='header']/div[2]/div/div/nav/div[2]/a"));
    	Assert.assertEquals(driver.findElement(By.xpath(".//*[@id='header']/div[2]/div/div/nav/div[2]/a")).getText(),"Contact us");
	}
    @AfterTest
    public void tearDown() throws Exception {
   		driver.quit();    
       
}	
	
	
}
