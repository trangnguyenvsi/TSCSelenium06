package PagePatory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_page {
WebDriver driver;
@FindBy(id="email")
WebElement Email;

@FindBy(id="passwd")
WebElement Pass;

@FindBy(id="SubmitLogin")
WebElement Login_Btn;

public void Login(WebDriver driver){
	 
   this.driver = driver;

    //This initElements method will create all WebElements

    PageFactory.initElements(driver, this);
}
public void setEmail(String StrEmail){
	Email.sendKeys(StrEmail);	
}
public void setPass(String StrPass){
	Pass.sendKeys(StrPass);	
}
public void clickLoginBtn(){
	Login_Btn.click();	
}

public void logintoLoGo(String StrEmail,String StrPass){

	this.setEmail(StrEmail);
	this.setPass(StrPass);
	this.clickLoginBtn();	
}







	
	
	
	
}
