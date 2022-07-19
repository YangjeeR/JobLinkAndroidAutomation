package plentyofjobsAutomationTestingPages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class LogOutPage extends BasePageObject {
	
	private By logoutlocator=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout[6]/android.widget.TextView");
	
	
	
	public LogOutPage(AppiumDriver<MobileElement> driver,Logger log)
	    {
	    	super(driver,log);
	    }
	  
	public void clickLogout()
	{
		log.info("Log out from the app");
		click(logoutlocator);
	
		
	}

}
