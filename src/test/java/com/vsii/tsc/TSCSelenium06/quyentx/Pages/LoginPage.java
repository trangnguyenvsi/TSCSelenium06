package com.vsii.tsc.TSCSelenium06.quyentx.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;

import com.vsii.tsc.TSCSelenium06.quyentx.tests.ReadData;
import com.vsii.tsc.TSCSelenium06.quyentx.tests.TestBase;

public class LoginPage extends TestBase{
	
	By userEmail = By.name("email");

	By userPwd = By.name("passwd");
	 
	By loginBtn =By.name("SubmitLogin");
	 
	public void Login(WebDriver driver){
	    	 
	        this.driver = driver;
	 
	}
	 
	public void setUserEmail(String strUserName){
		driver.findElement(userEmail).sendKeys(strUserName);
	    }
	 
	public void setUserPwd(String strPassword){
        driver.findElement(userPwd).sendKeys(strPassword);
	    }
	 
	public void clickLoginBtn(){
	    driver.findElement(loginBtn).click();
	    }
	
	public void login(String StrEmail, String StrPass){
		
		this.setUserEmail(StrEmail);
		this.setUserPwd(StrPass);
		this.clickLoginBtn();
	}
	
	@DataProvider(name = "login")
	public Object[][] loginData() {
		Object[][] arrayObject = ReadData.getExcelData("./sources/TestData.xls", "Login");
		return arrayObject;
	}

}