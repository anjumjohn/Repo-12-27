package stepdefinition;

import static org.testng.Assert.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.ArrayPage;
import pageobjects.ReusablePage;
import pageobjects.homePage;
import pageobjects.loginDSAlgo;
import utilities.Loggerload;

public class ReusableSD {

	loginDSAlgo log = new loginDSAlgo(); 
	homePage home = new homePage();
	ArrayPage array = new ArrayPage();
 
	ReusablePage reuse = new ReusablePage(); 

	@Given("The user is on Signin page of DS Algo portal")
	public void the_user_is_on_signin_page_of_ds_algo_portal() {

		log.gotoLoginPage();
		Loggerload.info("The user is on Signin page of DS Algo portal");

	}

	@When("The user enter valid {string} and {string}")
	public void the_user_enters_valid_username_and_password(String string, String string2) {

		log.signIn("arshsquashers@gmail.com", "Welcome12#");
		Loggerload.info("The user enters " + string + " and " + string2);
	}

	@When("The user click on login button")
	public void the_user_clicks_on_login_button() { 

		log.loginClick();
		Loggerload.info("The user is logged in");
	}

	@Then("The user redirected to homepage")
	public void the_user_is_redirected_to_the_homepage() {

		String title = home.getPageTitle();
		assertEquals(title, "NumpyNinja");
		Loggerload.info("Title of current page is" + title);

	}

	@Given("The user is on the {string} after logged in")
	public void the_user_is_on_the_after_logged_in(String string) {

		home.homePg();
	}

	@When("The user is redirected to {string} Page")
	public void the_user_is_redirected_to_page(String string) {

		reuse.reusableMethod(string);
		Loggerload.info("The user is on " + string + " after logged in");
	}

}
