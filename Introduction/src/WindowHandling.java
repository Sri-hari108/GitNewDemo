import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WindowHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Switching to new Tab
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\91930\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.xpath("//a[@class='blinkingText']")).click();

		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String parent = it.next();
		String child = it.next();
		driver.switchTo().window(child);
		System.out.println(
				driver.findElement(By.xpath("//*[@id=\"interview-material-container\"]/div/div[2]/p[2]")).getText());

		String[] text = driver.findElement(By.xpath("//*[@id=\"interview-material-container\"]/div/div[2]/p[2]"))
				.getText().split("@");
		String te = driver.findElement(By.xpath("//*[@id=\"interview-material-container\"]/div/div[2]/p[2]")).getText()
				.split("@")[1].split(".com")[0].trim();
		String[] sj = text[1].split(".com");
		String e = sj[0].trim();

		System.out.println(te);
		driver.switchTo().window(parent);
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));

		driver.findElement(By.id("username")).sendKeys(e);
		driver.findElement(By.name("password")).sendKeys("learning");
		driver.findElement(By.xpath("//input[@value='user']//following::span[1]")).click();
		w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("okayBtn")));
		driver.findElement(By.id("okayBtn")).click();
		// driver.switchTo().alert().accept();

		WebElement wb = driver.findElement(By.xpath("//select[@class='form-control']"));
		Select s = new Select(wb);
		s.selectByVisibleText("Consultant");

		driver.findElement(By.id("terms")).click();
		driver.findElement(By.cssSelector("input#signInBtn")).click();

	}

}
