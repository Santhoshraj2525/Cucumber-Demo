package stepDefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HooksDemo {
	
	/*
	 * @Before public void setUP() { System.out.println("Browser is launched"); }
	 * 
	 * @After public void tearDown() { System.out.println("Closing the browser"); }
	 */
	
	
	@Given("^user is on contacts page$")
	public void user_is_on_contacts_page() throws Throwable {
	   System.out.println("user navigates to contacts page");
	}

	@When("^user enteed details and click the save button$")
	public void user_enteed_details_and_click_the_save_button() {
	   System.out.println("user entered contacts and click the save button");
	}

	@Then("^contacts should be created$")
	public void contacts_should_be_created() {
	    System.out.println("Contacts got created");
	}

	@Given("^user is on Deals page$")
	public void user_is_on_Deals_page() {
		System.out.println("user navigates to deals page");
	}

	@When("^entered deals details and click the save button$")
	public void entered_deals_details_and_click_the_save_button() {
		System.out.println("user entered deals and click the save button");
	}

	@Then("^deals should be created$")
	public void deals_should_be_created() {
		System.out.println("Deals got created");
	}

	@Given("^user is on mail page$")
	public void user_is_on_mail_page() {
	    System.out.println("mails page get started");
	}

	@When("^user enter credentials$")
	public void user_enter_credentials() {
	    System.out.println("entered credentials");
	}

	@Then("^mail is logged in$")
	public void mail_is_logged_in() {
	    System.out.println("user is logged in");
	}
	
}
