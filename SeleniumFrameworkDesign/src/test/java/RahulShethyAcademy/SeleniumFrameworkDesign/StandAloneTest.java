package RahulShethyAcademy.SeleniumFrameworkDesign;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObjectModule.CheckoutPage;
import PageObjectModule.LoginPage;
import PageObjectModule.OrderCartVerify;
import PageObjectModule.ProductCatelog;
import PageObjectModule.VerifyProductInCart;
import RahulShethyAcademy.TestComponents.BaseTest;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StandAloneTest extends BaseTest {
	String productName = "IPHONE 13 PRO";

//	@Test(dataProvider = "getData", groups = { "purchase" })
//	public void submitOrder(String email, String password, String productName)
//			throws InterruptedException, IOException {
//		// TODO Auto-generated method stub
//
//		ProductCatelog productlg = lg.ApplicationLogin(email, password);
//		List<WebElement> items = productlg.getItems();
//		productlg.getProductByName(productName);
//		productlg.addProductToCart(productName);
//		VerifyProductInCart verifycart = productlg.CartHeader();
//		verifycart.getcartProduct();
//		Boolean cartitems = verifycart.getCartProductVerify(productName);
//		Assert.assertTrue(cartitems);
//		CheckoutPage checkoutPage = verifycart.goToCheckout();
//		checkoutPage.getAddress();
//		String confirmMessage = checkoutPage.getConfirmationOfProduct();
//		Assert.assertTrue(confirmMessage.equalsIgnoreCase("Thankyou for the order."));
//
//	}
	@Test(dataProvider = "getData", groups = { "purchase" })
	public void submitOrder(HashMap<String, String> input) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		ProductCatelog productlg = lg.ApplicationLogin(input.get("email"), input.get("password"));
		List<WebElement> items = productlg.getItems();
		productlg.getProductByName(input.get("productName"));
		productlg.addProductToCart(input.get("productName"));
		VerifyProductInCart verifycart = productlg.CartHeader();
		verifycart.getcartProduct();
		Boolean cartitems = verifycart.getCartProductVerify(input.get("productName"));
		Assert.assertTrue(cartitems);
		CheckoutPage checkoutPage = verifycart.goToCheckout();
		checkoutPage.getAddress();
		String confirmMessage = checkoutPage.getConfirmationOfProduct();
		Assert.assertTrue(confirmMessage.equalsIgnoreCase("Thankyou for the order."));

	}

	@Test(dependsOnMethods = { "submitOrder" })
	public void orderHistoryValidation() {
		ProductCatelog productlg = lg.ApplicationLogin("jagnath52kol@gmail.com", "Radha@108");
		OrderCartVerify orderCartVerify = productlg.orderHeader();
		Assert.assertTrue(orderCartVerify.getOrderProductVerify(productName));
	}

//	@DataProvider
//	public Object[][] getData() {
//		return new Object[][] { { "jagnath52kol@gmail.com", "Radha@108", "IPHONE 13 PRO" },
//				{ "RadhaKrishna108@gmail.com", "Radha@108","ADIDAS ORIGINAL" } };
//	}

//	@DataProvider
//	public Object[][] getData() {
//
//		HashMap<String, String> map = new HashMap<String, String>();
//		map.put("email", "jagnath52kol@gmail.com");
//		map.put("password", "Radha@108");
//		map.put("productName", "IPHONE 13 PRO");
//
//		HashMap<String, String> map1 = new HashMap<String, String>();
//		map1.put("email", "RadhaKrishna108@gmail.com");
//		map1.put("password", "Radha@108");
//		map1.put("productName", "ADIDAS ORIGINAL");
//		return new Object[][] {{map}, {map1}};
//	}

	@DataProvider
	public Object[][] getData() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(System.getProperty("user.dir")+
    			"\\src\\test\\java\\RahulShethyAcademy\\data\\PurchaseOrder.json");
		return new Object[][] { {data.get(0)}, {data.get(1)} };
	}

}
