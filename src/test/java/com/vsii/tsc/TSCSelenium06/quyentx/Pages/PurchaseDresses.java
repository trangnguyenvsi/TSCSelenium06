package com.vsii.tsc.TSCSelenium06.quyentx.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PurchaseDresses {

	WebDriver driver;
	
	@FindBy(id = "selectProductSort")
	WebElement SortBy;
	
	@FindBy(linkText = "List")
	WebElement List;
	
	@FindBy(linkText = "Printed Dress")
	WebElement printedDress;
	
	@FindBy(name = "Submit")
	WebElement AddToCart;
	
	@FindBy(linkText = "Proceed to checkout")
	WebElement checkOut1;
	
	@FindBy(linkText = "Proceed to checkout")
	WebElement checkOut2;
	
	@FindBy(xpath = "html/body/div[1]/div[2]/div/div[3]/div/form/p/button")
	WebElement processAddress;
	
	@FindBy(id = "cgv")
	WebElement termOfService;
	
	@FindBy(xpath = "html/body/div[1]/div[2]/div/div[3]/div/div/form/p/button")
	WebElement processCarrier;
	
	@FindBy(xpath = "html/body/div[1]/div[2]/div/div[3]/div/div/div[3]/div[2]/div/p/a")
	WebElement payByCheck;
	
	@FindBy(xpath = "html/body/div[1]/div[2]/div/div[3]/div/form/p/button")
	WebElement confirmPayment;
	
	public void setDriver(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//Executing purchase
	public void purchaseDress(){
		clickSort();
		clickList();
		chooseDress();
		AddToCart();
		CheckOut1();
		CheckOut2();
		processAddress();
		clickTerm();
		processCarrier();
		payByChek();
		confirmPayment();
	}
	
	//List of actions
	public void clickSort(){
	    this.SortBy.click();
	    }
	
	public void clickList(){
		this.List.click();
	}
	
	public void chooseDress(){
		this.printedDress.click();
	}
	
	public void AddToCart(){
		this.AddToCart.click();
	}
	
	public void CheckOut1(){
		this.checkOut1.click();
	}
	
	public void CheckOut2(){
		this.checkOut1.click();
	}
	
	public void processAddress(){
		this.processAddress.click();
	}
	
	public void clickTerm(){
		this.termOfService.click();
	}
	
	public void processCarrier(){
		this.processCarrier.click();
	}
	
	public void payByChek(){
		this.payByCheck.click();
	}
	
	public void confirmPayment(){
		this.confirmPayment.click();
	}
	

}
