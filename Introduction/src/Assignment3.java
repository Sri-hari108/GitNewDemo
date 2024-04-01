import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver =new ChromeDriver();
		WebDriverWait w=new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.name("password")).sendKeys("learning");
		driver.findElement(By.xpath("//input[@value='user']//following::span[1]")).click();
		w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("okayBtn")));
		driver.findElement(By.id("okayBtn")).click();
		//driver.switchTo().alert().accept();
		
		WebElement wb=driver.findElement(By.xpath("//select[@class='form-control']"));
		Select s=new Select(wb);
		s.selectByVisibleText("Consultant");
		
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.cssSelector("input#signInBtn")).click();
		
		w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//h4[@class='card-title']/a")));
		String[] name = {"iphone X","Samsung Note 8","Nokia Edge","Blackberry"};
		
		additems(driver,name);
		
		driver.findElement(By.xpath("//div[@id='navbarResponsive']/ul/li/a")).click();

	}
	public static void additems(WebDriver driver,String[] name) {
		List<WebElement> itemName=driver.findElements(By.xpath("//h4[@class='card-title']/a"));
		int j=0;
		for(int i=0;i<itemName.size();i++) {
			String itemNames=itemName.get(i).getText();
			
			List<String> nameChoosen=Arrays.asList(name);
		if(nameChoosen.contains(itemNames)) {
			j++;
		driver.findElements(By.xpath("//div[@class='card-footer']/button")).get(i).click();
		
		if(j==name.length) {
			break;
		}
		}
		}
	}

}
