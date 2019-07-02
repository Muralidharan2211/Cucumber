package Stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Signup {
	WebDriver driver;
	@Given("User open Signup page")
	public void user_open_Signup_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_c2a.04.29\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://www.newtours.demoaut.com/");
		driver.manage().window().maximize();
		WebElement reg=driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a"));
		reg.click();
		
	    
	}

	@When("User enter fname as {string}")
	public void user_enter_fname_as(String fname) {
		WebElement fn=driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/input"));
		fn.sendKeys(fname);
	    
	}

	@When("User enters lname as {string}")
	public void user_enters_lname_as(String lname) {
		WebElement ln= driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[3]/td[2]/input"));
		ln.sendKeys(lname);
	}

	@When("User enters pne as {string}")
	public void user_enters_pne_as(String pne) {
		WebElement phone=driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[4]/td[2]/input"));
		phone.sendKeys(pne);
		
	  
	}

	@When("User enters e-mail as {string}")
	public void user_enters_e_mail_as(String email) {
		WebElement mail=driver.findElement(By.id("userName"));
	    mail.sendKeys(email);
	}

	@When("User enters add as {string}")
	public void user_enters_add_as(String string) {
	   
	}

	@When("User enters Cty as {string}")
	public void user_enters_Cty_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@When("User enters ste as {string}")
	public void user_enters_ste_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@When("User enters pcode as {string}")
	public void user_enters_pcode_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@When("User enters ctry as {string}")
	public void user_enters_ctry_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@When("User enters uname as {string}")
	public void user_enters_uname_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@When("User enters pwd as {string}")
	public void user_enters_pwd_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@When("User enters cpwd as {string}")
	public void user_enters_cpwd_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("Click submit button")
	public void click_submit_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("verified signup success message")
	public void verified_signup_success_message() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

}
