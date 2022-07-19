package config;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import plentyofJobsAutomationbase.BaseTest;

public class PropertiesFile {
	
	static Properties prop=new Properties();
	static String projectPath=System.getProperty("user.dir");

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getProperties();
		//setProperties();
	}
	
	//read properties file
	public static void getProperties() 
	{
		
		try {
			
			String projectPath=System.getProperty("user.dir");
			InputStream input=new FileInputStream(projectPath+"/src/main/java/config/config.properties");
			prop.load(input);
		
			BaseTest.deviceName=prop.getProperty("deviceName");
			BaseTest.udid=prop.getProperty("udid");
			BaseTest.platformName=prop.getProperty("platformName");
			BaseTest.platformVersion=prop.getProperty("platformVersion");
			BaseTest.appPackage=prop.getProperty("appPackage");
			BaseTest.appActivity=prop.getProperty("appActivity");
			BaseTest.url=prop.getProperty("url");		
			
		} 
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}
		
	}
	
	//write properties file
	/*public static void setProperties()
	{
		try
		{
		OutputStream output=new FileOutputStream(projectPath+"/src/main/java/config/config.properties");
		prop.setProperty("deviceName", "Nord3");
		prop.store(output,"new data");
		
	}
	
	catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		System.out.println(e.getMessage());
		System.out.println(e.getCause());
	}
	

}
*/
}
