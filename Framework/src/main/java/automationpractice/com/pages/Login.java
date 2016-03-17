package automationpractice.com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login {
	//element: email address
	@FindBy(name ="email")
	private WebElement Email_txt;
	
	//element: password
	@FindBy(name = "passwd")
	private WebElement pass_txt;
	
	//element: button
	@FindBy(id = "SubmitLogin")
	private WebElement SighIn_btn;
	
	//element: alert
	@FindBy(xpath = "//*[@id='center_column']/div[1]/p")				
	private WebElement alert_lbl;
	
	//element: error msg content
	@FindBy(xpath = "//*[@id='center_column']/div[1]/ol/li")
	private WebElement ErrorMsg_lbl;	

	@FindBy(xpath = "//*[@id='center_column']/h1")
	private WebElement titleLogin_lbl;

	public WebElement getEmail_txt() {
		return Email_txt;
	}

	public void setEmail_txt(WebElement email_txt) {
		Email_txt = email_txt;
	}

	public WebElement getPass_txt() {
		return pass_txt;
	}

	public void setPass_txt(WebElement pass_txt) {
		this.pass_txt = pass_txt;
	}

	public WebElement getSighIn_btn() {
		return SighIn_btn;
	}

	public void setSighIn_btn(WebElement sighIn_btn) {
		SighIn_btn = sighIn_btn;
	}

	public WebElement getAlert_lbl() {
		return alert_lbl;
	}

	public void setAlert_lbl(WebElement alert_lbl) {
		this.alert_lbl = alert_lbl;
	}

	public WebElement getErrorMsg_lbl() {
		return ErrorMsg_lbl;
	}

	public void setErrorMsg_lbl(WebElement errorMsg_lbl) {
		ErrorMsg_lbl = errorMsg_lbl;
	}

	public WebElement getTitleLogin_lbl() {
		return titleLogin_lbl;
	}

	public void setTitleLogin_lbl(WebElement titleLogin_lbl) {
		this.titleLogin_lbl = titleLogin_lbl;
	}
	
}
