package plentyofjobsAutomationTestingPages;

import org.apache.logging.log4j.Logger;

import org.openqa.selenium.By;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class LandingScreenPage extends BasePageObject {
	
    private By getStartedLink=By.id("com.joblinkplus.app:id/btn_get_started");
    private By loginLink=By.id("com.joblinkplus.app:id/tv_login_here");
    private By contactUsLink=By.id("com.joblinkplus.app:id/contact_us");
    private By backbtnLink=By.id("com.joblinkplus.app:id/ivBack");
    
	
	
    public LandingScreenPage(AppiumDriver<MobileElement> driver,Logger log)
    {
    	super(driver,log);
    }
    
    public LandingScreenPage getStarted() throws InterruptedException
	{
    	
    	log.info("Checking landing screen");
    	clickLogin();
    	Thread.sleep(2000);
    	clickBackbtn();
    	Thread.sleep(2000);
		clickContact();
		Thread.sleep(2000);
		clickBackbtn();
		Thread.sleep(2000);
		log.info("clicking get started button");
		click(getStartedLink);
		return new LandingScreenPage(driver,log);
	}
    
    public LandingScreenPage clickLogin()
 	{
 		log.info("clicking login here link");
 		click(loginLink);
 		return new LandingScreenPage(driver,log);
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