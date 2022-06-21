package test;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pojo.Browser;
import pom.ZerodhaSignupPage;
import pom.Zerodhaloginpage;
import utility.Parametrization;
import utility.Screenshot;

public class ZerodhaSignuppageTest {
  WebDriver driver;
	@BeforeMethod
	public void browser() {
		driver=Browser.openBrowser();
		
	}
	
	@AfterMethod
	public void snaps() throws IOException {
		Screenshot.snap(driver);
		
	}
	@Test
	public void Zerodhasignup() throws InterruptedException, EncryptedDocumentException, IOException {
		Zerodhaloginpage zerodhaloginpage = new Zerodhaloginpage(driver);
		zerodhaloginpage.clickonsignup();
	
		Set<String> address = driver.getWindowHandles();
		Iterator<String> a = address.iterator();
			while(a.hasNext()) 
		{
			String add=a.next();
			driver.switchTo().window(add);
		//	String currentTitle =driver.getTitle();
		//	if(currentTitle .equals("Signup and open a Zerodha trading and demat account online and start investing – Zerodha"))
		//	{

			}
		//}
			ZerodhaSignupPage zerodhaSignupPage= new ZerodhaSignupPage(driver);
			String mobile = Parametrization.getData(4, 1);
			zerodhaSignupPage.EnterMobilenumber(mobile);
			zerodhaSignupPage.ClickonContinuebutton();
		
	    
			
			
	
	}
	
}
