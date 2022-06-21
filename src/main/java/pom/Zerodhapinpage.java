package pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Zerodhapinpage {
	@FindBy(xpath="//input[@id='pin']") private WebElement pin;
    @FindBy(xpath="//button[@class='button-orange wide']") private WebElement login;
    @FindBy(xpath="//a[text()='Forgot 2FA?']") private WebElement forgot;
    @FindBy(xpath="//a[text()=\"Don't have an account? Signup now!\"]")private WebElement signup;
    
    public Zerodhapinpage (WebDriver driver) {
    	PageFactory.initElements(driver,this);
    }
    
    public void enterpin(String pinn,WebDriver driver) {
    /*	WebDriverWait wait = new WebDriverWait (driver,Duration.ofMillis(2000));//   explicit wait
    	wait.until(ExpectedConditions.visibilityOf(pin));  //will rechech the element in 500ms  */
    	
    	FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
    	wait.withTimeout(Duration.ofMillis(2000));  // total wait time
    	wait.pollingEvery(Duration.ofMillis(20));   // polling time or rechecking time
    	wait.ignoring(Exception.class);    // exception ignore
    wait.until(ExpectedConditions.visibilityOf(pin));  
    	
    	pin.sendKeys(pinn);
    
    }
    public void clickonlogin() {
    	login.click();
    }
    public void clickonforgot() {
    	forgot.click();
    }
    public void clickonsignup() {
    	signup.click();
    }
    
}
