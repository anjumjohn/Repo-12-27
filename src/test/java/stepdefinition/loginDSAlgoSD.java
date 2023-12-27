package stepdefinition;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.loginDSAlgo;
import pageobjects.registerPage;

public class loginDSAlgoSD {
	
	loginDSAlgo log=new loginDSAlgo();
	
	

	//@TS_signin_01
	@Given("The user is on signin page")
	public void the_user_is_on_signin_page() {
	    log.gotoLoginPage();
	}
	
	@When("The user clicks Login with empty username {string} and valid password {string}")
	public void the_user_clicks_login_with_empty_username_and_valid_password(String string, String string2) {
	    log.signIn(string, string2);
	    log.loginClick();
	}

	
	//@TS_signin_02
	@When("The user clicks Login with username {string} and empty password {string}")
	public void the_user_clicks_login_with_username_and_empty_password(String string, String string2) {
		 log.signIn(string, string2);
		 log.loginClick();
	}
	
//@TS_signin_03
	@When("The user clicks Login with invalid username {string} and invalid password {string}")
	public void the_user_clicks_login_with_invalid_username_and_invalid_password(String string, String string2) {
		 log.signIn(string, string2);
		 log.loginClick();
	
	}
	
	@Then("It will display an error message {string}")
	public void it_will_display_an_error_message(String string) {
		
			assertEquals(log.invalidMessage(), string);
			
	}
	
	//@TS_signin_04
	@When("The user clicks Login with valid username {string} and invalid password {string}")
	public void the_user_clicks_login_with_valid_username_and_invalid_password(String string, String string2) {
		 log.signIn(string, string2);
		 log.loginClick();
	}
	
	@Then("It should display an error message {string} password not valid")
	public void it_should_display_an_error_message_password_not_valid(String string) {
			Assert.assertNotEquals(log.invalidMessage(), string);
	}

	//@TS_signin_05
	@When("The user clicks Login with valid username  {string} and valid password {string}")
	public void the_user_clicks_login_with_valid_username_and_valid_password(String string, String string2) {
	    log.signIn(string, string2);
	    log.loginClick();
	}

	@Then("It should display {string} message with username in top right corner")
	public void it_should_display_message_with_username_in_top_right_corner(String string) {
			assertEquals(log.loggedInVerify(), string);
			
		
	}

	@Given("The user is logged in")
	public void the_user_is_logged_in() {
	    log.gotoLoginPage();
	    log.signIn("numpyarshsquashers@gmail.com", "Thankgmail123");
	    //log.loginClick();
	}

	@When("The user clicks on Sign-Out link")
	public void the_user_clicks_on_sign_out_link() {
	    log.signoutClick();
	}

	@Then("The user gets the message {string}")
	public void the_user_gets_the_message_logged_out_successfully(String string) {
		try {
			assertEquals(log.loggedInVerify(), string);
			}
			catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}



}

	