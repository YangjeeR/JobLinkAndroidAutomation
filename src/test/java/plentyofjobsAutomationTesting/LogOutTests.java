package plentyofjobsAutomationTesting;

import org.testng.annotations.Test;

import plentyofJobsAutomationbase.TestUtilities;
import plentyofjobsAutomationTestingPages.LandingScreenPage;
import plentyofjobsAutomationTestingPages.LogOutPage;
import plentyofjobsAutomationTestingPages.LoginPage;
import plentyofjobsAutomationTestingPages.MenuPage;
import plentyofjobsAutomationTestingPages.SignUpPage;

public class LogOutTests extends TestUtilities {
	
	
	@Test
	public void LogOutTest()
	{
		
		log.info("Logout from the app");
	
   try
     {
		
		SignUpPage SignUpObj=new SignUpPage(driver,log);
		
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
