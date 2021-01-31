package facebook;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Scenario2 extends Baseclass{
	
	@Test
	public void forgot() {
		driver.findElement(By.linkText("Forgotten password?")).click();
		driver.findElement(By.id("identify_email")).sendKeys("kartheek.gunapati");
		driver.findElement(By.xpath("//span[text()='Cancel']")).click();
	}

}
