import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestiveDropdown {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91930\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		/*
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.findElement(By.id("autosuggest")).sendKeys("Ind");
		Thread.sleep(2000);
		
		List<WebElement> options=driver.findElements(By.xpath("//li[@class='ui-menu-item']/a"));
		
		for(WebElement option:options) {
			System.out.println(option.getText());
			if(option.getText().equalsIgnoreCase("Indonesia")) {
				option.click();
				break;
			}
		}
		System.out.println("-------------------------------------------------------");
		Thread.sleep(2000);
      driver.findElement(By.xpath("//*[@data-testid='round-trip-radio-button']/div[1]")).click();
      System.out.println(driver.findElement(By.xpath("Return Date")).getAttribute("style"));
		*/
		// Second way to do it
      
      driver.get("http://qaclickacademy.com/practice.php");

      driver.findElement(By.id("autocomplete")).sendKeys("ind");

      Thread.sleep(2000);

      driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);

      driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);

     System.out.println(driver.findElement(By.id("autocomplete")).getAttribute("value")); 
	}

}
