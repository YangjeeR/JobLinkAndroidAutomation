package plentyofjobsAutomationTestingPages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class InterestsPage extends BasePageObject{
	
	int i=1;
	private By interestlocator=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout["+i+"]/android.widget.LinearLayout/android.widget.CheckBox");

	public InterestsPage(AppiumDriver<MobileElement> driver,Logger log)
	{
		super(driver,log);
	}
	
	public void clickInterest()
	{
		for(int i=1;i<=3;i++)
		{
		log.info("Selecting interests from the list");
		click(interestlocator);
		}
	}
	     

}
