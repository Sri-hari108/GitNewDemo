package RahulShethyAcademy.SeleniumFrameworkDesign;


import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjectModule.CheckoutPage;
import PageObjectModule.ProductCatelog;
import PageObjectModule.VerifyProductInCart;
import RahulShethyAcademy.TestComponents.BaseTest;
import RahulShethyAcademy.TestComponents.Retry;

public class ErrorValidation extends BaseTest{

	@Test(retryAnalyzer=Retry.class)
	public void loginErrorValidation() throws InterruptedException, IOException {
		
		lg.ApplicationLogin("jagnath5kol@gmail.com", "Radha@108");
	   Assert.assertEquals("Incorrects email or password.", lg.errorMessageValidation());

	}
	
	@Test(groups= {"ErrorValidation"})
	public void productErrorValidation() throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		String productName = "IPHONE 13 PRO";
		ProductCatelog productlg =lg.ApplicationLogin("jagnath52kol@gmail.com", "Radha@108");
	    productlg.getItems();
		productlg.getProductByName(productName);
		productlg.addProductToCart(productName);
		VerifyProductInCart verifycart =productlg.CartHeader();
		verifycart.getcartProduct();
		Boolean cartitems=verifycart.getCartProductVerify("IPHONE 15 PRO");
		Assert.assertFalse(cartitems);
		

	}

}


