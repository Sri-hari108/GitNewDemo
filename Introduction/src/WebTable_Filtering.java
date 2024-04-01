import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class WebTable_Filtering {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\91930\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.id("search-field")).sendKeys("Potato");
		List<WebElement> webElementList = driver.findElements(By.xpath("//tr/td[1]"));
		
		List<WebElement> originalList = webElementList.stream().filter(s->s.getText().contains("Potato")).collect(Collectors.toList());
        
		Assert.assertEquals(webElementList.size(), originalList.size());
	}

}
