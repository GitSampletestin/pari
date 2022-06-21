package utility;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import pojo.Browser;

public class Screenshot {
	public static void snap(WebDriver driver) throws IOException {
		Date date=Calendar.getInstance().getTime();
	String timestamp= date.toString().replace(":", "").replace(" ","");
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        File destination = new File(".//SNAP//"+timestamp+"png");
        FileHandler.copy(source, destination);
}
} 