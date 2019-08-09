package casestudy;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
@CucumberOptions(features = "Resources", glue = "casestudy", monochrome = true, plugin = {
		"pretty", "json:target/casestudy.json" } , tags = {"@case4"},dryRun=false)
public class runner extends AbstractTestNGCucumberTests {

}

