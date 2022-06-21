package pojo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {
	public static WebDriver openBrowser() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\swapn\\Downloads\\new update chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
         driver.get("https://kite.zerodha.com/");
         return driver;
         
	}

	
}
