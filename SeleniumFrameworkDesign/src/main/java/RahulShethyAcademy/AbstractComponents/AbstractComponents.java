package RahulShethyAcademy.AbstractComponents;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import PageObjectModule.OrderCartVerify;
import PageObjectModule.VerifyProductInCart;

public class AbstractComponents {
	WebDriver driver;
	
	public AbstractComponents(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
     
	@FindBy(css = "[routerlink*='cart']")
	WebElement cartButton;
	
	@FindBy(css = "[routerlink*='myorders']")
	WebElement orderButton;
	
	
	
	public void waitForElementToAppear(By findBy) {
		
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	wait.until(ExpectedConditions.visibilityOfElementLocated(findBy));
	
	}
	
	public void waitForElementToAppears(WebElement findBy) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(findBy));
		
		}
	
	public void waitForElementToAppear() throws InterruptedException {
		Thread.sleep(1000);
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.invisibilityOf(ele));
	}
	
	public VerifyProductInCart CartHeader() {
		cartButton.click();
		VerifyProductInCart verifycart = new VerifyProductInCart(driver);
		return verifycart;
	}
	
	public OrderCartVerify orderHeader() {
		orderButton.click();
		OrderCartVerify orderCartVerify = new OrderCartVerify(driver);
		return orderCartVerify;
	}
	

}
