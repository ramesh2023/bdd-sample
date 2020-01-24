package bdd.stepDefinitions;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinition {
	
	@Given("I navigate to Github login page")
	public void login() {
		System.out.println("in login");
	}
	
	
	@When("^I enter valid \"([^\"]*)\" and \"([^\"]*)\"$")
	public void enterDetails(String user, String password) {
		System.out.println(user +"  Enter details--"+password);
	}

	@When("I click on login button")
	public void clickLogin() {
		System.out.println("Click Login");
		Assert.assertEquals(1,1);
	}
	
	@Then("Login should be successful")
	public void loginButton() {
		System.out.println("Login button");
	}
}
