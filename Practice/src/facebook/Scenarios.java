package facebook;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Scenarios extends Baseclass {

	@Test
	public void login() throws Exception {
		Thread.sleep(3000);
		driver.findElement(By.id("email")).sendKeys("kartheek.gunpatai");
		driver.findElement(By.name("pass")).sendKeys("abcdefghijklm");
	}
	
	
}
