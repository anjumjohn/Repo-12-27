package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.homePage;
import utilities.configReader;

import static org.testng.Assert.assertEquals;

public class homePageSD {

	homePage home= new homePage();
	String registerurl=configReader.getregisterUrl();
	String loginurl=configReader.getloginUrl(); 
	
	// User launch DsAlgo page
	@Given("The user opens DS Algo portal link")
	public void the_user_opens_ds_algo_portal_link() throws Exception {
		
		home.dsalgopage();
	}
	
	@When("The user clicks the {string} button")
	public void the_user_clicks_the_button(String string) throws InterruptedException {

		home.getStarted(string);
		Thread.sleep(3000);
	}
	
	@Then("The user should be redirected to homepage")
	public void the_user_should_be_redirected_to_homePage() throws InterruptedException {

		String title = home.getPageTitle();
		Thread.sleep(3000);
		assertEquals(title,"NumpyNinja","Do not match");

	}
	 //User tries to access the modules without logging in
	@Given("The user is on Home page")
	public void the_user_is_on_home_page() {
		home.homePg();
	    
	}

	@When("The user clicks on Get Started link on homepage {string} without login")
	public void the_user_clicks_on_get_started_link_on_homepage_without_login(String string) {
	    home.getStartedForModule(string);
	}

	@Then("The user get warning message {string}")
	public void the_user_get_warning_message(String string) throws InterruptedException {
	   String msg= home.alertmsg();
	   Thread.sleep(3000);
	   assertEquals(msg, string, "Title do not match");
	}


	@When("The user clicks on dropdown {string}")
	public void the_user_clicks_on_dropdown(String string) {
		home.dropdown(string);
	}
	
	@When("The user clicks on register link")
	public void the_user_clicks_on_register_link() {
	    home.click_register();
	}

	@Then("The user redirected to Registration page")
	public void the_user_redirected_to_registration_page() {
	    String registerlink=home.reg_url();
	    assertEquals(registerlink,registerurl,"Link do not match");
	}
	
	@When("The user clicks on signin link")
	public void the_user_clicks_on_signin_link() {
	    home.click_login();
	}

	@Then("The user redirected to login page")
	public void the_user_redirected_to_login_page() {
		String loginlink=home.login_url();
	    assertEquals(loginlink,loginurl,"Link do not match");
	}

	
}
