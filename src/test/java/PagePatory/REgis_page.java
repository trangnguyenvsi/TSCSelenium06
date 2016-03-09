package PagePatory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class REgis_page {
WebDriver driver;
@FindBy(id="email_create")
WebElement email_txt;

@FindBy(id="SubmitCreate")
WebElement create_btn;

@FindBy(id="id_gender1")
WebElement chk_gender1;

@FindBy(id="customer_firstname")
WebElement firstname;


@FindBy(id="customer_lastname")
WebElement lastname;


@FindBy(id="passwd")
WebElement password;


@FindBy(id="days")
WebElement days;


@FindBy(id="months")
WebElement months;


@FindBy(id="years")
WebElement years;

@FindBy(id="address1")
WebElement address1;

@FindBy(id="city")
WebElement city;

@FindBy(id="id_state")
WebElement id_state;

@FindBy(id="postcode")
WebElement postcode;

@FindBy(id="id_country")
WebElement id_country;

@FindBy(id="phone_mobile")
WebElement phone_mobile;

@FindBy(id="alias")
WebElement alias;



@FindBy(id="submitAccount")
WebElement submitBtn;

public void clickSubmit()
{
	this.submitBtn.click();
}
public void setGender()
{
	this.chk_gender1.click();
}

public void setFirstName(String StrFirstname)
{
	this.firstname.sendKeys(StrFirstname);
}


public void setLastName(String StrLastname)
{
	this.firstname.sendKeys(StrLastname);
}

public void setDays(String Strdays)
{
	this.firstname.sendKeys(Strdays);
}

public void setmonths(String Strmonths)
{
	new Select(months).selectByVisibleText(Strmonths);
}
public void setyears(String Stryears)
{
	new Select(years).selectByVisibleText(Stryears);
}


public void setaddress1(String Straddress1)
{
	this.firstname.sendKeys(Straddress1);
}
public void setcity(String Strcity)
{
	this.city.sendKeys(Strcity);
}
public void setid_state(String Strid_state)
{
	new Select(id_state).selectByVisibleText(Strid_state);
}
public void setpostcode(String Strpostcode)
{
	this.city.sendKeys(Strpostcode);
}
public void setid_country(String Strid_country)
{
	new Select(id_country).selectByVisibleText(Strid_country);
}
public void setphone_mobile(String Strphone_mobile)
{
	this.phone_mobile.sendKeys(Strphone_mobile);
}

public void setMyAdd_mobile(String Stralias)
{
	this.alias.sendKeys(Stralias);
}

public void Register(WebDriver driver){
	 
    this.driver = driver;

    //This initElements method will create all WebElements

    PageFactory.initElements(driver, this);
}

public void Register(String StrFirstname, String StrLastname, String Strdays, String Strmonths, String Stryears, String Straddress1, String Strcity,
		String Strid_state, String Strpostcode, String Strid_country, String Strphone_mobile, String Stralias)
{
	this.setGender();
	this.setFirstName(StrFirstname);
	this.setLastName(StrLastname);
	this.setDays(Strdays);
	this.setmonths(Strmonths);
	this.setyears(Stryears);
	this.setaddress1(Straddress1);
	this.setcity(Strcity);
	this.setid_state(Strid_state);
	this.setpostcode(Strpostcode);
	this.setid_country(Strid_country);
	this.setphone_mobile(Strphone_mobile);
	this.setMyAdd_mobile(Stralias);
	this.clickSubmit();
}
}

