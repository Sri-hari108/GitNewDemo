package RahulShethyAcademy.StepDefination;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

import PageObjectModule.CheckoutPage;
import PageObjectModule.LoginPage;
import PageObjectModule.ProductCatelog;
import PageObjectModule.VerifyProductInCart;
import RahulShethyAcademy.TestComponents.BaseTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinationIml extends BaseTest{
	
	public LoginPage lg;
	public ProductCatelog productlg;
	public CheckoutPage checkoutPage;
	@Given("I landed on E-commerce Application")
	public void I_landed_on_Ecommerce_Application() throws IOException{
		lg=lunchApplication();
	}
	
	@Given("^logged in with username (.+) and password (.+)$")
	public void loggedIn_with_UserName_And_Password(String username,String password) {
	productlg = lg.ApplicationLogin(username,password);
	}
	
	@When("^I add product (.+) in cart$")
	public void I_add_product_in_cart(String productName) throws InterruptedException {
		List<WebElement> items = productlg.getItems();
		productlg.getProductByName(productName);
		productlg.addProductToCart(productName);
	}
	
	@And("^Checkout (.+) and submit the order$")
	public void Checkout_and_submit_the_order(String productName) {
		VerifyProductInCart verifycart = productlg.CartHeader();
		verifycart.getcartProduct();
		Boolean cartitems = verifycart.getCartProductVerify(productName);
		Assert.assertTrue(cartitems);
		checkoutPage = verifycart.goToCheckout();
		checkoutPage.getAddress();
	}
	@Then("{string} message is displayed at the ConfirmationPage")
	public void message_displayed_at_ConfirmationPage(String string) {
		String confirmMessage = checkoutPage.getConfirmationOfProduct();
		Assert.assertTrue(confirmMessage.equalsIgnoreCase(string));
		driver.close();
	}
	
	@Then("{string} error messaged displayed")
	public void error_messaged_displayed(String string) {
		 Assert.assertEquals(string, lg.errorMessageValidation());
		 driver.close();
	}

}
