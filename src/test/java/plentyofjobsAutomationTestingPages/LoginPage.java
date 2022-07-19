package plentyofjobsAutomationTestingPages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class LoginPage extends BasePageObject{
	
	
	private By emailLocator=By.id("com.joblinkplus.app:id/etEmail");
	private By passwordLocator=By.id("com.joblinkplus.app:id/etPassword");
	private By continueBtnLocator=By.id("com.joblinkplus.app:id/btn_get_started");
	private By backbtnLink=By.id("com.joblinkplus.app:id/ivBack");
	private By contactUsLink=By.id("com.joblinkplus.app:id/tvContactUs");
	private By ForgotPasLink=By.id("com.joblinkplus.app:id/tvContactUs");
	

	  public LoginPage(AppiumDriver<MobileElement> driver,Logger log)
	    {
	    	super(driver,log);
	    }

	  
	  public void LoginForm(String Email, String Password) throws InterruptedException
		{
	    	log.info("Adding email and password");
			type(Email,emailLocator);	
			type(Password,passwordLocator);	
			clickContact();
			Thread.sleep(2000);
			clickBackbtn();
			Thread.sleep(2000);
			clickContinue();
		}
	  
	  
	  public SignUpPage clickContinue()
		{
			log.info("clicking Continue button");
			click(continueBtnLocator);
			return new SignUpPage(driver,log);
		}
	  
	   public LandingScreenPage clickContact()
		 	{
		 		log.info("clicking contact us link");
		 		click(contactUsLink);
		 		return new LandingScreenPage(driver,log);
		 	}
		    
		    public LandingScreenPage clickBackbtn()
		   	{
		   		log.info("clicking back button");
		   		click(backbtnLink);
		   		return new LandingScreenPage(driver,log);
		   	}

}
