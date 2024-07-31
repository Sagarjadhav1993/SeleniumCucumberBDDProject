	package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
	public WebDriver driver;
		
	By search=By.xpath("//*[@type='search']");
	
	By ProductName	=By.cssSelector("h4.product-name");
	
	By topdeals= By.linkText("Top Deals");

	//********************constructor**********
	public LandingPage(WebDriver driver) {
		
		this.driver=driver;
	}
	
	//***********************************
	
	
	public void SearchItem(String name) {
		
		driver.findElement(search).sendKeys(name);

	}
	public String GetproductName() {
		return driver.findElement(ProductName).getText();
	}

	public void selectTopDeals() {
		
		driver.findElement(topdeals).click();
	}
	
}
