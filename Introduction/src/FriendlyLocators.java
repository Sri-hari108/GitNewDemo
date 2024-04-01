import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

public class FriendlyLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\91930\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));

		driver.get("https://rahulshettyacademy.com/angularpractice/");
		WebElement nameeditbox=driver.findElement(By.xpath("(//*[@name='name'])[1]"));
		System.out.println(driver.findElement(with(By.tagName("label")).above(nameeditbox)).getText());
		WebElement emailText=driver.findElement(By.xpath("//*[@for='exampleInputPassword1']"));
		driver.findElement(with(By.tagName("input")).below(emailText)).click();
		WebElement checkbox=driver.findElement(By.xpath("//*[text()='Check me out if you Love IceCreams!']"));
		driver.findElement(with(By.tagName("input")).toLeftOf(checkbox)).click();
		WebElement statuscheck=driver.findElement(By.xpath("//*[text()='Employment Status: ']"));
		driver.findElement(with(By.tagName("input")).toRightOf(statuscheck)).click();

	}

}
 