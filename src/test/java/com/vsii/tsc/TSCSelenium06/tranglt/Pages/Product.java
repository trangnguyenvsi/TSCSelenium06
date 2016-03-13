package com.vsii.tsc.TSCSelenium06.tranglt.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Product {
	WebDriver driver;
	private String productName;
	private String productAttributes;
	private int productQuantity;
	private String productPrice;
	private String productShipping;

	
	@FindBy(id="layer_cart_product_title")
	WebElement productNameWeb;
	
	@FindBy(id="layer_cart_product_attributes")
	WebElement productAttributesWeb;
	
	@FindBy(id="layer_cart_product_quantity")
	WebElement productQuantityWeb;
	
	@FindBy(id="layer_cart_product_price")
	WebElement productPriceWeb;
	
	@FindBy(xpath = ".//*[@class='ajax_cart_shipping_cost']")
	WebElement productShippingWeb;
	
	@FindBy(xpath=".//*[@title='Close window']")
	WebElement closeButt;

	public void close() {
		this.closeButt.click();
	}
	
	public void setDriver(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public String getProductNameWeb() {
		return this.productNameWeb.getText();
	}

	public String getProductAttributesWeb() {
		return this.productAttributesWeb.getText();
	}

	public int getProductQuantityWeb() {
		String numb=this.productQuantityWeb.getText();
		if (numb.equals(""))
			return 0;
		else
		return Integer.parseInt(this.productQuantityWeb.getText());
	}

	public String getProductPriceWeb() {
		return this.productPriceWeb.getText();
	}

	public String getProductShippingWeb() {
		return this.productShippingWeb.getText();
	}

	public void setProductName() {
		this.productName = getProductNameWeb();
	}

	public void setProductAttributes() {
		this.productAttributes = getProductAttributesWeb();
	}

	public void setProductQuantity() {
		this.productQuantity = getProductQuantityWeb();
	}

	public void setProductPrice() {
		this.productPrice = getProductPriceWeb();
	}

	public void setProductShipping() {
		this.productShipping = getProductShippingWeb();
	}

	public String getProductName() {
		return productName;
	}

	public String getProductAttributes() {
		return productAttributes;
	}

	public int getProductQuantity() {
		return productQuantity;
	}

	public String getProductPrice() {
		return productPrice;
	}

	public String getProductShipping() {
		return productShipping;
	}
	
	public Product getProduct1Info(Product product) {
		product.setProductName();
		product.setProductAttributes();
		product.setProductQuantity();
		product.setProductPrice();
		product.setProductShipping();
		return product;
	}
	
}
