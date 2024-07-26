package StepDefinitions;

import java.util.Iterator;
import java.util.Set;

import org.bouncycastle.oer.its.ieee1609dot2.basetypes.PublicEncryptionKey;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObject.LandingPage;
import utils.Constant;

public class LandingPageStepDefinition {
	
	public WebDriver driver;
	public String landingPageproductName;
	public String offerpageProductName;
	Constant cn;                             //create globle variable of Constant	

	public LandingPageStepDefinition(Constant cn){   //create constructor to access constant element
		this.cn=cn;
	}
	
	@Given("User is on Greenkart landing page")
	public void user_is_on_greenkart_landing_page() throws InterruptedException {
	   
		WebDriverManager.chromedriver().setup();
	    cn.driver=new ChromeDriver();
		cn.driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		Thread.sleep(1000);

	}
	
	@When("User search with shortname {string} and extracted actual name of product")
	public void user_search_with_shortname_tom_and_extracted_actual_name_of_product(String shortname) throws InterruptedException {
	    
		LandingPage landPage=cn.pageObjectMg.getLandingPage();
		landPage.SearchItem(shortname);
		Thread.sleep(1000);
		cn.landingPageproductName =landPage.GetproductName().split("-")[0].trim();
		Thread.sleep(1000);
		System.out.println(landingPageproductName + "Product name is extracted from Home Page");
	}
}
