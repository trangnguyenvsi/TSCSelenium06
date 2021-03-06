package com.vsii.tsc.TSCSelenium06.lannt.PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
WebDriver driver;

@FindBy(xpath=".//*[@id='email']")
WebElement EmailAddress;

@FindBy(name="passwd")
WebElement Password;

@FindBy(name="SubmitLogin")
WebElement Login;

public Login(WebDriver driver)
{
this.driver=driver;	

//This initElements method will create all WebElements

PageFactory.initElements(driver, this);
}

public void setEmail(String StrEmail){
	EmailAddress.sendKeys(StrEmail);	
}
public void setPass(String StrPass){
	Password.sendKeys(StrPass);	
}
public void clickLoginBtn(){
	Login.click();	
}

public void login(String StrEmail, String StrPass){
	this.setEmail(StrEmail);
	this.setPass(StrPass);
	this.clickLoginBtn();
}
}
