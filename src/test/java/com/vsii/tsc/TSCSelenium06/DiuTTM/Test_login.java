package com.vsii.tsc.TSCSelenium06.DiuTTM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import PagePatory.Homepage;
import PagePatory.Login_page;


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
{	Homepage hp = new Homepage(driver);
	Login_page lg = new Login_page();
	hp.clickSignInBtn();
	
	lg.logintoLoGo("minhdiu.92@gmail.com","123123123");
	
	
}
	
}
