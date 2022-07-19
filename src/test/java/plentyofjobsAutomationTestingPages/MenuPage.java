package plentyofjobsAutomationTestingPages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class MenuPage extends BasePageObject {
	
	private By MenuLocator=By.xpath("//android.widget.FrameLayout[@content-desc=\"MENU\"]/android.widget.FrameLayout/android.widget.ImageView");
	private By Joblocator=By.xpath("//android.widget.FrameLayout[@content-desc=\"JOBS\"]/android.widget.FrameLayout/android.widget.ImageView");

	
	  public MenuPage(AppiumDriver<MobileElement> driver,Logger log)
	    {
	    	super(driver,log);
	    }
	  
	  public void TapMenu() throws Exception
	  {
		  log.info("Tap on Jobs and Menu");
		  click(Joblocator);
		  click(MenuLocator);
		  SwipeVeritical();
	  }
	  
	  


}
