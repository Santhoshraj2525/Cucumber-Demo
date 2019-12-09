package stepDefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TaggedHookDmeo {

	@Before
	public void setUp() {
		System.out.println("hellow browser");
	}
	
	@After
	public void tearDown() {
		System.out.println("bye bye browser");
	}
	
	@Before("@First")
	public void FirstSetup() {
		System.out.println("Hello first scenario");
	}
	
	@After("@First")
	public void tearFirst() {
		System.out.println("bye bye first scenaerio");
	}
	
	@Before("@Second")
	public void SecondSetup() {
		System.out.println("Hello second scenario");
	}
	
	@After("@Second")
	public void tearSecond() {
		System.out.println("bye bye second scenaerio");
	}
	
	
	@Given("^testing of first step one$")
	public void testing_of_first_step_one() {
		System.out.println("1.1");
	}

	@When("^testing of first step two$")
	public void testing_of_first_step_two() {
		System.out.println("1.2");
	}

	@Then("^testing of first step three$")
	public void testing_of_first_step_three() {
		System.out.println("1.3");
	}

	@Given("^testing of second step one$")
	public void testing_of_second_step_one() {
		System.out.println("2.1");
	}

	@When("^tsting of second step two$")
	public void tsting_of_second_step_two() {
		System.out.println("2.2");
	}

	@Then("^testing of second step three$")
	public void testing_of_second_step_three() {
		System.out.println("2.3");
	}

	@Given("^testing of thrid step one$")
	public void testing_of_thrid_step_one() {
		System.out.println("3.1");
	}

	@When("^testing of third step two$")
	public void testing_of_third_step_two() {
		System.out.println("3.2");
	}

	@Then("^testing of third step three$")
	public void testing_of_third_step_three() {
		System.out.println("3.3");
	}
}
