package com.vsii.tsc.TSCSelenium06.lannt.Test;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.vsii.tsc.TSCSelenium06.lannt.PageFactory.Search;

public class SearchTest {
 
	 WebDriver driver;
	    @BeforeClass
	        
	        public void setup(){
	     
	            driver = new FirefoxDriver();
	            
	            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	     
	            driver.get("http://automationpractice.com/index.php");
	     }
	  
	        @Test(priority=0)
	        public void SearchWithoutData(){
	            Search s = new Search(driver);
	            s.search("");
	            String str= driver.findElement(By.xpath(".//*[@id='center_column']/p")).getText();
	            Assert.assertEquals(str, "Please enter a search keyword");
	        }
	        @Test(priority=1)
	        public void SearchWithData(){
	            Search s = new Search(driver);
	            s.search("blouse");
	            String str= driver.findElement(By.xpath(".//*[@id='center_column']/ul/li/div/div[2]/h5/a")).getText();
	            Assert.assertEquals(str, "Blouse");
	        }
	            
	      @AfterTest
	         public void tearDown() throws Exception {
	        		driver.quit();    
	            
}
}
