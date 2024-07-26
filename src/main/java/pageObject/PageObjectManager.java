package pageObject;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
	
	public LandingPage landpage;
	public OffersPage offer;
	public WebDriver driver;
	
	//*****constructor****
	public PageObjectManager(WebDriver driver) {
		this.driver=driver;
	}
	
	//******Method*******
	public LandingPage getLandingPage() {
		landpage=new LandingPage(driver);
		return landpage;
	}
	
	public OffersPage getOfferPage() {
		offer=new OffersPage(driver);
		return offer;
	}

}
