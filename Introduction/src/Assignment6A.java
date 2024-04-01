import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Assignment6A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\91930\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("checkBoxOption3")).click();
		String value = driver.findElement(By.cssSelector("[for='honda']")).getText();
		System.out.println(value);
		WebElement dropDownValue = driver.findElement(By.id("dropdown-class-example"));
		Select dropDown = new Select(dropDownValue);
		dropDown.selectByVisibleText(value);

		driver.findElement(By.cssSelector("#name")).sendKeys(value);
		driver.findElement(By.id("alertbtn")).click();
		if (driver.switchTo().alert().getText().contains(value)) {
			System.out.println("Alert message verified");
			Assert.assertTrue(true);

		} else {
			Assert.assertTrue(false);
		}

	}

}
