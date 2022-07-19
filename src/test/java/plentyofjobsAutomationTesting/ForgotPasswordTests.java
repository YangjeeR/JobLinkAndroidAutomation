package plentyofjobsAutomationTesting;


import org.testng.annotations.Test;

import plentyofJobsAutomationbase.ExcelDataProvider;
import plentyofJobsAutomationbase.TestUtilities;
import plentyofjobsAutomationTestingPages.ForgotPasswordPage;
import plentyofjobsAutomationTestingPages.SetPasswordPage;
import plentyofjobsAutomationTestingPages.VerificationCodePage;
import plentyofjobsAutomationTestingPages.VerificationCodePage2;

public class ForgotPasswordTests extends TestUtilities {

	@Test
	public void LoginTest()
	{
		log.info("Opening forgot password Page");
	
   try
     {
	   ExcelDataProvider exceldataObj=new ExcelDataProvider();
	   String email=exceldataObj.getEmail();
		// open forgot password screen
	   ForgotPasswordPage forgotObj=new ForgotPasswordPage(driver,log);
	   forgotObj.ForgotPassword();
	   Thread.sleep(5000);
	   forgotObj.setEmail(email);
	   forgotObj.Continuebtn();
	   Thread.sleep(7000);
	
		
		//Code verification screen
		//Retrieve code from mail
	   VerificationCodePage2 codePageObj=new VerificationCodePage2();
		String code=codePageObj.getVerificationCode();
		
		//Set new Password
		SetPasswordPage setPwdObj=new SetPasswordPage(driver,log);
		String confirmPassword=exceldataObj.getconfirmPassword();
		String newPassword=exceldataObj.getnewPassword();
		setPwdObj.setNewPassword(code,newPassword, confirmPassword);
		Thread.sleep(10000);
		setPwdObj.clickOkbtn();
		
		
	
	 }
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		    System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}
		
	}
}
