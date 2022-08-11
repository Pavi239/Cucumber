package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class Definition {
	
	WebDriver driver;

	
	@Given("Open the browser and go to the Login page swaglabs")
	public void open_the_browser_and_go_to_the_login_page_swaglabs() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://parabank.parasoft.com/parabank/index.html");
	}
	@When("Enter the username")
	public void enter_the_username() {
		driver.findElement(By.name("username")).sendKeys("pavi");
	}
	@When("Enter the password")
	public void enter_the_password() {
		 driver.findElement(By.name("password")).sendKeys("pavi123");
	}
	@When("Click on login-button")
	public void click_on_login_button() {
		driver.findElement(By.className("button")).click();
	}
	@Then("Login should be successfull")
	public void login_should_be_successfull() {
	String Expectedname =	driver.findElement(By.xpath("//*[@p/b/'Welcome']")).getText();
	String Actualname = "Welcome pavi sundhar";
	Assert.assertEquals(Expectedname, Actualname);
	driver.close();
	    
	}



	}



	

	








