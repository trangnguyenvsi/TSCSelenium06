package com.vsii.tsc.TSCSelenium06.lannt.PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCart {

	WebDriver driver;
	
	@FindBy (xpath=".//*[@id='home-page-tabs']/li[1]/a")
	WebElement Popular;
	
	@FindBy (xpath=".//*[@id='homefeatured']/li[2]/div/div[2]/div[2]/a[1]/span")
	WebElement AddToCartIT1;
	
	@FindBy (xpath=".//*[@id='homefeatured']/li[3]/div/div[2]/div[2]/a[1]/span")
	WebElement AddToCartIT2;
	
	@FindBy ()
	WebElement acb;
	
	public ShoppingCart(){
		
	}
	public void checkCart(){
			
		
	}
	
}
