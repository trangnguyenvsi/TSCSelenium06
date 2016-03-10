package com.vsii.tsc.TSCSelenium06.quyentx.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import com.vsii.tsc.TSCSelenium06.quyentx.tests.TestBase;

public class RegisterPage extends TestBase {

	By email3 = By.name("email_create");
	By emailSubmit = By.name("SubmitCreate");
	By gender = By.id("id_gender1");
	By customerFName = By.id("customer_firstname");
	By customerLName = By.id("customer_lastname");
	By email2 = By.name("email");
	By passwd = By.id("passwd");
	By day = By.id("days");
	By months = By.id("months");
	By years = By.id("years");
	By signNewsletter = By.id("newsletter");
	By signOffer = By.id("optin");
	By receiverFname = By.id("firstname");
	By receiverLName = By.id("lastname");
	By receiverCom = By.id("company");
	By receiverAddr1 = By.id("address1");
	By receiverAddr2 = By.id("address2");
	By receiverCity = By.id("city");
	By receiverState = By.id("id_state");
	By receiverPostcode = By.id("postcode");
	By receiverCountry = By.id("id_country");
	By receiverInfo = By.id("other");
	By receiverPhone1 = By.id("phone");
	By receiverPhone2 = By.id("phone_mobile");
	By receiverAlias = By.id("alias");
	By regBtn = By.id("submitAccount");

//	public void Register(WebDriver driver) {
//
//		this.driver = driver;
//
//	}
	
	// Case execution
	public void register(String email1, String cusFName, String cusLName, String mail2, String pwd, String date,
			String mon, String yr, String recFName, String recLName, String recCom, String recAddr1, String recAddr2,
			String recCity, String recPcode, String recCountry, String recInfo, String recPhone1, String recPhone2,
			String recAlias) {
		this.setEmail1(email1);
		this.clickCreate();
		this.setCustomerFirstName(cusFName);
		this.setCustomerLName(cusLName);
		this.setCustomerEmail(mail2);
		this.setPassword(pwd);
		this.setPassword(pwd);
		this.setDate(date);
		this.setMonth(mon);
		this.setYear(yr);

		this.signupNewsletter();
		this.signOffer();

		this.setReceiverFname(recFName);
		this.setReceiverLName(recLName);
		this.setReceiverCom(recCom);
		this.setRecAddr2(recAddr2);
		this.setRecAddr2(recAddr2);
		this.setCity(recCity);
		this.setPostcode(recPcode);
		this.setCountry(recCountry);
		this.setInfo(recInfo);
		this.setPhone1(recPhone1);
		this.setPhone2(recPhone2);
		this.setAlias(recAlias);
		this.clickRegister();
	}

	//Action list
	public void setEmail1(String email1) {
		driver.findElement(email3).sendKeys(email1);
	}

	public void clickCreate() {
		driver.findElement(emailSubmit).click();
	}

	public void selectTitle() {
		driver.findElement(gender).click();
	}

	public void setCustomerFirstName(String cusFName) {
		driver.findElement(customerFName).sendKeys(cusFName);
	}

	public void setCustomerLName(String cusLName) {
		driver.findElement(customerLName).sendKeys(cusLName);
	}

	public void setCustomerEmail(String mail2) {
		driver.findElement(email2).sendKeys(mail2);
	}

	public void setPassword(String pwd) {
		driver.findElement(passwd).sendKeys(pwd);
	}

	public void setDate(String date) {
		new Select(driver.findElement(day)).selectByVisibleText(date);
	}

	public void setMonth(String mon) {
		new Select(driver.findElement(months)).selectByVisibleText(mon);
	}

	public void setYear(String yr) {
		new Select(driver.findElement(years)).selectByVisibleText(yr);
	}

	public void signupNewsletter() {
		driver.findElement(signNewsletter).click();
	}

	public void signOffer() {
		driver.findElement(signOffer).click();
	}

	public void setReceiverFname(String recFName) {
		driver.findElement(receiverFname).sendKeys(recFName);
	}

	public void setReceiverLName(String recLName) {
		driver.findElement(receiverLName).sendKeys(recLName);
	}

	public void setReceiverCom(String recCom) {
		driver.findElement(receiverCom).sendKeys(recCom);
	}

	public void setRecAddr1(String recAddr1) {
		driver.findElement(receiverAddr1).sendKeys(recAddr1);
	}

	public void setRecAddr2(String recAddr2) {
		driver.findElement(receiverAddr2).sendKeys(recAddr2);
	}

	public void setCity(String recCity) {
		driver.findElement(receiverCity).sendKeys(recCity);
	}

	public void setState(String recState) {
		driver.findElement(receiverState).sendKeys(recState);
	}

	public void setPostcode(String recPcode) {
		driver.findElement(receiverPostcode).sendKeys(recPcode);
	}

	public void setCountry(String recCountry) {
		driver.findElement(receiverCountry).sendKeys(recCountry);
	}

	public void setInfo(String recInfo) {
		driver.findElement(receiverInfo).sendKeys(recInfo);
	}

	public void setPhone1(String recPhone1) {
		driver.findElement(receiverPhone1).sendKeys(recPhone1);
	}

	public void setPhone2(String recPhone2) {
		driver.findElement(receiverPhone2).sendKeys(recPhone2);
	}

	public void setAlias(String recAlias) {
		driver.findElement(receiverAlias).sendKeys(recAlias);
	}

	public void clickRegister() {
		driver.findElement(regBtn).click();
	}

}
