package pageobjects;

import org.openqa.selenium.WebDriver;

import hooks.baseClassForDriver;
import utilities.configReader;

public class ReusablePage {

	public static WebDriver driver = baseClassForDriver.getdriver();

	public void reusableMethod(String string) {

		String page_name = string.replaceAll("\\s+", "");
		String urlName = configReader.geturl(page_name);
		driver.get(urlName);
	}

}
