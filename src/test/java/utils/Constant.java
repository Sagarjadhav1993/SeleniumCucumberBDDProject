package utils;

import org.openqa.selenium.WebDriver;

import pageObject.PageObjectManager;

public class Constant {
	
	public WebDriver driver;
	public PageObjectManager pageObjectMg;
	public String landingPageproductName;
	public String offerpageProductName;
	
	public Constant() {
		pageObjectMg=new PageObjectManager(driver);
	}


}
