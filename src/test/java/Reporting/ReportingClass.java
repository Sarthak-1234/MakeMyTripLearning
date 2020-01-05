package Reporting;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import Initiate.InitiateTest;
import utils.TakeScreenshots;

public class ReportingClass {
	
	public static ExtentReports report = InitiateTest.report;  //html report
	public static ExtentTest test;  //instantiate
	public static TakeScreenshots screencapture;
	
	
	//now we have to add functions text to the reports
	
	
	
	//ExtentTest
	
	//when testcase has to start --ReportingClass.initReports("First Scenario")

	//when my testcase --pass ---ReportingClass.infoLogPass("my testcase");
	
	//when my testcase fail --- ReportingClass.reportFailure("testcase fail", driver)
	
	//message print -----ReportingClass.infoLogMessage("Testcase is running")
	
	//When u have to publish your report --ReportingClass.putReport(); ---After Class or After suite
	
	
	
	
	
	
	public static void reportFailure(String errMsg, WebDriver driver) throws Throwable {
    	screencapture = new TakeScreenshots(driver);
		ReportingClass.infoLogFail(errMsg);
	}
	
	public static void initReports(String scenario) {
		test = report.createTest(scenario); 
		
		//when we have to start the testcase ---initReports
		
		//report it will create test
		
	}
	
	public static void putReport() {
		report.flush(); //publish reporst
	}
	
	public static void infoLogPass(String msg) {
		test.log(Status.PASS, msg);
	}
	
	public static void infoLogFail(String msg) throws IOException, Exception {
		test.log(Status.FAIL,msg +" Screenshot-> "+ test.addScreenCaptureFromPath(ExtentManager.screenshotFolderPath+screencapture.TakeScreenshot()));
		Assert.assertFalse(true);
	}
	
	public static void infoLogMessage(String msg) {
		test.log(Status.INFO, msg);
	}

}
