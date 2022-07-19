package plentyofjobsAutomationTestingPages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class SignUpPage extends BasePageObject{
	
	private By firstNameLocator=By.id("com.joblinkplus.app:id/etFirstName");
	private By lastNameLocator=By.id("com.joblinkplus.app:id/etLastName");
	private By emailLocator=By.id("com.joblinkplus.app:id/etEmail");
	private By passwordLocator=By.id("com.joblinkplus.app:id/etPassword");
	private By continueBtnLocator=By.id("com.joblinkplus.app:id/btn_get_started");
	private By dateLocator=By.id("com.joblinkplus.app:id/etDob");
	private By selectDateLocator=By.xpath("//android.view.View[@content-desc=\"05 July 2022\"]");
	private By OkButtonLocator=By.id("android:id/button1");
	private By mobileNumLocator=By.id("com.joblinkplus.app:id/etMobileNumber");
	private By checkboxLocator=By.id("com.joblinkplus.app:id/checkbox");
	private By contactUsLink=By.id("com.joblinkplus.app:id/tvContactUs");
	private By termsLink=By.id("com.joblinkplus.app:id/tvContactUs");
	private By backbtnLink=By.id("com.joblinkplus.app:id/ivBack");
	
	
	  public SignUpPage(AppiumDriver<MobileElement> driver,Logger log)
	    {
	    	super(driver,log);
	    }

	  
	    public void signUpForm(String Firstname,String LastName,String Email, String Password,String mobileNum) throws InterruptedException
		{
	    	log.info("Adding user details");
			type(Firstname,firstNameLocator);	
			type(LastName,lastNameLocator);	
			type(Email,emailLocator);	
			type(Password,passwordLocator);	
			clickContinue();
			Thread.sleep(5000);
			click(dateLocator);
			click(selectDateLocator);
			clickOkbtn();
			type(mobileNum,mobileNumLocator);	
			clickCheckbox();
			//clickContact();
			//clickBackbtn();
			clickContinue();
			Thread.sleep(5000);
			
			
		}
	    
	    public SignUpPage clickContinue()
		{
			log.info("clicking Continue button");
			click(continueBtnLocator);
			return new SignUpPage(driver,log);
		}
	    
	    public SignUpPage clickOkbtn()
	 		{
	 			log.info("clicking ok button");
	 			click(OkButtonLocator);
	 			return new SignUpPage(driver,log);
	 		}
	    
	    public SignUpPage clickCheckbox()
 		{
 			log.info("Tick terms and conditions");
 			click(checkboxLocator);
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
