package Javascript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import Configlibrary.Configfile;

public class Javascript2 {
	
	public static void main(String args[]) throws Exception {
		
		Configfile config = new Configfile();
		
		System.setProperty("webdriver.chrome.driver",config.getChrome());
		ChromeOptions opt = new ChromeOptions();
		opt.setPageLoadStrategy(PageLoadStrategy.NORMAL);
		WebDriver driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get(config.getyahoo());
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Sign in']")).click();
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("document.getElementById('createacc').click();");
		Thread.sleep(3000);
		WebElement fname = driver.findElement(By.name("firstName"));
		js.executeScript("arguments[0].style.border='2px dotted red';", fname);
		Thread.sleep(3000);
		js.executeScript("arguments[0].value='Kartheek';", fname);
		Thread.sleep(3000);
		js.executeScript("document.getElementById('usernamereg-lastName').style.background='yellow';");
		Thread.sleep(3000);
		js.executeScript("document.getElementById('usernamereg-lastName').value='Gunapati';");
		Thread.sleep(3000);
		js.executeScript("alert('Yahoo User Account Create Page');");
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		js.executeScript("window.scrollTo(0,'document.body.scrollheight');");
		Thread.sleep(3000);
		driver.quit();

		
	}

}
