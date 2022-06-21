package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZerodhaForgotPasswordPage {

	@FindBy(xpath = "//label[@for='radio-30']")
	private WebElement rememberid;
	@FindBy(xpath = "//label[@for='radio-31']")
	private WebElement forgotid;
	@FindBy(xpath = "//input[@placeholder='User ID']")
	private WebElement userid;
	@FindBy(xpath = "//input[@placeholder='PAN']")
	private WebElement pannumber;
	@FindBy(xpath = "//label[@for='radio-35']")
	private WebElement onEmail;
	@FindBy(xpath = "//label[@for='radio-36']")
	private WebElement onsms;
	@FindBy(xpath = "//input[@placeholder='E-mail (as on account)']")
	private WebElement Email;
	@FindBy(xpath = "//input[@placeholder='Mobile number (as on account)']")
	private WebElement MobileNo;
	@FindBy(xpath = "//input[@placeholder='Captcha']")
	private WebElement Captcha;
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement reset;

	public ZerodhaForgotPasswordPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void ClickonrememberID() {
		rememberid.click();
	}

	public void ClickonforgotID() {
		forgotid.click();
	}

	public void EnteruserID(String id) {
		userid.sendKeys(id);
	}

	public void EnterPanNumber(String pan) {
		pannumber.sendKeys(pan);
	}

	public void ClickonEmail() {
		onEmail.click();
	}

	public void ClickonSMS() {
		onsms.click();
	}
	public void EntermobileEmailid(String emailid) {
		MobileNo.sendKeys(emailid);
	}
	public void EntermobileNumber(String mob) {
		MobileNo.sendKeys(mob);
	}

	public void EnterCaptcha(String captchaa) {
		Captcha.sendKeys(captchaa);
	}
    public void ClickonReset() {
    	reset.click();
    }
}