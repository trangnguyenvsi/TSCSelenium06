package com.vsii.tsc.TSCSelenium06.DiuTTM.Test;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import com.vsii.tsc.TSCSelenium06.DiuTTM.PageFactory.Search;

public class Test_Search extends TestBase
{     
    WebDriver driver;
        @Test(priority=0)
        public void Searchwithoutinputdata(){
            Search hp = new Search(driver);
            hp.search("");
            String act= driver.findElement(By.xpath(".//*[@id='center_column']/p")).getText();
            Assert.assertEquals(act, "Please enter a search keyword");
        }
        @Test(priority=1)
        public void SearchTrue(){
            Search hp = new Search(driver);
            hp.search("blouse");
            String act= driver.findElement(By.xpath(".//*[@id='center_column']/ul/li/div/div[2]/h5/a")).getText();
            Assert.assertEquals(act, "Blouse");
        
        }
}
