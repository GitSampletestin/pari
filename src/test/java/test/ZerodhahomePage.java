package test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pojo.Browser;
import pom.ZerodhaHomepageDashboard;
import pom.Zerodhaloginpage;
import pom.Zerodhapinpage;
import utility.Parametrization;

public class ZerodhahomePage {
	WebDriver driver;
	@BeforeMethod
	public void browser() {
		driver=Browser.openBrowser();
	}
   
	@Test
	public void BuyingstockFromMOTest() throws EncryptedDocumentException, IOException, InterruptedException {
		Zerodhaloginpage zerodhaloginpage = new Zerodhaloginpage(driver);
		String id = Parametrization.getData(8, 1);
		String pass = Parametrization.getData(9, 1);
		zerodhaloginpage.enteruserid(id);
		zerodhaloginpage.enterpassword(pass);
		zerodhaloginpage.clickonlogin();
        Thread.sleep(3000);
		Zerodhapinpage zerodhapinpage = new Zerodhapinpage(driver);
		String pin = Parametrization.getData(10, 1);
		System.out.println(pin);
		zerodhapinpage.enterpin(pin,driver);
		zerodhapinpage.clickonlogin();
        
		Thread.sleep(4000);
		ZerodhaHomepageDashboard zerodhaHomepageDashboard = new ZerodhaHomepageDashboard(driver);
		String stock =Parametrization.getData(6, 1);
		zerodhaHomepageDashboard.Searchstocks(stock);
		zerodhaHomepageDashboard.movetoelement(driver);
		zerodhaHomepageDashboard.BuyStock();
		zerodhaHomepageDashboard.SelectIntradayoptin();
		zerodhaHomepageDashboard.MObuy();
		String qty =Parametrization.getData(7, 1);
		zerodhaHomepageDashboard.SelectQuantity(qty);
		zerodhaHomepageDashboard.FinalBuy();
	}
	 
	
}