package com.vsii.tsc.TSCSelenium06.quyentx.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class RegisterPage {
	
	WebDriver driver;
	
	@FindBy(name = "email_create")
	WebElement email3;
	
	@FindBy(name = "SubmitCreate")
	WebElement emailSubmit;
	
	@FindBy(id = "id_gender1")
	WebElement gender1;
	
	@FindBy(id = "id_gender2")
	WebElement gender2;
	
	@FindBy(id = "customer_firstname")
	WebElement customerFName;
	
	@FindBy(id = "customer_lastname")
	WebElement customerLName;
	
	@FindBy(name = "email")
	WebElement email2;
	
	@FindBy(id = "passwd")
	WebElement passwd;
	
	@FindBy(id = "days")
	WebElement day;
	
	@FindBy(id = "months")
	WebElement months;

	@FindBy(id = "years")
	WebElement years;
	
	@FindBy(id = "newsletter")
	WebElement signNewsletter;
	
	@FindBy(id = "optin")
	WebElement signOffer;
	
	@FindBy(id = "firstname")
	WebElement receiverFname;
	
	@FindBy(id = "lastname")
	WebElement receiverLName;
	
	@FindBy(id = "company")
	WebElement receiverCom;
	
	@FindBy(id = "address1")
	WebElement receiverAddr1;

	@FindBy(id = "address2")
	WebElement receiverAddr2;

	@FindBy(id = "city")
	WebElement receiverCity;
	
	@FindBy(id = "id_state")
	WebElement receiverState;
	
	@FindBy(id = "postcode")
	WebElement receiverPostcode;
	
	@FindBy(id = "id_country")
	WebElement receiverCountry;
	
	@FindBy(id = "other")
	WebElement receiverInfo;
	
	@FindBy(id = "phone")
	WebElement receiverPhone1;
	
	@FindBy(id = "phone_mobile")
	WebElement receiverPhone2;
	
	@FindBy(id = "alias")
	WebElement receiverAlias;
	
	@FindBy(id = "submitAccount")
	WebElement regBtn;
	
	//PageFactory init element
	public void setDriver(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	// Case execution
	public void register(String expTitle, String email1, String cusFName, String cusLName, String mail2, String pwd, String date,
			String mon, String yr, String recFName, String recLName, String recCom, String recAddr1, String recAddr2,
			String recCity, String recPcode, String recCountry, String recInfo, String recPhone1, String recPhone2,
			String recAlias) {
		setEmail1(email1);
		clickCreate();
		selectTitleMr();
		setCustomerFirstName(cusFName);
		setCustomerLName(cusLName);
//		setCustomerEmail(mail2);
		setPassword(pwd);
		setPassword(pwd);
		setDate(date);
		setMonth(mon);
		setYear(yr);

		signupNewsletter();
		signOffer();

		setReceiverFname(recFName);
		setReceiverLName(recLName);
		setReceiverCom(recCom);
		setRecAddr2(recAddr2);
		setRecAddr2(recAddr2);
		setCity(recCity);
		setPostcode(recPcode);
		setCountry(recCountry);
		setInfo(recInfo);
		setPhone1(recPhone1);
		setPhone2(recPhone2);
		setAlias(recAlias);
		clickRegister();
	}

	//Action list
	public void setEmail1(String email1) {
		this.email3.sendKeys(email1);
	}

	public void clickCreate() {
		this.emailSubmit.click();
	}

	public void selectTitleMr() {
			this.gender1.click();
	}

	public void selectTitleMrs(){
		
	}
	
	public void setCustomerFirstName(String cusFName) {
		this.customerFName.sendKeys(cusFName);
	}

	public void setCustomerLName(String cusLName) {
		this.customerLName.sendKeys(cusLName);
	}

//	public void setCustomerEmail(String mail2) {
//		this.email2.sendKeys(mail2);
//	}

	public void setPassword(String pwd) {
		this.passwd.sendKeys(pwd);
	}

	public void setDate(String date) {
		new Select(this.day).selectByVisibleText(date);
	}

	public void setMonth(String mon) {
		new Select(this.months).selectByVisibleText(mon);
	}

	public void setYear(String yr) {
		new Select(this.years).selectByVisibleText(yr);
	}

	public void signupNewsletter() {
		this.signNewsletter.click();
	}

	public void signOffer() {
		this.signOffer.click();
	}

	public void setReceiverFname(String recFName) {
		this.receiverFname.sendKeys(recFName);
	}

	public void setReceiverLName(String recLName) {
		this.receiverLName.sendKeys(recLName);
	}

	public void setReceiverCom(String recCom) {
		this.receiverCom.sendKeys(recCom);
	}

	public void setRecAddr1(String recAddr1) {
		this.receiverAddr1.sendKeys(recAddr1);
	}

	public void setRecAddr2(String recAddr2) {
		this.receiverAddr2.sendKeys(recAddr2);
	}

	public void setCity(String recCity) {
		this.receiverCity.sendKeys(recCity);
	}

	public void setState(String recState) {
		this.receiverState.sendKeys(recState);
	}

	public void setPostcode(String recPcode) {
		this.receiverPostcode.sendKeys(recPcode);
	}

	public void setCountry(String recCountry) {
		this.receiverCountry.sendKeys(recCountry);
	}

	public void setInfo(String recInfo) {
		this.receiverInfo.sendKeys(recInfo);
	}

	public void setPhone1(String recPhone1) {
		this.receiverPhone1.sendKeys(recPhone1);
	}

	public void setPhone2(String recPhone2) {
		this.receiverPhone2.sendKeys(recPhone2);
	}

	public void setAlias(String recAlias) {
		this.receiverAlias.sendKeys(recAlias);
	}

	public void clickRegister() {
		this.regBtn.click();
	}

}
