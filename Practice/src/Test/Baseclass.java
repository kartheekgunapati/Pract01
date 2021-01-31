package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Baseclass {
	
	WebDriver driver;
	
	@BeforeClass
	public void browserSetup() throws Exception {
		Configfile cong = new Configfile();
		System.setProperty("webdriver.chrome.driver",cong.getChrome());
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get(cong.getFacebook());
	}
	
	@AfterClass
	public void browserQuit() {
		driver.manage().deleteAllCookies();
		driver.quit();
	}
	

}
