package plentyofjobsAutomationTesting;

import org.testng.annotations.Test;

import plentyofJobsAutomationbase.TestUtilities;
import plentyofjobsAutomationTestingPages.LanguagePage;

public class LanguageSetUpTest extends TestUtilities {
	
	

	public void LanguageSetUp()
	{
		LanguagePage langObj=new LanguagePage(driver,log);
		log.info("Setting up language");
		langObj.clicklanguage();
		langObj.clicklanguagelist();
		langObj.clickContinue();

	}

}
