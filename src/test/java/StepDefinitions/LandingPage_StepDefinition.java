package StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LandingPage_StepDefinition {
	
	public WebDriver driver;
	
	@Given("user is on amazon landing page")
	public void user_is_on_amazon_landing_page() {
		
		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver", "Users\\sj109646\\Desktop\\chromediver");
		
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
	}


}
