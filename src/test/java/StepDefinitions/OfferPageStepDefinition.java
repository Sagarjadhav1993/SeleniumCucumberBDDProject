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
import pageObject.OffersPage;
import pageObject.PageObjectManager;
import utils.Constant;

public class OfferPageStepDefinition {
	
	public WebDriver driver;
	public String landingPageproductName;
	public String offerpageProductName;
	PageObjectManager pageObjectMg;
	Constant cn;

	public OfferPageStepDefinition(Constant cn){   //create constructor to access constant element
		this.cn=cn;
	}
	
	@And("User search for {string} shortname in offer page")
	public void user_search_for_same_shortname_in_offer_page_to_check_if_products_exist(String shortname) throws InterruptedException {
		OffersPage offers=new OffersPage(cn.driver);
		LandingPage landPage=cn.pageObjectMg.getLandingPage();
		
	    landPage.selectTopDeals();
	   Thread.sleep(1000);
	   switchtoOfferpage();
	   
	   offers.SearchItem(shortname);
	   Thread.sleep(1000);
	   cn.offerpageProductName=offers.GetproductName();
	}
		
	   public void switchtoOfferpage() {
		   //skip below part , if it already switch to offer page
		   Set<String> Windows=cn.driver.getWindowHandles();	   
		   for (String Window : Windows) {
			   cn.driver.switchTo().window(Window);
	     	}
		
	   }
	   
	
	@Then("Validate product name in offers page matches with landing page")
	public void validate_product_name_in_offers_page_matches_with_landing_page() {
	    
		Assert.assertEquals(landingPageproductName, offerpageProductName);
		cn.driver.quit();
	}

}
