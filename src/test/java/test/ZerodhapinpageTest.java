package test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pojo.Browser;
import pom.Zerodhaloginpage;
import pom.Zerodhapinpage;
import utility.Parametrization;
import utility.Screenshot;

public class ZerodhapinpageTest {
	WebDriver driver;

	@BeforeMethod
	public void browser() {
		driver = Browser.openBrowser();
	}
    @AfterMethod
    public void snapshot() throws IOException{
     Screenshot.snap(driver);
    }
	@Test
	public void LogintoZerodhawithPinTest() throws EncryptedDocumentException, IOException, InterruptedException {
		Zerodhaloginpage zerodhaloginpage = new Zerodhaloginpage(driver);
		String id = Parametrization.getData(0, 1);
		String pass = Parametrization.getData(1, 1);
		zerodhaloginpage.enteruserid(id);
		zerodhaloginpage.enterpassword(pass);
		zerodhaloginpage.clickonlogin();
        
		Zerodhapinpage zerodhapinpage = new Zerodhapinpage(driver);
		String pin = Parametrization.getData(2, 1);
		System.out.println(pin);
		zerodhapinpage.enterpin(pin,driver);
		zerodhapinpage.clickonlogin();

	}

}
