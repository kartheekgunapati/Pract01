package Screenshot;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;

public class Sshotlibrary {
	
	WebDriver driver;
	
	public static void captureScreenShot(WebDriver driver, String screehshot) throws Exception {
		try {
			TakesScreenshot ts = (TakesScreenshot) driver;
			File src = ts.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src,new File("./SShots/"+screehshot+".png"));
		} catch (WebDriverException e) {
			System.out.println(e.getMessage());
		}
	}

}
