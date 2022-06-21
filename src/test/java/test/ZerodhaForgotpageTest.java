package test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pojo.Browser;
import pom.ZerodhaForgotPasswordPage;
import pom.Zerodhaloginpage;
import utility.Parametrization;

public class ZerodhaForgotpageTest {
	WebDriver driver;
	@BeforeMethod
	public void browser() {
		driver=Browser.openBrowser();
	}
	
	@Test
	public void ForgotpasswordTest() throws InterruptedException, EncryptedDocumentException, IOException {
		Zerodhaloginpage zerodhaloginpage = new Zerodhaloginpage(driver);
		zerodhaloginpage.clickonforgotpassword();
		Thread.sleep(1500);
		ZerodhaForgotPasswordPage zerodhaForgotPasswordPage = new ZerodhaForgotPasswordPage (driver);
		zerodhaForgotPasswordPage.ClickonrememberID();
		String ID=Parametrization.getData(0, 1);
		zerodhaForgotPasswordPage.EnteruserID(ID);
		String pan=Parametrization.getData(3, 1);
		zerodhaForgotPasswordPage.EnterPanNumber(pan);
		zerodhaForgotPasswordPage.ClickonSMS();
		String mob=Parametrization.getData(4, 1);
		zerodhaForgotPasswordPage.EntermobileNumber(mob);
		Thread.sleep(1500);
		String cap =Parametrization.getData(5, 1);
		zerodhaForgotPasswordPage.EnterCaptcha(cap);
		zerodhaForgotPasswordPage.ClickonReset();
	}

}
