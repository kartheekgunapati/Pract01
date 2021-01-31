package Runner;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;

public class Testrunner {
	
	public static void main(String args[]) {
		
		TestNG run = new TestNG();
		
		List<String> list = new ArrayList<String>();
		list.add("C:\\Users\\msuser1\\git\\YahooGit\\Practice\\test-output\\testng-failed.xml");
		run.setTestSuites(list);
		run.run();
		
		
	}

}
 