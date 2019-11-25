package stepDefinitions;

import cucumber.api.java.en.Given;

public class TagsDemoWithBDD {

	@Given("^This is a valid scenario$")
	public void this_is_a_valid_scenario() throws Throwable {
	  System.out.println("Smoke, Regression, End2End"); 
	}

	@Given("^this is negative scenairo$")
	public void this_is_negative_scenairo() throws Throwable {
		System.out.println("Regression");
		}

	@Given("^user should be in home page$")
	public void user_should_be_in_home_page() throws Throwable {
		 System.out.println("Regression");
	}

	@Given("^Home page title should be FreeCRM$")
	public void home_page_title_should_be_FreeCRM() throws Throwable {
		 System.out.println("Smoke");
	}

	@Given("^user should be able to navigate to Contacts page$")
	public void user_should_be_able_to_navigate_to_Contacts_page() throws Throwable {
		 System.out.println("Regression");
	}

	@Given("^COntacts page should have contact list$")
	public void contacts_page_should_have_contact_list() throws Throwable {
		 System.out.println("Smoke");
	}

	@Given("^user able to add new contacts$")
	public void user_able_to_add_new_contacts() throws Throwable {
		 System.out.println("Regression");
	}

	@Given("^user should be able to navigate to deals page$")
	public void user_should_be_able_to_navigate_to_deals_page() throws Throwable {
		 System.out.println("Smoke");
	}

	@Given("^Delas page should have deals list$")
	public void delas_page_should_have_deals_list() throws Throwable {
		 System.out.println("End2End");
	}

	@Given("^Santhosh should able to add the deals$")
	public void santhosh_should_able_to_add_the_deals() throws Throwable {
		 System.out.println("End2End");
	}

}
