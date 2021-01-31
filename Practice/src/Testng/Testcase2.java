package Testng;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Testcase2 extends Baseclass {
	
	@Test
	public void caseTest1() {
		driver.findElement(By.id("header-signin-link")).click();
		driver.findElement(By.name("username")).sendKeys("Kartheek.Gunapati");
		String uname = driver.findElement(By.name("username")).getAttribute("value");
		System.out.println("Username Value is : "+uname);
		driver.findElement(By.id("mbr-forgot-link")).click();
		driver.navigate().back();

	}
}
