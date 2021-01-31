package Test;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Configfile {
	
	Properties pro;
	
	public Configfile() throws Exception {
		File src = new File("./Configuration/config.property");
		FileInputStream fis = new FileInputStream(src);
		pro = new Properties();
		pro.load(fis);
	}
	
	public String getChrome() {
		String Chrome = pro.getProperty("ChormeDriver");
		return Chrome;
	}
	
	public String getFirefox() {
		String Ffox = pro.getProperty("FirefoxDriver");
		return Ffox;
	}
	
	public String getFacebook() {
		String Fbook = pro.getProperty("FBUrl");
		return Fbook;
	}
	

}
