package com.vsii.tsc.TSCSelenium06.quyentx.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	
	@FindBy(id = "email")
	WebElement userEmail;

	@FindBy(name = "passwd")
	WebElement userPwd;
	 
	@FindBy(name = "SubmitLogin")
	WebElement loginBtn;
	 
	public void setDriver(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void setUserEmail(String e){
		this.userEmail.sendKeys(e);
	    }
	 
	public void setUserPwd(String p){
        this.userPwd.sendKeys(p);
	    }
	 
	public void clickLoginBtn(){
	    this.loginBtn.click();
	    }
	
	public void login(String expTitle, String email, String password){
		
		setUserEmail(email);
		setUserPwd(password);
		clickLoginBtn();
	}
	
	public void login(){
		String e = "quyentx.test@gmail.com";
		String p = "testP@ss";
		setUserEmail(e);
		setUserPwd(p);
		clickLoginBtn();
	}
	


}