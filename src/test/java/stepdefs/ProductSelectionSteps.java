package stepdefs;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProductSelectionSteps {

	WebDriver driver = BaseClass.driver;
	
	@Given("^User has landed on the Product page$")
	public void user_has_landed_on_the_product_page(){
		
		 WebElement ProductPageTitle = driver.findElement(By.xpath("//*[@class='title']"));
			String ActualText =  ProductPageTitle.getText();
			String ExpectedText = "PRODUCTS";
			Assert.assertEquals(ExpectedText, ActualText);
	    }
	 
	 @When("^User selects the product \"([^\"]*)\"$")
	 public void user_selects_the_product_something(String product) {
		
		  driver.manage().timeouts().implicitlyWait(50000, TimeUnit.MILLISECONDS);
		  WebElement buttonProductSelect = driver.findElement(By.xpath("//*[text()= '" + product + "']//following::button[1]"));
		  buttonProductSelect.click();
	    }
	  
	 @And("^Click on the Add To Cart button$")
	 public void click_on_the_add_to_cart_button() {
		  WebElement addtoCartIcon = driver.findElement(By.xpath("//*[@class='shopping_cart_link']"));
		  addtoCartIcon.click();
	      
	    }

	  @Then("^Product added successfully to the cart$")
	  public void product_added_successfully_to_the_cart(){
		  
	    	List<WebElement> iteminCart = driver.findElements(By.xpath("//*[@class ='cart_item']"));
	    	int ProductsCount = iteminCart.size();
	    	System.out.println("Product added successfully count is: " + ProductsCount);
		 
	    }
	  
	  @When("^User selects the products$")
	  	public void user_selects_the_products(DataTable table) {
		  
	    	String products[]= {table.cell(1, 1),table.cell(2, 1),table.cell(3, 1)};
	    	 
		      for(int i=0;i<products.length;) {
		    	   
		        driver.manage().timeouts().implicitlyWait(50000, TimeUnit.MILLISECONDS);
		        WebElement buttonProductSelect = driver.findElement(By.xpath("//*[text()= '" + products[i] + "']//following::button[1]"));
			    buttonProductSelect.click();
			    i++;
			
	    }
		       
		       WebElement addtoCartIcon = driver.findElement(By.xpath("//*[@class='shopping_cart_link']"));
				  addtoCartIcon.click();       
	  
	  }
}