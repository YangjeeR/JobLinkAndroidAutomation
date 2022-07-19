package plentyofjobsAutomationTestingPages;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class VerificationCodePage2 {
	
	WebDriver driver;

	
	public String getVerificationCode() throws InterruptedException
	{
		
	
	System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
	 driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 String baseUrl = "https://yopmail.com/en/";
	 driver.get(baseUrl);
	 Thread.sleep(5000);
	 
	 driver.findElement(By.xpath("//input[@class = 'ycptinput']")).sendKeys("yang_poj58@yopmail.com");
	 driver.findElement(By.xpath("//button[@class = 'md']")).click();
	 driver.manage().timeouts().implicitlyWait(7, TimeUnit.MINUTES);
	 driver.switchTo().frame("ifmail");
	 String codetext=driver.findElement(By.id("mail")).getText();
	 System.out.println(codetext);
	 String[]code= codetext.split("is");
	 String text = code[0]; 
	 String Verifycode = code[1].trim(); 
	 System.out.println("Verification code is " + Verifycode);
	 return Verifycode;
	 

	
	
	}

}
