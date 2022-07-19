package plentyofjobsAutomationTestingPages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class AddressPage extends BasePageObject{
	
	private By statelocator=By.id("com.joblinkplus.app:id/spinnerLanguageUnselected");
	private By statelistlocator=By.xpath("	\r\n" + 
			"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.RelativeLayout[1]/android.widget.TextView");
	private By suburblocator=By.id("com.joblinkplus.app:id/etSuburb");
	private By googlesearchbar=By.id("com.joblinkplus.app:id/places_autocomplete_search_bar");
	private By googlelist=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.TextView[1]"); 
	private By sliderbar=By.id("com.joblinkplus.app:id/sneekBar");

	public AddressPage(AppiumDriver<MobileElement> driver,Logger log)
	{
		super(driver,log);
	}
	
	public void setLocation(String text) throws InterruptedException
	{
		clickstate();
		Thread.sleep(5000);
		Choosestate();
		Thread.sleep(5000);
		clicksuburb();
		Thread.sleep(5000);
		searchAddress(text);
		Thread.sleep(5000);
		selectAddressfromlist();
		Thread.sleep(5000);
		Seekbar(sliderbar);
		
		
	}
	
	public void clickstate()
	{
		log.info("Tap on state");
		click(statelocator);
	}
	public void Choosestate()
	{
		log.info("Select state");
		click(statelistlocator);
	}
	
	public void clicksuburb()
	{
		log.info("Tap on suburb/postcode");
		click(suburblocator);
	}
	
	public String searchAddress(String text)
	{
		log.info("Search address");
		type(text,googlesearchbar);
		return text;
	}
	
	public void selectAddressfromlist()
	{
		log.info("Select Address from the list");
		click(googlelist);
	}

}
