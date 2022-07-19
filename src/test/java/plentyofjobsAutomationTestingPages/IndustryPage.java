package plentyofjobsAutomationTestingPages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class IndustryPage extends BasePageObject {
	private By induslocator=By.id("com.joblinkplus.app:id/spinnerLanguageUnselected");
	private By induslistlocator=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.RelativeLayout[2]/android.widget.TextView");

	
	public IndustryPage(AppiumDriver<MobileElement> driver,Logger log)
	{
		super(driver,log);
	}
	 
	 
	 public IndustryPage clickindustry()
		{
			log.info("clicking industry field");
			click(induslocator);
			return new IndustryPage(driver,log);
		}
	 
	 public IndustryPage clickinduslist()
		{
			log.info("Select language from the list");
			click(induslistlocator);
			return new IndustryPage(driver,log);
		}
}
