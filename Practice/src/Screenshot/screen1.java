package Screenshot;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Configlibrary.Configfile;

public class screen1 {
	
	public static void main(String args[]) throws Exception {
		
		Configfile config = new Configfile();
		System.setProperty("webdriver.chrome.driver",config.getChrome());
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get(config.getAmazon());
		Thread.sleep(3000);
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File("./SShots/abhibus.png"));
		Thread.sleep(3000);
		driver.quit();
	}

}
