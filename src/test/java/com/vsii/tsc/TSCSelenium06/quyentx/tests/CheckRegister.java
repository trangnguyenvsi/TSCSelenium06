package com.vsii.tsc.TSCSelenium06.quyentx.tests;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.vsii.tsc.TSCSelenium06.quyentx.Pages.RegisterPage;

public class CheckRegister extends RegisterPage {

	@BeforeTest
	public void beforeTest() {
		driver.get(TestBase.baseURL + "controller=authentication&back=my-account");
	}

	@Test(dataProvider = "register")
	public void registerInvalid(String expTitle, String email1, String cusFName, String cusLName, String mail2,
			String pwd, String date, String mon, String yr, String recFName, String recLName, String recCom,
			String recAddr1, String recAddr2, String recCity, String recPcode, String recCountry, String recInfo,
			String recPhone1, String recPhone2, String recAlias) {

		String actualTitle = "";
		actualTitle = driver.getTitle();

		register(email1, cusFName, cusLName, mail2, pwd, date, mon, yr, recFName, recLName, recCom, recAddr1, recAddr2,
				recCity, recPcode, recCountry, recInfo, recPhone1, recPhone2, recAlias);

		Assert.assertEquals(actualTitle, expTitle);
	}

	@AfterTest
	public void afterTest() {
		System.out.println("Test register successfully.");
	}

	@DataProvider(name = "register")
	public Object[][] regData() {
		Object[][] arrayObject = ReadData.getExcelData("./sources/TestData.xls", "Register");
		return arrayObject;
	}

}
