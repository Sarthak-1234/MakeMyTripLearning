package DataProviders;

import org.testng.annotations.DataProvider;

public class HotelData {
	
	@DataProvider(name = "dev")
	public Object[][] getLoginCredentials_dev() {
		return new Object[][] {
			{"user1", "pass1"},
			{"user2", "pass2"},
			{"user3", "pass3"},
			{"user4", "pass4"},
			{"user5", "pass5"},
		};
	}

}
