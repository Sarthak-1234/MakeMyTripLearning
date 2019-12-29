package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class HomePageObject{
	
	
	
	
	//driver
	
	WebDriver driver;
	
	public HomePageObject(WebDriver driver) {
		this.driver = driver;
	}
	
	
	public String getTitle() {
		return driver.getTitle();
	}
	
	public String getURL() {
		return driver.getCurrentUrl();
	}
	

}
