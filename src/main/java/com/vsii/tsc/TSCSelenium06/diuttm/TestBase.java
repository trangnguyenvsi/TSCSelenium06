package com.vsii.tsc.TSCSelenium06.diuttm;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import java.io.IOException;


import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class TestBase {
	protected Properties p;
	protected WebDriver driver;
	protected String urlBase;

	@BeforeClass
    public void beforeClass() throws IOException {
	    Properties p = new Properties();
		// Read config file
		p = Utility1.readConfig();
		String browser = p.getProperty("browserName");
		urlBase=p.getProperty("base_url");		
		
		if (browser.equalsIgnoreCase("firefox") ){
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}
		else if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\diuttm\\Wedriver_lib\\IEDriverServer.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		} else if (browser.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver", "C:\\Users\\diuttm\\Wedriver_lib\\chromedriver.exe");
			driver = new InternetExplorerDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}
		driver.get(urlBase);
	}
	@AfterMethod
    public void tearDown() throws Exception {
		driver.quit();
	}
	 
	

}
