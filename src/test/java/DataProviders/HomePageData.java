package DataProviders;

import org.testng.annotations.DataProvider;

public class HomePageData {

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
	
	@DataProvider(name = "homepagedataqa")
	public Object[][] getLoginCredentials_qa() {
		return new Object[][] {
			{"user1_qa", "pass1_qa", "id1", "ph1"},
			{"user2_qa", "pass2_qa", "id2", "ph2"},
			{"user3_qa", "pass3_qa","id3", "ph3"},
			{"user4_qa", "pass4_qa","id4", "ph4"},
			{"user5_qa", "pass5_qa","id5", "ph5"},
		};
	}
	
	//Username and password
	
	//bank account
	
	
	
	@DataProvider(name = "prod")
	public Object[][] getLoginCredentials_prod() {
		return new Object[][] {
			{"user1", "pass1"},
			{"user2", "pass2"},
			{"user3", "pass3"},
			{"user4", "pass4"},
			{"user5", "pass5"},
		};
	}
	
	@DataProvider(name = "bankaccountForQA")
	public Object[][] bankaccount() {
		return new Object[][] {
			{"name", "adharcard", "pancard", "email", "Ph", "12"},
			{"name1", "adharcard1", "pancard1", "email1", "Ph1", "121"},
		};
	}
	
}
