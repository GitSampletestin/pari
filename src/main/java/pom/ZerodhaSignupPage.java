package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZerodhaSignupPage {

	@FindBy(xpath = "//input[@maxlength='10']")
	private WebElement mobileno;
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement continuue;
	@FindBy(xpath = "//a[text()='Want to open an NRI account?']")
	private WebElement nriaccount;

	public ZerodhaSignupPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
    
	public void EnterMobilenumber(String number) {
		mobileno.sendKeys(number);
	}
	
	public void ClickonContinuebutton() {
		continuue.click();
	}
	
	public void ClickonNRIaccount() {
		nriaccount.clear();
	}
	
	
	
}