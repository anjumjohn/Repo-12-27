package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import hooks.baseClassForDriver;
import utilities.configReader;

public class homePage {

	public static WebDriver driver = baseClassForDriver.getdriver();
	String URL = configReader.getApplicationUrl();
	String home = configReader.getHomePage();

	// webelements for modules
	@FindBy(xpath = "//button[text()='Get Started']")
	WebElement getStarted;

	@FindBy(xpath = "//a[@href='data-structures-introduction']")
	WebElement getstarted_DS;

	@FindBy(xpath = "//a[@href='array']")
	WebElement getstarted_Array;

	@FindBy(xpath = "//a[@href='linked-list']")
	WebElement getstarted_LL;

	@FindBy(xpath = "//a[@href='stack']")
	WebElement getstarted_stack;

	@FindBy(xpath = "//a[@href='queue']")
	WebElement getstarted_queue;

	@FindBy(xpath = "//a[@href='tree']")
	WebElement getstarted_tree;

	@FindBy(xpath = "//a[@href='graph']")
	WebElement getstarted_graph;

//	@FindBy(xpath = "//div[@class='row row-cols-1 row-cols-md-3 g-4']/div[5]//a")
//	WebElement queueBtn;

	// webelement for user not logged in alert msg
	@FindBy(xpath = "//div[@class='alert alert-primary']")
	WebElement alertmsg;

	// webelements for dropdown
	@FindBy(xpath = "//a[text()='Data Structures']")
	WebElement dropdown_DS;
	@FindBy(xpath = "//a[text()='Arrays']")
	WebElement dropdown_array;
	@FindBy(xpath = "//a[text()='Linked List']")
	WebElement dropdown_linkedlist;
	@FindBy(xpath = "//a[text()='Stack']")
	WebElement dropdown_stack;
	@FindBy(xpath = "//a[text()='Queue']")
	WebElement dropdown_queue;
	@FindBy(xpath = "//a[text()='Tree']")
	WebElement dropdown_tree;
	@FindBy(xpath = "//a[text()='Graph']")
	WebElement dropdown_graph;

	// Webelement for register
	@FindBy(xpath = "//a[@href='/register']")
	WebElement register;
	@FindBy(xpath = "//a[@href='/login']")
	WebElement login;

	public homePage() {

		PageFactory.initElements(driver, this);
	}

	public void dsalgopage() {

		driver.get(URL);

	}

	public void getStarted(String str) {

		getStarted.click();

	}

	public String getPageTitle() {

		String title = driver.getTitle();
		return title;
		// TODO Auto-generated method stub

	}

	public void homePg() {
		driver.get(home);
	}

	public void getStartedForModule(String string) {
		switch (string) {
		case "Datastructures":
			getstarted_DS.click();
			break;
		case "Arrays":

			getstarted_Array.click();
			break;
		case "Linkedlist":

			getstarted_LL.click();
			break;
		case "Stack":

			getstarted_stack.click();
			break;
		case "Queue":

			getstarted_queue.click();
			break;
		case "Tree":

			getstarted_tree.click();
			break;
		case "Graph":

			getstarted_graph.click();
			break;
		}
	}

	public String alertmsg() {
		String msg = alertmsg.getText();
		return msg;
	}

	// dropdown options
	public void dropdown(String string) {

		dropdown_DS.click();
		switch (string) {
		case "Arrays":

			dropdown_array.click();
			break;
		case "Linkedlist":

			dropdown_linkedlist.click();
			break;
		case "Stack":

			dropdown_stack.click();
			break;
		case "Queue":

			dropdown_queue.click();
			break;
		case "Tree":

			dropdown_tree.click();
			break;
		case "Graph":

			dropdown_graph.click();
			break;
		}

	}

	// register page
	public void click_register() {
		register.click();
	}

	public String reg_url() {
		String regurl = driver.getCurrentUrl();
		return regurl;

	}

	// login page
	public void click_login() {
		login.click();
	}

	public String login_url() {
		String loginurl = driver.getCurrentUrl();
		return loginurl;

	}

	public void dataStructureClick() {

		getstarted_DS.click();
	}

	public void queueClick() {

		getstarted_queue.click();
	}

}
