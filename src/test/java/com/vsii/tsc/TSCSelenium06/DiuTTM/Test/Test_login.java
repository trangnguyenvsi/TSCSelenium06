package com.vsii.tsc.TSCSelenium06.DiuTTM.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.vsii.tsc.TSCSelenium06.DiuTTM.PagePatory.Homepage;
import com.vsii.tsc.TSCSelenium06.DiuTTM.PagePatory.Login_page;


public class Test_login {
   WebDriver driver;
    @BeforeClass
    
    public void setup(){
 
        FirefoxDriver driver = new FirefoxDriver();
        
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 
        driver.get("http://automationpractice.com/index.php");
 }
@Test
public void LoginSucc()
{	//Homepage hp2 = new Homepage(driver);
    //hp2.clickSignInBtn();
    
    //driver.findElement(By.xpath(".//*[@id='header']/div[2]/div/div/nav/div[1]/a")).click();
	Login_page lg = new Login_page(driver);
	lg.login("minhdiu.92@gmail.com","123123123");	
	String act = driver.findElement(By.xpath(".//*[@id='header']/div[2]/div/div/nav/div[2]/a")).getText();
    Assert.assertEquals(act,"Sign out");
}
//@Test(priority=1) 
public void testLoginFail(){
    Login_page lg = new Login_page(driver);
    lg.login("minhdiu.92@gmail.com","");
    String act=driver.findElement(By.xpath(".//*[@id='header']/div[2]/div/div/nav/div[2]/a")).getText();
    Assert.assertEquals(act,"Contact us");

}	
}
