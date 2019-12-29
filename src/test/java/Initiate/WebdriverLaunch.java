package Initiate;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import Managers.ExcelFileReader;
import Managers.ProFileReader;



public class WebdriverLaunch {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(WebdriverLaunch.class);
	
	public static WebDriver driver;
	
	
	
	
	public static WebDriver getDriver() throws IOException {
	
	LOGGER.info("Driver in Prop file = "+ ProFileReader.getProp("config", "browser"));	
	
	if(ProFileReader.getProp("config", "browser").equalsIgnoreCase("chrome")) {
		LOGGER.info("Launching ChromeDriver");
	System.setProperty("webdriver.chrome.driver", "chromedriver_windows.exe");
	driver = new ChromeDriver();
	} else if(ProFileReader.getProp("config", "browser").equalsIgnoreCase("firefox")){
		System.out.println("Firefox is not configured");
	} else if(ProFileReader.getProp("config", "browser").equalsIgnoreCase("ie")){
		System.out.println("IE is not configured");
	} 

	
	//System.out.println(ExcelFileReader.getData(fileName, colName, rowNum));
		
	return driver;
	}

}
