import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class WebTable_Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\91930\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");

		// click on the column
		driver.findElement(By.xpath("//tr/th[1]")).click();
		// capture all webElements into list
		List<WebElement> webElementList = driver.findElements(By.xpath("//tr/td[1]"));
		// capture text all webElements into the new(Original) list
		List<String> originalList = webElementList.stream().map(s -> s.getText()).collect(Collectors.toList());
		// sorted on original list => sorted list
		List<String> sortedList = originalList.stream().sorted().collect(Collectors.toList());
		// Compare Original list Vs Sorted list
		Assert.assertTrue(originalList.equals(sortedList));
		List<String> price;
		do {
			List<WebElement> webElementLists = driver.findElements(By.xpath("//tr/td[1]"));
			price = webElementLists.stream().filter(s -> s.getText().contains("Rice")).map(s -> getPrice(s))
					.collect(Collectors.toList());
			price.forEach(a -> System.out.println(a));

			if (price.size() < 1) {
				driver.findElement(By.cssSelector("[aria-label='Next']")).click();
			}
		} while (price.size() < 1);

	}

	private static String getPrice(WebElement s) {
		// TODO Auto-generated method stub
		String itemPrice = s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return itemPrice;
	}

}
