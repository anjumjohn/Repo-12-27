package stepdefinition;

//import Pages.loginDSAlgo;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.QueuePage;
import pageobjects.homePage;

public class QueueSD {

	QueuePage queue = new QueuePage();
	homePage home = new homePage();

	@When("The user clicks Get Started button below Queue")
	public void the_user_clicks_get_started_button_below_Queue() {

		home.getStartedForModule("Queue");
	}

	@When("The user clicks Implementation of Queue in Python link") 
	public void the_user_clicks_implementation_of_queue_in_python_link() {

		queue.implementationQueueClick();
	}

	@When("The user clicks Implementation using collections.deque link")
	public void the_user_clicks_implementation_using_collections_deque_link() {

		queue.collectionsDequeClick();
	}

	@When("The user clicks Implementation using array link")
	public void the_user_clicks_implementation_using_array_link() {

		queue.implementationArrayClick();
	}

	@When("The user clicks Queue Operations link")
	public void the_user_clicks_queue_operations_link() {

		queue.queueOperationsClick();
	}
}

