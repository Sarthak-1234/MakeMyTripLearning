package Tests;

import java.io.IOException;

import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import Initiate.InitiateTest;
import Managers.ExcelFileReader;
import Managers.ProFileReader;


public class HomePageTest extends InitiateTest {
//	InitiateTest = Parent
//    HomePageTest = child
	
	//BeforeClass ---jo driver open
	
	//HomePageObject homepage; //no object
	//object ---which is present in InitateTest
	
	private static final Logger LOGGER = LoggerFactory.getLogger(HomePageTest.class);
	
	@Test
	public void checkTitle() throws IOException {
		LOGGER.info("Checking Title");
		Assert.assertEquals(homepage.getTitle(), "MakeMyTrip - #1 Travel Website 50% OFF on Hotels, Flights & Holiday");
		Assert.assertEquals(ProFileReader.getProp("homepage", "homepageusername"), "abc");
		Assert.assertEquals(ExcelFileReader.getData("Data", "Name", 2), "Sarthak");
		LOGGER.info(ProFileReader.getProp("env")); //------config
	}
	
	@Test
	public void searchForFlight() {
		System.out.println("Checking Search flight");
		//Search
	}
	
	@Test
	public void getTabsOfHomePage() {
		System.out.println("Checking hoempage tab");
		
	}
	
	
	

}
