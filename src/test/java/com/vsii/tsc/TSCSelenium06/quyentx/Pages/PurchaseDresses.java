package com.vsii.tsc.TSCSelenium06.quyentx.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PurchaseDresses {

	WebDriver driver;
	
//	@FindBy(xpath = "html/body/div[1]/div[1]/header/div[3]/div/div/div[6]/ul/li[1]/ul")
//	WebElement  Menuwomen;
//	
//	@FindBy(id = "layered_category_8")
//	WebElement Category;	
//	
//	@FindBy(id = "layered_id_attribute_group_13")
//	WebElement OrangeColor;
//	
//	@FindBy(id ="layered_id_feature_1")
//	WebElement PolyComposition;
//	
//	@FindBy(id = "layered_id_feature_13")
//	WebElement StyleGirly;
//	
//	@FindBy(id = "layered_id_feature_19")
//	WebElement PropertiesShort;
	
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
	
	@FindBy(name = "processAddress")
	WebElement processAddress;
	
	@FindBy(id = "cgv")
	WebElement termOfService;
	
	@FindBy(name = "processCarrier")
	WebElement processCarrier;
	
	@FindBy(linkText = "Pay by check.")
	WebElement payByCheck;
	
	@FindBy(linkText = "processAddress")
	WebElement confirmPayment;
	
	public void setDriver(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//Executing purchase
	public void purchaseDress(){
//		clickMenuWomen();
//		clickCategory();
//		clickColor();
//		clickComposition();
//		clickStyle();
//		clickProperty();
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
//	public void clickMenuWomen(){
//	    this.Menuwomen.click();
//	    }
	
//	public void clickCategory(){
//	    this.Category.click();
//	    }
//	
//	public void clickColor(){
//	    this.OrangeColor.click();
//	    }
//	
//	public void clickComposition(){
//	    this.PolyComposition.click();
//	    }
//	
//	public void clickStyle(){
//	    this.StyleGirly.click();
//	    }
//	
//	public void clickProperty(){
//	    this.PropertiesShort.click();
//	    }
	
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
