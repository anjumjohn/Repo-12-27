package pageobjects;


//import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//import org.testng.Assert;
//import Utilities.configReader;
import hooks.baseClassForDriver;

public class DataStructurePage {

	public static WebDriver driver = baseClassForDriver.getdriver();
	
//	String Ds_Url = configReader.getDataStructureUrl();
//	String timeComplexity_Url = configReader.getTimeComplexityUrl();
//	String practiceQues_Url = configReader.getPracticeQuestionUrl();
//	String tryEditor_Url = configReader.getTryEditorUrl();

	@FindBy(xpath = "//a[text()='Time Complexity']")
	WebElement timeComplexity;

	@FindBy(xpath = "//a[text()='Practice Questions']")
	WebElement practiceQuestions;

	@FindBy(xpath = "//a[text()='Try here>>>']")
	WebElement tryHere;

	@FindBy(xpath = "//textarea[@tabindex='0']")
	WebElement tryEditor;

	@FindBy(xpath = "//button[text()='Run']")
	WebElement run;

	@FindBy(xpath = "//pre[@id='output']")
	WebElement console;

	public DataStructurePage() {

		PageFactory.initElements(driver, this);
	}



	public void timeComplexity() {

		timeComplexity.click();
	}


	public void practiceQuestions() {

		practiceQuestions.click();
	}


	public void tryHere() {

		tryHere.click();
	}

//	public void tryEditorPageAssert() {
//
//		String tryEditorPageUrl = driver.getCurrentUrl();
//		Assert.assertEquals(tryEditorPageUrl, tryEditor_Url);
//	}

//	public void tryEditorPage() {
//
//		driver.get(tryEditor_Url);
//	}
	
	

//	public void tryEditor(String pythonCode) {
//
//		tryEditor.sendKeys(pythonCode);
//	}
//
//	public void runClick() {
//
//		run.click();
//	}

//	public void consolecheck1() {
//
//		String consoleOutput = console.getText();
//		Assert.assertEquals(consoleOutput, "hello");
//	}
//
//	public void erase() {
//
//		tryEditor.clear();
//	}
//
//	public void consolecheck2() {
//
//		String consoleOutput = console.getText();
//		Assert.assertEquals(consoleOutput, "world");
//	}
//
//	public void alert() {
//
//		Alert alert = driver.switchTo().alert();
//		alert.accept();
//
//	}
//	
//	public void getTimeComplexity_Url() {
//		
//		driver.get(timeComplexity_Url);
//	}

}
