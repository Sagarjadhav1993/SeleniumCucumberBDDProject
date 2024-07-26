package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class)     -->use for when use Junit not this line for TestNG, In TestNG We extend class AbstractTestNGCucumberTests
@CucumberOptions(features ="src/test/java/features",
glue = "StepDefinitions",monochrome = true,
plugin = {"pretty","html:target/HtmlReport/Cucumber.html",
		"json:target/JsonReport/Cucumber.json"})

public class TestNGRunner extends AbstractTestNGCucumberTests{
	
}


