import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Calender {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91930\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		
		System.out.println("-------------------------------------------------------");
		Thread.sleep(2000);
      driver.findElement(By.xpath("//*[@data-testid='round-trip-radio-button']/div[1]")).click();
      System.out.println(driver.findElement(By.xpath("//div[text()='Return Date']")).getAttribute("style"));
      //System.out.println(driver.findElement(By.xpath("//div[text()='Return Date']")).isEnabled());
      if(driver.findElement(By.xpath("//div[text()='Return Date']")).getAttribute("style").contains("1")) {
    	  System.out.println("It is enable");
    	  Assert.assertTrue(true);
      }else {
    	  Assert.assertTrue(false);
      }
      
      /*
		driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[3]/div/div[1]/div/div[2]/input")).click();
			
		driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-14lw9ot r-z2wwpe r-1rjd0u6 r-1g94qm0 r-u8s1d r-8fdsdq'] //div[text()='TIR']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='VTZ']")).click();		
		
		System.out.println("-------------------------------------------");
		System.out.println(driver.findElement(By.xpath("(//div[@class='css-76zvg2 css-bfa6kz r-1862ga2 r-1gkfh8e'])[2]")).getAttribute("style"));
		if(driver.findElement(By.xpath("(//div[@class='css-76zvg2 css-bfa6kz r-1862ga2 r-1gkfh8e'])[2]"))
				.getAttribute("style").contains(" ")) 
		{
			System.out.println("it is enable");
			Assert.assertFalse(false);
		}else {
			Assert.assertFalse(true);
		}
		System.out.println("-------------------------------------------");
		driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[4]/div/div[2]/div[2]/div[3]/div[2]/div/div[1]/div/div[3]/div[2]/div[1]/div/div")).click();
		
		driver.findElement(By.xpath("//div[text()='Return Date']//following::div[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[4]/div/div[2]/div[2]/div[3]/div[2]/div/div[2]/div/div[3]/div[1]/div[5]/div/div")).click();
		// font-family: inherit; opacity: 1;
		System.out.println(driver.findElement(By.xpath("(//div[@class='css-76zvg2 css-bfa6kz r-1862ga2 r-1gkfh8e'])[2]")).getAttribute("style"));
				if(driver.findElement(By.xpath("(//div[@class='css-76zvg2 css-bfa6kz r-1862ga2 r-1gkfh8e'])[2]"))
						.getAttribute("style").contains("opacity: 1")) 
				{
					System.out.println("it is enable");
					Assert.assertTrue(true);
				}else {
					Assert.assertFalse(true);
				}
		
		*/

	}

}
