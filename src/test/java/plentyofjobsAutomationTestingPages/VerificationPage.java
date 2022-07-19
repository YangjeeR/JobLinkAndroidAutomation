package plentyofjobsAutomationTestingPages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class VerificationPage extends BasePageObject {
	
	private By codeLocator=By.id("com.joblinkplus.app:id/etEmail");
	private By resendLocator=By.id("com.joblinkplus.app:id/tv_resendCode");
	private By continueBtnLocator=By.id("com.joblinkplus.app:id/btn_get_started");
	
	  public VerificationPage(AppiumDriver<MobileElement> driver,Logger log)
	    {
	    	super(driver,log);
	    }
	  

	  
	  public void VerifyCode(String code) throws InterruptedException
		{
	    	log.info("Enter code");
	    	Thread.sleep(5000);
			type(code,codeLocator);
			//clickResend();
			clickContinue();
			

		}
	  
	  public VerificationPage clickResend()
	  {
		log.info("Clicking on Resend code link");
		click(resendLocator);
		return new VerificationPage(driver,log);
	  }

	  public SignUpPage clickContinue()
			{
				log.info("clicking Continue button");
				click(continueBtnLocator);
				return new SignUpPage(driver,log);
			}
	  
	  
}
