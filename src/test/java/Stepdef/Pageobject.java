package Stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pageobject {
	
	WebDriver driver;
	//Pageobject()
	//{
	//PageFactory.initElements(driver, this);
	//}
	@FindBy(name="userName") public static WebElement un;
	@FindBy(name="password") public static WebElement pwd;
	@FindBy(name="login") public static WebElement ok;

}
