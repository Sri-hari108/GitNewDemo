package PageObjectModule;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import static org.testng.Assert.assertTrue;

import RahulShethyAcademy.AbstractComponents.AbstractComponents;

public class VerifyProductInCart extends AbstractComponents {
	WebDriver driver;

	public VerifyProductInCart(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// List<WebElement> items = driver.findElements(By.cssSelector(".card-body"));
	@FindBy(css = ".cartSection h3")
	List<WebElement> cartProduct;
	
	@FindBy(xpath = "//*[text()='Checkout']")
	WebElement checkoutButton;
	
	

	
	By ToastBy=By.id("toast-container");
	
	public List<WebElement> getcartProduct() {
		//waitForElementToAppear(itemsBy);
		return cartProduct;
	}

	public Boolean getCartProductVerify(String productName) {
		Boolean cartitems = getcartProduct().stream()
				.anyMatch(CartProducts -> CartProducts.getText().equalsIgnoreCase(productName));
		return cartitems;
		
		
	}
	
	public CheckoutPage goToCheckout() {
		checkoutButton.click();
		CheckoutPage checkoutPage = new CheckoutPage(driver);
		return checkoutPage;
	}
	
}


