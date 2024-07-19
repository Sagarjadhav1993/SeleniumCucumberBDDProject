package runner;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.testng.annotations.BeforeClass;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


//@RunWith(Cucumber.class)     -->use for when use Junit not this line for TestNG, In TestNG We extend class AbstractTestNGCucumberTests
@CucumberOptions(features="src\\test\\java\\features",
glue= {"StepDefinitions"},
monochrome=true)

public class TestRunner extends AbstractTestNGCucumberTests{
	
}


