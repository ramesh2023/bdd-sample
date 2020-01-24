package bdd.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LogoutStepDefinition {
	
	@Given("I click logout button")
	public void logout() {
		System.out.println("Click on logout");
	}
	
	@Then("Logout should be successful")
	public void checkLogout() {
		System.out.println("check logout");
	}

}
