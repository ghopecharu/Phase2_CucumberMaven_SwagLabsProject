package stepdefs;


import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class LoginSteps {
	
     WebDriver driver = BaseClass.driver;

	  @Given("^User has opened the SwagLabs application$")
      public void user_has_opened_the_swaglabs_application(){
		  
	    	   driver.get("https://www.saucedemo.com/");
		       driver.manage().window().maximize();
		       driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
	       }
	       

	    @When("^User enters the username \"([^\"]*)\"$")
	    public void user_enters_the_username_something(String username) {
	    	
	    	   WebElement userName = driver.findElement(By.xpath("//*[@name ='user-name']"));
			   userName.sendKeys(username);
	       }

	     @Then("^User should be landed on the swaglabs product Page$")
	     public void user_should_be_landed_on_the_swaglabs_product_page(){
	    	 
	    	   WebElement ProductPageTitle = driver.findElement(By.xpath("//*[@class='title']"));
	    	   String ActText = ProductPageTitle.getText();
	    	   String ExpText = "PRODUCTS";
	    	  Assert.assertEquals(ExpText, ActText);
	       }

	     @And("^User enters the password \"([^\"]*)\"$")
	     public void user_enters_the_password_something(String password) {
	    	 
	    	   WebElement Password = driver.findElement(By.xpath("//*[@id = 'password']"));
	   	       Password.sendKeys(password);
	       }

	      @And("^User clicks on LOGIN button$") 
	      public void user_clicks_on_login_button() {
	    	   
	    	   WebElement Login_button = driver.findElement(By.xpath("//input[@id='login-button']"));   //Login button
			    Login_button.click();
	       }

	      @Then("^User should see the error message \"([^\"]*)\"$")
	      public void user_should_see_the_error_message_something(String Experror) {
	    	  
	    	   WebElement ErrorMsg = driver.findElement(By.xpath("//*[@data-test='error']"));   //Login button
			  String ActError = ErrorMsg.getText();
			  Assert.assertEquals(Experror, ActError);
	       }

	   }


