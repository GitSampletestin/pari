package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Zerodhaloginpage {
	
	@FindBy(xpath="//input[@id='userid']") private WebElement userid;
	@FindBy(xpath="//input[@id='password']") private WebElement password;
    @FindBy(xpath="//button[@class='button-orange wide']") private WebElement login;
    @FindBy(xpath="//a[text()='Forgot user ID or password?']") private WebElement forgotid;
    @FindBy(xpath="//a[text()=\"Don't have an account? Signup now!\"]")private WebElement signup;
    @FindBy(xpath="//span[text()='User ID should be minimum 6 characters.']")private WebElement  Errortext;

    
    public Zerodhaloginpage(WebDriver driver) {
    	PageFactory.initElements(driver,this);
    }
    
    public void enteruserid(String id) {
    	userid.sendKeys(id);
    }
    
    public void enterpassword(String pass) {
    	password.sendKeys(pass);
    }
    
   public void clickonlogin() {
	   login.click();
   }
    public void clickonforgotpassword() {
    	forgotid.click();
    }
    public void clickonsignup() {
    	signup.click();
    }
   public String getErrortext () {
	  String error= Errortext.getText();
	  return error;
   }
    
}
