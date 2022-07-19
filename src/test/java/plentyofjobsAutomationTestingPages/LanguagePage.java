package plentyofjobsAutomationTestingPages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;



public class LanguagePage extends BasePageObject  {
	
	private By languagelocator=By.id("com.joblinkplus.app:id/spinnerLanguage");
	private By languagelistlocator=By.xpath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/"
			+ "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup"
			+ "/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.RelativeLayout[2]"
			+ "/android.widget.TextView");
	private By continueBtnLocator=By.id("com.joblinkplus.app:id/btn_get_started");
	
	public LanguagePage(AppiumDriver<MobileElement> driver,Logger log)
	{
		super(driver,log);
	}
	
	
	 public LanguagePage clickContinue()
		{
			log.info("clicking Continue button");
			click(continueBtnLocator);
			return new LanguagePage(driver,log);
		}
	 
	 
	 public LanguagePage clicklanguage()
		{
			log.info("clicking langauge field");
			click(languagelocator);
			return new LanguagePage(driver,log);
		}
	 
	 public LanguagePage clicklanguagelist()
		{
			log.info("Select language from the list");
			click(languagelistlocator);
			return new LanguagePage(driver,log);
		}


}
