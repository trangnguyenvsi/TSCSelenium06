package automationpractice.com.testbases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import automationpractice.com.methods.LoginMethods;
import automationpractice.com.utility.ExtentManager;


public class Testbase {
	public WebDriver driver; 

	 
	public LoginMethods objLogin;
	@BeforeTest
	public void beforeTest() throws IOException {
		driver = new FirefoxDriver();		
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		driver.manage().window().maximize();
		objLogin = new LoginMethods(driver);
		System.out.println("dow hoi");
		
	}
	@AfterTest
	public void afterTest() {
		driver.quit();
	}

}


