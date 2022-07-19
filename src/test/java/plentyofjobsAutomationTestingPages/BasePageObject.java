package plentyofjobsAutomationTestingPages;


import java.time.Duration;

import org.apache.logging.log4j.Logger;
import io.appium.java_client.*;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileElement;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import io.appium.java_client.AppiumDriver;



public class BasePageObject {
	
	protected AppiumDriver<MobileElement> driver;
	protected Logger log;
	
	
	public BasePageObject(AppiumDriver<MobileElement> driver,Logger log)
	{
		
		this.driver=driver;
		this.log=log;
	}
	

	/** Find element using given locator */
	public MobileElement find(By locator) {
		return driver.findElement(locator);
	}
	
	/** click element with given locator*/
	protected void click(By locator) {
		find(locator).click();
	}
	
	/** Type given text into element with given locator */
	protected void type(String text, By locator) {
		find(locator).sendKeys(text);
	}
	
	/** Retrieve text from given locator */
	protected String getPageText(By locator) {
		return find(locator).getText();
	}
	
	 /* Wait for specific ExpectedCondition for the given amount of time in seconds
	 */
	private void waitFor(ExpectedCondition<WebElement> condition, Integer timeOutInSeconds) {
		timeOutInSeconds = timeOutInSeconds != null ? timeOutInSeconds : 30;
		WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds);
		wait.until(condition);
	}
	
	/**
	 * Wait for given number of seconds for element with given locator to be visible
	 * on the page
	 */
	protected void waitForVisibilityOf(By locator, Integer... timeOutInSeconds) {
		int attempts = 0;
		while (attempts < 2) {
			try {
				waitFor(ExpectedConditions.visibilityOfElementLocated(locator),
						(timeOutInSeconds.length > 0 ? timeOutInSeconds[0] : null));
				break;
			} catch (StaleElementReferenceException e) {
			}
			attempts++;
		}
	}
	
	/** Drag 'from' element to 'to' element */
	protected void performDragAndDrop(By from, By to) {
		// Actions action = new Actions(driver);
		// action.dragAndDrop(find(from), find(to)).build().perform();

		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript(
				"function createEvent(typeOfEvent) {\n" + "var event =document.createEvent(\"CustomEvent\");\n"
						+ "event.initCustomEvent(typeOfEvent,true, true, null);\n" + "event.dataTransfer = {\n"
						+ "data: {},\n" + "setData: function (key, value) {\n" + "this.data[key] = value;\n" + "},\n"
						+ "getData: function (key) {\n" + "return this.data[key];\n" + "}\n" + "};\n"
						+ "return event;\n" + "}\n" + "\n" + "function dispatchEvent(element, event,transferData) {\n"
						+ "if (transferData !== undefined) {\n" + "event.dataTransfer = transferData;\n" + "}\n"
						+ "if (element.dispatchEvent) {\n" + "element.dispatchEvent(event);\n"
						+ "} else if (element.fireEvent) {\n" + "element.fireEvent(\"on\" + event.type, event);\n"
						+ "}\n" + "}\n" + "\n" + "function simulateHTML5DragAndDrop(element, destination) {\n"
						+ "var dragStartEvent =createEvent('dragstart');\n"
						+ "dispatchEvent(element, dragStartEvent);\n" + "var dropEvent = createEvent('drop');\n"
						+ "dispatchEvent(destination, dropEvent,dragStartEvent.dataTransfer);\n"
						+ "var dragEndEvent = createEvent('dragend');\n"
						+ "dispatchEvent(element, dragEndEvent,dropEvent.dataTransfer);\n" + "}\n" + "\n"
						+ "var source = arguments[0];\n" + "var destination = arguments[1];\n"
						+ "simulateHTML5DragAndDrop(source,destination);",
				find(from), find(to));
	}
	

	/*public static void swipeHorizontal(AppiumDriver driver, double startPercentage, double finalPercentage, double anchorPercentage, int duration) throws Exception {
        
	    Dimension size = driver.manage().window().getSize();
        int anchor = (int) (size.height * anchorPercentage);
        int startPoint = (int) (size.width * startPercentage);
        int endPoint = (int) (size.width * finalPercentage);
        new TouchAction(driver).press(PointOption.point(startPoint, anchor)).release().perform();
	
        
        //.waitAction(Duration.ofMillis(duration)).moveTo(endPoint, anchor).release().perform();
		}*/
      


    
    public void SwipeVeritical()
    {
    	TouchAction action = new TouchAction(driver);
    	PointOption p1= new PointOption();
    	Dimension dimensions = driver.manage().window().getSize();
    	Double screenHeightStart = dimensions.getHeight() * 0.5;
    	int h1 = screenHeightStart.intValue();
    	Double screenHeightEnd = dimensions.getHeight() * 0.1;
    	int h2 = screenHeightEnd.intValue();
    	action.press(PointOption.point(0,h1))
    	.waitAction(new WaitOptions().withDuration(Duration.ofMillis(600)))
    	.moveTo(PointOption.point(0, h2))
    	.release()
    	.perform();
    }
    
    public void Seekbar(By locator)
    {
		//Locating seekbar using resource id
    	MobileElement seek_bar=find(locator);
    	// get start co-ordinate of seekbar
    	int start=seek_bar.getLocation().getX();
    	//Get width of seekbar
    	int end=seek_bar.getSize().getWidth();
    	//get location of seekbar vertically
    	int y=seek_bar.getLocation().getY();

    	    // Select till which position you want to move the seekbar
    	    TouchAction action=new TouchAction(driver);

    	   
    	    //Move it 40%
    	    int moveTo=(int)(end*0.4);
    	    action.press(PointOption.point(start,y)).moveTo(PointOption.point(moveTo,y))
    	    .release().perform();
    }
 

	
}
