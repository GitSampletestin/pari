package test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

import utility.Screenshot;

public class Testlistner extends Basetest implements ITestListener {
	public void onTestStart(ITestResult result) {
		System.out.println("test has start");
	}
	
	public void onTestFailure(ITestResult result) {
		System.out.println(result.getName()+"Test fail");
		//Screenshot.snap(driver,result.getName());
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println(result.getName()+"test skipped");

	}
	
	public void onTestSuccess(ITestResult result) {
		System.out.println(result.getName()+"test success");
	}
	
}
