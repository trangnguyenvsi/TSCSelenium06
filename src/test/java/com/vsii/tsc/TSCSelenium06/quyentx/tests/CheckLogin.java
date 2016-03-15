package com.vsii.tsc.TSCSelenium06.quyentx.tests;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.vsii.tsc.TSCSelenium06.quyentx.Pages.LoginPage;
import com.vsii.tsc.TSCSelenium06.quyentx.tests.TestBase;

public class CheckLogin extends TestBase{

	LoginPage login = new LoginPage();
	
	/* 
	Case 1: Login with invalid credentials
	Asserts test result by comparing ExpTitle and ActualTitle
	Expected title:  "Login - My Store" defined in TestData 
	*/
	@Test(dataProvider = "loginInvalid")
	public void loginInvalid(String expTitle, String email, String password){
		driver.get(baseURL + "index.php?controller=authentication");
		String actualTitle = "";
		actualTitle = driver.getTitle();
		login.setDriver(driver);
		login.login(expTitle, email, password);
		Assert.assertEquals(actualTitle, expTitle);
	}
	
	/* 
	Case 2: Login with valid credentials
	Asserts test result by comparing ExpTitle and ActualTitle
	Expected title:  "My account - My Store" defined in TestData 
	*/
	@Test(dataProvider = "loginValid")
	public void loginValid(String expTitle, String email, String password){
		driver.get(baseURL + "index.php?controller=authentication");
		String actualTitle = "";
		actualTitle = driver.getTitle();
		login.setDriver(driver);
		login.login(expTitle, email, password);
		Assert.assertEquals(actualTitle, expTitle);
	}
	@AfterTest
	public void afterTest(){
		System.out.println("Test login successfully.");
	}
}