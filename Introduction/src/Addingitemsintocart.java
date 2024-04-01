import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Addingitemsintocart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\91930\\\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		//WebDriverWait w=new WebDriverWait(driver,Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

		int j = 0;
		String[] foods = { "Beetroot", "Carrot", "Pomegranate" };
		List<WebElement> foodname = driver.findElements(By.cssSelector("h4.product-name"));

		// array to arrayList
		List<String> foodslist = Arrays.asList(foods);

		for (int i = 0; i < foodname.size(); i++) {

			String[] fooddie = foodname.get(i).getText().split("-");
			String actaulfoodie = fooddie[0].trim();
			if (foodslist.contains(actaulfoodie)) {
				j++;
				driver.findElements(By.xpath("//*[@class='product-action']/button")).get(i).click();

				if (j == foods.length) {
					break;
				}
			}
		}
		
		driver.findElement(By.xpath("//img[@alt='Cart']")).click();
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();

		//w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("input.promoCode")));
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");

	}

}
