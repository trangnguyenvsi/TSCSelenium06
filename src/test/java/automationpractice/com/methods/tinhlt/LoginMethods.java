package automationpractice.com.methods.tinhlt;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import automationpractice.com.pages.tinhlt.Login;

public class LoginMethods {
	Login lgObj = new Login();
	WebDriver driver;
	//initial pagefactory model
	public LoginMethods(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, lgObj);		
	}
	
	
	public String getLoginTitle()
	{
		String titleLogin = lgObj.getTitleLogin_lbl().getText();
		return titleLogin;
		
	}
	public String getAlertText() {
		
		String AlertText = lgObj.getAlert_lbl().getText();
		return AlertText;
	}
	public String getErrorContent() {
	
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='center_column']/div[1]/ol/li")));
		String errContent = lgObj.getErrorMsg_lbl().getText();
		return errContent;	
	}
	
	//clear textbox
	public void clearInfo()
	{
		lgObj.getEmail_txt().clear();
		lgObj.getPass_txt().clear();
	}
	//input user+pass
	public void InputInfo(String user, String pass)
	{
			lgObj.getPass_txt().sendKeys(pass);		
			lgObj.getEmail_txt().sendKeys(user);		
		
	}
	public void clickLoginBtn()
	{
		
		lgObj.getSighIn_btn().click();
	}
	
}
