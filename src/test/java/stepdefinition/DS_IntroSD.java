package stepdefinition;

//import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.DataStructurePage;
import pageobjects.homePage;

public class DS_IntroSD { 
	
	homePage home = new homePage();
	DataStructurePage data = new DataStructurePage();
	
	@When("The user clicks on the Get Started button below Data Structures")
	public void the_user_clicks_on_the_get_started_button_below_data_structures() {
	    
		home.getStartedForModule("Datastructures");
	}

	@When("The user clicks on the Time Complexity link")
	public void the_user_clicks_on_the_time_complexity_link() {
	   
		data.timeComplexity();
	}


}
