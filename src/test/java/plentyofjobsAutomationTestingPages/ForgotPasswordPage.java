package plentyofjobsAutomationTestingPages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class ForgotPasswordPage extends BasePageObject{
	
	private By loginLink=By.id("com.joblinkplus.app:id/tv_login_here");
	private By ForgotPasLink=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.TextView[2]");
	private By emaillocator=By.id("com.joblinkplus.app:id/etEmail");
	private By continuebtnlocator=By.id("com.joblinkplus.app:id/btn_get_started");
	
	  public ForgotPasswordPage(AppiumDriver<MobileElement> driver,Logger log)
	    {
	    	super(driver,log);
	    }
	  
	  public void ForgotPassword()
		{
			log.info("clicking on login link");
			click(loginLink);
			log.info("clicking on forgot password link");
			click(ForgotPasLink);
		}

	  public void setEmail(String Email)
	  {
		  log.info("Add email address");
		  type(Email,emaillocator);
		  
	  }
	  
	  public void Continuebtn()
	  {
		  log.info("Click Continue button");
		  click(continuebtnlocator);
		  
	  }
}
