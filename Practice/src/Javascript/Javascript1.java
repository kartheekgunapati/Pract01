package Javascript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Javascript1 {
	
	public static void main(String args[]) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\msuser1\\Documents\\Workspace\\Celin\\Cha\\Chrome\\chromedriver.exe");
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		Thread.sleep(3000);
		driver.findElement(By.id("email")).sendKeys("karthick.gunapati@gmail.com");
		Thread.sleep(2000);
		WebElement pwd = driver.findElement(By.name("pass"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='9492638386';",pwd);
		Thread.sleep(2000);
		WebElement login = driver.findElement(By.name("login"));
		js.executeScript("arguments[0].click()", login);
		Thread.sleep(3000);
		driver.quit();
		
	}

}
