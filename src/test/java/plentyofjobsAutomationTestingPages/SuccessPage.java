package plentyofjobsAutomationTestingPages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class SuccessPage extends BasePageObject{
	
	private By successMessage=By.id("com.joblinkplus.app:id/tvJobPreferenceTitle");
	
	
	  public SuccessPage(AppiumDriver<MobileElement> driver,Logger log)
	    {
	    	super(driver,log);
	    }
	  
	  public String getSuccessMessage()
	  {
		  log.info("Success Message");
		  return find(successMessage).getText();
	  }
	  

}
