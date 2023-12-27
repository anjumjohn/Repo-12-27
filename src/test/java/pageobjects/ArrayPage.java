package pageobjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.ElementsUtils;
import utilities.Loggerload;
import utilities.configReader;
import hooks.baseClassForDriver;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;


public class ArrayPage {

	public static WebDriver driver = baseClassForDriver.getdriver();
	
	homePage home = new homePage();
	ElementsUtils eleUtil = new ElementsUtils();
	static Actions action;

	@FindBy(xpath = "//a[text()='Arrays in Python']")
	WebElement arraysInPython;

	@FindBy(xpath = "//a[text()='Try here>>>']")
	WebElement tryHere;

	@FindBy(xpath = "//a[text()='Arrays Using List']")
	WebElement arraysUsingList;

	@FindBy(xpath = "//a[text()='Basic Operations in Lists']")
	WebElement basicOperationsInLists;

	@FindBy(xpath = "//a[text()='Applications of Array']")
	WebElement applicationsOfArray;
	
	@FindBy(xpath = "//a[text()='Practice Questions']")
	WebElement practiceQuestions;

//	@FindBy(xpath = "//a[text()='Search the array']")
//	WebElement searchTheArray;
	
	@FindBy (xpath="//a[@href='/question/1']")
	WebElement searchTheArray;

	@FindBy(xpath = "//a[text()='Max Consecutive Ones']")
	WebElement maxConsecutiveOnes;

	@FindBy(xpath = "//a[text()='Find Numbers with Even Number of Digits']")
	WebElement findNumbersWithEvenNumberOfDigits;

	@FindBy(xpath = "//a[text()='Squares of  a Sorted Array']")
	WebElement squaresOfASortedArray;
	
	@FindBy (xpath="//a[@href='/tryEditor']")
	WebElement TryHereLink;
	
	@FindBy (xpath="//*[@id='answer_form']")
	WebElement answerform;
	
	@FindBy (xpath="//textarea[@tabindex='0']")
	WebElement editorInput;
	
	@FindBy (xpath="//*[@id='answer_form']/button")
	WebElement runButton;
	
	@FindBy (xpath="//*[@class='button']")
	WebElement submitButton;
	
	@FindBy (id="output")
	WebElement output; 

	public ArrayPage() {

		PageFactory.initElements(driver, this);
	}
	
	public void arrayClick() {
		
		home.getStartedForModule("Arrays");
	}

//	public void getUrlOf(String pagename) {
//		String urlName = configReader.geturl(pagename);
//		driver.get(urlName);
//	}

	public void arraysInPythonClick() {

		arraysInPython.click();
	}

	public void arraysUsingListClick() {

		arraysUsingList.click();
	}

	public void basicOperationsInListsClick() {

		basicOperationsInLists.click();
	}

	public void applicationsOfArrayClick() {

		applicationsOfArray.click();
	}
	
	public void tryHereClick() {

		tryHere.click();
	}
	
	public void practiceQuestionsClick() {

		practiceQuestions.click();
	}
	public void searchTheArrayClick() {

		searchTheArray.click();
	}

	public void maxConsecutiveOnesClick() {

		maxConsecutiveOnes.click();
	}

	public void findNumbersWithEvenNumberOfDigitsClick() {

		findNumbersWithEvenNumberOfDigits.click();
	}

	public void squaresOfASortedArrayClick() {

		squaresOfASortedArray.click();
	}
	
	public String getArrayPageTitle() {
		String title = driver.getTitle();
		return title;
	}
	
//	public void enterPythonCodePractice(String sheetname, int rownumber) throws InvalidFormatException, IOException {
//		eleUtil.waitForElement(answerform);
//		String code = eleUtil.getCodefromExcel(sheetname, rownumber);
//		eleUtil.enterCodePractice(2,0,true);
//
//	}
	
	public void enterPythonCodePractice(String sheetname, int rownumber) throws InvalidFormatException, IOException {
		eleUtil.waitForElement(answerform);
		String code = eleUtil.getCodefromExcel(sheetname, rownumber);
		eleUtil.enterCodePractice(code, editorInput);

	}


	public String getExpectedResult(String sheetName, Integer rowNum) throws InvalidFormatException, IOException {
		String expectedResult = eleUtil.getResultfromExcel(sheetName, rowNum);
		return expectedResult;
	}

	public String getActualResult() {
		eleUtil.waitForElement(output);
		return output.getText();

	}

	public void clickOnRunButton() {
		Loggerload.info("Click on Run button");
		runButton.click();

	}
	
	public String getErrorText() {
		String errorMsg = driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		return errorMsg;

	}

//	public void clickArraysUsingList() {
//		Loggerload.info("click " + arraysUsingListLink.getText() + " On array page");
//		arraysUsingListLink.click();
//
//	}
//
//	public void clickBasicOpInLists() {
//		Loggerload.info("click " + basicOpinListsLink.getText() + " On array page");
//		basicOpinListsLink.click();
//
//	}
//
//	public void clickAppOfArray() {
//		Loggerload.info("click " + appOfArrayLink.getText() + " On array page");
//		appOfArrayLink.click();
//
//	}
//	
//	public void clickPracticeQue() {
//		Loggerload.info("click " + practiceQueLink.getText() + " On array page");
//		practiceQueLink.click();
//
//	}
//
//	public void clickarrayLink() {
//		Loggerload.info("click " + searchArrayLink.getText() + " On array page");
//		searchArrayLink.click();
//
//	}

	public void clickOnSubmitButton() {
		Loggerload.info("Click on Submit button");
		submitButton.click();
	}

//	public void navigateTotryEditor() {
//
//		driver.get(tryEditorURL);
//
//	}
//
//	public void navigateTo(String pagename) {
//		String urlName = ConfigReader.geturl(pagename);
//		driver.get(urlName);
//	}
//	
//	public void maxConsOnes() {
//		Loggerload.info("The user clicks the Max Consecutive Ones link");
//		mostConOnesLink.click();
//
//	}
//
//	public void findNumbers() {
//		Loggerload.info("The user clicks the Find Numbers with Even Number of Digits link");
//		findEvenNumLink.click();
//
//	}
//
//	public void squaresSortedArray() {
//		Loggerload.info("The user clicks the Squares of a Sorted Array link");
//		sqOfSortedArrayLink.click();
//	}
	




}
