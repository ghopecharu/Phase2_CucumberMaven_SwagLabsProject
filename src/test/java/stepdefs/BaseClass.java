package stepdefs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class BaseClass {
    public static WebDriver driver;
	@Before
	public void setup() {
      
	       System.setProperty("webdriver.chrome.driver", "chromedriver");
		   driver= new ChromeDriver();
		
        }
	
	@After
	public void teardown() {
		 WebElement OpenMenu = driver.findElement(By.xpath("//*[@id='react-burger-menu-btn']"));
		 OpenMenu.click();  
		 WebElement logout = driver.findElement(By.xpath("//*[@id='logout_sidebar_link']"));
		 logout.click(); 
		 
		
	//driver.quit();
	 }
	
}

