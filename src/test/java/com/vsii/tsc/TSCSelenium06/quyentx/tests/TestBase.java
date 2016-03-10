/**
 * 
 */

package com.vsii.tsc.TSCSelenium06.quyentx.tests;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

/**
 * @author quyentx
 *
 */

public class TestBase {
	
	protected static WebDriver driver;
	static String baseURL = "http://automationpractice.com/index.php";
	
	@BeforeSuite
	public void getBrowser() {
		
			try {
				Properties prop = new Properties();
				InputStream inputStream = new FileInputStream("./sources/config.properties");
				prop.load(inputStream);

				// get the property value and decide which browser to use
				String browser = prop.getProperty("browser");
				if (browser.equalsIgnoreCase("firefox")) {
					driver = new FirefoxDriver();
				} else if (browser.equalsIgnoreCase("chrome")) {
					System.setProperty("webdriver.chrome.driver", "./sources/chromedriver.exe");
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

			} catch (Exception e) {
				System.out.println("Exception: " + e);
			}
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
	
	@AfterSuite
	public void afterSuite(){
		System.out.println("Class execution finished!");
		driver.close();
	}
}
