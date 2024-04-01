package Test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test4 {

	@Test
	public void WebLoginHomeLoan() {
		System.out.println("Kumar");

	}

	@Test(dataProvider ="getData")
	public void MobileLoginHomeLoan(String Username, String Password) {
		System.out.println("Lila");
		System.out.println(Username);
		System.out.println(Password);
	}

	@Parameters({ "URL", "UserName" })
	@Test
	public void APILoginHomeLoan(String urlName, String api) {
		System.out.println("Prabhuji");
		System.out.println(urlName);
		System.out.println(api);
	}

	@BeforeTest
	public void firstExecute() {
		System.out.println("I will Execute First Hari BOL");
	}

	@DataProvider
	public Object[][] getData() {
		// 1st Combination-Username and Password-good credit history
		// 2nd Combination- Username and Password - No credit History
		// 3rd Combination- Username and Password - Frauledent credit

		Object[][] data = new Object[3][2];
		// 1st set
		data[0][0] = "FirstKrishna";
		data[0][1] = "RadhaPassword";

		// 2nd set
		data[1][0] = "SecondKrishna";
		data[1][1] = "RadharaniPassword";

		// 3rd set
		data[2][0] = "ThirdKrishna";
		data[2][1] = "KrishPriyaPassword";
		return data;

	}

}
