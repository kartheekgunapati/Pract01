package Screenshot;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Configlibrary.Configfile;

public class Failedscreenshot {
	
	Configfile config;
	WebDriver driver;
	
	@BeforeClass
	public void browserLaunch() throws Exception {
		config = new Configfile();
		System.setProperty("webdriver.chrome.driver",config.getChrome());
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}
	
	@Test(priority=1)
	public void mainPage() throws Exception {
		config = new Configfile();
		driver.get(config.getfacebook());
		driver.findElement(By.id("email")).sendKeys("karthick.gunapati@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.id("pass")).sendKeys("9492638386");
	}

	@Test(priority=2)
	public void forgotPassword() throws Exception {
		driver.findElement(By.linkText("Forgotten password?")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("email")).sendKeys("karthick.gunapati@gmail.com");
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.navigate().back();
	}
	
	@Test(priority=3)
	public void createAcct() throws Exception {
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("firstname")).sendKeys("Kartheek");
		Thread.sleep(3000);
		driver.findElement(By.name("lastnaeeeee")).sendKeys("Gunapati");
	}
	
	@AfterClass
	public void screenShot(ITestResult result) throws Exception {
		if(ITestResult.FAILURE==result.getStatus()) {
			Sshotlibrary.captureScreenShot(driver, result.getName());
	}
		
	}
	
}
