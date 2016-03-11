package com.vsii.tsc.TSCSelenium06.DiuTTM.PagePatory;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage
{
    WebDriver driver;
    @FindBy(id="search_query_top")
    WebElement searchBox;
    
    @FindBy(id="contact-link")
    WebElement contactUs;
 
    @FindBy(xpath=".//*[@id='searchbox']/button")
    WebElement searchBtn;
    
    @FindBy(id="newsletter-input")
    WebElement newsletterTxt;
 
    public Homepage(WebDriver driver){
        
        this.driver = driver;
 
        //This initElements method will create all WebElements
 
        PageFactory.initElements(driver, this);
 
    }
  
    public void SetDataSearch(String StrSearchTxt)
    {
                this.searchBox.sendKeys(StrSearchTxt);        
    }
    public void clickSearchBtn()
    {
                this.searchBtn.click();        
    }
    public void clickCtusBtn()
    {
                this.contactUs.click();        
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
