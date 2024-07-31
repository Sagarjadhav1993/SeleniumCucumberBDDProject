package utils;

import org.openqa.selenium.WebDriver;

import pageObject.PageObjectManager;

public class Constant {
	
	public WebDriver driver;
	public PageObjectManager pageObjectMg;
	public String landingPageproductName;
	public String offerpageProductName;
	public TestBase base;
	public GenericUtils genUtils;
	
	public Constant() {
		base=new TestBase();
		pageObjectMg=new PageObjectManager(base.WebDriverManager());
		genUtils=new GenericUtils(base.WebDriverManager());
	}


}
 