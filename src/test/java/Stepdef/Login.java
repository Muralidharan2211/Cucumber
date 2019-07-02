package Stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login {
	WebDriver driver;
	@Given("user opens login page in newtour application")
	public void user_opens_login_page_in_newtour_application() {
	//   System.out.println("User enters newtour application");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_c2a.04.29\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://www.newtours.demoaut.com/");
		//driver.manage().window().maximize();
		
	}

	@When("user enter username as {string} and password as {string}")
	public void user_enter_username_as_and_password_as(String string, String string2) {
		// System.out.println("Username and password is entered");
		PageFactory.initElements(driver, Pageobject.class);
		Pageobject.un.sendKeys(string);
		Pageobject.pwd.sendKeys(string2);
		
		
	}

	@When("click submit button")
	public void click_submit_button() {
		PageFactory.initElements(driver, Pageobject.class);
	
	Pageobject.ok.click();
	
	  
	}

	@Then("verify Login success")
	public void verify_Login_success() {
		 System.out.println("Login is verified");
	    
	}

}
