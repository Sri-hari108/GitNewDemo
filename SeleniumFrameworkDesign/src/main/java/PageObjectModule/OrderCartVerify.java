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

public class OrderCartVerify extends AbstractComponents {
	WebDriver driver;

	public OrderCartVerify(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// List<WebElement> items = driver.findElements(By.cssSelector(".card-body"));
	@FindBy(css = "tr td:nth-child(3)")
	List<WebElement> orderProduct;
	
	public List<WebElement> getorderProduct() {
		//waitForElementToAppear(itemsBy);
		return orderProduct;
	}

	public Boolean getOrderProductVerify(String productName) {
		Boolean ordertitems = getorderProduct().stream()
				.anyMatch(orderProduct -> orderProduct.getText().equalsIgnoreCase(productName));
		return ordertitems;
		
		
	}
	
	
}


