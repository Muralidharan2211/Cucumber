package Stepdef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginApp {
	@Given("Open newtour app")
	public void open_newtour_app() {
		System.out.println("Open newtour app");
	}
	    

	@When("User enters username as {string} and password as {string}")
	public void user_enters_username_as_and_password_as(String un, String ps) {
		System.out.println("enter username as"+un+"password as "+ps);
	}
	    
	

	@When("submit Login form")
	public void submit_Login_form() {
		
		System.out.println("Click on login");
	}
	@Then("verify pass")
	public void verify_pass() {
		System.out.println("passed");
	    
	}

	@Then("verify fail")
	public void verify_fail() {
		System.out.println("Failed");
	    
	}



}
