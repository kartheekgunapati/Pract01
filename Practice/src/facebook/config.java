package facebook;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class config {
	
	Properties pro;
	
	public config() throws Exception {
		File src = new File("C:\\Users\\msuser1\\git\\YahooGit\\Practice\\Configuration\\config.property");
		FileInputStream fis = new FileInputStream(src);
		pro = new Properties();
		pro.load(fis);
	}
	
	public String getChrome() {
		String chrome = pro.getProperty("ChormeDriver");
		return chrome;
	}
	
	public String getUrl() {
		String url = pro.getProperty("FBUrl");
		return url;
	}

}
