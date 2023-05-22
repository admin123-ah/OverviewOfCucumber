package Binding;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Bindings {
	
	@Given("I am on the home page")
	public void i_am_on_the_home_page() {
	String HomePageTitle = 	Hooks.driver.getTitle();
	assertEquals(HomePageTitle, "JPetStore Demo");
	Hooks.driver.findElement(By.xpath("//a[text()= 'Enter the Store']")).click();
	Hooks.driver.findElement(By.xpath("//a[text()= 'Sign In']")).click();
	
	
	   
	}
	
	@Given("I logged in successfully with {string} and {string}")
	public void i_logged_in_successfully_with_and(String string, String string2) {
	    Hooks.driver.findElement(By.xpath("//input[@name = 'username']")).sendKeys(string);
	    Hooks.driver.findElement(By.xpath("//input[@name = 'password']")).clear();
	    Hooks.driver.findElement(By.xpath("//input[@name = 'password']")).sendKeys(string2);
	    Hooks.driver.findElement(By.xpath("//input[@value = 'Login']")).click();
	}

	@When("I add Fish with SKU {string} to the cart")
	public void i_add_fish_with_sku_to_the_cart(String string) {
		
		Hooks.driver.findElement(By.xpath("(//a[contains(@href,'FISH')])[1]")).click();
		Hooks.driver.findElement(By.xpath("//a[text()= 'FI-SW-01']")).click();
		Hooks.driver.findElement(By.xpath("(//a[text()= 'Add to Cart'])[1]")).click();
		
		
	  
	   
	}

	@When("I proceed to checkout")
	public void i_proceed_to_checkout() {
	  Hooks.driver.findElement(By.xpath("//a[text()= 'Proceed to Checkout']")).click();
	  
	   
	}

	@When("I continue to the next step")
	public void i_continue_to_the_next_step() {
		Hooks.driver.findElement(By.xpath("//input[@name = 'newOrder']")).click();
	   
	}

	@When("I confirm the order")
	public void i_confirm_the_order() {
		
		Hooks.driver.findElement(By.xpath("//a[text() = 'Confirm']")).click();
	  
	   
	}

	@Then("I should see a confirmation message for the order submission")
	public void i_should_see_a_confirmation_message_for_the_order_submission() {
		String confirmMsg = Hooks.driver.findElement(By.xpath("//li")).getText();
		assertEquals(confirmMsg, "Thank you, your order has been submitted.");
	   
	}

	@Given("I am on the PetStore home page")
	public void i_am_on_the_pet_store_home_page() {
		
		Hooks.driver.findElement(By.xpath("//a[text() = 'Return to Main Menu']")).click();
	   
	}
	
	@Given("I clicked on birds")
	public void i_clicked_on_birds() {
		Hooks.driver.findElement(By.xpath("(//a[contains(@href,'BIRDS')])[1]")).click();
	}

	
	@When("I add Birds with SKU to the cart")
	public void i_add_birds_with_sku_to_the_cart(io.cucumber.datatable.DataTable dataTable) {
	   List<List<String>> data = dataTable.asLists();
	   String txt= data.get(0).get(0); 
	   Hooks.driver.findElement(By.xpath("//a[text()= '"+txt+"']")).click();
	   Hooks.driver.findElement(By.xpath( "//table//td[contains(text()"
	   		+ ",'"+txt+"')]/following-sibling::td/a")).click();
	   
	   
	
	
	}


}
