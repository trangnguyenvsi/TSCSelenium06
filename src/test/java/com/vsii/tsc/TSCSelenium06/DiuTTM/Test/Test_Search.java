package com.vsii.tsc.TSCSelenium06.DiuTTM.Test;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import PagePatory.Homepage;

public class Test_Search
{     
    WebDriver driver;
    @BeforeClass
        
        public void setup(){
     
            driver = new FirefoxDriver();
            
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
     
            driver.get("http://automationpractice.com/index.php");
     }
  
        @Test(priority=0)
        public void Searchwithoutinputdata(){
            Homepage hp = new Homepage(driver);
            hp.search("");
            String act= driver.findElement(By.xpath(".//*[@id='center_column']/p")).getText();
            Assert.assertEquals(act, "Please enter a search keyword");
        }
        @Test(priority=1)
        public void SearchTrue(){
            Homepage hp = new Homepage(driver);
            hp.search("blouse");
            String act= driver.findElement(By.xpath(".//*[@id='center_column']/ul/li/div/div[2]/h5/a")).getText();
            Assert.assertEquals(act, "Blouse");
        
        }
}
