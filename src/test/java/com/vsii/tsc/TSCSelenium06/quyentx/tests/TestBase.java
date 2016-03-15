/**
 * 
 */

package com.vsii.tsc.TSCSelenium06.quyentx.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;

/**
 * @author quyentx
 *
 */

public class TestBase {
	
	public static WebDriver driver;
	static String baseURL = "http://automationpractice.com/";
	
	@BeforeSuite
	public void beforeClass() throws IOException{
				Properties prop = new Properties();
				InputStream inputStream = new FileInputStream("./sources/config.properties");
				prop.load(inputStream);

				// get the property value and decide which browser to use
				String browser = prop.getProperty("browserName");
				String sourcelab = prop.getProperty("sourcelab");
				
				if(sourcelab.equalsIgnoreCase("no")){
				
					if (browser.equalsIgnoreCase("firefox")) {
						driver = new FirefoxDriver();
						driver.manage().window().maximize();
						driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
						
					} else if (browser.equalsIgnoreCase("chrome")) {
						System.setProperty("webdriver.chrome.driver", "./resource/chromedriver.exe");
						driver = new ChromeDriver();
						driver.manage().window().maximize();
						driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
						
					} else if (browser.equalsIgnoreCase("opera")) {
						System.setProperty("webdriver.opera.driver", "./sources/operadriver.exe");
						driver = new OperaDriver();
						driver.manage().window().maximize();
						driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
					} else {
						System.out.println("No browser's found!");
					}
				}else if(sourcelab.equalsIgnoreCase("yes")){
					if (browser.equalsIgnoreCase("firefox")) {
						DesiredCapabilities caps = DesiredCapabilities.firefox();
						caps.setCapability("platform", "Windows 7");
						caps.setCapability("version", "43.0");
						driver = new RemoteWebDriver(
								new URL("http://quyenta_hanu:8e43108e-4697-4d85-8d31-2b19c620a65c@ondemand.saucelabs.com:80/wd/hub"),
								caps);
						driver.manage().window().maximize();
						driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
					} else if (browser.equalsIgnoreCase("chrome")) {
						DesiredCapabilities caps = DesiredCapabilities.chrome();
						caps.setCapability("platform", "Windows 7");
						caps.setCapability("version", "47.0");
						driver = new RemoteWebDriver(
								new URL("http://quyenta_hanu:8e43108e-4697-4d85-8d31-2b19c620a65c@ondemand.saucelabs.com:80/wd/hub"),
								caps);
						driver.manage().window().maximize();
						driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
						
					}
				}
			}
	
	@AfterSuite
	public void afterSuite(){
		System.out.println("Class execution finished!");
		driver.close();
	}
	
	@DataProvider(name = "loginInvalid")
	public Object[][] loginInvalid() {
		Object[][] arrayObject = ReadData.getExcelData("./sources/TestData.xls", "LoginInvalid");
		return arrayObject;
	}
	
	@DataProvider(name = "loginValid")
	public Object[][] loginValid() {
		Object[][] arrayObject = ReadData.getExcelData("./sources/TestData.xls", "LoginValid");
		return arrayObject;
	}
	
	@DataProvider(name = "registerValid")
	public Object[][] registerValid() {
		Object[][] arrayObject = ReadData.getExcelData("./sources/TestData.xls", "RegisterValid");
		return arrayObject;
	}
	
	@DataProvider(name = "registerInvalid")
	public Object[][] registerInvalid() {
		Object[][] arrayObject = ReadData.getExcelData("./sources/TestData.xls", "RegisterInvalid");
		return arrayObject;
	}
}
