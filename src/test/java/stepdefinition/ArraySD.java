package stepdefinition;

import pageobjects.ArrayPage;
import pageobjects.ReusablePage;
import pageobjects.homePage;
import utilities.Loggerload;
import utilities.configReader;
import static org.testng.Assert.assertEquals;

import java.io.IOException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When; 


public class ArraySD {

	ArrayPage array = new ArrayPage();
	homePage home = new homePage();
	ReusablePage reuse = new ReusablePage();
	String Excelpath = configReader.getexcelfilepath();
	static String expectedMsg;
	
	@When("The user clicks on the Get Started button below Array")
	public void the_user_clicks_on_the_get_started_button_below_array() {
	    
		home.getStartedForModule("Arrays");
		Loggerload.info("User is in Arrays Module");
	}

	@Then("The user is redirected to  {string} Page")
	public void the_user_is_directed_to_page(String string) {
		String Title = array.getArrayPageTitle();
		Loggerload.info("Title of current page is : " + Title);
		//assertEquals(Title, pagename, "Title do not match");
	}
	@Given("The user is in {string} page")
	public void the_user_is_in_page(String string) {

		reuse.reusableMethod(string);
		Loggerload.info("The user is in " + string);
	}

	@When("The user clicks Arrays in Python link")
	public void the_user_clicks_arrays_in_python_link() {

		array.arraysInPythonClick();
		Loggerload.info("User clicks on Arrays in Python Link");
	}

	@Then("The user is redirected to {string} page")
	public void the_user_is_redirected_to_page(String string) {

		reuse.reusableMethod(string);
		Loggerload.info("The user is redirected to " + string);
	}

	@When("The user clicks the Try here link")
	public void the_user_clicks_the_try_here_link() {

		array.tryHereClick();
		Loggerload.info("User clicks on try here button");
	}

	@When("The user clicks Arrays Using List link")
	public void the_user_clicks_arrays_using_list_link() {

		array.arraysUsingListClick();
		Loggerload.info("User clicks on Arrays Using List Link");
	}

	@When("The user clicks Basic Operations in Lists link")
	public void the_user_clicks_basic_operations_in_lists_link() {

		array.basicOperationsInListsClick();
		Loggerload.info("User clicks on Operations in Lists Link");
	}

	@When("The user clicks Applications of Array link")
	public void the_user_clicks_applications_of_array_link() {

		array.applicationsOfArrayClick();
		Loggerload.info("User clicks on Application of Array Link");
	}

	@When("The user clicks Practice Questions link")
	public void the_user_clicks_practice_questions_link() {

		array.practiceQuestionsClick();
		Loggerload.info("User clicks on Practice Questions Link");
	}

	@When("The user clicks Search the array link")
	public void the_user_clicks_search_the_array_link() {

		array.searchTheArrayClick();
		Loggerload.info("User clicks on Practice Questions - Search the array Link");
	}

	@When("The user clicks Max Consecutive Ones link")
	public void the_user_clicks_max_consecutive_ones_link() {

		array.maxConsecutiveOnesClick();
		Loggerload.info("User clicks on Practice Questions - Max Consecutive Ones Link");
	}

	@When("The user clicks Find Numbers with Even Number of Digits link")
	public void the_user_clicks_find_numbers_with_even_number_of_digits_link() {

		array.findNumbersWithEvenNumberOfDigitsClick();
		Loggerload.info("User clicks on Practice Questions Link - Find Numbers with Even Number of Digits");
	}

	@When("The user clicks Squares of a sorted Array link")
	public void the_user_clicks_squares_of_a_sorted_array_link() {

		array.squaresOfASortedArrayClick();
		Loggerload.info("User clicks on Practice Questions Link - Squares of a sorted Array");
	}
	
	// @TS_array_21
		@Given("The user is on {string} page of {string} after logged in")
		public void the_user_is_on_page_of_after_logged_in(String pname, String pname2) {
			Loggerload.info("The user is on " + pname + "page of " + pname2 + " after logged in");
//			String page_name = pname + pname2.replaceAll("\\s+", "");
//			array.getUrlOf(page_name);
			reuse.reusableMethod(pname2);
		}

		@When("The user enter valid python code in tryEditor from sheet {string} and {int} for the question")
		public void the_user_enter_valid_python_code_in_try_editor_from_sheet_and_for_the_question(String sheetName,
				Integer rowNum) throws InvalidFormatException, IOException {
//			Loggerload.info("The user enter valid python code in tryEditor from sheetname :" + sheetName
//					+ " and row number :" + rowNum);
//			array.enterPythonCodePractice(sheetName, rowNum);
//			expectedMsg = array.getExpectedResult(sheetName, rowNum);
			
//			array.TextIndentation(null, null, 0, 0, false);
		}
		
		@When("The user clicks on run button")
		public void the_user_clicks_on_run_button() {
			array.clickOnRunButton();
		}

		@Then("The user should be presented with Run result")
		public void the_user_should_be_presented_with_run_result() throws InterruptedException {
			String actualMsg = array.getActualResult();
			Loggerload.info("Actual result  : " + actualMsg);
			assertEquals(actualMsg, expectedMsg, "Result do not match");

		}

		@When("The user clicks on Submit button")
		public void the_user_clicks_on_submit_button() {
			array.clickOnSubmitButton();
		}

		@Then("The user should be presented with successful submission message")
		public void the_user_should_be_presented_with_successful_submission_message() throws InterruptedException {
			String actualMsg = array.getActualResult();
			Loggerload.info("Actual result of successful submission message :" + actualMsg);
			assertEquals(actualMsg, expectedMsg, "Result do not match");
		}
		
		@When("The user enter python code with invalid syntax in tryEditor from sheet {string} and {int}")
		public void the_user_enter_python_code_with_invalid_syntax_in_try_editor_from_sheet_and(String sheetName,
				Integer rowNum) throws InvalidFormatException, IOException {
			Loggerload.info("The user enter python code with invalid syntax in tryEditor from sheetname :" + sheetName
					+ " and row number : " + rowNum);
			array.enterPythonCodePractice(sheetName, rowNum);
		}

//		@Then("The user should be presented with error message")
//		public void the_user_should_be_presented_with_error_message() {
//			String actualMsg = array.getErrorText();
//			Loggerload.info("Actual Error message is  : " + actualMsg);
//			assertEquals(actualMsg,"NameError: name 'hello' is not defined on line 1", "Result do not match");
//		}
		
		@Then("The user should be presented with error message as {string}")
		public void the_user_should_be_presented_with_error_message_as(String expectedmsg) {
			String actualMsg = array.getErrorText();
			Loggerload.info("Actual Error message is  : " + actualMsg);
			assertEquals(actualMsg, expectedmsg, "Result do not match");
		}
	
}
