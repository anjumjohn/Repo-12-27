package runner;

import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features",
				glue= {"stepdefinition","hooks"},
				plugin = {"pretty", "html:target/dsalgo.html",
						"json:target/dsalgo.json",
						"junit:target/dsalgo.xml",
						"pretty:target/dsalgo.txt"},
				monochrome = true,
				tags = "@Array",
				dryRun = false
		)
public class TestRunner extends AbstractTestNGCucumberTests{
	
	//@DataProvider(parallel=true)
	//public Object[][]scenario() {
		//return super.scenarios();
	}
	
	
//}	


