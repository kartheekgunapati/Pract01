package Testng;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Testcase3 extends Baseclass {
	
	@Test
	public void caseTest2() {
		driver.findElement(By.id("header-signin-link")).click();
		driver.findElement(By.id("createacc")).click();
		driver.findElement(By.name("firstName")).sendKeys("ABC");
		driver.findElement(By.name("lastName")).sendKeys("XYZ");
	}
	

}
