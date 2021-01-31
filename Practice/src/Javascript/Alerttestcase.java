package Javascript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alerttestcase {
	
	public static void main(String args[]) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\msuser1\\Documents\\Workspace\\Celin\\Cha\\firefox driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("alert('Welcome to Facebook Page');");
		Thread.sleep(3000);
		String atext = driver.switchTo().alert().getText();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		System.out.println("Alert Message is : "+atext);
		driver.findElement(By.xpath("//input[contains(@id,'ema')]")).sendKeys("KARTHEEK REDDY GUNAPATI");
		driver.findElement(By.xpath("//input[starts-with(@name,'pas')]")).sendKeys("ABC123XYA");
		driver.findElement(By.xpath("//input[@name='pass']//following::a[1]")).click();
		Thread.sleep(3000);
		driver.quit();
		
		
	}

}
