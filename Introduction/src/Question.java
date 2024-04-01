import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Question {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "G:\\driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		driver.findElement(By.name("name")).sendKeys("Radha-Krishna");
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("aksh@gmail.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("Hare");
		driver.findElement(By.xpath("//input[@id='exampleCheck1']")).click();
		
		WebElement s=driver.findElement(By.id("exampleFormControlSelect1"));
		Select a=new Select(s);
		a.selectByIndex(1);
		
		driver.findElement(By.cssSelector("#inlineRadio1")).click();
		
		
		driver.findElement(By.xpath("//label[text()='Date of Birth']/following::input[1]")).sendKeys("02/02/1992");
		
		
		
		driver.findElement(By.xpath("//input[@value='Submit']")).click();
		Thread.sleep(2000);
		String st=driver.findElement(By.xpath("//div[contains(@class,'alert alert-success')]")).getText();
		System.out.println(st);
		
	}

}
