import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\91930\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		// no of row present
		int noofRows = driver.findElements(By.cssSelector("[name='courses'] tbody tr")).size();
		System.out.println(noofRows);

		// no of column present
		int noofColumn = driver.findElements(By.cssSelector("[name='courses'] tbody tr th")).size();
		System.out.println(noofColumn);

		// Print entire second column
		for (int i = 0; i < driver.findElements(By.cssSelector("[name='courses'] tbody tr")).size(); i++) {
			if (driver.findElements(By.cssSelector("[name='courses'] tbody tr")).get(i).getText().contains("SQL")) {
				System.out.println(driver.findElements(By.cssSelector("[name='courses'] tbody tr")).get(i).getText());
				break;
			}
		}

	}

}
