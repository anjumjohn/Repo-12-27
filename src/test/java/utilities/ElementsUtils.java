package utilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.commons.math3.ode.events.Action;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import hooks.baseClassForDriver;

public class ElementsUtils {
	
	public static WebDriver driver = baseClassForDriver.getdriver();;
	String Excelpath = configReader.getexcelfilepath();
	String code;
	String result;
	static Actions action;

	public void waitForElement(WebElement element) {
		new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(element));

	}
	
	public String getCodefromExcel(String sheetname, int rownumber) throws InvalidFormatException, IOException {
		ExcelReader reader = new ExcelReader();
		List<Map<String, String>> testdata = reader.getData(Excelpath, sheetname);
		code = testdata.get(rownumber).get("pythonCode");
		result = testdata.get(rownumber).get("Result");
		return code;
	}

	public void enterCode(String code, WebElement element) {

		new Actions(driver).sendKeys(element, code).perform();
	}

	public void enterCodePractice(String code, WebElement element) {
		new Actions(driver).keyDown(Keys.COMMAND).sendKeys("a").sendKeys(Keys.DELETE).keyUp(Keys.COMMAND).perform();
		String[] str1 = code.split("\n");
		for (int i = 0; i < str1.length; i++) {
			if (str1[i].equalsIgnoreCase("\\b")) {
				element.sendKeys(Keys.BACK_SPACE);
			} else {
				element.sendKeys(str1[i]);
				element.sendKeys(Keys.RETURN);
			}
		}
	}
//	public static void enterCodePractice(WebElement pythonElement, int row, int space,boolean flag) {
//        action = new Actions(driver);
//          // Keys cmdCtrl = Platform.getCurrent().is(Platform.MAC) ? Keys.COMMAND : Keys.CONTROL;
//       for(int i=1;i<=row;i++) {
//             action.sendKeys(Keys.ARROW_UP).keyUp(Keys.SHIFT).perform();
//              for(int j=1;j<=space;j++) {
//               if(i==1 && flag) action.sendKeys(Keys.BACK_SPACE).perform();
//               else action.sendKeys(Keys.DELETE).perform();
//              }
//       }
//   }


	public String getResultfromExcel(String sheetname, int rownumber) throws InvalidFormatException, IOException {
		ExcelReader reader = new ExcelReader();
		List<Map<String, String>> testdata = reader.getData(Excelpath, sheetname);
		result = testdata.get(rownumber).get("Result");
		Loggerload.info("Expected result from Excel sheetname " + sheetname + " and " + rownumber + " : " + result);
		return result;
	}
}
