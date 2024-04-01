import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\91930\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companion/");
		//selecting desired month
	

		while(!driver.findElement(By.cssSelector(".cur-month")).getText().contains("February")) {
			driver.findElement(By.xpath("//span[@class=\"flatpickr-next-month\"]")).click();
		}
		
		// selecting desired date
		List<WebElement> options=driver.findElements(By.className("flatpickr-day "));
		
		for(WebElement option: options) {
			if(option.getText().equalsIgnoreCase("14")) {
				option.click();
				break;
			}
		}
	}

}
