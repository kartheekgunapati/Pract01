package Test;

import org.testng.annotations.Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.Select;


public class Testcase1 extends Baseclass {
	
	@Test(priority=-3)
	public void testCase1() {
		WebElement e1 = driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
		String link = e1.getAttribute("href");
		System.out.println("Href Value is : "+link);
	}
	
	//@Test(priority=1)
	@Test(enabled=false)
	public void testCase2() {
		WebElement e2 = driver.findElement(By.id("email"));
		e2.sendKeys("Kartheek.Gunapati");
		String Mail = e2.getAttribute("value");
		System.out.println("Email Id is : "+Mail);
	}
	
	@Test(priority=-2)
	//@Test(enabled=false)
	public void testCase3() {
		WebElement e3 = driver.findElement(By.name("pass"));
		e3.sendKeys("9988776690");
		String pwd = e3.getAttribute("value");
		System.out.println("Email Id is : "+pwd);
	}
	
	@Test(priority=4)
	public void testCase4() {
		List<WebElement> list = driver.findElements(By.xpath("//div[@class='_6lux']"));
		int s = list.size();
		System.out.println("Size of the list is : "+s);
		//WebDriverWait wait = new WebDriverWait(driver,30);
		//WebElement we1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='_6lux'][2]")));
		//we1.sendKeys("9493517466");
		driver.findElement(By.xpath("//div[@class='_6lux']/input[1]")).sendKeys("9493517466");
	}
	
	@Test(priority=5)
	public void testCase5() {
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		WebElement s1 = driver.findElement(By.name("birthday_month"));
		Select s = new Select(s1);
		List<WebElement> list2 = s.getOptions();
		int a = list2.size();
		System.out.println("Size of the List 2 is :"+a);
		driver.findElement(By.xpath("//select[@id='month']/option[8]")).click();
		driver.findElement(By.xpath("//select[@id='day']/option[23]")).click();
		driver.findElement(By.xpath("//select[@name='birthday_year']/option[29]")).click();
	
		
	}

}
