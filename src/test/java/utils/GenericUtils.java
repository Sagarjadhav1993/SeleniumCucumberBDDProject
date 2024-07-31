package utils;

import java.util.Set;

import org.openqa.selenium.WebDriver;

public class GenericUtils {
	WebDriver driver;
	
	public GenericUtils(WebDriver driver){
		this.driver=driver;
	}
	
	public void SwitchWindowToChild() {
		 //skip below part , if it already switch to offer page
		   Set<String> Windows=driver.getWindowHandles();	   
		   for (String Window : Windows) {
			   driver.switchTo().window(Window);
	     	}
	}

}
	