package test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import pojo.Browser;
import pom.Zerodhaloginpage;
import utility.Parametrization;
import utility.Report;


@Listeners(Testlistner.class)
public class ZerodhaLoginpageTest<ITestRsult> extends Basetest{
 ExtentReports reports ;
 ExtentTest test;
 
	@BeforeTest
	public void extentReports() {
	 reports = Report.createreport();
	}
	@BeforeMethod
	public void browser() {
		driver=Browser.openBrowser();
	}

	@Test
	public void LoginWithValidCredentialTest() throws EncryptedDocumentException, IOException {
		test=reports.createTest("LoginWithValidCredentialTest");
		Zerodhaloginpage zerodhaloginpage = new Zerodhaloginpage(driver);
		String userid = Parametrization.getData(0, 1);
		String pass = Parametrization.getData(1, 1);
		zerodhaloginpage.enteruserid(userid);
		zerodhaloginpage.enterpassword(pass);
		zerodhaloginpage.clickonlogin();
	}

	@Test
	public void LoginwihoutCredentials() throws EncryptedDocumentException, IOException {
		test=reports.createTest("LoginwihoutCredentials");
		Zerodhaloginpage zerodhaloginpage = new Zerodhaloginpage(driver);
		zerodhaloginpage.clickonlogin();
		String text = zerodhaloginpage.getErrortext();
		String expectedText = "User ID should be minimum 62 characters.";
   //   Assert.assertEquals(text, expectedText);   // hard assert
	    SoftAssert softAssert=  new SoftAssert();
		softAssert.assertEquals(text,expectedText);
		String userid = Parametrization.getData(0, 1);
		String pass = Parametrization.getData(1, 1);
		zerodhaloginpage.enteruserid(userid);
		zerodhaloginpage.enterpassword(pass);
		zerodhaloginpage.clickonlogin();
		
	//	softAssert.assertAll();	
	}
	

	@Test 
	public void forgotpasswordlinkTest() {
		test=reports.createTest("forgotpasswordlinkTest");
		Zerodhaloginpage zerodhaloginpage = new Zerodhaloginpage(driver);
		zerodhaloginpage.clickonforgotpassword();
	}

	@Test(dependsOnMethods = {"LoginwihoutCredentials"})
	public void signuplinkTest() {
		test=reports.createTest("signuplinkTest");
		Zerodhaloginpage zerodhaloginpage = new Zerodhaloginpage(driver);
		zerodhaloginpage.clickonsignup();
	}
	
	@AfterMethod
	public void closeBrowser(ITestResult result) {
		if(result.getStatus()==ITestResult.FAILURE)
		{
			test.log(Status.FAIL, result.getName());
		}
		else if(result.getStatus()==ITestResult.SUCCESS) {
			test.log(Status.PASS, result.getName());
		}
		else
		{
			test.log(Status.SKIP, result.getName());
		}
	}
	@AfterTest
	public void flushResult()
	{
		reports.flush();
	}
	
	}


