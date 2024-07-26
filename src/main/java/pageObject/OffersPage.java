package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OffersPage {
	public WebDriver driver;
		
	By search=By.xpath("//*[@type='search']");
	
	By ProductName	=By.cssSelector("tr td:nth-child(1)");

	//********************constructor**********
	public OffersPage(WebDriver driver) {
		
		this.driver=driver;
	}
	
	//***********************************
	
	
	public void SearchItem(String name) {
		
		driver.findElement(search).sendKeys(name);

	}
	public String GetproductName() {
		return driver.findElement(ProductName).getText();
	}

}
		