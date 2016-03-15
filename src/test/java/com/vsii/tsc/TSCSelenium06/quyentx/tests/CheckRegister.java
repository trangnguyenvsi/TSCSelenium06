package com.vsii.tsc.TSCSelenium06.quyentx.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import com.vsii.tsc.TSCSelenium06.quyentx.Pages.RegisterPage;

public class CheckRegister extends TestBase {
	TestBase tb=new TestBase();
	RegisterPage reg = new RegisterPage();
	
	/* 
	Case 1: Register with invalid credentials
	Asserts test result by comparing ExpTitle and ActualTitle
	Expected title:  "Login - My Store" defined in TestData 
	*/
	@Test(dataProvider = "registerInvalid")
	public void registerInvalid (String expTitle, String email1, String cusFName, String cusLName, String mail2,
			String pwd, String date, String mon, String yr, String recFName, String recLName, String recCom,
			String recAddr1, String recAddr2, String recCity, String recPcode, String recCountry, String recInfo,
			String recPhone1, String recPhone2, String recAlias) {
		
		driver.get(baseURL);
		driver.findElement(By.linkText("Sign in")).click();
		
		String actualTitle = "";
		actualTitle = driver.getTitle();
		
		reg.setDriver(driver);
		reg.register(expTitle, email1, cusFName, cusLName, mail2, pwd, date, mon, yr, recFName, recLName, recCom, recAddr1, recAddr2,
				recCity, recPcode, recCountry, recInfo, recPhone1, recPhone2, recAlias);
		Assert.assertEquals(actualTitle, expTitle);
	}


	/* 
	Case 2: Register with valid credentials
	Asserts test result by comparing ExpTitle and ActualTitle
	Expected title:  "My account - My Store" defined in TestData 
	*/
	@Test(dataProvider = "registerValid")
	public void registerValid (String expTitle, String email1, String cusFName, String cusLName, String mail2,
			String pwd, String date, String mon, String yr, String recFName, String recLName, String recCom,
			String recAddr1, String recAddr2, String recCity, String recPcode, String recCountry, String recInfo,
			String recPhone1, String recPhone2, String recAlias) {
		
		driver.get(baseURL);
		driver.findElement(By.linkText("Sign in")).click();
		
		String actualTitle = "";
		actualTitle = driver.getTitle();
		reg.setDriver(driver);
		
		reg.register(expTitle, email1, cusFName, cusLName, mail2, pwd, date, mon, yr, recFName, recLName, recCom, recAddr1, recAddr2,
				recCity, recPcode, recCountry, recInfo, recPhone1, recPhone2, recAlias);
		Assert.assertEquals(actualTitle, expTitle);
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("Test register successfully.");
	}
}
