package plentyofjobsAutomationTesting;

import org.testng.annotations.Test;

import plentyofJobsAutomationbase.TestUtilities;
import plentyofjobsAutomationTestingPages.LandingScreenPage;
import plentyofjobsAutomationTestingPages.LogOutPage;
import plentyofjobsAutomationTestingPages.LoginPage;
import plentyofjobsAutomationTestingPages.MenuPage;
import plentyofjobsAutomationTestingPages.SignUpPage;

public class Login1Tests extends TestUtilities {
	
	
	@Test
	public void LoginTest()
	{
		log.info("Starting Login test");
	
   try
     {
		// open landing screen
		LandingScreenPage landingObj=new LandingScreenPage(driver,log);
		landingObj.clickLogin();
		SignUpPage SignUpObj=new SignUpPage(driver,log);
		
		
		//Open sign up page and fill up form
		LoginPage LoginObj=new LoginPage(driver,log);
		Thread.sleep(4000);
		LoginObj.LoginForm("yang_poj30@yopmail.com","Password@1");
		Thread.sleep(10000);
		//LoginObj.clickContinue();
		
		//Menu tabs 
	    Thread.sleep(7000);
		MenuPage menuObj=new MenuPage(driver,log);
		menuObj.TapMenu();
		Thread.sleep(5000);
				
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
