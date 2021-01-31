package Testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class Baseclass {
	
	WebDriver driver;
	
	@BeforeClass
	@Parameters("Browser")
	public void browserLaunch(String browserName) throws Exception {
		Configfile con = new Configfile();
		if(browserName.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", con.getChrome());
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get(con.getYahoo());
		} else if(browserName.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver",con.getFirefox());
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get(con.getYahoo());
		}
	}
	
	@AfterClass
	public void tearDown() {
		driver.manage().deleteAllCookies();
		driver.quit();
	}

}
