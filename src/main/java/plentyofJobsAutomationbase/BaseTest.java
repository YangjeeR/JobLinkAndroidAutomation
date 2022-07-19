package plentyofJobsAutomationbase;

import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import config.PropertiesFile;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class BaseTest {
	
	protected AppiumDriver<MobileElement> driver;
	protected Logger log;

	protected String testSuiteName;
	protected String testName;
	protected String testMethodName;
	
	public static String deviceName=null;
	public static String udid=null;
	public static String platformName=null;
	public static String platformVersion=null;
	public static String appPackage=null;
	public static String appActivity=null;
	public static String url=null;
	
	@BeforeMethod(alwaysRun=true)
	public void OpenApplication(Method method, ITestContext ctx) throws MalformedURLException {
		
		String testName= ctx.getCurrentXmlTest().getName();
		log=LogManager.getLogger(testName);
		
		 try
		 {
			 DesiredCapabilities cap=new DesiredCapabilities();
		 		PropertiesFile.getProperties();
				//add device features
				cap.setCapability("deviceName",deviceName);
				cap.setCapability("udid",udid);
				cap.setCapability("platformName",platformName);
				cap.setCapability("platformVersion",platformVersion);
				
				//to start particular application
				cap.setCapability("appPackage", appPackage);
				cap.setCapability("appActivity", appActivity);
				
				URL baseurl=new URL(url);
				driver =new AppiumDriver(baseurl,cap);
				
				System.out.println("Application started.......");
				Thread.sleep(3000);
		 }
		 catch (InterruptedException e)
		 {
			 e.printStackTrace();
		 }
		 
		
		
		this.testSuiteName = ctx.getSuite().getName();
		this.testName = testName;
		this.testMethodName = method.getName();
	}

	/*@AfterMethod(alwaysRun=true)
	public void tearDown() {
		log.info("Close application");
		// Close application
		driver.quit();
	}*/
}
