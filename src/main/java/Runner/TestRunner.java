package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\hp\\eclipse-workspace\\FreeCRMwithBDD\\src\\main\\java\\Features\\TagsDemo.feature",
		glue= {"stepDefinitions"},
		format= {"pretty","html:test-output","json:json_cucumber/cucumber.json"},
		dryRun=false,
		monochrome=true,
		strict=true,
		tags= {"~@SmokeTest", "~@EndtoEndTest"})

public class TestRunner {
	
}
