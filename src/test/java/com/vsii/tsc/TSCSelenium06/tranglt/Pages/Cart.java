package com.vsii.tsc.TSCSelenium06.tranglt.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cart {
	WebDriver driver;
	//Product product1 = new Product();
//	Product product2 = new Product();
//	Product product3 = new Product();

	@FindBy(xpath = ".//*[@id='homefeatured']/li[2]/div")
	WebElement frameProduct1;
	
	@FindBy(xpath = ".//*[@id='homefeatured']/li[3]/div")
	WebElement frameProduct2;
	
	@FindBy(xpath = ".//*[@id='homefeatured']/li[4]/div")
	WebElement frameProduct3;

	@FindBy(xpath = ".//*[@id='homefeatured']/li/div/div/div/a[@data-id-product='2']")
	WebElement addProduct1;

	@FindBy(xpath = ".//*[@id='homefeatured']/li/div/div/div/a[@data-id-product='3']")
	WebElement addProduct2;

	@FindBy(xpath = ".//*[@id='homefeatured']/li/div/div/div/a[@data-id-product='4']")
	WebElement addProduct3;
	
	@FindBy(xpath = ".//*[@id='header']/div[3]/div/div/div[3]/div/div/div/div/dl/dt[1]/span/a")
	WebElement remove;
	


	public void clickProduct1() {
		Actions builder = new Actions(driver);
		builder.moveToElement(frameProduct1).perform();
		this.addProduct1.click();
	}
	
	public void clickProduct2() {
		Actions builder = new Actions(driver);
		builder.moveToElement(frameProduct2).perform();
		this.addProduct2.click();
	}
	
	public void clickProduct3() {
		Actions builder = new Actions(driver);
		builder.moveToElement(frameProduct3).perform();
		this.addProduct3.click();
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void remove() throws InterruptedException {
		Actions builder = new Actions(driver);
		builder.moveToElement(driver.findElement(By.xpath(".//*[@id='header']/div[3]/div/div/div[3]/div/a"))).perform();
		builder.moveToElement(driver.findElement(By.xpath(".//*[@id='header']/div[3]/div/div/div[3]/div/a/b"))).perform();
		Thread.sleep(3000);
		this.remove.click();
	}
}
