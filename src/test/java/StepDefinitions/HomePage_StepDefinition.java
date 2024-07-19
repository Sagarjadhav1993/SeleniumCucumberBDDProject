package StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.github.dockerjava.api.model.Driver;

import actiondriver.Action;
import base.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HomePage_StepDefinition {
	
	@When("user search {string} in search box")
	public void user_search_in_search_box(String ProductName) {
		
	}

	@And("hit enter")
	public void hit_enter() {
		
	}

	@Then("user navigated to search result page")
	public void user_navigated_to_search_result_page() {
	
	}

	@When("user click on Add to carts from search result page")
	public void user_click_on_add_to_carts_from_search_result_page() {
	
	}

	@And("user click on My cart")
	public void user_click_on_my_cart() {

	}

	@Then("user navigate to My cart and see list of products")
	public void user_navigate_to_my_cart_and_see_list_of_products() {
	
	}

}
