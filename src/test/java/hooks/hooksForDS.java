package hooks;

import io.cucumber.java.BeforeAll;
import utilities.configReader;

public class hooksForDS {


		private static baseClassForDriver bs;

		@BeforeAll
		public static void before() throws Throwable {
			//Get browser Type from config properties file
			configReader.configload();
			String browser = configReader.getBrowserType();
			
			//Initialize driver from base class	
			bs = new baseClassForDriver();
			bs.initDriver(browser);
		
		}

}
