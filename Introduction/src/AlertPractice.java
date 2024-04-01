import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class AlertPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91930\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		String name = "Radha-Krishna";
		driver.findElement(By.id("name")).sendKeys(name);
		driver.findElement(By.cssSelector("#alertbtn")).click();

		System.out.println(driver.switchTo().alert().getText());
		
		if(driver.switchTo().alert().getText().contains(name)){
		System.out.println("Alert name is verified");
		Assert.assertTrue(true);
		}else {
			Assert.assertTrue(false);
		}
		driver.switchTo().alert().accept();
		driver.findElement(By.id("name")).sendKeys("Chaintanya Mahaprabhu");
		driver.findElement(By.xpath("//input[@value='Confirm']")).click();

		System.out.println(driver.switchTo().alert().getText());

		driver.switchTo().alert().dismiss();
	}

}
