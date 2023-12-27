package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class configReader {
		
	private static Properties prop;
	private static String proppath = "src/test/resources/config/config.properties";
	
	public static void configload()throws Throwable {
	
	try {
		FileInputStream ip= new FileInputStream(proppath);
		prop=new Properties();
		try {
			prop.load(ip);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		throw new RuntimeException("config.properties not found at " + proppath);
	}
	
	}
	
	public static String getBrowserType() {
		String browser = prop.getProperty("browser");
		if (browser != null)
			return browser;
		else
			throw new RuntimeException("browser not specified in the config.properties file.");
	}
	
	public static String getApplicationUrl() {
		String url = prop.getProperty("url");
		if (url != null)
			return url;
		else
			throw new RuntimeException("url not specified in the config.properties file.");
	}
	
	public static String getHomePage() {
		String homepage = prop.getProperty("homepage");
		if (homepage != null)
			return homepage;
		else
			throw new RuntimeException("url not specified in the config.properties file.");
				
	}
	
	public static String getregisterUrl() {
		String register=prop.getProperty("registerurl");
		if(register!=null)
			return register;
		else
			throw new RuntimeException("url not specified in the config.properties file.");
	}
	
	public static String getloginUrl() {
		String login=prop.getProperty("loginpage");
		if(login!=null)
			return login;
		else
			throw new RuntimeException("url not specified in the config.properties file.");
	}
	
//	public static String getDataStructureUrl() {
//		String login=prop.getProperty("Ds_Url");
//		if(login!=null)
//			return login;
//		else
//			throw new RuntimeException("url not specified in the config.properties file.");
//	}
//	
//	public static String getTimeComplexityUrl() {
//		String login=prop.getProperty("timeComplexity_Url");
//		if(login!=null)
//			return login;
//		else
//			throw new RuntimeException("url not specified in the config.properties file.");
//	}
//	
//	public static String getPracticeQuestionUrl() {
//		String login=prop.getProperty("practiceQues_Url");
//		if(login!=null)
//			return login;
//		else
//			throw new RuntimeException("url not specified in the config.properties file.");
//	}
//	
//	public static String getTryEditorUrl() {
//		String login=prop.getProperty("tryEditor_Url");
//		if(login!=null)
//			return login;
//		else
//			throw new RuntimeException("url not specified in the config.properties file.");
//	}
//
//	public static String getQueueUrl() {
//		String login=prop.getProperty("queueUrl");
//		if(login!=null)
//			return login;
//		else
//			throw new RuntimeException("url not specified in the config.properties file.");
//	}
//	
//	public static String getImplementationQueueUrl() {
//		String login=prop.getProperty("implementationQueueUrl");
//		if(login!=null)
//			return login;
//		else
//			throw new RuntimeException("url not specified in the config.properties file.");
//	}
//	public static String getPracticePageUrl() {
//		String login=prop.getProperty("practicePageUrl");
//		if(login!=null)
//			return login;
//		else
//			throw new RuntimeException("url not specified in the config.properties file.");
//	}
//	public static String getCollectionsDequeUrl() {
//		String login=prop.getProperty("collectionsDequeUrl");
//		if(login!=null)
//			return login;
//		else
//			throw new RuntimeException("url not specified in the config.properties file.");
//	}
//	public static String getImplementationArrayUrl() {
//		String login=prop.getProperty("implementationArrayUrl");
//		if(login!=null)
//			return login;
//		else
//			throw new RuntimeException("url not specified in the config.properties file.");
//	}
//	public static String getQueueOperationsUrl() {
//		String login=prop.getProperty("queueOperationsUrl");
//		if(login!=null)
//			return login;
//		else
//			throw new RuntimeException("url not specified in the config.properties file.");
//	}
	
	public static String geturl(String pagename) {
		String url = prop.getProperty(pagename);
		if (url != null)
			return url;
		else
			throw new RuntimeException(pagename + " url not specified in the Configuration.properties file.");
	}
	
	public static String getexcelfilepath() {
		String excelfilelpath = prop.getProperty("excelfilepath");
		if (excelfilelpath != null)
			return excelfilelpath;
		else
			throw new RuntimeException("Excel file path not specified in the Configuration.properties file.");
	}
	

}

