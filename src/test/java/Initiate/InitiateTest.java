package Initiate;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.aventstack.extentreports.ExtentReports;

import Managers.ProFileReader;
import PageObject.HomePageObject;
import PageObject.HotelPageObject;
import Reporting.ExtentManager;
import Reporting.ReportingClass;



public class InitiateTest {
	
	//Constructors
	//this keyword
	//inheritance
	//access modifiers
	
	
	//public
	//private
	//default ------same package
	//protected ---extends and in diff package
	
	private static final Logger LOGGER = LoggerFactory.getLogger(InitiateTest.class);
	
	public static WebDriver driver;
	public HomePageObject homepage;
	public HotelPageObject hotelpage;
	public static ExtentReports report;
	
	
	
	//STCM@Test
	
	@BeforeClass //har class se pehle
	public void beforeClass() throws IOException {
		
		LOGGER.info("In BeforeClass");
		driver = WebdriverLaunch.getDriver();
		
		LOGGER.info("==============Creating objects of PageObject Classes==================");
		homepage = new HomePageObject(driver);
		hotelpage = new HotelPageObject(driver);
		report = ExtentManager.setUp("Extent_Reports");//html report
		
		
		
	}
	
	@BeforeMethod //hra test se pehle
	public void beforeMethod() throws IOException {
		LOGGER.info("Launching URL "+ProFileReader.getProp("url"));
		driver.get(ProFileReader.getProp("url"));
	}
	
	@AfterClass
	public void afterClass() {
		//create test case --- ReportingClass.initReports(scenario);
		//testcase ---pass ---ReportingClass.infoLogPass("pass");
		
		ReportingClass.putReport();
	}
	
	

}
