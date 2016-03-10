package com.vsii.tsc.TSCSelenium06.DiuTTM.PagePatory;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class REgis_page {

WebDriver driver;
    
@FindBy(name="email_create")
WebElement EmailAddress;

@FindBy(name="SubmitCreate")
WebElement CreateAnAccount;

@FindBy(name="id_gender")
WebElement Title;

@FindBy(name="customer_firstname")
WebElement FirstName;

@FindBy(name="customer_lastname")
WebElement LastName;

@FindBy(name="email")
WebElement Email;

@FindBy(name="passwd")
WebElement Password;

@FindBy(name="Days")
WebElement DayOfBirth;

@FindBy(name="months")
WebElement MonthOfBirth;

@FindBy(name="years")
WebElement YearOfBirth;

@FindBy(name="firstname")
WebElement firstname;

@FindBy(name="lastname")
WebElement lastname;

@FindBy (xpath=".//*[@id='address1']")
WebElement Address;

@FindBy (xpath=".//*[@id='city']")
WebElement City;

@FindBy (xpath=".//*[@id='id_state']")
WebElement State;

@FindBy (xpath=".//*[@id='postcode']")
WebElement Zipcode;

@FindBy (name="id_country")
WebElement Country;

@FindBy (name="phone_mobile")
WebElement MobilePhone;

@FindBy (name="alias")
WebElement aliasMail;

@FindBy (name="submitAccount")
WebElement Register;

@FindBy (xpath=".//*[@id='create_account_error']")
WebElement InvalidEmail;



public REgis_page (WebDriver driver) {
    this.driver = driver;
    //This initElements method will create all WebElements

    PageFactory.initElements(driver, this);
}
//public void setEmailAddress(String Email){
//    
//    EmailAddress.sendKeys(Email);
//}

//public void clickCreateAnAccount(){
//    
//    CreateAnAccount.click();
//}
public void setTitle(){ 
//  Title.sendKeys(title);
//  new Select (Title).selectByVisibleText("");
  this.Title.click();
}
public void setFirstName(String firstname){
    
    FirstName.sendKeys(firstname);
}
public void setLastName(String lastname){
    
    LastName.sendKeys(lastname);
}

public void setEmail(String email){
    
    Email.sendKeys(email);
    
}

public void setPassw(String passw){
    
    Password.sendKeys(passw);
    
}
public void setFirstname(String frsname){
    
    firstname.sendKeys(frsname);
    
}
public void setLastname(String lstname){
    
    lastname.sendKeys(lstname);
    
}
public void setAdd(String add){
    
    Address.sendKeys(add);
    
}
public void setCity(String city){
    
    City.sendKeys(city);
    
}
public void setState(String state){
    new Select(State).selectByVisibleText(state);

    
}
public void setZipcode(String zipcode){
    
    Zipcode.sendKeys(zipcode);
    
}
public void setCountry(String ctr){
    
    new Select(Country).selectByVisibleText(ctr);
    
}
public void setHomephone(String hp){
    
    MobilePhone.sendKeys(hp);
    
}
public void setAliasmail(String aemail){
    
    aliasMail.sendKeys(aemail);
    
}
public void clickRegister(){
    
    Register.click();
}

public void register(String firstname, String lastname, String email,String passw, String frsname, String lstname, String add, String city, String state,String zipcode,String ctr, String hp, String aemail) {

    EmailAddress.sendKeys("stupid111@gmail.com");
    CreateAnAccount.click();
    this.setTitle();
    this.setLastName(lastname);
    this.setFirstName(firstname);
    this.setEmail(email);
    this.setPassw(passw);   
    this.setFirstname(frsname);
    this.setLastname(lstname);
    this.setAdd(add);
    this.setCity(city);
    this.setState(state);
    this.setZipcode(zipcode);
    this.setCountry(ctr);
    this.setHomephone(hp);
    this.setHomephone(hp);
    this.clickRegister();
    
}
}
