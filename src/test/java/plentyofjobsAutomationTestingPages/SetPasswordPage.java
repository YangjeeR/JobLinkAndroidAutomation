package plentyofjobsAutomationTestingPages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class SetPasswordPage extends BasePageObject {
	
	private By codeLocator=By.id("com.joblinkplus.app:id/etVerification");
	private By resendLocator=By.id("com.joblinkplus.app:id/tv_resendCode");
	private By newPasswordLocator=By.id("com.joblinkplus.app:id/etNewPassword");
	private By confirmPasswordLocator=By.id("com.joblinkplus.app:id/etConfirmPassword");
	private By continueBtnLocator=By.id("com.joblinkplus.app:id/btn_get_started");
	private By okbuttonLocator=By.id("android:id/button1");
	
	  public SetPasswordPage(AppiumDriver<MobileElement> driver,Logger log)
	    {
	    	super(driver,log);
	    }
	  

	  
	  public void setNewPassword(String code,String newPassword,String confirmPassword) throws InterruptedException
		{
	    	log.info("Enter code");
	    	Thread.sleep(5000);
			type(code,codeLocator);
			type(newPassword,newPasswordLocator);
			type(confirmPassword,confirmPasswordLocator);
			click(continueBtnLocator);
			//clickResend();

			

		}
	  
	  public SetPasswordPage clickResend()
	  {
		log.info("Clicking on Resend code link");
		click(resendLocator);
		return new SetPasswordPage(driver,log);
	  }
	  
	  public void clickOkbtn()
	  {
		log.info("Clicking on ok button");
		click(okbuttonLocator);

	  }

	  
	  
}
