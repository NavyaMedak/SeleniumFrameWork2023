package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	@Given("user is on login page")
	public void user_is_on_login_page() {
	   System.out.println("Login page");
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
		 System.out.println("U and P");
	}

	@And("click on login button")
	public void click_on_login_button() {
		 System.out.println("Click Login button");
	}

	@Then("user is navigate to home page")
	public void user_is_navigate_to_home_page() {
		 System.out.println("Home Page");
	}
	
	
	
	
	
	
	
	

}
