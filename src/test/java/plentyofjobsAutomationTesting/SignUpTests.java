package plentyofjobsAutomationTesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import plentyofJobsAutomationbase.TestUtilities;
import plentyofjobsAutomationTestingPages.AddressPage;
import plentyofjobsAutomationTestingPages.IndustryPage;
import plentyofjobsAutomationTestingPages.InterestsPage;
import plentyofjobsAutomationTestingPages.LandingScreenPage;
import plentyofjobsAutomationTestingPages.LanguagePage;
import plentyofjobsAutomationTestingPages.LogOutPage;
import plentyofjobsAutomationTestingPages.MenuPage;
import plentyofjobsAutomationTestingPages.SignUpPage;
import plentyofjobsAutomationTestingPages.SuccessPage;
import plentyofjobsAutomationTestingPages.VerificationCodePage;
import plentyofjobsAutomationTestingPages.VerificationPage;

public class SignUpTests extends TestUtilities {
	
	@Test
	public void SignUpFormTest()
	{
		log.info("Starting Signup test");
	
   try
     {
		// open landing screen
		LandingScreenPage landingObj=new LandingScreenPage(driver,log);
		landingObj.getStarted();
	

		
		//Open sign up page and fill up form
		SignUpPage SignUpObj=new SignUpPage(driver,log);
		Thread.sleep(4000);
		SignUpObj.signUpForm("Yangjee","Ebpearls","yang_poj60@yopmail.com","Password@1","0456789578");
		
		//Retrieve code from mail
		VerificationCodePage codePageObj=new VerificationCodePage();
		String code=codePageObj.getVerificationCode();
		
		//Verify code 
		VerificationPage verifyObj=new VerificationPage(driver,log);
		verifyObj.VerifyCode(code);
		 driver.manage().timeouts().implicitlyWait(7, TimeUnit.MINUTES);
		 Thread.sleep(5000);
		
		//Select Language
		LanguagePage langObj=new LanguagePage(driver,log);
		log.info("Setting up language");
		langObj.clicklanguage();
		langObj.clicklanguagelist();
		langObj.clickContinue();
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.MINUTES);
		
		//Select industry
		IndustryPage indusObj=new IndustryPage(driver,log);
		log.info("Setting up industry");
		Thread.sleep(10000);
		indusObj.clickindustry();
		Thread.sleep(5000);
		indusObj.clickinduslist();
		langObj.clickContinue();
		
		//Select interest
		InterestsPage interObj=new InterestsPage(driver,log);
		Thread.sleep(10000);
		interObj.clickInterest();
		Thread.sleep(5000);
		langObj.clickContinue();
	
		//select location
		AddressPage addressObj=new AddressPage(driver,log);
		Thread.sleep(10000);
		addressObj.setLocation("Bondi");
		langObj.clickContinue();
		
		//Verify success Page text 
		SuccessPage successObj=new SuccessPage(driver,log);
		Thread.sleep(5000);
		String message=successObj.getSuccessMessage();
		if(message.equalsIgnoreCase("I think we have enough to start showing you some jobs"))
		{
		  System.out.println("Profile has been successfully set up.");	
		}
		else
		{
			System.out.println("Error in setting up profile.");
		}
		langObj.clickContinue();
		
		
		//Menu tabs 
	    Thread.sleep(7000);
		MenuPage menuObj=new MenuPage(driver,log);
		menuObj.TapMenu();

		//Log out 
		Thread.sleep(5000);
		LogOutPage logoutObj=new LogOutPage(driver,log);
		logoutObj.clickLogout();
		Thread.sleep(5000);
		SignUpObj.clickOkbtn();
		log.info("User successfully logged out from the app");
		
	
	
	 }
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		    System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}
		
	}

}
