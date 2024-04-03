package PageObjectModule;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import static org.testng.Assert.assertTrue;

import RahulShethyAcademy.AbstractComponents.AbstractComponents;

public class CheckoutPage extends AbstractComponents {
	WebDriver driver;

	public CheckoutPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// List<WebElement> items = driver.findElements(By.cssSelector(".card-body"));
	@FindBy(css = ".list-group button")
	List<WebElement> list;

	@FindBy(xpath = "//*[@placeholder='Select Country']")
	WebElement selectCountry;

	@FindBy(css = "[class*='action__submit']")
	WebElement submit;
	
	@FindBy(css = ".hero-primary")
	WebElement message;


	By ToastBy = By.id("toast-container");

	public void getAddress() {
		// waitForElementToAppear(itemsBy);
		selectCountry.sendKeys("Ind");
		System.out.println("HARI BOL");

		try {

			for (int i = 1; i <= list.size(); i++) {
				if (list.get(i).getText().equalsIgnoreCase("India")) {
					list.get(i).click();
				}
			}
		} catch (StaleElementReferenceException e) {

			for (int i = 1; i <= list.size(); i++) {
				if (list.get(i).getText().equalsIgnoreCase("India")) {
					list.get(i).click();
				}
			}
		}
		Actions a = new Actions(driver);
		a.moveToElement(submit).click().build().perform();

	}
	
	public String getConfirmationOfProduct() {
		  String confirmMessage= message.getText();
		  return confirmMessage;
	       
	}

}
