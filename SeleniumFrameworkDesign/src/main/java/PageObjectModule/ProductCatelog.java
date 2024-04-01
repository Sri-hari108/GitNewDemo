package PageObjectModule;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import RahulShethyAcademy.AbstractComponents.AbstractComponents;

public class ProductCatelog extends AbstractComponents {
	WebDriver driver;

	public ProductCatelog(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// List<WebElement> items = driver.findElements(By.cssSelector(".card-body"));
	@FindBy(css = ".card-body")
	List<WebElement> items;
//	@FindBy(css = ".ng-animating")
//	WebElement spinner;
	@FindBy(css = "[routerlink*='cart']")
	WebElement cartButton;
	

	By itemsBy = By.cssSelector(".card-body");
	By ToastBy=By.id("toast-container");
	public List<WebElement> getItems() {
		waitForElementToAppear(itemsBy);
		return items;
	}

	public WebElement getProductByName(String productName) {
		WebElement prod = getItems().stream()
				.filter(product -> product.findElement(By.cssSelector("b")).getText().equals(productName)).findFirst()
				.orElse(null);
		return prod;
	}
	
	public void addProductToCart(String productName) throws InterruptedException {
		WebElement prod=getProductByName(productName);
		prod.findElement(By.cssSelector(".card-body button:last-of-type")).click();
		waitForElementToAppear(ToastBy);
		System.out.println(driver.findElement(By.id("toast-container")).getText());
		waitForElementToAppear();
		cartButton.click();
	}

}
