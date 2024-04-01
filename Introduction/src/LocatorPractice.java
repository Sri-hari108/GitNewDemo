import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class LocatorPractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webDriver.chrome.driver", "G:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice");
		
		driver.findElement(By.id("inputUsername")).sendKeys("akashkr930487@gmail.com");
		driver.findElement(By.xpath("//input[@name='inputPassword']")).sendKeys("HareKrishna");//rahulshettyacademy
		driver.findElement(By.id("chkboxOne")).click();
		//driver.findElement(By.id("chkboxTwo")).click();
		driver.findElement(By.xpath("//button[text()='Sign In']")).click();
		//Thread.sleep(1000);
		System.out.println(driver.findElement(By.xpath("//p[@class='error']")).getText());		
		Assert.assertEquals(driver.findElement(By.xpath("//p[@class='error']")).getText(),"* Incorrect username or password" );
		/*
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("akashkr930487@gmail.com");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("HareKrishna");
		driver.findElement(By.xpath("//input[@name='inputPassword']")).sendKeys("0987654321");
		driver.findElement(By.cssSelector("button.reset-pwd-btn")).click();
		//Thread.sleep(1000);
		System.out.println(driver.findElement(By.cssSelector("p.infoMsg")).getText());
		driver.findElement(By.cssSelector("button[class*='go-to']")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input#inputUsername")).sendKeys("Krishna");
		driver.findElement(By.xpath("//input[@name='inputPassword']")).clear();
		driver.findElement(By.xpath("//input[@name='inputPassword']")).sendKeys("rahulshettyacademy");
		//driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");//rahulshettyacademy
		//driver.findElement(By.xpath("//*[@id='chkboxOne']")).click();
		driver.findElement(By.id("chkboxTwo")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Sign')]")).click();
		*/
		
		
	}

}
