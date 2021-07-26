package stepdefs;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
	     monochrome = true,
             plugin= {"pretty","html:target/cucumber-html","json:target/cucumber.json"},
	     features = {"classpath:features"},
	     glue= {"stepdefs"}
		 // features = "src/test/java/features",
	         // tags= {"@LoginFeature"},
		)
public class TestRunner {

}

//tags= {"@NegativeLogin"},
	// tags= {"@NegativeLogin,@PositiveLogin"},
	//tags= {"@NegativeLogin","@Sanity"},
	    
