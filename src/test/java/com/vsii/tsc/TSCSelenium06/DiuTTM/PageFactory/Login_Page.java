package com.vsii.tsc.TSCSelenium06.DiuTTM.PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page
{   
    WebDriver driver;

    @FindBy(id = "email")
    WebElement email;

    @FindBy(id = "passwd")
    WebElement passwd;

    @FindBy(id = "SubmitLogin")
    WebElement SubmitLogin;
    
    @FindBy(xpath=".//*[@class='logout']")
    WebElement logout;

    public void Login_Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void setEmail(String email) {
        this.email.sendKeys(email);
    }

    public void setPasswd(String passwd) {
        this.passwd.sendKeys(passwd);
    }

    public void clickSubmitLogin() {
        this.SubmitLogin.click();
    }
    public void Login(String email,String passwd) {
        setEmail(email);
        setPasswd(passwd);
        clickSubmitLogin();
    }
    
    public void clickLogout() {
        this.logout.click();
        
    }
}
