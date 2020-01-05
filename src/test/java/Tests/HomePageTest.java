package Tests;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Initiate.InitiateTest;
import Managers.ExcelFileReader;
import Managers.ProFileReader;
import Reporting.ReportingClass;

@Listeners(utils.Listener.class)
public class HomePageTest extends InitiateTest {

	
	private static final Logger LOGGER = LoggerFactory.getLogger(HomePageTest.class);
	
	@Test
	public void checkTitle() throws IOException {
		LOGGER.info("Checking Title");
		
		Assert.assertEquals(homepage.getTitle(), "Ma - #1 Travel Website 50% OFF on Hotels, Flights & Holiday");
		
		
		
		//it is type of html report
		
	
//		html code ------jar file
//		<hr> TestCase Pass <br></hr>
		
		//1. Depenendencies - Extent Reports ki
		

		
		
		
		
		
		
		
		
//		try {
//		Assert.assertEquals(homepage.getTitle(), "MakeMyTrip - #1 Travel Website 50% OFF on Hotels, Flights & Holiday");
//		LOGGER.info("TestCase Pass");
//		} catch(Exception e) {
//			LOGGER.info("TestCase fail");	
//		}
		
		//		Assert.assertEquals(ProFileReader.getProp("homepage", "homepageusername"), "abc");
//		Assert.assertEquals(ExcelFileReader.getData("Data", "Name", 2), "Sarthak");
//		LOGGER.info(ProFileReader.getProp("env"));
	}
	
	//ExtentReport > listeners will tell test case pass or fail
	
	//TestNG ---Liteners
	//Cucumber ----no literns
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	@Test
//	public void searchForFlight() {
//		System.out.println("Checking Search flight");
//	}
//	
//	@Parameters({"EmpID", "EmpName"})
//	@Test
//	public void ParameterInTestNGUse(@Optional("1111") String id, @Optional("abc") String name) {
//
//		System.out.println(id+"-------"+name);
//	}
//	
//	
//	@Test (dataProvider = "homepagedataqa", dataProviderClass = DataProviders.HomePageData.class)
//	public void DataProviderUseInTestNG(String username, String password, String id, String ph) {
//		System.out.println("Loggin in gmail using "+username+"---password = "+ password+"----id = "+id+"--ph="+ph);
//		
//	}
}
