package Stepdef;

//mport java.awt.List;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import java.util.*;

public class Search {
	
		@When("user searches for product")
		public void user_searches_for_product(io.cucumber.datatable.DataTable a) {
			List<String> productsname=a.asList();
			for(String pro:productsname)
			{
				System.out.println(pro);
			}
		    
		}

		@When("verify")
		public void verify() {
		
		}

		@Then("close the applicaton")
		public void close_the_applicaton() {
		    
		}


	

}
