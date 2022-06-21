package utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Report {
   public static ExtentReports createreport() {
	   ExtentSparkReporter htmlReporter = new ExtentSparkReporter("extentReport.html");
	   ExtentReports reports = new ExtentReports();
	  reports.attachReporter( htmlReporter);
	  reports.setSystemInfo("Regression", "Zerodha");
	  reports.setSystemInfo("Browser", "Chrome");
      return reports;
   }
}
