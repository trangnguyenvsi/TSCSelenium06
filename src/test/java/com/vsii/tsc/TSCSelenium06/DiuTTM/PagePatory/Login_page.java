package com.vsii.tsc.TSCSelenium06.DiuTTM.PagePatory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_page{
WebDriver driver;

@FindBy(xpath=".//*[@id='email']")
WebElement EmailAddress;

@FindBy(name="passwd")
WebElement Password;

@FindBy(name="SubmitLogin")
WebElement Login;

@FindBy(xpath=".//*[@id='header']/div[2]/div/div/nav/div[1]/a")
WebElement SignIn;

public void clickSignInBtn()
{
            this.SignIn.click();        
}
public Login_page(WebDriver driver)
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
    this.clickSignInBtn();
    this.setEmail(StrEmail);
    this.setPass(StrPass);
    this.clickLoginBtn();
}
}
