package plentyofjobsAutomationTesting;

import plentyofJobsAutomationbase.TestUtilities;
import plentyofjobsAutomationTestingPages.IndustryPage;
import plentyofjobsAutomationTestingPages.LanguagePage;

public class IndustrySetUpTest extends TestUtilities {

	
	public void IndustrySetUp()
	{
		IndustryPage indusObj=new IndustryPage(driver,log);
		LanguagePage langObj=new LanguagePage(driver,log);
		log.info("Setting up industry");
		indusObj.clickindustry();
		indusObj.clickinduslist();
		langObj.clickContinue();

	}

}
