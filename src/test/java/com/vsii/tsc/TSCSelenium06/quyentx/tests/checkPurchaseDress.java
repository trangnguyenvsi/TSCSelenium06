package com.vsii.tsc.TSCSelenium06.quyentx.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.vsii.tsc.TSCSelenium06.quyentx.Pages.LoginPage;
import com.vsii.tsc.TSCSelenium06.quyentx.Pages.PurchaseDresses;

public class checkPurchaseDress extends TestBase{
	TestBase tb=new TestBase();
	LoginPage login = new LoginPage();
	PurchaseDresses pd = new PurchaseDresses();
	
	@Test
	public void purchaseDressValid() {
		
		pd.setDriver(driver);
		pd.purchaseDress();
		Assert.assertEquals(driver.findElement(By.xpath("html/body/div[1]/div[2]/div/div[3]/div/h1")).getText(),
				"ORDER CONFIRMATION");
	}
	
	@BeforeTest
	public void preTest(){
		driver.get(baseURL);
		driver.findElement(By.linkText("Sign in")).click();
		login.setDriver(driver);
		login.login();
		driver.get("http://automationpractice.com/index.php?id_category=3&controller=category");
	}

	
}
