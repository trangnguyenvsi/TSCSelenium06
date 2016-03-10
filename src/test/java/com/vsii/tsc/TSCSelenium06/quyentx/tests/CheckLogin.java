package com.vsii.tsc.TSCSelenium06.quyentx.tests;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.vsii.tsc.TSCSelenium06.quyentx.Pages.LoginPage;

public class CheckLogin extends LoginPage{
	
	@BeforeTest
	public void beforeTest()  {
        
    }
	
	@Test(dataProvider = "login")
	public void loginInvalid(String expTitle, String email, String password){
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		String actualTitle = "";
		actualTitle = driver.getTitle();
		
		login(email, password);
		
		Assert.assertEquals(actualTitle, expTitle);
	}
	
	
	@AfterTest
	public void afterTest(){
		System.out.println("Test login successfully.");
	}
	
}