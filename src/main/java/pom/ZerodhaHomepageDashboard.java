package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZerodhaHomepageDashboard {

	@FindBy(xpath = "//input[@icon='search']") private WebElement search;
	@FindBy(xpath = "//span[text()='JUBLINGREA']") private WebElement jubl;
	@FindBy(xpath = "//button[@data-balloon='Buy']") private WebElement jublbuy;
	@FindBy(xpath = "//label[@class='su-radio-label']") private WebElement intraday;
	@FindBy(xpath = "//input[@autofocus='autofocus']")private WebElement quantity;
	@FindBy(xpath = "(//label[@class='su-radio-label'])[8]") private WebElement longterm;
	@FindBy(xpath = "(//label[@class='su-radio-label'])[9]") private WebElement marketprzbuy;
	@FindBy(xpath = "(//label[@class='su-radio-label'])[10]")private WebElement limitprzbuy;
	@FindBy(xpath = "//button[@type='submit']")private WebElement BUY;
	@FindBy(xpath = "(//button[@type='button'])[3]")private WebElement CANCEL;

	public ZerodhaHomepageDashboard(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void Searchstocks(String stocks) {
		search.sendKeys(stocks);
	}
    public void movetoelement(WebDriver driver) {
    	Actions action = new Actions(driver);
    	action.moveToElement(jubl);
    	action.perform();
    }
    public void AddjublstockinWatchlist() {
    	jubl.click();
    }
	public void BuyStock() {
		jublbuy.click();
	}

	public void SelectIntradayoptin() {
		intraday.click();
	}

	public void SelectQuantity(String qty) {
		//quantity.clear();
		quantity.sendKeys(qty);
	}

	public void MObuy() {
		marketprzbuy.click();
	}
    public void FinalBuy() {
    	BUY.click();
    }
	public void CancelOrder() {
		CANCEL.click();
	}
	
	
	
	
	
}
