package com.vsii.tsc.TSCSelenium06.DiuTTM.Test;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import PagePatory.Homepage;

public class Test_Newletters
{
    WebDriver driver;
    @BeforeClass
    
    public void setup(){
 
        driver = new FirefoxDriver();
        
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 
        driver.get("http://automationpractice.com/index.php");
 }

    @Test(priority=0)
    public void sendLetterSucc() throws AWTException {       
       Homepage hp = new Homepage(driver);
      hp.sendLetter("minhdiu.92@gmail.com");        
    }
}
