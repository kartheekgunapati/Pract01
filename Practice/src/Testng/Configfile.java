package Testng;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Configfile {
	
	Properties pro;
	
	public Configfile() throws Exception{
		File src = new File("./Configuration/config.property");
		FileInputStream fis = new FileInputStream(src);
		pro = new Properties();
		pro.load(fis);
	}
	
	public String getChrome() {
		String chrome = pro.getProperty("ChormeDriver");
		return chrome;
	}
	
	public String getFirefox() {
		String ffox = pro.getProperty("FirefoxDriver");
		return ffox;
	}
	
	public String getYahoo() {
		String yahoo = pro.getProperty("YahooUrl");
		return yahoo;
	}
}
