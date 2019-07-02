package Stepdef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class Back {
	@Given("user enter uid and pwd")
	public void user_enter_uid_and_pwd() {
	   System.out.println("User enters userid and password");
	}

	@Given("click signin")
	public void click_signin() {
		 System.out.println("Click signin");
	}

	@When("user enters bat")
	public void user_enters_bat() {
		System.out.println("Search the Required product");
	}

	@When("user adding the searched product to the cart")
	public void user_adding_the_searched_product_to_the_cart() {
		System.out.println("Added to cart");
	}

	@When("user performs payment process")
	public void user_performs_payment_process() {
		System.out.println("payment process ongoing");
	}

	@When("user logout of application")
	public void user_logout_of_application() {
		System.out.println("Click signout");
	}



}
