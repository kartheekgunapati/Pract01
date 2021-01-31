package facebook;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Baseclass {
	
	WebDriver driver;
	
	@BeforeClass
	public void browserSetUp() throws Exception {
		config con = new config();
		System.setProperty("webdriver.chrome.driver",con.getChrome());
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(con.getUrl());
	}
	
	@AfterClass
	public void tearDown() {
		driver.manage().deleteAllCookies();
		driver.quit();
	}
	

}
