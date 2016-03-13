package com.vsii.tsc.TSCSelenium06.tranglt.Test;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.vsii.tsc.TSCSelenium06.tranglt.Pages.Authentication;

public class Login extends TestBase {
	TestBase testBase=new TestBase();
	Authentication authen = new Authentication();

	// Case1: Login successfully, expect: sau khi dang nhap thanh cong co chu: 
	// Welcome to your account. Here you can manage all of your personal information and orders.
	@Test(priority=1,dataProvider = "LoginSucc")
	public void LoginSuccess(String email, String passwd) {
		driver.get(urlBase + "index.php?controller=authentication");
		authen.setDriver(driver);
		authen.Login(email, passwd);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Assert.assertEquals(driver.findElement(By.xpath(".//*[@id='center_column']/p")).getText(),
				"Welcome to your account. Here you can manage all of your personal information and orders.");
		driver.get(urlBase + "/index.php?mylogout=");;
	}

	// Case2: Login fail, Cac case sai lay tu data driven
	// Expect sai khi login xong van o lai trang: http://automationpractice.com/index.php?controller=authentication
	@Test(priority=0,dataProvider = "LoginFail")
	public void LoginFail(String email, String passwd) {
		driver.get(urlBase + "index.php?controller=authentication");
		authen.setDriver(driver);
		authen.Login(email, passwd);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Assert.assertEquals(driver.getCurrentUrl(),
				"http://automationpractice.com/index.php?controller=authentication");
	}
}
