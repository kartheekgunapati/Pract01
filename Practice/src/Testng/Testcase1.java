package Testng;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Testcase1 extends Baseclass {
	
	@Test
	public void tcase1() {
		driver.findElement(By.id("header-search-input")).clear();
		driver.findElement(By.id("header-search-input")).sendKeys("Yellayapalem");
		driver.findElement(By.id("header-desktop-search-button")).click();
		String tittle = driver.getTitle();
		System.out.println("Tittle of the page is : "+tittle);
		driver.navigate().back();
		
	}

}
