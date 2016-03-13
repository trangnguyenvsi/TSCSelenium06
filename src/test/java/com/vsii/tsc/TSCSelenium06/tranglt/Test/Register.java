package com.vsii.tsc.TSCSelenium06.tranglt.Test;

import com.vsii.tsc.TSCSelenium06.tranglt.Pages.Authentication;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Register extends TestBase {
	Authentication authen = new Authentication();

	// Case 3: register thanh cong, doc thong tin tu da driven
	// expect: thanh cong khi register xong co chu: Welcome to your account. Here you can manage all of your personal information and orders.
	@Test(priority=0,dataProvider = "dataRegisterSuccess")
	public void RegisterSuccess(String email, String customer_firstname, String customer_lastname, String passwd, String days,
			String months, String years, String firstname, String lastname, String company, String address1,
			String address2, String city, String id_state, String postcode, String id_country, String other,
			String phone, String phone_mobile, String alias) {
		driver.get(urlBase + "index.php?controller=authentication");
		authen.setDriver(driver);
		authen.preRegister(email);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		authen.Register(customer_firstname, customer_lastname, passwd, days, months, years, firstname, lastname,
				company, address1, address2, city, id_state, postcode, id_country, other, phone, phone_mobile, alias);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Assert.assertEquals(driver.findElement(By.xpath(".//*[@id='center_column']/p")).getText(),
				"Welcome to your account. Here you can manage all of your personal information and orders.");
		authen.clickLogout();
	}
	
	// Case 4: Register fail: du lieu lay tu data driven
	// Fail khi co thong bao loi
	@Test(priority=1, dataProvider = "dataRegisterFail")
	public void RegisterFail(String email, String customer_firstname, String customer_lastname, String passwd, String days,
			String months, String years, String firstname, String lastname, String company, String address1,
			String address2, String city, String id_state, String postcode, String id_country, String other,
			String phone, String phone_mobile, String alias) {
		driver.get(urlBase + "index.php?controller=authentication&back=my-account");
		authen.setDriver(driver);
		authen.preRegister(email);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		authen.Register(customer_firstname, customer_lastname, passwd, days, months, years, firstname, lastname,
				company, address1, address2, city, id_state, postcode, id_country, other, phone, phone_mobile, alias);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Assert.assertEquals(driver.findElement(By.xpath(".//*[@id='center_column']/p")).getText(),
				"Welcome to your account. Here you can manage all of your personal information and orders.");
	}

}
