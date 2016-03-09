package com.vsii.tsc.TSCSelenium06.lannt.PageFactory;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search {

	WebDriver driver;
	
	@FindBy(xpath=".//*[@id='search_query_top']")
	WebElement SearchInput;
	
	@FindBy(xpath=".//*[@id='searchbox']/button")
	WebElement Searchbtn;
	
	@FindBy(id="contact-link")
	WebElement contactUs;
	    
	@FindBy(xpath=".//*[@id='header']/div[2]/div/div/nav/div[1]/a")
	WebElement SignIn;
	    	    
	@FindBy(id="newsletter-input")
	WebElement newsletterTxt;
	
	public Search(WebDriver driver){
		this.driver = driver;
		
	//This initElements method will create all WebElements
		 
      PageFactory.initElements(driver, this);
	}
	
	 public void SetDataSearch(String StrSearchTxt)
	    {
	                this.SearchInput.sendKeys(StrSearchTxt);        
	    }
	    public void clickSearchBtn()
	    {
	                this.Searchbtn.click();        
	    }
	    public void clickCtusBtn()
	    {
	                this.contactUs.click();        
	    }
	    public void clickSignInBtn()
	    {
	                this.SignIn.click();        
	    }
	    public void setNewLetter(String Strletter)
	    {
	                this.newsletterTxt.sendKeys(Strletter);        
	    }
	    
	   public void search(String StrSearchTxt){
	       this.SetDataSearch(StrSearchTxt);
	       this.clickSearchBtn();}
	   
	   public void sendLetter(String Strletter) throws AWTException{
	       this.setNewLetter(Strletter);
	       Robot robot = new Robot();
	       robot.keyPress(KeyEvent.VK_ENTER);}
	   
}
