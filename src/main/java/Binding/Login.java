package Binding;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {

	@Given("I am on the PetStore website")
	public void i_am_on_the_pet_store_website() {

		System.out.println("****I am on the PetStore website****");

	}

	@Given("I am on the login page")
	public void i_am_on_the_login_page() {

		System.out.println("****I am on the login page****");
	}

	@When("I enter {string} and {string}")
	public void i_enter_and(String string, String string2) {

		System.out.println("I enter " + string + " and " + string2 + "");

	}

	@When("I click the login button")
	public void i_click_the_login_button() {

		System.out.println("I click the login button");

	}

	@Then("I should be on the home page")
	public void i_should_be_on_the_home_page() {

		System.out.println("I should be on the home page");

	}

	@Then("I should see my username {string}")
	public void i_should_see_my_username(String string) {

		System.out.println("I should see my username " + string + "");

	}
}
