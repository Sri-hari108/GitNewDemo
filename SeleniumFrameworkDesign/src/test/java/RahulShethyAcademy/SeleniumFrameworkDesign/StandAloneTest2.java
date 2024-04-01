package RahulShethyAcademy.SeleniumFrameworkDesign;

import static org.testng.Assert.assertTrue;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import PageObjectModule.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StandAloneTest2 {

	public static void main(String[] args) {
		/*
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://rahulshettyacademy.com/client");
		
		LoginPage lg=new LoginPage(driver);
		
		driver.findElement(By.id("userEmail")).sendKeys("jagnath52kol@gmail.com");
		driver.findElement(By.id("userPassword")).sendKeys("Radha@108");
		driver.findElement(By.id("login")).click();
		String name = "IPHONE 13 PRO";
		
		List<WebElement> items = driver.findElements(By.cssSelector(".card-body"));
		WebElement prod = items.stream()
				.filter(product -> product.findElement(By.cssSelector("b")).getText().equals(name)).findFirst()
				.orElse(null);
		prod.findElement(By.cssSelector(".card-body button:last-of-type")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("toast-container")));
		System.out.println(driver.findElement(By.id("toast-container")).getText());

		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".ng-animating")));

		driver.findElement(By.cssSelector("[routerlink*='cart']")).click();
		List<WebElement> cartProduct = driver.findElements(By.cssSelector(".cartSection h3"));
		Boolean cartitems = cartProduct.stream()
				.anyMatch(CartProducts -> CartProducts.getText().equalsIgnoreCase(name));
		Assert.assertTrue(cartitems);
		driver.findElement(By.xpath("//*[text()='Checkout']")).click();
		driver.findElement(By.xpath("//*[@placeholder='Select Country']")).sendKeys("Ind");
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".list-group button")));
		// WebElement li=list.stream().filter(s->s.getText().equalsIgnoreCase("India"));
		try {
		 List<WebElement> list=driver.findElements(By.cssSelector(".list-group button"));		
		 for( int i=1;i<=list.size();i++) {
			if( list.get(i).getText().equalsIgnoreCase("India")) {
				list.get(i).click();
			}
		 }
		}
		catch(StaleElementReferenceException e) {
			List<WebElement> list=driver.findElements(By.cssSelector(".list-group button"));		
			 for( int i=1;i<=list.size();i++) {
				if( list.get(i).getText().equalsIgnoreCase("India")) {
					list.get(i).click();
				}
			 }
		}
		
		
		 Actions a=new Actions(driver);
		 a.moveToElement(driver.findElement(By.cssSelector("[class*='action__submit']"))).click().build().perform();
		 
       String confirmMessage= driver.findElement(By.cssSelector(".hero-primary")).getText();
       Assert.assertTrue(confirmMessage.equalsIgnoreCase("Thankyou for the order."));
	}
	*/

	}
}
