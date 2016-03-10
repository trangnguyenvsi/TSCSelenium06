package com.vsii.tsc.TSCSelenium06.DiuTTM.Test;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import PagePatory.REgis_page;

public class Test_register
{
    WebDriver driver;
    REgis_page obj;
    @BeforeClass
        
        public void setup(){
     
            driver = new FirefoxDriver();
            
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
     
            driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account#account-creation");
     }
    //@Test
    public void testRegisPass(){
        obj= new REgis_page(driver);         
        obj.register("Diu","TRan","","123456","Diuttm","TTM","HN","HN","Hawaii","00000","United States","0564646","234234@gmail.com");
        driver.findElement(By.xpath(".//*[@id='header']/div[2]/div/div/nav/div[2]/a"));
        Assert.assertEquals(driver.findElement(By.xpath(".//*[@id='header']/div[2]/div/div/nav/div[2]/a")).getText(),"Sign out");
    }
 @Test
    public void testRegisFail(){
        obj= new REgis_page(driver);   
        obj.register("Diu","TRan","","123456","Diuttm","TTM","HN","HN","Hawaii","00000","United States","","234234@gmail.com");
        driver.findElement(By.xpath(".//*[@id='header']/div[2]/div/div/nav/div[2]/a"));
        Assert.assertEquals(driver.findElement(By.xpath(".//*[@id='header']/div[2]/div/div/nav/div[2]/a")).getText(),"Contact us");
    }
//    @AfterTest
//    public void tearDown() throws Exception {
//        driver.quit();    
//       
//}   
    
    
}

