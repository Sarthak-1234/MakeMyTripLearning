package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageObject{
	
	@FindBy (xpath = "//abc")
	WebElement nextButton;
	
	@FindBy(css = "div abc")
	WebElement userNameInputBox;
	
	
	//Jaise hi is class ka object banega..Jitne locators sab load ho jayenge ek sath
	
	
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
	
	public void clickOnNextButton() {
		nextButton.click();
	}
	
	public void enterUserName() {
		userNameInputBox.sendKeys("username");
	}
	
	public void enterUserName1() {
		userNameInputBox.sendKeys("username");
	}
	
	

}
